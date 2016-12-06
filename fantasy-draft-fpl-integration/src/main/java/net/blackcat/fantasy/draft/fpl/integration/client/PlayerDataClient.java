/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import java.util.List;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayerDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

//    private static final String ENDPOINT = "http://fantasy.premierleague.com/web/api/elements/%s/";
    private static final String ALL_PLAYERS_ENDPOINT = "https://fantasy.premierleague.com/drf/elements/";
    private static final String SINGLE_PLAYER_ENDPOINT = "https://fantasy.premierleague.com/drf/element-summary/%s";

    public List<FantasyPremierLeaguePlayer> getPlayers() {
        final ResponseEntity<List<FantasyPremierLeaguePlayer>> response = 
        		restTemplate.exchange(ALL_PLAYERS_ENDPOINT, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<FantasyPremierLeaguePlayer>>() {});
        
        return response.getBody();
    }
    
    public FantasyPremierLeaguePlayerDetail getPlayer(int playerId) {
        final String url = String.format(SINGLE_PLAYER_ENDPOINT, playerId);

        System.out.println("Calling FPL for player: " + playerId);
        System.out.println(url);
        
        final FantasyPremierLeaguePlayerDetail player = restTemplate.getForObject(url, FantasyPremierLeaguePlayerDetail.class);
        System.out.println("Done");
        
        return player;
    }
}
