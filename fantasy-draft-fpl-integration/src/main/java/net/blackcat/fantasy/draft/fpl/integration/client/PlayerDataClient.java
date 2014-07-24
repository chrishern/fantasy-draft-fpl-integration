/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueResponseErrorHandler;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;

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

	private RestTemplate restTemplate;
	
	private static final String ENDPOINT = "http://fantasy.premierleague.com/web/api/elements/%s/";

	public PlayerDataClient() {
		restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new FantasyPremierLeagueResponseErrorHandler());
	}
	
	public FantasyPremierLeaguePlayer getPlayer(int playerId) throws FantasyPremierLeagueException {
		final String url = String.format(ENDPOINT, playerId);
		
		final FantasyPremierLeaguePlayer player = restTemplate.getForObject(url, FantasyPremierLeaguePlayer.class);
		
		System.out.println("Player name: " + player.getFirst_name() + " " + player.getSecond_name());
		System.out.println("Team: " + player.getTeam_name());
		System.out.println("Position: " + player.getType_name());
		
		return player;
	}
	
	public static void main(final String [] args) {
		final PlayerDataClient client = new PlayerDataClient();
		
		for (int i = 0; i < 40; i++) {
			try {
				client.getPlayer(i);
			} catch (final FantasyPremierLeagueException e) {
				System.out.println("Custom exception.  " + e.getStatusCode() + ", " + e.getBody()); 
			}
		}
	}
}
