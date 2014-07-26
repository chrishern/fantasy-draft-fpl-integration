/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * REST client which invokes the Fantasy Premier League REST endpoint to get player data.
 * 
 * @author Chris
 *
 */
@Service(value = "playerDataClient")
public class PlayerDataClient {

	@Autowired
	@Qualifier(value = "fplRestTemplate")
	private RestTemplate restTemplate;
	
	private static final String ENDPOINT = "http://fantasy.premierleague.com/web/api/elements/%s/";

	public FantasyPremierLeaguePlayer getPlayer(int playerId) throws FantasyPremierLeagueException {
		final String url = String.format(ENDPOINT, playerId);
		
		final FantasyPremierLeaguePlayer player = restTemplate.getForObject(url, FantasyPremierLeaguePlayer.class);
		
		return player;
	}
}
