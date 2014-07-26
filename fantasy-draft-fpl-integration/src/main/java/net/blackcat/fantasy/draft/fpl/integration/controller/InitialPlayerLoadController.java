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
@Controller(value = "initialPlayerLoadController")
public class InitialPlayerLoadController {

	@Autowired
	@Qualifier(value = "playerDataFacade")
	private static PlayerDataFacade playerDataFacade;
	
	public static void main(String [] args) {
		final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String []{"fplIntegrationContext.xml"});
		
		ctx.registerShutdownHook();
		
		playerDataFacade.performInitialPlayerDataLoad();
		
		ctx.close();
	}
}
