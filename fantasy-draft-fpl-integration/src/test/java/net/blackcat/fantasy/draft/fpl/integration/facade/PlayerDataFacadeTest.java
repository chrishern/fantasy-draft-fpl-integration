/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.testdata.FantasyPremierLeaguePlayerTestDataBuilder;
import net.blackcat.fantasy.draft.integration.facade.GameweekFacade;
import net.blackcat.fantasy.draft.integration.facade.PlayerFacade;
import net.blackcat.fantasy.draft.integration.facade.TeamFacade;
import net.blackcat.fantasy.draft.integration.facade.dto.PlayerDto;
import net.blackcat.fantasy.draft.integration.testdata.dto.PlayerDtoTestDataBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit tests for {@link PlayerDataFacade}.
 * 
 * @author Chris
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PlayerDataFacadeTest {

	@Captor
	private ArgumentCaptor<List<PlayerDto>> playerDtoListCaptor;
	
	@Captor
	private ArgumentCaptor<Map<Integer, PlayerDto>> playerDtoMapCaptor;
	
	@Mock
	private PlayerDataClient playerDataClient;
    
	@Mock
	private PlayerFacade playerIntegrationFacade;
	
	@Mock
	private TeamFacade teamIntegrationFacade;
	
	@Mock
	private GameweekFacade gameweekIntegrationFacade;
	
	private PlayerDataFacade playerDataFacade;

	private FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer;
	
	@Before
	public void setup() {
		playerDataFacade = new PlayerDataFacade(playerDataClient, playerIntegrationFacade, gameweekIntegrationFacade, teamIntegrationFacade);

		final PlayerDto playerDto = PlayerDtoTestDataBuilder.aPlayer().build();
		fantasyPremierLeaguePlayer = FantasyPremierLeaguePlayerTestDataBuilder.aFantasyPremierLeaguePlayer().withStatistics().build();
		
		when(playerIntegrationFacade.getPlayers()).thenReturn(Arrays.asList(playerDto));
		when(playerDataClient.getPlayer(playerDto.getId())).thenReturn(fantasyPremierLeaguePlayer);
	}
	
	@Test
	public void testUpdateExistingPlayerStatistics() throws Exception {
		// arrange
		
		// act
		playerDataFacade.updateExistingPlayerStatistics();
		
		// assert
		verify(playerIntegrationFacade).updatePlayersStatistics(playerDtoListCaptor.capture());
		
		assertThat(playerDtoListCaptor.getValue()).hasSize(1);
	}

	@Test
	public void testUpdateExistingPlayerPriceData() throws Exception {
		// arrange
		
		// act
		playerDataFacade.updateExistingPlayerPriceData();
		
		// assert
		verify(playerIntegrationFacade).updatePlayersCurrentPrice(playerDtoMapCaptor.capture());
		verify(teamIntegrationFacade).updateSelectedPlayersSellToPotPrice(playerDtoMapCaptor.capture());
		
		assertThat(playerDtoMapCaptor.getAllValues()).hasSize(2);
		assertThat(playerDtoMapCaptor.getAllValues().get(0).keySet()).containsOnly(Integer.valueOf(fantasyPremierLeaguePlayer.getId()));
		assertThat(playerDtoMapCaptor.getAllValues().get(1).keySet()).containsOnly(Integer.valueOf(fantasyPremierLeaguePlayer.getId()));
	}
}
