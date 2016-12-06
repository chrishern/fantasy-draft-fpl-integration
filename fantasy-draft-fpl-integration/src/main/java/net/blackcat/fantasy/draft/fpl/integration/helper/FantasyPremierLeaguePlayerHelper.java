/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.helper;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerDto;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerGameweekScoreDto;
import net.blackcat.fantasy.draft.integration.model.types.player.Position;

/**
 * Helper class for the FantasyPremierLeaguePlayer object generated from the FPL REST response.
 * 
 * Ideally these methods would be in the FantasyPremierLeaguePlayer or the associated DTO but because
 * the FPL object is generated and the DTOs don't have a dependency on the FPL proejct, this is not possible.
 * 
 * @author Chris
 *
 */
public final class FantasyPremierLeaguePlayerHelper {

	public final static Map<Integer, String> TEAM_MAP = new HashMap<Integer, String>();
	static {
		TEAM_MAP.put(1, "Arsenal");
		TEAM_MAP.put(2, "Bournemouth");
		TEAM_MAP.put(3, "Burnley");
		TEAM_MAP.put(4, "Chelsea");
		TEAM_MAP.put(5, "Crystal Palace");
		TEAM_MAP.put(6, "Everton");
		TEAM_MAP.put(7, "Hull City");
		TEAM_MAP.put(8, "Leicester City");
		TEAM_MAP.put(9, "Liverpool");
		TEAM_MAP.put(10, "Manchester City");
		TEAM_MAP.put(11, "Manchester United");
		TEAM_MAP.put(12, "Middlesbrough");
		TEAM_MAP.put(13, "Southampton");
		TEAM_MAP.put(14, "Stoke City");
		TEAM_MAP.put(15, "Sunderland");
		TEAM_MAP.put(16, "Swansea City");
		TEAM_MAP.put(17, "Tottenham Hotspur");
		TEAM_MAP.put(18, "Watford");
		TEAM_MAP.put(19, "West Bromwich Albion");
		TEAM_MAP.put(20, "West Ham United");
	}
	
	/**
	 * Build a {@link PlayerGameweekScoreDto} from a {@link FantasyPremierLeaguePlayer} for a specific gameweek.
	 * 
	 * @param fantasyPremierLeaguePlayer FPL player to convert.
	 * @param gameweek Gameweek to get the gameweek score for.
	 * @return Converted {@link PlayerGameweekScoreDto} for the specified gameweek.
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static PlayerGameweekScoreDto buildPlayerGameweekScoreDtoForGameweek(final FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer, final int gameweek) {

		Integer minutesPlayed = 0;
		Integer pointsScored = 0;
		
//		for (final Object allGameweeks : fantasyPremierLeaguePlayer.getFixtureHistory().getAll()) {
//			final List<Object> gameweekData = (ArrayList<Object>) allGameweeks;
//			
//			final int gameweekNumber = (Integer) gameweekData.get(1);
//			
//			if (gameweekNumber == gameweek) {
//				minutesPlayed = (Integer) gameweekData.get(3);
//				pointsScored = (Integer) gameweekData.get(19);
//				break;
//			}
//		}
//		
//		final PlayerGameweekScoreDto playerGamweekScore = new PlayerGameweekScoreDto(fantasyPremierLeaguePlayer.getId(), minutesPlayed, pointsScored);
//		return playerGamweekScore;
		return null;
	}
	
	/**
	 * Build a {@link PlayerGameweekScoreDto} from a {@link FantasyPremierLeaguePlayer} for the current gameweek.
	 * 
	 * @param fantasyPremierLeaguePlayer FPL player to convert.
	 * @return Converted {@link PlayerGameweekScoreDto} for the current gameweek.
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static PlayerGameweekScoreDto buildPlayerGameweekScoreDtoForCurrentGameweek(final FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer) {
		final PlayerGameweekScoreDto playerGamweekScore = new PlayerGameweekScoreDto(
				fantasyPremierLeaguePlayer.getId(), fantasyPremierLeaguePlayer.getMinutes(), fantasyPremierLeaguePlayer.getEventPoints());
		return playerGamweekScore;
	}
	
	/**
     * Convert a {@link FantasyPremierLeaguePlayer} to a {@link PlayerDto}.
     * 
     * @param fplPlayer {@link FantasyPremierLeaguePlayer} to convert.
     * @return Converted {@link PlayerDto}.
     */
    public static PlayerDto convertFantasyPremierLeaguePlayer(final FantasyPremierLeaguePlayer fplPlayer) {

        final PlayerDto dto = new PlayerDto(fplPlayer.getId());

        dto.setForename(fplPlayer.getFirstName());
        dto.setSurname(fplPlayer.getSecondName());
        dto.setTeam(TEAM_MAP.get(fplPlayer.getTeam()));
        dto.setPosition(Position.fromFantasyPremierLeaguePosition(fplPlayer.getElementType()));
        dto.setTotalPoints(fplPlayer.getTotalPoints());
        dto.setCurrentPrice(calculateCostNow(fplPlayer.getNowCost()));
        dto.setGoals(fplPlayer.getGoalsScored());
        dto.setAssists(fplPlayer.getAssists());
        dto.setCleanSheets(fplPlayer.getCleanSheets());
        dto.setPointsPerGame(new BigDecimal(fplPlayer.getPointsPerGame()));

        return dto;
    }
    
    /*
     * Calculate the current cost of this player based on the FPL current value.
     */
    private static BigDecimal calculateCostNow(final int nowCost) {
        final BigDecimal costNow = new BigDecimal(nowCost);

        return costNow.multiply(new BigDecimal("0.1"));
    }

}
