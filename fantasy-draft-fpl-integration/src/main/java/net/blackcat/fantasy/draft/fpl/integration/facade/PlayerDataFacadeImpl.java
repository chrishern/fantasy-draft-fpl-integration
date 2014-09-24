/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.integration.controller.GameweekScoreController;
import net.blackcat.fantasy.draft.integration.controller.PlayerController;
import net.blackcat.fantasy.draft.integration.controller.TeamController;
import net.blackcat.fantasy.draft.player.GameweekScorePlayer;
import net.blackcat.fantasy.draft.player.Player;
import net.blackcat.fantasy.draft.player.FplCostPlayer;
import net.blackcat.fantasy.draft.player.types.PlayerSelectionStatus;
import net.blackcat.fantasy.draft.player.types.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Implementation of player data operations.
 * 
 * @author Chris
 *
 */
@Service(value = "playerDataFacade")
public class PlayerDataFacadeImpl implements PlayerDataFacade {

	private final static int UPPER_PLAYER_NUMBER_LIMIT = 3000;
	
	@Autowired
	@Qualifier(value = "playerDataClient")
	private PlayerDataClient playerDataClient;
	
	@Autowired
	@Qualifier(value = "playerIntegrationController")
	private PlayerController playerIntegrationController;
	
	@Autowired
	@Qualifier(value = "gameweekScoreIntegrationController")
	private GameweekScoreController gameweekScoreIntegrationController;
	
	@Autowired
	@Qualifier(value = "teamIntegrationController")
	private TeamController teamIntegrationController;
	
	@Override
	public void performInitialPlayerDataLoad() {
		final List<Player> draftPlayers = new ArrayList<Player>();
		final boolean atLeastOneSuccessfulRead = buildPlayerListFromRestClient(draftPlayers);
		
		if (atLeastOneSuccessfulRead) {
			playerIntegrationController.addPlayers(draftPlayers);
		}
		
	}

	@Override
	public void populatePlayerScores() {
		final Map<Integer, GameweekScorePlayer> playersWithScores = new HashMap<Integer, GameweekScorePlayer>();
		
		System.out.println("Starting read of FPL data");
		
		for (final Position playerPosition : Position.values()) {
			final List<Player> selectedPlayers = playerIntegrationController.getPlayers(playerPosition, PlayerSelectionStatus.SELECTED);
			
			for (final Player selectedPlayer : selectedPlayers) {
				final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(selectedPlayer.getId());
				
				playersWithScores.put(selectedPlayer.getId(), fplPlayer.toGameweekScorePlayer());
				
				System.out.println("Stored data for player " + selectedPlayer.getForename() + " " + selectedPlayer.getSurname());
			}
		}
		
		System.out.println("Finished read of FPL data");
		System.out.println();
		
		gameweekScoreIntegrationController.storeGameweekScores(playersWithScores);
	}

	@Override
	public void updatePlayersWithInitialPurchasePrice() {
		final Map<Integer, FplCostPlayer> playersWithScores = new HashMap<Integer, FplCostPlayer>();
		
		for (final Position playerPosition : Position.values()) {
			final List<Player> selectedPlayers = playerIntegrationController.getPlayers(playerPosition, PlayerSelectionStatus.SELECTED);
			
			for (final Player selectedPlayer : selectedPlayers) {
				final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(selectedPlayer.getId());
				
				playersWithScores.put(selectedPlayer.getId(), fplPlayer.toPopulateFplCostPlayer());
			}
		}
		
		teamIntegrationController.updateSelectedPlayersWithIntialFplCost(playersWithScores);
	}
	
	/**
	 * Build up a list of {@link Player} objects from FPL using the REST client
	 * 
	 * @param draftPlayers List to add the {@link Player} objects to.
	 * @return True if any data has been successfully read from the endpoint, false otherwise.
	 */
	private boolean buildPlayerListFromRestClient(final List<Player> draftPlayers) {
		boolean atLeastOneSuccessfulRead = false;
		
		for (int i = 1; i <= UPPER_PLAYER_NUMBER_LIMIT; i++) {
			try {
				final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(i);
				
				draftPlayers.add(fplPlayer.toPlayer());
				atLeastOneSuccessfulRead = true;
			} catch (final FantasyPremierLeagueException e) {
				handleRestClientException(atLeastOneSuccessfulRead, e);
				break;
			}
		}
		return atLeastOneSuccessfulRead;
	}

	/**
	 * Handle an exception coming back from the FPL player rest client.
	 * 
	 * @param atLeastOneSuccessfulRead Whether any data has been successfully read.
	 * @param exception The exception that was thrown.
	 */
	private void handleRestClientException(final boolean atLeastOneSuccessfulRead,
			final FantasyPremierLeagueException exception) {
		if (endOfDataHasBeenReached(atLeastOneSuccessfulRead, exception)) {
			// Log out that we have reached the end of the data in FPL.
		} else {
			// Log out that there was an error connecting.
		}
	}

	/**
	 * Determine if an exception has been thrown because we have reached the end of the data from FPL.
	 * 
	 * @param atLeastOneSuccessfulRead Whether any data has been successfully read.
	 * @param exception The exception that was thrown.
	 * @return True if we have reached the end of the FPL data, false if the exception was thrown for another reason.
	 */
	private boolean endOfDataHasBeenReached(final boolean atLeastOneSuccessfulRead,
			final FantasyPremierLeagueException exception) {
		return atLeastOneSuccessfulRead && HttpStatus.NOT_FOUND == exception.getStatusCode();
	}

}
