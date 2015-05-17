/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.controller;

import net.blackcat.fantasy.draft.fpl.integration.facade.PlayerDataFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author Chris
 *
 */
@Controller(value = "calculateGameweekPointsController")
public class CalculateGameweekPointsController {

	@Autowired
	@Qualifier(value = "playerDataFacade")
	private PlayerDataFacade playerDataFacade;
	
	public static void main(String [] args) {
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String []{"fplIntegrationContext.xml", "mysqlDatasourceContext.xml"});
		
		ctx.registerShutdownHook();
		
		final CalculateGameweekPointsController mainMethod = ctx.getBean(CalculateGameweekPointsController.class);
		mainMethod.calculateGameweekPoints();
		
		ctx.close();
	}
	
	/**
	 * Calculate the gameweek points for the current gameweek.
	 */
	public void calculateGameweekPoints() {
		playerDataFacade.populatePlayerScores();
	}
	
	/**
	 * Calculate the gameweek points for a historical gameweek.
	 * 
	 * @param gameweek Gameweek to calculate the weekly points for.
	 */
	public void calculateHistoricalGameweekPoints(final int gameweek) {
		playerDataFacade.populateHistoricalPlayerScores(gameweek);
	}
 }
