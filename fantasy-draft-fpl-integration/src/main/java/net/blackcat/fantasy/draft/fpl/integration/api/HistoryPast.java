
package net.blackcat.fantasy.draft.fpl.integration.api;

import java.util.HashMap;
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
    "id",
    "season_name",
    "element_code",
    "start_cost",
    "end_cost",
    "total_points",
    "minutes",
    "goals_scored",
    "assists",
    "clean_sheets",
    "goals_conceded",
    "own_goals",
    "penalties_saved",
    "penalties_missed",
    "yellow_cards",
    "red_cards",
    "saves",
    "bonus",
    "bps",
    "influence",
    "creativity",
    "threat",
    "ict_index",
    "ea_index",
    "season"
})
public class HistoryPast {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season_name")
    private String seasonName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("element_code")
    private Integer elementCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_cost")
    private Integer startCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_cost")
    private Integer endCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_points")
    private Integer totalPoints;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    private Integer minutes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("goals_scored")
    private Integer goalsScored;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assists")
    private Integer assists;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clean_sheets")
    private Integer cleanSheets;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("goals_conceded")
    private Integer goalsConceded;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("own_goals")
    private Integer ownGoals;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalties_saved")
    private Integer penaltiesSaved;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalties_missed")
    private Integer penaltiesMissed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("red_cards")
    private Integer redCards;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("saves")
    private Integer saves;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bonus")
    private Integer bonus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bps")
    private Integer bps;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("influence")
    private String influence;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creativity")
    private String creativity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("threat")
    private String threat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ict_index")
    private String ictIndex;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ea_index")
    private Integer eaIndex;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    private Integer season;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The seasonName
     */
    @JsonProperty("season_name")
    public String getSeasonName() {
        return seasonName;
    }

