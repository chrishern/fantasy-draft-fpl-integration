package net.blackcat.fantasy.draft.fpl.integration.controller;

import net.blackcat.fantasy.draft.fpl.integration.facade.PlayerDataFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value = "initialPlayerValueController")
public class InitialPlayerValueController {

	@Autowired
	@Qualifier(value = "playerDataFacade")
	private PlayerDataFacade playerDataFacade;
	
	public void updatePlayersWithInitialPurchasePrice() {
		playerDataFacade.updatePlayersWithInitialPurchasePrice();
	}
}
