/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.exception;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * Custom error handler for handling Fantasy Premier League REST error responses.
 * 
 * @author Chris
 *
 */
public class FantasyPremierLeagueResponseErrorHandler implements
		ResponseErrorHandler {

	private ResponseErrorHandler errorHandler = new DefaultResponseErrorHandler();
	
	public void handleError(final ClientHttpResponse response) throws IOException {
		throw new FantasyPremierLeagueException(response.getStatusCode(), response.getStatusText());
	}

	public boolean hasError(final ClientHttpResponse response) throws IOException {
		return errorHandler.hasError(response);
	}

}