    /**
     * 
     * (Required)
     * 
     * @param seasonName
     *     The season_name
     */
    @JsonProperty("season_name")
    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The elementCode
     */
    @JsonProperty("element_code")
    public Integer getElementCode() {
        return elementCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param elementCode
     *     The element_code
     */
    @JsonProperty("element_code")
    public void setElementCode(Integer elementCode) {
        this.elementCode = elementCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The startCost
     */
    @JsonProperty("start_cost")
    public Integer getStartCost() {
        return startCost;
    }

    /**
     * 
     * (Required)
     * 
     * @param startCost
     *     The start_cost
     */
    @JsonProperty("start_cost")
    public void setStartCost(Integer startCost) {
        this.startCost = startCost;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The endCost
     */
    @JsonProperty("end_cost")
    public Integer getEndCost() {
        return endCost;
    }

    /**
     * 
     * (Required)
     * 
     * @param endCost
     *     The end_cost
     */
    @JsonProperty("end_cost")
    public void setEndCost(Integer endCost) {
        this.endCost = endCost;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The totalPoints
     */
    @JsonProperty("total_points")
    public Integer getTotalPoints() {
        return totalPoints;
    }

    /**
     * 
     * (Required)
     * 
     * @param totalPoints
     *     The total_points
     */
    @JsonProperty("total_points")
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The minutes
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * 
     * (Required)
     * 
     * @param minutes
     *     The minutes
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The goalsScored
     */
    @JsonProperty("goals_scored")
    public Integer getGoalsScored() {
        return goalsScored;
    }

    /**
     * 
     * (Required)
     * 
     * @param goalsScored
     *     The goals_scored
     */
    @JsonProperty("goals_scored")
    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The assists
     */
    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    /**
     * 
     * (Required)
     * 
     * @param assists
     *     The assists
     */
    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The cleanSheets
     */
    @JsonProperty("clean_sheets")
    public Integer getCleanSheets() {
        return cleanSheets;
    }

    /**
     * 
     * (Required)
     * 
     * @param cleanSheets
     *     The clean_sheets
     */
    @JsonProperty("clean_sheets")
    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The goalsConceded
     */
    @JsonProperty("goals_conceded")
    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    /**
     * 
     * (Required)
     * 
     * @param goalsConceded
     *     The goals_conceded
     */
    @JsonProperty("goals_conceded")
    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The ownGoals
     */
    @JsonProperty("own_goals")
    public Integer getOwnGoals() {
        return ownGoals;
    }

    /**
     * 
     * (Required)
     * 
     * @param ownGoals
     *     The own_goals
     */
    @JsonProperty("own_goals")
    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The penaltiesSaved
     */
    @JsonProperty("penalties_saved")
    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    /**
     * 
     * (Required)
     * 
     * @param penaltiesSaved
     *     The penalties_saved
     */
    @JsonProperty("penalties_saved")
    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The penaltiesMissed
     */
    @JsonProperty("penalties_missed")
    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @param penaltiesMissed
     *     The penalties_missed
     */
    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The yellowCards
     */
    @JsonProperty("yellow_cards")
    public Integer getYellowCards() {
        return yellowCards;
    }

    /**
     * 
     * (Required)
     * 
     * @param yellowCards
     *     The yellow_cards
     */
    @JsonProperty("yellow_cards")
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The redCards
     */
    @JsonProperty("red_cards")
    public Integer getRedCards() {
        return redCards;
    }

    /**
     * 
     * (Required)
     * 
     * @param redCards
     *     The red_cards
     */
    @JsonProperty("red_cards")
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The saves
     */
    @JsonProperty("saves")
    public Integer getSaves() {
        return saves;
    }

    /**
     * 
     * (Required)
     * 
     * @param saves
     *     The saves
     */
    @JsonProperty("saves")
    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bonus
     */
    @JsonProperty("bonus")
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 
     * (Required)
     * 
     * @param bonus
     *     The bonus
     */
    @JsonProperty("bonus")
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bps
     */
    @JsonProperty("bps")
    public Integer getBps() {
        return bps;
    }

    /**
     * 
     * (Required)
     * 
     * @param bps
     *     The bps
     */
    @JsonProperty("bps")
    public void setBps(Integer bps) {
        this.bps = bps;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The influence
     */
    @JsonProperty("influence")
    public String getInfluence() {
        return influence;
    }

    /**
     * 
     * (Required)
     * 
     * @param influence
     *     The influence
     */
    @JsonProperty("influence")
    public void setInfluence(String influence) {
        this.influence = influence;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The creativity
     */
    @JsonProperty("creativity")
    public String getCreativity() {
        return creativity;
    }

    /**
     * 
     * (Required)
     * 
     * @param creativity
     *     The creativity
     */
    @JsonProperty("creativity")
    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The threat
     */
    @JsonProperty("threat")
    public String getThreat() {
        return threat;
    }

    /**
     * 
     * (Required)
     * 
     * @param threat
     *     The threat
     */
    @JsonProperty("threat")
    public void setThreat(String threat) {
        this.threat = threat;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The ictIndex
     */
    @JsonProperty("ict_index")
    public String getIctIndex() {
        return ictIndex;
    }

    /**
     * 
     * (Required)
     * 
     * @param ictIndex
     *     The ict_index
     */
    @JsonProperty("ict_index")
    public void setIctIndex(String ictIndex) {
        this.ictIndex = ictIndex;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eaIndex
     */
    @JsonProperty("ea_index")
    public Integer getEaIndex() {
        return eaIndex;
    }

    /**
     * 
     * (Required)
     * 
     * @param eaIndex
     *     The ea_index
     */
    @JsonProperty("ea_index")
    public void setEaIndex(Integer eaIndex) {
        this.eaIndex = eaIndex;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The season
     */
    @JsonProperty("season")
    public Integer getSeason() {
        return season;
    }

    /**
     * 
     * (Required)
     * 
     * @param season
     *     The season
     */
    @JsonProperty("season")
    public void setSeason(Integer season) {
        this.season = season;
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
        return new HashCodeBuilder().append(id).append(seasonName).append(elementCode).append(startCost).append(endCost).append(totalPoints).append(minutes).append(goalsScored).append(assists).append(cleanSheets).append(goalsConceded).append(ownGoals).append(penaltiesSaved).append(penaltiesMissed).append(yellowCards).append(redCards).append(saves).append(bonus).append(bps).append(influence).append(creativity).append(threat).append(ictIndex).append(eaIndex).append(season).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HistoryPast) == false) {
            return false;
        }
        HistoryPast rhs = ((HistoryPast) other);
        return new EqualsBuilder().append(id, rhs.id).append(seasonName, rhs.seasonName).append(elementCode, rhs.elementCode).append(startCost, rhs.startCost).append(endCost, rhs.endCost).append(totalPoints, rhs.totalPoints).append(minutes, rhs.minutes).append(goalsScored, rhs.goalsScored).append(assists, rhs.assists).append(cleanSheets, rhs.cleanSheets).append(goalsConceded, rhs.goalsConceded).append(ownGoals, rhs.ownGoals).append(penaltiesSaved, rhs.penaltiesSaved).append(penaltiesMissed, rhs.penaltiesMissed).append(yellowCards, rhs.yellowCards).append(redCards, rhs.redCards).append(saves, rhs.saves).append(bonus, rhs.bonus).append(bps, rhs.bps).append(influence, rhs.influence).append(creativity, rhs.creativity).append(threat, rhs.threat).append(ictIndex, rhs.ictIndex).append(eaIndex, rhs.eaIndex).append(season, rhs.season).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
