/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.model.FixtureHistory;
import net.blackcat.fantasy.draft.integration.controller.GameweekScoreController;
import net.blackcat.fantasy.draft.integration.controller.PlayerController;
import net.blackcat.fantasy.draft.integration.controller.TeamController;
import net.blackcat.fantasy.draft.player.FplCostPlayer;
import net.blackcat.fantasy.draft.player.GameweekScorePlayer;
import net.blackcat.fantasy.draft.player.Player;
import net.blackcat.fantasy.draft.player.types.PlayerSelectionStatus;
import net.blackcat.fantasy.draft.player.types.Position;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

/**
 * Unit tests for {@link PlayerDataFacadeImpl}.
 * 
 * @author Chris
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PlayerDataFacadeImplTest {
	
	private static final int MODEL_PLAYER_1_ID = 1;
	private static final int MODEL_PLAYER_2_ID = 2;
	
	private static final String GOALKEEPER = "Goalkeeper";
	private static final String DEFENDER = "Defender";
	
	private static final String BAD_REQUEST = "Bad request";
	private static final String NOT_FOUND = "Not found";
	
	private static final String FORENAME = "Player";
	private static final String SURNAME_ONE = "One";
	private static final String TEAM_ONE = "Team1";
	private static final int PLAYER_1_COST_CHANGE = 2;
	private static final int PLAYER_1_COST_NOW = 72;

	private static final String SURNAME_TWO = "Two";
	private static final String TEAM_TWO = "Team2";
	private static final int PLAYER_2_COST_CHANGE = -3;
	private static final int PLAYER_2_COST_NOW = 102;
	
	private static final int MINUTES_PLAYED_VALUE = 45;
	private static final String MINUTES_PLAYED_LABEL = "Minutes played";

	@Mock
	private PlayerDataClient playerDataClient;
	
	@Mock
	private PlayerController playerIntegrationController;
	
	@Mock
	private TeamController teamIntegrationController;
	
	@Mock
	private GameweekScoreController gameweekScoreIntegrationController;
	
	@InjectMocks
	private PlayerDataFacadeImpl playerDataFacade = new PlayerDataFacadeImpl();
	
	@Captor
	private ArgumentCaptor<List<Player>> playerListCaptor;
	
	@Captor
	private ArgumentCaptor<Map<Integer, GameweekScorePlayer>> gameweekScorePlayerListCaptor;
	
	@Captor
	private ArgumentCaptor<Map<Integer, FplCostPlayer>> costPlayerListCaptor;
	
	private FantasyPremierLeaguePlayer player1;
	private FantasyPremierLeaguePlayer player2;
	
	private Player modelPlayer1;
	private Player modelPlayer2;
	
	@Before
	public void setup() {
		player1 = new FantasyPremierLeaguePlayer();
		player1.setId(MODEL_PLAYER_1_ID);
		player1.setFirst_name(FORENAME);
		player1.setSecond_name(SURNAME_ONE);
		player1.setTeam_name(TEAM_ONE);
		player1.setType_name(GOALKEEPER);
		player1.setNow_cost(PLAYER_1_COST_NOW);
		player1.setCost_change_start(PLAYER_1_COST_CHANGE);
		
		player2 = new FantasyPremierLeaguePlayer();
		player2.setId(MODEL_PLAYER_2_ID);
		player2.setFirst_name(FORENAME);
		player2.setSecond_name(SURNAME_TWO);
		player2.setTeam_name(TEAM_TWO);
		player2.setType_name(DEFENDER);
		player2.setNow_cost(PLAYER_2_COST_NOW);
		player2.setCost_change_start(PLAYER_2_COST_CHANGE);
		
		modelPlayer1 = new Player();
		modelPlayer1.setId(MODEL_PLAYER_1_ID);
		
		modelPlayer2 = new Player();
		modelPlayer2.setId(MODEL_PLAYER_2_ID);
	}
	
	@Test
	public void testPerformInitialPlayerDataLoad_DataSuccessfullyRead() {
		// arrange
		when(playerDataClient.getPlayer(1)).thenReturn(player1);
		when(playerDataClient.getPlayer(2)).thenReturn(player2);
		when(playerDataClient.getPlayer(3)).thenThrow(new FantasyPremierLeagueException(HttpStatus.NOT_FOUND, NOT_FOUND));
		
		// act
		playerDataFacade.performInitialPlayerDataLoad();
		
		// assert
		verify(playerIntegrationController).addPlayers(playerListCaptor.capture());
		
		assertThat(playerListCaptor.getValue()).hasSize(2);
		
		assertThat(playerListCaptor.getValue().get(0).getForename()).isEqualTo(FORENAME);
		assertThat(playerListCaptor.getValue().get(0).getSurname()).isEqualTo(SURNAME_ONE);
		assertThat(playerListCaptor.getValue().get(0).getTeam()).isEqualTo(TEAM_ONE);
		
		assertThat(playerListCaptor.getValue().get(1).getForename()).isEqualTo(FORENAME);
		assertThat(playerListCaptor.getValue().get(1).getSurname()).isEqualTo(SURNAME_TWO);
		assertThat(playerListCaptor.getValue().get(1).getTeam()).isEqualTo(TEAM_TWO);
	}

	@Test
	public void testPerformInitialPlayerDataLoad_NoDataRead() {
		// arrange
		when(playerDataClient.getPlayer(1)).thenThrow(new FantasyPremierLeagueException(HttpStatus.NOT_FOUND, NOT_FOUND));
		
		// act
		playerDataFacade.performInitialPlayerDataLoad();
		
		// assert
		verify(playerIntegrationController, never()).addPlayers(anyListOf(Player.class));
	}
	
	@Test
	public void testPerformInitialPlayerDataLoad_ResponseCodeOtherThan401() {
		// arrange
		when(playerDataClient.getPlayer(1)).thenReturn(player1);
		when(playerDataClient.getPlayer(2)).thenThrow(new FantasyPremierLeagueException(HttpStatus.BAD_REQUEST, BAD_REQUEST));
		
		// act
		playerDataFacade.performInitialPlayerDataLoad();
		
		// assert
		verify(playerIntegrationController).addPlayers(playerListCaptor.capture());
		
		assertThat(playerListCaptor.getValue()).hasSize(1);
		
		assertThat(playerListCaptor.getValue().get(0).getForename()).isEqualTo(FORENAME);
		assertThat(playerListCaptor.getValue().get(0).getSurname()).isEqualTo(SURNAME_ONE);
		assertThat(playerListCaptor.getValue().get(0).getTeam()).isEqualTo(TEAM_ONE);
	}
	
	@Test
	public void testPopulatePlayerScores() {
		// arrange
		final List<Object> eventExplain = new ArrayList<Object>();
		
		final List<Object> eventExplainMinsPlayed = new ArrayList<Object>();
		eventExplainMinsPlayed.add(MINUTES_PLAYED_LABEL);
		eventExplainMinsPlayed.add(MINUTES_PLAYED_VALUE);
		
		eventExplain.add(eventExplainMinsPlayed);
		
		player1.setEvent_explain(eventExplain);
		player2.setEvent_explain(eventExplain);
		
		when(playerIntegrationController.getPlayers(Position.GOALKEEPER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer1));
		when(playerIntegrationController.getPlayers(Position.DEFENDER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer2));
		when(playerIntegrationController.getPlayers(Position.MIDFIEDER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		when(playerIntegrationController.getPlayers(Position.STRIKER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		
		when(playerDataClient.getPlayer(MODEL_PLAYER_1_ID)).thenReturn(player1);
		when(playerDataClient.getPlayer(MODEL_PLAYER_2_ID)).thenReturn(player2);
		
		// act
		playerDataFacade.populatePlayerScores();
		
		// assert
		verify(gameweekScoreIntegrationController).storeGameweekScores(gameweekScorePlayerListCaptor.capture());
		
		assertThat(gameweekScorePlayerListCaptor.getValue().entrySet()).hasSize(2);
		
		assertThat(gameweekScorePlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getId()).isEqualTo(MODEL_PLAYER_1_ID);
		assertThat(gameweekScorePlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getId()).isEqualTo(MODEL_PLAYER_2_ID);
	}
	
	@Test
	public void testPopulateHistoricalPlayerScores() {
		// arrange
		final FixtureHistory fixtureHistory = new FixtureHistory();
		
		final List<Object> gameweekOne = createGameweekData(1, 90, 10);
		final List<Object> gameweekTwo = createGameweekData(2, 70, 2);
		final List<Object> gameweekThree = createGameweekData(3, 41, 6);
		final List<Object> gameweekFour = createGameweekData(4, 0, 0);
		
		final List<Object> allGameweeks = new ArrayList<Object>();
		allGameweeks.add(gameweekOne);
		allGameweeks.add(gameweekTwo);
		allGameweeks.add(gameweekThree);
		allGameweeks.add(gameweekFour);
		
		fixtureHistory.setAll(allGameweeks);
		
		player1.setFixture_history(fixtureHistory);
		player2.setFixture_history(fixtureHistory);
		
		when(playerIntegrationController.getPlayers(Position.GOALKEEPER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer1));
		when(playerIntegrationController.getPlayers(Position.DEFENDER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer2));
		when(playerIntegrationController.getPlayers(Position.MIDFIEDER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		when(playerIntegrationController.getPlayers(Position.STRIKER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		
		when(playerDataClient.getPlayer(MODEL_PLAYER_1_ID)).thenReturn(player1);
		when(playerDataClient.getPlayer(MODEL_PLAYER_2_ID)).thenReturn(player2);
		
		// act
		playerDataFacade.populateHistoricalPlayerScores(1);
		
		// assert
		verify(gameweekScoreIntegrationController).storeGameweekScores(gameweekScorePlayerListCaptor.capture());
		
		assertThat(gameweekScorePlayerListCaptor.getValue().entrySet()).hasSize(2);
		
		assertThat(gameweekScorePlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getId()).isEqualTo(MODEL_PLAYER_1_ID);
		assertThat(gameweekScorePlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getId()).isEqualTo(MODEL_PLAYER_2_ID);
	}
	
	@Test
	public void testUpdatePlayersWithInitialPurchasePrice() {
		// arrange
		when(playerDataClient.getPlayer(1)).thenReturn(player1);
		when(playerDataClient.getPlayer(2)).thenReturn(player2);
		
		when(playerIntegrationController.getPlayers(Position.GOALKEEPER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer1));
		when(playerIntegrationController.getPlayers(Position.DEFENDER, PlayerSelectionStatus.SELECTED)).thenReturn(Arrays.asList(modelPlayer2));
		when(playerIntegrationController.getPlayers(Position.MIDFIEDER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		when(playerIntegrationController.getPlayers(Position.STRIKER, PlayerSelectionStatus.SELECTED)).thenReturn(new ArrayList<Player>());
		
		// act
		playerDataFacade.updatePlayersWithInitialPurchasePrice();
		
		// assert
		verify(teamIntegrationController).updateSelectedPlayersWithIntialFplCost(costPlayerListCaptor.capture());
		
		assertThat(costPlayerListCaptor.getValue().entrySet()).hasSize(2);
		
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getId()).isEqualTo(MODEL_PLAYER_1_ID);
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getInitialCost().doubleValue()).isEqualTo(7.0);
		
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getId()).isEqualTo(MODEL_PLAYER_2_ID);
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getInitialCost().doubleValue()).isEqualTo(10.5);
	}
	
	@Test
	public void testUpdatePlayersCurrentPrice() {
		// arrange
		when(playerIntegrationController.getPlayers()).thenReturn(Arrays.asList(modelPlayer1, modelPlayer2));
		
		when(playerDataClient.getPlayer(1)).thenReturn(player1);
		when(playerDataClient.getPlayer(2)).thenReturn(player2);
		
		// act
		playerDataFacade.updatePlayersCurrentPrice();
		
		// assert
		verify(playerIntegrationController).updatePlayersCurrentPrice(costPlayerListCaptor.capture());
		
		assertThat(costPlayerListCaptor.getValue().entrySet()).hasSize(2);
		
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getId()).isEqualTo(MODEL_PLAYER_1_ID);
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_1_ID).getCurrentCost().doubleValue()).isEqualTo(7.2);
		
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getId()).isEqualTo(MODEL_PLAYER_2_ID);
		assertThat(costPlayerListCaptor.getValue().get(MODEL_PLAYER_2_ID).getCurrentCost().doubleValue()).isEqualTo(10.2);
	}
	
	private List<Object> createGameweekData(final int gameweekNumber, final int minutesPlayed, final int totalPoints) {
		final List<Object> gameweekOne = new ArrayList<Object>();
		
		gameweekOne.add("16 Aug 17:30");
		gameweekOne.add(gameweekNumber);
		gameweekOne.add("CRY(H) 2-1");
		gameweekOne.add(minutesPlayed);
		gameweekOne.add(1);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(1);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(0);
		gameweekOne.add(3);
		gameweekOne.add(40);
		gameweekOne.add(34);
		gameweekOne.add(0);
		gameweekOne.add(90);
		gameweekOne.add(totalPoints);
		
		return gameweekOne;
	}
}
