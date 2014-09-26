/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.model;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import net.blackcat.fantasy.draft.player.FplCostPlayer;
import net.blackcat.fantasy.draft.player.GameweekScorePlayer;

import org.junit.Test;

/**
 * Unit tests for {@link FantasyPremierLeaguePlayer}.
 * 
 * @author Chris
 *
 */
public class FantasyPremierLeaguePlayerTest {

	private static final double PLAYER_CURRENT_COST_DECIMAL = 10.4d;
	private static final double PLAYER_INITIAL_COST = 10.5d;
	private static final int PLAYER_COST_CHANGE = -1;
	private static final int PLAYER_CURRENT_COST = 104;
	private static final int POINTS_SCORED = 1;
	private static final int MINUTES_PLAYED_VALUE = 45;
	private static final String MINUTES_PLAYED_LABEL = "Minutes played";
	private static final int PLAYER_ID = 12;

	@Test
	public void testToGameweekScorePlayer() {
		// arrange
		final FantasyPremierLeaguePlayer fplPlayer = new FantasyPremierLeaguePlayer();
		fplPlayer.setId(PLAYER_ID);
		fplPlayer.setEvent_total(POINTS_SCORED);
		
		final List<Object> eventExplain = new ArrayList<Object>();
		
		final List<Object> eventExplainMinsPlayed = new ArrayList<Object>();
		eventExplainMinsPlayed.add(MINUTES_PLAYED_LABEL);
		eventExplainMinsPlayed.add(MINUTES_PLAYED_VALUE);
		
		eventExplain.add(eventExplainMinsPlayed);
		
		fplPlayer.setEvent_explain(eventExplain);
		
		// act
		final GameweekScorePlayer gameweekScorePlayer = fplPlayer.toGameweekScorePlayer();
		
		// assert
		assertThat(gameweekScorePlayer.getId()).isEqualTo(PLAYER_ID);
		assertThat(gameweekScorePlayer.getMinutesPlayed()).isEqualTo(MINUTES_PLAYED_VALUE);
		assertThat(gameweekScorePlayer.getScore()).isEqualTo(POINTS_SCORED);
	}
	
	@Test
	public void testToPopulateInitialFplCostPlayer() {
		// arrange
		final FantasyPremierLeaguePlayer fplPlayer = new FantasyPremierLeaguePlayer();
		fplPlayer.setId(PLAYER_ID);
		fplPlayer.setNow_cost(PLAYER_CURRENT_COST);
		fplPlayer.setCost_change_start(PLAYER_COST_CHANGE);
		
		// act
		final FplCostPlayer fplCostPlayer = fplPlayer.toPopulateFplCostPlayer();
		
		// assert
		assertThat(fplCostPlayer.getId()).isEqualTo(PLAYER_ID);
		assertThat(fplCostPlayer.getInitialCost().doubleValue()).isEqualTo(PLAYER_INITIAL_COST);
		assertThat(fplCostPlayer.getCurrentCost().doubleValue()).isEqualTo(PLAYER_CURRENT_COST_DECIMAL);
	}

}
