/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.facade;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import net.blackcat.fantasy.draft.fpl.integration.api.FantasyPremierLeaguePlayer;
import net.blackcat.fantasy.draft.fpl.integration.client.PlayerDataClient;
import net.blackcat.fantasy.draft.fpl.integration.testdata.FantasyPremierLeaguePlayerTestDataBuilder;
import net.blackcat.fantasy.draft.integration.facade.GameweekFacade;
import net.blackcat.fantasy.draft.integration.facade.PlayerFacade;
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
	
	@Mock
	private PlayerDataClient playerDataClient;
    
	@Mock
	private PlayerFacade playerIntegrationFacade;
	
	@Mock
	private GameweekFacade gameweekIntegrationFacade;
	
	private PlayerDataFacade playerDataFacade;
	
	@Before
	public void setup() {
		playerDataFacade = new PlayerDataFacade(playerDataClient, playerIntegrationFacade, gameweekIntegrationFacade);
	}
	
	@Test
	public void testUpdateExistingPlayerStatistics() throws Exception {
		// arrange
		final PlayerDto playerDto = PlayerDtoTestDataBuilder.aPlayer().build();
		final FantasyPremierLeaguePlayer fantasyPremierLeaguePlayer = FantasyPremierLeaguePlayerTestDataBuilder.aFantasyPremierLeaguePlayer().withStatistics().build();
		
		when(playerIntegrationFacade.getPlayers()).thenReturn(Arrays.asList(playerDto));
		when(playerDataClient.getPlayer(playerDto.getId())).thenReturn(fantasyPremierLeaguePlayer);
		
		// act
		playerDataFacade.updateExistingPlayerStatistics();
		
		// assert
		verify(playerIntegrationFacade).updatePlayersStatistics(playerDtoListCaptor.capture());
		
		assertThat(playerDtoListCaptor.getValue()).hasSize(1);
	}

}
