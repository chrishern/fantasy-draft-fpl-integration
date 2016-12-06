
package net.blackcat.fantasy.draft.fpl.integration.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "history_past",
    "fixtures_summary",
    "explain",
    "history_summary",
    "fixtures",
    "history"
})
public class FantasyPremierLeaguePlayerDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("history_past")
    private List<HistoryPast> historyPast = new ArrayList<HistoryPast>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fixtures_summary")
    private List<FixturesSummary> fixturesSummary = new ArrayList<FixturesSummary>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("explain")
    private List<Explain> explain = new ArrayList<Explain>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("history_summary")
    private List<HistorySummary> historySummary = new ArrayList<HistorySummary>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fixtures")
    private List<Fixture_> fixtures = new ArrayList<Fixture_>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("history")
    private List<History> history = new ArrayList<History>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The historyPast
     */
    @JsonProperty("history_past")
    public List<HistoryPast> getHistoryPast() {
        return historyPast;
    }

    /**
     * 
     * (Required)
     * 
     * @param historyPast
     *     The history_past
     */
    @JsonProperty("history_past")
    public void setHistoryPast(List<HistoryPast> historyPast) {
        this.historyPast = historyPast;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fixturesSummary
     */
    @JsonProperty("fixtures_summary")
    public List<FixturesSummary> getFixturesSummary() {
        return fixturesSummary;
    }

    /**
     * 
     * (Required)
     * 
     * @param fixturesSummary
     *     The fixtures_summary
     */
    @JsonProperty("fixtures_summary")
    public void setFixturesSummary(List<FixturesSummary> fixturesSummary) {
        this.fixturesSummary = fixturesSummary;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The explain
     */
    @JsonProperty("explain")
    public List<Explain> getExplain() {
        return explain;
    }

    /**
     * 
     * (Required)
     * 
     * @param explain
     *     The explain
     */
    @JsonProperty("explain")
    public void setExplain(List<Explain> explain) {
        this.explain = explain;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The historySummary
     */
    @JsonProperty("history_summary")
    public List<HistorySummary> getHistorySummary() {
        return historySummary;
    }

    /**
     * 
     * (Required)
     * 
     * @param historySummary
     *     The history_summary
     */
    @JsonProperty("history_summary")
    public void setHistorySummary(List<HistorySummary> historySummary) {
        this.historySummary = historySummary;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fixtures
     */
    @JsonProperty("fixtures")
    public List<Fixture_> getFixtures() {
        return fixtures;
    }

    /**
     * 
     * (Required)
     * 
     * @param fixtures
     *     The fixtures
     */
    @JsonProperty("fixtures")
    public void setFixtures(List<Fixture_> fixtures) {
        this.fixtures = fixtures;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The history
     */
    @JsonProperty("history")
    public List<History> getHistory() {
        return history;
    }

    /**
     * 
     * (Required)
     * 
     * @param history
     *     The history
     */
    @JsonProperty("history")
    public void setHistory(List<History> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(historyPast).append(fixturesSummary).append(explain).append(historySummary).append(fixtures).append(history).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FantasyPremierLeaguePlayerDetail) == false) {
            return false;
        }
        FantasyPremierLeaguePlayerDetail rhs = ((FantasyPremierLeaguePlayerDetail) other);
        return new EqualsBuilder().append(historyPast, rhs.historyPast).append(fixturesSummary, rhs.fixturesSummary).append(explain, rhs.explain).append(historySummary, rhs.historySummary).append(fixtures, rhs.fixtures).append(history, rhs.history).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
