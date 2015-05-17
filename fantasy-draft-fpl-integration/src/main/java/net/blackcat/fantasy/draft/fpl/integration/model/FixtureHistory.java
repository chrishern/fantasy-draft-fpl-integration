/**
 * 
 */
package net.blackcat.fantasy.draft.fpl.integration.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Class representing the fixture history of a player.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixtureHistory implements Serializable {

	private static final long serialVersionUID = 3511879205012234328L;

	private List<Object> all;

	/**
	 * @return the all
	 */
	public List<Object> getAll() {
		return all;
	}

	/**
	 * @param all the all to set
	 */
	public void setAll(List<Object> all) {
		this.all = all;
	}
}
