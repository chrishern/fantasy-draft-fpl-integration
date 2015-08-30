/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.testdata;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;

/**
 * Class for building instance of {@link FantasyPremierLeaguePlayer} to use in unit tests.
 * 
 * @author Chris
 *
 */
public class FantasyPremierLeaguePlayerTestDataBuilder {

	private final int DEFAULT_ID = 1;
	private final int DEFAULT_TOTAL_POINTS = 34;
	private final int DEFAULT_GOALS = 2;
	private final int DEFAULT_ASSISTS = 5;
	private final int DEFAULT_CLEAN_SHEETS = 0;
	private final double DEFAULT_POINTS_PER_GAME = 3.5;
	private final int DEFAULT_NOW_COST = 7;
	
	private FantasyPremierLeaguePlayer fplPlayer;
	
	private FantasyPremierLeaguePlayerTestDataBuilder() {
		fplPlayer = new FantasyPremierLeaguePlayer();
		fplPlayer.setId(DEFAULT_ID);
		fplPlayer.setNowCost(DEFAULT_NOW_COST);
	}
	
	public static FantasyPremierLeaguePlayerTestDataBuilder aFantasyPremierLeaguePlayer() {
		return new FantasyPremierLeaguePlayerTestDataBuilder();
	}
	
	public FantasyPremierLeaguePlayerTestDataBuilder withStatistics() {
		fplPlayer.setAssists(DEFAULT_ASSISTS);
		fplPlayer.setTotalPoints(DEFAULT_TOTAL_POINTS);
		fplPlayer.setGoalsScored(DEFAULT_GOALS);
		fplPlayer.setCleanSheets(DEFAULT_CLEAN_SHEETS);
		fplPlayer.setPointsPerGame(String.valueOf(DEFAULT_POINTS_PER_GAME));
		
		return this;
	}
	
	public FantasyPremierLeaguePlayer build() {
		return fplPlayer;
	}
}
