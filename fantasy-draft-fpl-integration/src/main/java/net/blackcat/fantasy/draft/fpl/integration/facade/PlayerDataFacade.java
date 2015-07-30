/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.integration.facade.PlayerFacade;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerDto;
import net.blackcat.fantasy.draft.integration.model.types.player.Position;

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

    @Autowired
    public PlayerDataFacade(final PlayerDataClient playerDataClient, final PlayerFacade playerIntegrationFacade) {

        this.playerDataClient = playerDataClient;
        this.playerIntegrationFacade = playerIntegrationFacade;
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
     * Build up a list of {@link PlayerDto} objects from FPL using the REST client
     * 
     * @param draftPlayers
     *            List to add the {@link PlayerDto} objects to.
     * @return True if any data has been successfully read from the endpoint, false otherwise.
     */
    private boolean buildPlayerListFromRestClient(final List<PlayerDto> draftPlayers) {
        boolean atLeastOneSuccessfulRead = false;

        for (int i = 1; i <= UPPER_PLAYER_NUMBER_LIMIT; i++) {
            try {
                final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(i);

                draftPlayers.add(convertFantasyPremierLeaguePlayer(fplPlayer));
                atLeastOneSuccessfulRead = true;
            } catch (final FantasyPremierLeagueException e) {
                handleRestClientException(atLeastOneSuccessfulRead, e);
                break;
            }
        }
        return atLeastOneSuccessfulRead;
    }

    private PlayerDto convertFantasyPremierLeaguePlayer(final FantasyPremierLeaguePlayer fplPlayer) {

        final PlayerDto dto = new PlayerDto(fplPlayer.getId());

        dto.setForename(fplPlayer.getFirstName());
        dto.setSurname(fplPlayer.getSecondName());
        dto.setTeam(fplPlayer.getTeamName());
        dto.setPosition(Position.fromFantasyPremierLeaguePosition(fplPlayer.getTypeName()));
        dto.setTotalPoints(fplPlayer.getTotalPoints());
        dto.setCurrentPrice(calculateCostNow(fplPlayer.getNowCost()));
        dto.setGoals(fplPlayer.getGoalsScored());
        dto.setAssists(fplPlayer.getAssists());
        dto.setCleanSheets(fplPlayer.getCleanSheets());
        dto.setPointsPerGame(new BigDecimal(fplPlayer.getPointsPerGame()));

        return dto;
    }

    /**
     * Calculate the current cost of this player.
     * 
     * @return Current cost of this player
     */
    private BigDecimal calculateCostNow(final int nowCost) {
        final BigDecimal costNow = new BigDecimal(nowCost);

        return costNow.multiply(new BigDecimal("0.1"));
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
