/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.model;

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
public class FantasyPremierLeaguePlayer {

	private int id;
	private String first_name;
	private String second_name;
	private String team_name;
	private String type_name;
	
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
	 * Convert this object into a draft model {@link Player}.
	 * 
	 * @return Converted draft model {@link Player}.
	 */
	public Player toPlayer() {
		final Player player = new Player();
		
		player.setForename(first_name);
		player.setSurname(second_name);
		player.setTeam(team_name);
		player.setPosition(Position.fromFantasyPremierLeaguePosition(type_name));
		
		return player;
	}
}
