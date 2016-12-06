/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.client;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit tests for {@link PlayerDataClient}
 * 
 * @author Chris
 * 
 */
@ContextConfiguration(value = "/fplIntegrationTestContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PlayerDataClientTest {

//    private static final String FPL_ENDPOINT = "http://fantasy.premierleague.com/web/api/elements/%s/";
//
//    private String playerJson;
//    private String playerWithGameweekScoreJson;
//    private int playerToRequest;
//
//    @Autowired
//    @Qualifier(value = "fplRestTemplate")
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private PlayerDataClient playerDataClient;
//
//    private MockRestServiceServer mockServer;
//
//    @Before
//    public void setUp() throws Exception {
//        mockServer = MockRestServiceServer.createServer(restTemplate);
//
//        playerToRequest = 1;
//
//        final ClassPathResource playerClassPathResource = new ClassPathResource("/jsonResponse/player.xml");
//        playerJson = FileUtils.readFileToString(playerClassPathResource.getFile());
//
//        final ClassPathResource playerWithScoreClassPathResource = new ClassPathResource("/jsonResponse/player_with_gameweek_score.xml");
//        playerWithGameweekScoreJson = FileUtils.readFileToString(playerWithScoreClassPathResource.getFile());
//    }
//
//    @Test
//    public void testGetPlayer_Success() {
//        // arrange
//        mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
//                .andRespond(withSuccess(playerJson, MediaType.APPLICATION_JSON));
//
//        // act
//        final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(playerToRequest);
//
//        // assert
//        mockServer.verify();
//        assertThat(fplPlayer.getId()).isEqualTo(180);
//        assertThat(fplPlayer.getFirstName()).isEqualTo("Wes");
//        assertThat(fplPlayer.getSecondName()).isEqualTo("Morgan");
//        assertThat(fplPlayer.getTeamName()).isEqualTo("Leicester");
//        assertThat(fplPlayer.getTypeName()).isEqualTo("Defender");
//    }
//
//    @Test(expected = FantasyPremierLeagueException.class)
//    public void testGetPlayer_EndpointThrowsException() {
//        // arrange
//        mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
//                .andRespond(withStatus(HttpStatus.NOT_FOUND));
//
//        // act
//        playerDataClient.getPlayer(playerToRequest);
//
//        // assert
//        Assert.fail("Exception expected.");
//    }
//
//    @Test
//    @SuppressWarnings("unchecked")
//    public void testGetPlayer_WithGameweekPoints() {
//        // arrange
//        mockServer.expect(requestTo(String.format(FPL_ENDPOINT, playerToRequest))).andExpect(method(HttpMethod.GET))
//                .andRespond(withSuccess(playerWithGameweekScoreJson, MediaType.APPLICATION_JSON));
//
//        // act
//        final FantasyPremierLeaguePlayer fplPlayer = playerDataClient.getPlayer(playerToRequest);
//
//        // assert
//        mockServer.verify();
//        assertThat(fplPlayer.getId()).isEqualTo(25);
//        assertThat(fplPlayer.getFirstName()).isEqualTo("Olivier");
//        assertThat(fplPlayer.getSecondName()).isEqualTo("Giroud");
//        assertThat(fplPlayer.getTeamName()).isEqualTo("Arsenal");
//        assertThat(fplPlayer.getTypeName()).isEqualTo("Forward");
//        assertThat(fplPlayer.getEventTotal()).isEqualTo(5);
//
//        // event_explain tests
//        assertThat(fplPlayer.getEventExplain()).hasSize(2);
//        assertThat(fplPlayer.getEventExplain().get(0)).isInstanceOf(ArrayList.class);
//
//        final List<Object> eventExplain = (ArrayList<Object>) fplPlayer.getEventExplain().get(0);
//        assertThat(eventExplain).hasSize(3);
//        assertThat(eventExplain.get(0)).isInstanceOf(String.class);
//        assertThat(eventExplain.get(1)).isInstanceOf(Integer.class);
//
//        final String label = (String) eventExplain.get(0);
//        assertThat(label).isEqualTo("Minutes played");
//
//        final Integer minutesPlayer = (Integer) eventExplain.get(1);
//        assertThat(minutesPlayer).isEqualTo(45);
//
//        // fixture_history tests
//        assertThat(fplPlayer.getFixtureHistory()).isNotNull();
//        assertThat(fplPlayer.getFixtureHistory().getAll()).hasSize(2);
//
//        final List<Object> gameweekOne = (ArrayList<Object>) fplPlayer.getFixtureHistory().getAll().get(0);
//
//        final Integer minutesPlayerGameweekOne = (Integer) gameweekOne.get(3);
//        assertThat(minutesPlayerGameweekOne).isEqualTo(29);
//
//        final Integer totalScoreGameweekOne = (Integer) gameweekOne.get(19);
//        assertThat(totalScoreGameweekOne).isEqualTo(1);
//    }
}
