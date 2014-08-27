/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

/**
 * Facade for Fantasy Premier League player data.
 * 
 * @author Chris
 *
 */
public interface PlayerDataFacade {

	/**
	 * Perform the initial population of player data from the Fantasy Premier League database to the Fantasy Draft database. 
	 */
	void performInitialPlayerDataLoad();
	
	/**
	 * Populate the player scores for a given gameweek.
	 * 
	 * @param gameweek Gameweek to populate the player scores for.
	 */
	void populatePlayerScores(int gameweek);
}
