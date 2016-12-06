/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.controller;

import net.blackcat.fantasy.draft.fpl.integration.facade.PlayerDataFacade;
import net.blackcat.fantasy.draft.integration.exception.FantasyDraftIntegrationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author Chris
 *
 */
@Controller(value = "calculateGameweekScoresController")
public class CalculateGameweekScoresController {

	@Autowired
	@Qualifier(value = "playerDataFacade")
	private PlayerDataFacade playerDataFacade;
	
	public static void main(String [] args) {
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String []{"fplIntegrationContext.xml", "mysqlDatasourceContext.xml"});
		
		ctx.registerShutdownHook();
		
		final CalculateGameweekScoresController mainMethod = ctx.getBean(CalculateGameweekScoresController.class);
		try {
			mainMethod.performInitialLoad();
		} catch (final FantasyDraftIntegrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctx.close();
	}
	
	private void performInitialLoad() throws FantasyDraftIntegrationException {
//		playerDataFacade.calculateCurrentGameweekScores();
	}
}
