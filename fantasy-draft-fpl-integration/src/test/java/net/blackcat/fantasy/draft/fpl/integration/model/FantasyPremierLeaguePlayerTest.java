/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.model;

import static org.fest.assertions.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import net.blackcat.fantasy.draft.player.GameweekScorePlayer;

import org.junit.Test;

/**
 * Unit tests for 
 * 
 * @author Chris
 *
 */
public class FantasyPremierLeaguePlayerTest {

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

}
