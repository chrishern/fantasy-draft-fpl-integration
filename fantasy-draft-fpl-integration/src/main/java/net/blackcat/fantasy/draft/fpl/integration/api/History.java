
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
    "kickoff_time",
    "kickoff_time_formatted",
    "team_h_score",
    "team_a_score",
    "was_home",
    "round",
    "total_points",
    "value",
    "transfers_balance",
    "selected",
    "transfers_in",
    "transfers_out",
    "loaned_in",
    "loaned_out",
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
    "open_play_crosses",
    "big_chances_created",
    "clearances_blocks_interceptions",
    "recoveries",
    "key_passes",
    "tackles",
    "winning_goals",
    "attempted_passes",
    "completed_passes",
    "penalties_conceded",
    "big_chances_missed",
    "errors_leading_to_goal",
    "errors_leading_to_goal_attempt",
    "tackled",
    "offside",
    "target_missed",
    "fouls",
    "dribbles",
    "element",
    "fixture",
    "opponent_team"
})
public class History {

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
    @JsonProperty("kickoff_time")
    private String kickoffTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kickoff_time_formatted")
    private String kickoffTimeFormatted;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_h_score")
    private Integer teamHScore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_a_score")
    private Integer teamAScore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("was_home")
    private Boolean wasHome;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round")
    private Integer round;
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
    @JsonProperty("value")
    private Integer value;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transfers_balance")
    private Integer transfersBalance;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected")
    private Integer selected;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transfers_in")
    private Integer transfersIn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transfers_out")
    private Integer transfersOut;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loaned_in")
    private Integer loanedIn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loaned_out")
    private Integer loanedOut;
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
    @JsonProperty("open_play_crosses")
    private Integer openPlayCrosses;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("big_chances_created")
    private Integer bigChancesCreated;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clearances_blocks_interceptions")
    private Integer clearancesBlocksInterceptions;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recoveries")
    private Integer recoveries;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key_passes")
    private Integer keyPasses;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tackles")
    private Integer tackles;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("winning_goals")
    private Integer winningGoals;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attempted_passes")
    private Integer attemptedPasses;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed_passes")
    private Integer completedPasses;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalties_conceded")
    private Integer penaltiesConceded;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("big_chances_missed")
    private Integer bigChancesMissed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errors_leading_to_goal")
    private Integer errorsLeadingToGoal;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("errors_leading_to_goal_attempt")
    private Integer errorsLeadingToGoalAttempt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tackled")
    private Integer tackled;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("offside")
    private Integer offside;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target_missed")
    private Integer targetMissed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fouls")
    private Integer fouls;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dribbles")
    private Integer dribbles;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("element")
    private Integer element;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fixture")
    private Integer fixture;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("opponent_team")
    private Integer opponentTeam;
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
     *     The kickoffTime
     */
    @JsonProperty("kickoff_time")
    public String getKickoffTime() {
        return kickoffTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param kickoffTime
     *     The kickoff_time
     */
    @JsonProperty("kickoff_time")
    public void setKickoffTime(String kickoffTime) {
        this.kickoffTime = kickoffTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The kickoffTimeFormatted
     */
    @JsonProperty("kickoff_time_formatted")
    public String getKickoffTimeFormatted() {
        return kickoffTimeFormatted;
    }

    /**
     * 
     * (Required)
     * 
     * @param kickoffTimeFormatted
     *     The kickoff_time_formatted
     */
    @JsonProperty("kickoff_time_formatted")
    public void setKickoffTimeFormatted(String kickoffTimeFormatted) {
        this.kickoffTimeFormatted = kickoffTimeFormatted;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The teamHScore
     */
    @JsonProperty("team_h_score")
    public Integer getTeamHScore() {
        return teamHScore;
    }

    /**
     * 
     * (Required)
     * 
     * @param teamHScore
     *     The team_h_score
     */
    @JsonProperty("team_h_score")
    public void setTeamHScore(Integer teamHScore) {
        this.teamHScore = teamHScore;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The teamAScore
     */
    @JsonProperty("team_a_score")
    public Integer getTeamAScore() {
        return teamAScore;
    }

    /**
     * 
     * (Required)
     * 
     * @param teamAScore
     *     The team_a_score
     */
    @JsonProperty("team_a_score")
    public void setTeamAScore(Integer teamAScore) {
        this.teamAScore = teamAScore;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The wasHome
     */
    @JsonProperty("was_home")
    public Boolean getWasHome() {
        return wasHome;
    }

    /**
     * 
     * (Required)
     * 
     * @param wasHome
     *     The was_home
     */
    @JsonProperty("was_home")
    public void setWasHome(Boolean wasHome) {
        this.wasHome = wasHome;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The round
     */
    @JsonProperty("round")
    public Integer getRound() {
        return round;
    }

    /**
     * 
     * (Required)
     * 
     * @param round
     *     The round
     */
    @JsonProperty("round")
    public void setRound(Integer round) {
        this.round = round;
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
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transfersBalance
     */
    @JsonProperty("transfers_balance")
    public Integer getTransfersBalance() {
        return transfersBalance;
    }

    /**
     * 
     * (Required)
     * 
     * @param transfersBalance
     *     The transfers_balance
     */
    @JsonProperty("transfers_balance")
    public void setTransfersBalance(Integer transfersBalance) {
        this.transfersBalance = transfersBalance;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The selected
     */
    @JsonProperty("selected")
    public Integer getSelected() {
        return selected;
    }

    /**
     * 
     * (Required)
     * 
     * @param selected
     *     The selected
     */
    @JsonProperty("selected")
    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transfersIn
     */
    @JsonProperty("transfers_in")
    public Integer getTransfersIn() {
        return transfersIn;
    }

    /**
     * 
     * (Required)
     * 
     * @param transfersIn
     *     The transfers_in
     */
    @JsonProperty("transfers_in")
    public void setTransfersIn(Integer transfersIn) {
        this.transfersIn = transfersIn;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transfersOut
     */
    @JsonProperty("transfers_out")
    public Integer getTransfersOut() {
        return transfersOut;
    }

    /**
     * 
     * (Required)
     * 
     * @param transfersOut
     *     The transfers_out
     */
    @JsonProperty("transfers_out")
    public void setTransfersOut(Integer transfersOut) {
        this.transfersOut = transfersOut;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The loanedIn
     */
    @JsonProperty("loaned_in")
    public Integer getLoanedIn() {
        return loanedIn;
    }

    /**
     * 
     * (Required)
     * 
     * @param loanedIn
     *     The loaned_in
     */
    @JsonProperty("loaned_in")
    public void setLoanedIn(Integer loanedIn) {
        this.loanedIn = loanedIn;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The loanedOut
     */
    @JsonProperty("loaned_out")
    public Integer getLoanedOut() {
        return loanedOut;
    }

    /**
     * 
     * (Required)
     * 
     * @param loanedOut
     *     The loaned_out
     */
    @JsonProperty("loaned_out")
    public void setLoanedOut(Integer loanedOut) {
        this.loanedOut = loanedOut;
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
     *     The openPlayCrosses
     */
    @JsonProperty("open_play_crosses")
    public Integer getOpenPlayCrosses() {
        return openPlayCrosses;
    }

    /**
     * 
     * (Required)
     * 
     * @param openPlayCrosses
     *     The open_play_crosses
     */
    @JsonProperty("open_play_crosses")
    public void setOpenPlayCrosses(Integer openPlayCrosses) {
        this.openPlayCrosses = openPlayCrosses;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bigChancesCreated
     */
    @JsonProperty("big_chances_created")
    public Integer getBigChancesCreated() {
        return bigChancesCreated;
    }

    /**
     * 
     * (Required)
     * 
     * @param bigChancesCreated
     *     The big_chances_created
     */
    @JsonProperty("big_chances_created")
    public void setBigChancesCreated(Integer bigChancesCreated) {
        this.bigChancesCreated = bigChancesCreated;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clearancesBlocksInterceptions
     */
    @JsonProperty("clearances_blocks_interceptions")
    public Integer getClearancesBlocksInterceptions() {
        return clearancesBlocksInterceptions;
    }

    /**
     * 
     * (Required)
     * 
     * @param clearancesBlocksInterceptions
     *     The clearances_blocks_interceptions
     */
    @JsonProperty("clearances_blocks_interceptions")
    public void setClearancesBlocksInterceptions(Integer clearancesBlocksInterceptions) {
        this.clearancesBlocksInterceptions = clearancesBlocksInterceptions;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The recoveries
     */
    @JsonProperty("recoveries")
    public Integer getRecoveries() {
        return recoveries;
    }

    /**
     * 
     * (Required)
     * 
     * @param recoveries
     *     The recoveries
     */
    @JsonProperty("recoveries")
    public void setRecoveries(Integer recoveries) {
        this.recoveries = recoveries;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The keyPasses
     */
    @JsonProperty("key_passes")
    public Integer getKeyPasses() {
        return keyPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @param keyPasses
     *     The key_passes
     */
    @JsonProperty("key_passes")
    public void setKeyPasses(Integer keyPasses) {
        this.keyPasses = keyPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tackles
     */
    @JsonProperty("tackles")
    public Integer getTackles() {
        return tackles;
    }

    /**
     * 
     * (Required)
     * 
     * @param tackles
     *     The tackles
     */
    @JsonProperty("tackles")
    public void setTackles(Integer tackles) {
        this.tackles = tackles;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The winningGoals
     */
    @JsonProperty("winning_goals")
    public Integer getWinningGoals() {
        return winningGoals;
    }

    /**
     * 
     * (Required)
     * 
     * @param winningGoals
     *     The winning_goals
     */
    @JsonProperty("winning_goals")
    public void setWinningGoals(Integer winningGoals) {
        this.winningGoals = winningGoals;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The attemptedPasses
     */
    @JsonProperty("attempted_passes")
    public Integer getAttemptedPasses() {
        return attemptedPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @param attemptedPasses
     *     The attempted_passes
     */
    @JsonProperty("attempted_passes")
    public void setAttemptedPasses(Integer attemptedPasses) {
        this.attemptedPasses = attemptedPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The completedPasses
     */
    @JsonProperty("completed_passes")
    public Integer getCompletedPasses() {
        return completedPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @param completedPasses
     *     The completed_passes
     */
    @JsonProperty("completed_passes")
    public void setCompletedPasses(Integer completedPasses) {
        this.completedPasses = completedPasses;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The penaltiesConceded
     */
    @JsonProperty("penalties_conceded")
    public Integer getPenaltiesConceded() {
        return penaltiesConceded;
    }

    /**
     * 
     * (Required)
     * 
     * @param penaltiesConceded
     *     The penalties_conceded
     */
    @JsonProperty("penalties_conceded")
    public void setPenaltiesConceded(Integer penaltiesConceded) {
        this.penaltiesConceded = penaltiesConceded;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bigChancesMissed
     */
    @JsonProperty("big_chances_missed")
    public Integer getBigChancesMissed() {
        return bigChancesMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @param bigChancesMissed
     *     The big_chances_missed
     */
    @JsonProperty("big_chances_missed")
    public void setBigChancesMissed(Integer bigChancesMissed) {
        this.bigChancesMissed = bigChancesMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The errorsLeadingToGoal
     */
    @JsonProperty("errors_leading_to_goal")
    public Integer getErrorsLeadingToGoal() {
        return errorsLeadingToGoal;
    }

    /**
     * 
     * (Required)
     * 
     * @param errorsLeadingToGoal
     *     The errors_leading_to_goal
     */
    @JsonProperty("errors_leading_to_goal")
    public void setErrorsLeadingToGoal(Integer errorsLeadingToGoal) {
        this.errorsLeadingToGoal = errorsLeadingToGoal;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The errorsLeadingToGoalAttempt
     */
    @JsonProperty("errors_leading_to_goal_attempt")
    public Integer getErrorsLeadingToGoalAttempt() {
        return errorsLeadingToGoalAttempt;
    }

    /**
     * 
     * (Required)
     * 
     * @param errorsLeadingToGoalAttempt
     *     The errors_leading_to_goal_attempt
     */
    @JsonProperty("errors_leading_to_goal_attempt")
    public void setErrorsLeadingToGoalAttempt(Integer errorsLeadingToGoalAttempt) {
        this.errorsLeadingToGoalAttempt = errorsLeadingToGoalAttempt;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tackled
     */
    @JsonProperty("tackled")
    public Integer getTackled() {
        return tackled;
    }

    /**
     * 
     * (Required)
     * 
     * @param tackled
     *     The tackled
     */
    @JsonProperty("tackled")
    public void setTackled(Integer tackled) {
        this.tackled = tackled;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The offside
     */
    @JsonProperty("offside")
    public Integer getOffside() {
        return offside;
    }

    /**
     * 
     * (Required)
     * 
     * @param offside
     *     The offside
     */
    @JsonProperty("offside")
    public void setOffside(Integer offside) {
        this.offside = offside;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The targetMissed
     */
    @JsonProperty("target_missed")
    public Integer getTargetMissed() {
        return targetMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @param targetMissed
     *     The target_missed
     */
    @JsonProperty("target_missed")
    public void setTargetMissed(Integer targetMissed) {
        this.targetMissed = targetMissed;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fouls
     */
    @JsonProperty("fouls")
    public Integer getFouls() {
        return fouls;
    }

    /**
     * 
     * (Required)
     * 
     * @param fouls
     *     The fouls
     */
    @JsonProperty("fouls")
    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dribbles
     */
    @JsonProperty("dribbles")
    public Integer getDribbles() {
        return dribbles;
    }

    /**
     * 
     * (Required)
     * 
     * @param dribbles
     *     The dribbles
     */
    @JsonProperty("dribbles")
    public void setDribbles(Integer dribbles) {
        this.dribbles = dribbles;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The element
     */
    @JsonProperty("element")
    public Integer getElement() {
        return element;
    }

    /**
     * 
     * (Required)
     * 
     * @param element
     *     The element
     */
    @JsonProperty("element")
    public void setElement(Integer element) {
        this.element = element;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fixture
     */
    @JsonProperty("fixture")
    public Integer getFixture() {
        return fixture;
    }

    /**
     * 
     * (Required)
     * 
     * @param fixture
     *     The fixture
     */
    @JsonProperty("fixture")
    public void setFixture(Integer fixture) {
        this.fixture = fixture;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The opponentTeam
     */
    @JsonProperty("opponent_team")
    public Integer getOpponentTeam() {
        return opponentTeam;
    }

    /**
     * 
     * (Required)
     * 
     * @param opponentTeam
     *     The opponent_team
     */
    @JsonProperty("opponent_team")
    public void setOpponentTeam(Integer opponentTeam) {
        this.opponentTeam = opponentTeam;
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
        return new HashCodeBuilder().append(id).append(kickoffTime).append(kickoffTimeFormatted).append(teamHScore).append(teamAScore).append(wasHome).append(round).append(totalPoints).append(value).append(transfersBalance).append(selected).append(transfersIn).append(transfersOut).append(loanedIn).append(loanedOut).append(minutes).append(goalsScored).append(assists).append(cleanSheets).append(goalsConceded).append(ownGoals).append(penaltiesSaved).append(penaltiesMissed).append(yellowCards).append(redCards).append(saves).append(bonus).append(bps).append(influence).append(creativity).append(threat).append(ictIndex).append(eaIndex).append(openPlayCrosses).append(bigChancesCreated).append(clearancesBlocksInterceptions).append(recoveries).append(keyPasses).append(tackles).append(winningGoals).append(attemptedPasses).append(completedPasses).append(penaltiesConceded).append(bigChancesMissed).append(errorsLeadingToGoal).append(errorsLeadingToGoalAttempt).append(tackled).append(offside).append(targetMissed).append(fouls).append(dribbles).append(element).append(fixture).append(opponentTeam).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof History) == false) {
            return false;
        }
        History rhs = ((History) other);
        return new EqualsBuilder().append(id, rhs.id).append(kickoffTime, rhs.kickoffTime).append(kickoffTimeFormatted, rhs.kickoffTimeFormatted).append(teamHScore, rhs.teamHScore).append(teamAScore, rhs.teamAScore).append(wasHome, rhs.wasHome).append(round, rhs.round).append(totalPoints, rhs.totalPoints).append(value, rhs.value).append(transfersBalance, rhs.transfersBalance).append(selected, rhs.selected).append(transfersIn, rhs.transfersIn).append(transfersOut, rhs.transfersOut).append(loanedIn, rhs.loanedIn).append(loanedOut, rhs.loanedOut).append(minutes, rhs.minutes).append(goalsScored, rhs.goalsScored).append(assists, rhs.assists).append(cleanSheets, rhs.cleanSheets).append(goalsConceded, rhs.goalsConceded).append(ownGoals, rhs.ownGoals).append(penaltiesSaved, rhs.penaltiesSaved).append(penaltiesMissed, rhs.penaltiesMissed).append(yellowCards, rhs.yellowCards).append(redCards, rhs.redCards).append(saves, rhs.saves).append(bonus, rhs.bonus).append(bps, rhs.bps).append(influence, rhs.influence).append(creativity, rhs.creativity).append(threat, rhs.threat).append(ictIndex, rhs.ictIndex).append(eaIndex, rhs.eaIndex).append(openPlayCrosses, rhs.openPlayCrosses).append(bigChancesCreated, rhs.bigChancesCreated).append(clearancesBlocksInterceptions, rhs.clearancesBlocksInterceptions).append(recoveries, rhs.recoveries).append(keyPasses, rhs.keyPasses).append(tackles, rhs.tackles).append(winningGoals, rhs.winningGoals).append(attemptedPasses, rhs.attemptedPasses).append(completedPasses, rhs.completedPasses).append(penaltiesConceded, rhs.penaltiesConceded).append(bigChancesMissed, rhs.bigChancesMissed).append(errorsLeadingToGoal, rhs.errorsLeadingToGoal).append(errorsLeadingToGoalAttempt, rhs.errorsLeadingToGoalAttempt).append(tackled, rhs.tackled).append(offside, rhs.offside).append(targetMissed, rhs.targetMissed).append(fouls, rhs.fouls).append(dribbles, rhs.dribbles).append(element, rhs.element).append(fixture, rhs.fixture).append(opponentTeam, rhs.opponentTeam).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
