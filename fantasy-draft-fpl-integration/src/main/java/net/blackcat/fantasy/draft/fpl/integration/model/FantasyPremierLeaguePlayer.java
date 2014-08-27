/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.blackcat.fantasy.draft.player.GameweekScorePlayer;
import net.blackcat.fantasy.draft.player.Player;
import net.blackcat.fantasy.draft.player.types.Position;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model object representing a Fantasy Premier League player.
 * 
 * @author Chris
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FantasyPremierLeaguePlayer implements Serializable {

	private static final long serialVersionUID = 7326675443829823877L;

	private int id;
	private String first_name;
	private String second_name;
	private String team_name;
	private String type_name;
	private List<Object> event_explain;
	private int event_total;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	/**
	 * @return the second_name
	 */
	public String getSecond_name() {
		return second_name;
	}
	
	/**
	 * @param second_name the second_name to set
	 */
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	
	/**
	 * @return the team_name
	 */
	public String getTeam_name() {
		return team_name;
	}
	
	/**
	 * @param team_name the team_name to set
	 */
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	/**
	 * @return the type_name
	 */
	public String getType_name() {
		return type_name;
	}
	
	/**
	 * @param type_name the type_name to set
	 */
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	/**
	 * @return the event_explain
	 */
	public List<Object> getEvent_explain() {
		return event_explain;
	}

	/**
	 * @param event_explain the event_explain to set
	 */
	public void setEvent_explain(List<Object> event_explain) {
		this.event_explain = event_explain;
	}

	/**
	 * @return the event_total
	 */
	public int getEvent_total() {
		return event_total;
	}

	/**
	 * @param event_total the event_total to set
	 */
	public void setEvent_total(int event_total) {
		this.event_total = event_total;
	}

	/**
	 * Convert this object into a draft model {@link Player}.
	 * 
	 * @return Converted draft model {@link Player}.
	 */
	public Player toPlayer() {
		final Player player = new Player();
		
		player.setId(id);
		player.setForename(first_name);
		player.setSurname(second_name);
		player.setTeam(team_name);
		player.setPosition(Position.fromFantasyPremierLeaguePosition(type_name));
		
		return player;
	}
	
	/**
	 * Convert this object into a draft model {@link GameweekScorePlayer}.
	 * 
	 * @return Converted {@link GameweekScorePlayer}.
	 */
	@SuppressWarnings("unchecked")
	public GameweekScorePlayer toGameweekScorePlayer() {
		final GameweekScorePlayer gameweekScore = new GameweekScorePlayer();
		
		gameweekScore.setId(id);
		gameweekScore.setScore(event_total);
		
		for (final Object event : event_explain) {
			final List<Object> eventExplainItems = (ArrayList<Object>) event;
			
			final String eventLabel = (String) eventExplainItems.get(0);
			
			if (eventLabel.equalsIgnoreCase("Minutes played")) {
				final Integer minutesPlayed = (Integer) eventExplainItems.get(1);
				gameweekScore.setMinutesPlayed(minutesPlayed);
				break;
			}
		}
		
		return gameweekScore;
	}
}
