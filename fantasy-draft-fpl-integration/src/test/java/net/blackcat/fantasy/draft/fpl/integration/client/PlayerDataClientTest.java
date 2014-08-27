/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import static org.fest.assertions.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.ArrayList;
import java.util.List;

import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

/**
 * Unit tests for {@link PlayerDataClient}
 * 
 * @author Chris
 *
 */
@ContextConfiguration(value = "/fplIntegrationTestContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PlayerDataClientTest {

	private static final String FPL_ENDPOINT = "http://fantasy.premierleague.com/web/api/elements/%s/";
	
	private String playerJson;
	private String playerWithGameweekScoreJson;
	private int playerToRequest;
	
	@Autowired
	@Qualifier(value = "fplRestTemplate")
    private RestTemplate restTemplate;

	@Autowired
	private PlayerDataClient playerDataClient;
	
    private MockRestServiceServer mockServer;
	
    @Before
    public void setUp() throws Exception {
        mockServer = MockRestServiceServer.createServer(restTemplate);

        playerToRequest = 1;
        
        final ClassPathResource playerClassPathResource = new ClassPathResource("/jsonResponse/player.xml");
        playerJson = FileUtils.readFileToString(playerClassPathResource.getFile());
        
        final ClassPathResource playerWithScoreClassPathResource = new ClassPathResource("/jsonResponse/player_with_gameweek_score.xml");
        playerWithGameweekScoreJson = FileUtils.readFileToString(playerWithScoreClassPathResource.getFile());
    }
    
	@Test
	public void testGetPlayer_Success() {
		// arrange
		mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
        	.andRespond(withSuccess(playerJson, MediaType.APPLICATION_JSON));
		
		// act
		final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(playerToRequest);
		
		// assert
		mockServer.verify();
		assertThat(fplPlayer.getId()).isEqualTo(180);
		assertThat(fplPlayer.getFirst_name()).isEqualTo("Wes");
		assertThat(fplPlayer.getSecond_name()).isEqualTo("Morgan");
		assertThat(fplPlayer.getTeam_name()).isEqualTo("Leicester");
		assertThat(fplPlayer.getType_name()).isEqualTo("Defender");
	}

	@Test(expected = FantasyPremierLeagueException.class)
	public void testGetPlayer_EndpointThrowsException() {
		// arrange
		mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
    		.andRespond(withStatus(HttpStatus.NOT_FOUND));
	
		// act
		playerDataClient.getPlayer(playerToRequest);
		
		// assert
		Assert.fail("Exception expected.");
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void testGetPlayer_WithGameweekPoints() {
		// arrange
		mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
    		.andRespond(withSuccess(playerWithGameweekScoreJson, MediaType.APPLICATION_JSON));
		
		// act
		final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(playerToRequest);
		
		// assert
		mockServer.verify();
		assertThat(fplPlayer.getId()).isEqualTo(25);
		assertThat(fplPlayer.getFirst_name()).isEqualTo("Olivier");
		assertThat(fplPlayer.getSecond_name()).isEqualTo("Giroud");
		assertThat(fplPlayer.getTeam_name()).isEqualTo("Arsenal");
		assertThat(fplPlayer.getType_name()).isEqualTo("Forward");
		assertThat(fplPlayer.getEvent_total()).isEqualTo(5);
		assertThat(fplPlayer.getEvent_explain()).hasSize(2);
		assertThat(fplPlayer.getEvent_explain().get(0)).isInstanceOf(ArrayList.class);
		
		final List<Object> eventExplain = (ArrayList<Object>) fplPlayer.getEvent_explain().get(0);
		assertThat(eventExplain).hasSize(3);
		assertThat(eventExplain.get(0)).isInstanceOf(String.class);
		assertThat(eventExplain.get(1)).isInstanceOf(Integer.class);
		
		final String label = (String) eventExplain.get(0);
		assertThat(label).isEqualTo("Minutes played");
		
		final Integer minutesPlayer = (Integer) eventExplain.get(1);
		assertThat(minutesPlayer).isEqualTo(45);
	}
}
