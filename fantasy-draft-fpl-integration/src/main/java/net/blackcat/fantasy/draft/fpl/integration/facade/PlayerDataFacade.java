/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.helper.FantasyPremierLeaguePlayerHelper;
import net.blackcat.fantasy.draft.integration.exception.FantasyDraftIntegrationException;
import net.blackcat.fantasy.draft.integration.facade.GameweekFacade;
import net.blackcat.fantasy.draft.integration.facade.PlayerFacade;
import net.blackcat.fantasy.draft.integration.facade.TeamFacade;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerDto;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerGameweekScoreDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Facade for Fantasy Premier League player data.
 * 
 * @author Chris
 * 
 */
@Component
public class PlayerDataFacade {

	private final static int UPPER_PLAYER_NUMBER_LIMIT = 3000;

    private PlayerDataClient playerDataClient;
    private PlayerFacade playerIntegrationFacade;
    private GameweekFacade gameweekFacade;
    private TeamFacade teamIntegrationFacade;

    @Autowired
    public PlayerDataFacade(final PlayerDataClient playerDataClient, final PlayerFacade playerIntegrationFacade, 
    		final GameweekFacade gameweekFacade, final TeamFacade teamIntegrationFacade) {

        this.playerDataClient = playerDataClient;
        this.playerIntegrationFacade = playerIntegrationFacade;
        this.gameweekFacade = gameweekFacade;
        this.teamIntegrationFacade = teamIntegrationFacade;
    }

    /**
     * Perform the initial population of player data from the Fantasy Premier League database to the Fantasy Draft
     * database.
     */
    public void performInitialPlayerDataLoad() {
        final List<PlayerDto> draftPlayers = new ArrayList<PlayerDto>();
        final boolean atLeastOneSuccessfulRead = buildPlayerListFromRestClient(draftPlayers);

        if (atLeastOneSuccessfulRead) {
            playerIntegrationFacade.addPlayers(draftPlayers);
        }

    }
    
    /**
     * Update the player statistics of the currently stored players in the game.
     * @throws FantasyDraftIntegrationException 
     */
    public void updateExistingPlayerStatistics() throws FantasyDraftIntegrationException {
    	
    	final List<PlayerDto> playerDtos = new ArrayList<PlayerDto>();
    	
    	for (final PlayerDto currentPlayer : playerIntegrationFacade.getPlayers()) {
    		
    		final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(currentPlayer.getId());
    		final PlayerDto playerDto = FantasyPremierLeaguePlayerHelper.convertFantasyPremierLeaguePlayer(fplPlayer);
    		playerDtos.add(playerDto);
    	}
    	
    	playerIntegrationFacade.updatePlayersStatistics(playerDtos);
    }
    
    /**
     * Update the player price data of players in the game.
     * @throws FantasyDraftIntegrationException 
     */
    public void updateExistingPlayerPriceData() throws FantasyDraftIntegrationException {
    	
    	final Map<Integer, PlayerDto> playerDtoMap = new HashMap<Integer, PlayerDto>();
    	
    	for (final PlayerDto currentPlayer : playerIntegrationFacade.getPlayers()) {
    		
    		final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(currentPlayer.getId());
    		final PlayerDto playerDto = FantasyPremierLeaguePlayerHelper.convertFantasyPremierLeaguePlayer(fplPlayer);
    		playerDtoMap.put(playerDto.getId(), playerDto);
    	}
    	
    	playerIntegrationFacade.updatePlayersCurrentPrice(playerDtoMap);
    	teamIntegrationFacade.updateSelectedPlayersSellToPotPrice(playerDtoMap);
    }

    /**
     * Calculate the gameweek scores for the current gameweek.
     * 
     * @throws FantasyDraftIntegrationException
     */
	public void calculateCurrentGameweekScores() throws FantasyDraftIntegrationException {
    	
    	System.out.println("Start calculating gameweek scores");
    	
    	final Map<Integer, PlayerGameweekScoreDto> playerGameweekScores = new HashMap<Integer, PlayerGameweekScoreDto>();
    	
    	for (final PlayerDto player : playerIntegrationFacade.getPlayers()) {

    		final FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer = playerDataClient.getPlayer(player.getId());
    		final PlayerGameweekScoreDto playerGamweekScore = FantasyPremierLeaguePlayerHelper.buildPlayerGameweekScoreDtoForCurrentGameweek(fantasyPremierLeaguePlayer);
    		playerGameweekScores.put(player.getId(), playerGamweekScore);
    	}
    	
    	System.out.println("Read all player data from FPL");
    	
    	gameweekFacade.calculateGameweekScores(playerGameweekScores);
    	
    	System.out.println("Finished calculating gameweek scores");
    }
	
	/**
     * Calculate the gameweek scores for a specific gameweek.
     * 
     * @param gameweek The number of the gameweek to calculate the scores for.
     * @throws FantasyDraftIntegrationException
     */
	public void calculateGameweekScores(final int gameweek) throws FantasyDraftIntegrationException {
    	
    	System.out.println("Start calculating gameweek scores for gameweek " + gameweek);
    	
    	final Map<Integer, PlayerGameweekScoreDto> playerGameweekScores = new HashMap<Integer, PlayerGameweekScoreDto>();
    	
    	for (final PlayerDto player : playerIntegrationFacade.getPlayers()) {

    		final FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer = playerDataClient.getPlayer(player.getId());
    		final PlayerGameweekScoreDto playerGamweekScore = FantasyPremierLeaguePlayerHelper.buildPlayerGameweekScoreDtoForGameweek(fantasyPremierLeaguePlayer, gameweek);
    		playerGameweekScores.put(player.getId(), playerGamweekScore);
    	}
    	
    	System.out.println("Read all player data from FPL");
    	
    	gameweekFacade.calculateGameweekScores(playerGameweekScores, gameweek);
    	
    	System.out.println("Finished calculating gameweek scores");
    }

	/*
     * Build up a list of PlayerDto objects from FPL using the REST client
     */
    private boolean buildPlayerListFromRestClient(final List<PlayerDto> draftPlayers) {
        boolean atLeastOneSuccessfulRead = false;

        for (int i = 631; i <= UPPER_PLAYER_NUMBER_LIMIT; i++) {
            try {
                final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(i);

                draftPlayers.add(FantasyPremierLeaguePlayerHelper.convertFantasyPremierLeaguePlayer(fplPlayer));
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
     * @param atLeastOneSuccessfulRead
     *            Whether any data has been successfully read.
     * @param exception
     *            The exception that was thrown.
     */
    private void handleRestClientException(final boolean atLeastOneSuccessfulRead, final FantasyPremierLeagueException exception) {
        if (endOfDataHasBeenReached(atLeastOneSuccessfulRead, exception)) {
            // Log out that we have reached the end of the data in FPL.
        } else {
            // Log out that there was an error connecting.
        }
    }

    /**
     * Determine if an exception has been thrown because we have reached the end of the data from FPL.
     * 
     * @param atLeastOneSuccessfulRead
     *            Whether any data has been successfully read.
     * @param exception
     *            The exception that was thrown.
     * @return True if we have reached the end of the FPL data, false if the exception was thrown for another reason.
     */
    private boolean endOfDataHasBeenReached(final boolean atLeastOneSuccessfulRead, final FantasyPremierLeagueException exception) {
        return atLeastOneSuccessfulRead && HttpStatus.NOT_FOUND == exception.getStatusCode();
    }
}
