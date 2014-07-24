/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception class used to represent exceptions that occur during invocation of 
 * the Fantasy Premier League API.
 * 
 * @author Chris
 *
 */
public class FantasyPremierLeagueException extends RuntimeException {

	private static final long serialVersionUID = 1607603400944881095L;

	private HttpStatus statusCode;
    private String body;

    public FantasyPremierLeagueException(final HttpStatus statusCode, final String body) {
        super(body);
        this.statusCode = statusCode;
        this.body = body;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(final HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }
	
}
