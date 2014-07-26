/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.exception.FantasyPremierLeagueException;
import net.blackcat.fantasy.draft.fpl.integration.model.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.integration.controller.PlayerController;
import net.blackcat.fantasy.draft.player.Player;

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

	private static final String GOALKEEPER = "Goalkeeper";
	private static final String DEFENDER = "Defender";
	private static final String BAD_REQUEST = "Bad request";
	private static final String NOT_FOUND = "Not found";
	private static final String FORENAME = "Player";
	private static final String SURNAME_ONE = "One";
	private static final String TEAM_ONE = "Team1";
	private static final String SURNAME_TWO = "Two";
	private static final String TEAM_TWO = "Team2";

	@Mock
	private PlayerDataClient playerDataClient;
	
	@Mock
	private PlayerController playerIntegrationController;
	
	@InjectMocks
	private PlayerDataFacadeImpl playerDataFacade = new PlayerDataFacadeImpl();
	
	@Captor
	private ArgumentCaptor<List<Player>> playerListCaptor;
	
	private FantasyPremierLeaguePlayer player1;
	private FantasyPremierLeaguePlayer player2;
	
	@Before
	public void setup() {
		player1 = new FantasyPremierLeaguePlayer();
		player1.setFirst_name(FORENAME);
		player1.setSecond_name(SURNAME_ONE);
		player1.setTeam_name(TEAM_ONE);
		player1.setType_name(GOALKEEPER);
		
		player2 = new FantasyPremierLeaguePlayer();
		player2.setFirst_name(FORENAME);
		player2.setSecond_name(SURNAME_TWO);
		player2.setTeam_name(TEAM_TWO);
		player2.setType_name(DEFENDER);
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
}
