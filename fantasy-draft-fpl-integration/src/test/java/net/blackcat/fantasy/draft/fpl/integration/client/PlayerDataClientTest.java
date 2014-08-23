/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import static org.fest.assertions.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
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
        
        final ClassPathResource classPathResource = new ClassPathResource("/jsonResponse/player.xml");
        playerJson = FileUtils.readFileToString(classPathResource.getFile());
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
}
