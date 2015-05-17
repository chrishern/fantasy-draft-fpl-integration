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
	 * Populate the player scores for the current gameweek.
	 */
	void populatePlayerScores();
	
	/**
	 * Populate the player scores for a historical gameweek.
	 */
	void populateHistoricalPlayerScores(int gameweek);
	
	/**
	 * A one off method used to get the initial FPL purchase price of players that have been selected.
	 */
	void updatePlayersWithInitialPurchasePrice();
	
	/**
	 * Update the current price of all players stored based on the current price within Fantasy Premier League.
	 */
	void updatePlayersCurrentPrice();
}
