
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
    "photo",
    "web_name",
    "status",
    "code",
    "first_name",
    "second_name",
    "squad_number",
    "news",
    "now_cost",
    "chance_of_playing_this_round",
    "chance_of_playing_next_round",
    "value_form",
    "value_season",
    "cost_change_start",
    "cost_change_event",
    "cost_change_start_fall",
    "cost_change_event_fall",
    "in_dreamteam",
    "dreamteam_count",
    "selected_by_percent",
    "form",
    "transfers_out",
    "transfers_in",
    "transfers_out_event",
    "transfers_in_event",
    "loans_in",
    "loans_out",
    "loaned_in",
    "loaned_out",
    "total_points",
    "event_points",
    "points_per_game",
    "ep_this",
    "ep_next",
    "special",
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
    "element_type",
    "team"
})
public class FantasyPremierLeaguePlayer {

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
    @JsonProperty("photo")
    private String photo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("web_name")
    private String webName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    private Integer code;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    private String firstName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("second_name")
    private String secondName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("squad_number")
    private Integer squadNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("news")
    private String news;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("now_cost")
    private Integer nowCost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chance_of_playing_this_round")
    private Object chanceOfPlayingThisRound;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("chance_of_playing_next_round")
    private Object chanceOfPlayingNextRound;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value_form")
    private String valueForm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value_season")
    private String valueSeason;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost_change_start")
    private Integer costChangeStart;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost_change_event")
    private Integer costChangeEvent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost_change_start_fall")
    private Integer costChangeStartFall;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost_change_event_fall")
    private Integer costChangeEventFall;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("in_dreamteam")
    private Boolean inDreamteam;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dreamteam_count")
    private Integer dreamteamCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("selected_by_percent")
    private String selectedByPercent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("form")
    private String form;
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
    @JsonProperty("transfers_in")
    private Integer transfersIn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transfers_out_event")
    private Integer transfersOutEvent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transfers_in_event")
    private Integer transfersInEvent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loans_in")
    private Integer loansIn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loans_out")
    private Integer loansOut;
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
    @JsonProperty("total_points")
    private Integer totalPoints;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event_points")
    private Integer eventPoints;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("points_per_game")
    private String pointsPerGame;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ep_this")
    private Object epThis;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ep_next")
    private String epNext;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("special")
    private Boolean special;
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
    @JsonProperty("element_type")
    private Integer elementType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team")
    private Integer team;
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
     *     The photo
     */
    @JsonProperty("photo")
    public String getPhoto() {
        return photo;
    }

    /**
     * 
     * (Required)
     * 
     * @param photo
     *     The photo
     */
    @JsonProperty("photo")
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The webName
     */
    @JsonProperty("web_name")
    public String getWebName() {
        return webName;
    }

    /**
     * 
     * (Required)
     * 
     * @param webName
     *     The web_name
     */
    @JsonProperty("web_name")
    public void setWebName(String webName) {
        this.webName = webName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * (Required)
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The secondName
     */
    @JsonProperty("second_name")
    public String getSecondName() {
        return secondName;
    }

    /**
     * 
     * (Required)
     * 
     * @param secondName
     *     The second_name
     */
    @JsonProperty("second_name")
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The squadNumber
     */
    @JsonProperty("squad_number")
    public Integer getSquadNumber() {
        return squadNumber;
    }

    /**
     * 
     * (Required)
     * 
     * @param squadNumber
     *     The squad_number
     */
    @JsonProperty("squad_number")
    public void setSquadNumber(Integer squadNumber) {
        this.squadNumber = squadNumber;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The news
     */
    @JsonProperty("news")
    public String getNews() {
        return news;
    }

    /**
     * 
     * (Required)
     * 
     * @param news
     *     The news
     */
    @JsonProperty("news")
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The nowCost
     */
    @JsonProperty("now_cost")
    public Integer getNowCost() {
        return nowCost;
    }

    /**
     * 
     * (Required)
     * 
     * @param nowCost
     *     The now_cost
     */
    @JsonProperty("now_cost")
    public void setNowCost(Integer nowCost) {
        this.nowCost = nowCost;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The chanceOfPlayingThisRound
     */
    @JsonProperty("chance_of_playing_this_round")
    public Object getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    /**
     * 
     * (Required)
     * 
     * @param chanceOfPlayingThisRound
     *     The chance_of_playing_this_round
     */
    @JsonProperty("chance_of_playing_this_round")
    public void setChanceOfPlayingThisRound(Object chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The chanceOfPlayingNextRound
     */
    @JsonProperty("chance_of_playing_next_round")
    public Object getChanceOfPlayingNextRound() {
        return chanceOfPlayingNextRound;
    }

    /**
     * 
     * (Required)
     * 
     * @param chanceOfPlayingNextRound
     *     The chance_of_playing_next_round
     */
    @JsonProperty("chance_of_playing_next_round")
    public void setChanceOfPlayingNextRound(Object chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The valueForm
     */
    @JsonProperty("value_form")
    public String getValueForm() {
        return valueForm;
    }

    /**
     * 
     * (Required)
     * 
     * @param valueForm
     *     The value_form
     */
    @JsonProperty("value_form")
    public void setValueForm(String valueForm) {
        this.valueForm = valueForm;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The valueSeason
     */
    @JsonProperty("value_season")
    public String getValueSeason() {
        return valueSeason;
    }

    /**
     * 
     * (Required)
     * 
     * @param valueSeason
     *     The value_season
     */
    @JsonProperty("value_season")
    public void setValueSeason(String valueSeason) {
        this.valueSeason = valueSeason;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The costChangeStart
     */
    @JsonProperty("cost_change_start")
    public Integer getCostChangeStart() {
        return costChangeStart;
    }

    /**
     * 
     * (Required)
     * 
     * @param costChangeStart
     *     The cost_change_start
     */
    @JsonProperty("cost_change_start")
    public void setCostChangeStart(Integer costChangeStart) {
        this.costChangeStart = costChangeStart;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The costChangeEvent
     */
    @JsonProperty("cost_change_event")
    public Integer getCostChangeEvent() {
        return costChangeEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @param costChangeEvent
     *     The cost_change_event
     */
    @JsonProperty("cost_change_event")
    public void setCostChangeEvent(Integer costChangeEvent) {
        this.costChangeEvent = costChangeEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The costChangeStartFall
     */
    @JsonProperty("cost_change_start_fall")
    public Integer getCostChangeStartFall() {
        return costChangeStartFall;
    }

    /**
     * 
     * (Required)
     * 
     * @param costChangeStartFall
     *     The cost_change_start_fall
     */
    @JsonProperty("cost_change_start_fall")
    public void setCostChangeStartFall(Integer costChangeStartFall) {
        this.costChangeStartFall = costChangeStartFall;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The costChangeEventFall
     */
    @JsonProperty("cost_change_event_fall")
    public Integer getCostChangeEventFall() {
        return costChangeEventFall;
    }

    /**
     * 
     * (Required)
     * 
     * @param costChangeEventFall
     *     The cost_change_event_fall
     */
    @JsonProperty("cost_change_event_fall")
    public void setCostChangeEventFall(Integer costChangeEventFall) {
        this.costChangeEventFall = costChangeEventFall;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The inDreamteam
     */
    @JsonProperty("in_dreamteam")
    public Boolean getInDreamteam() {
        return inDreamteam;
    }

    /**
     * 
     * (Required)
     * 
     * @param inDreamteam
     *     The in_dreamteam
     */
    @JsonProperty("in_dreamteam")
    public void setInDreamteam(Boolean inDreamteam) {
        this.inDreamteam = inDreamteam;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dreamteamCount
     */
    @JsonProperty("dreamteam_count")
    public Integer getDreamteamCount() {
        return dreamteamCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param dreamteamCount
     *     The dreamteam_count
     */
    @JsonProperty("dreamteam_count")
    public void setDreamteamCount(Integer dreamteamCount) {
        this.dreamteamCount = dreamteamCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The selectedByPercent
     */
    @JsonProperty("selected_by_percent")
    public String getSelectedByPercent() {
        return selectedByPercent;
    }

    /**
     * 
     * (Required)
     * 
     * @param selectedByPercent
     *     The selected_by_percent
     */
    @JsonProperty("selected_by_percent")
    public void setSelectedByPercent(String selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The form
     */
    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    /**
     * 
     * (Required)
     * 
     * @param form
     *     The form
     */
    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
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
     *     The transfersOutEvent
     */
    @JsonProperty("transfers_out_event")
    public Integer getTransfersOutEvent() {
        return transfersOutEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @param transfersOutEvent
     *     The transfers_out_event
     */
    @JsonProperty("transfers_out_event")
    public void setTransfersOutEvent(Integer transfersOutEvent) {
        this.transfersOutEvent = transfersOutEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transfersInEvent
     */
    @JsonProperty("transfers_in_event")
    public Integer getTransfersInEvent() {
        return transfersInEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @param transfersInEvent
     *     The transfers_in_event
     */
    @JsonProperty("transfers_in_event")
    public void setTransfersInEvent(Integer transfersInEvent) {
        this.transfersInEvent = transfersInEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The loansIn
     */
    @JsonProperty("loans_in")
    public Integer getLoansIn() {
        return loansIn;
    }

    /**
     * 
     * (Required)
     * 
     * @param loansIn
     *     The loans_in
     */
    @JsonProperty("loans_in")
    public void setLoansIn(Integer loansIn) {
        this.loansIn = loansIn;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The loansOut
     */
    @JsonProperty("loans_out")
    public Integer getLoansOut() {
        return loansOut;
    }

    /**
     * 
     * (Required)
     * 
     * @param loansOut
     *     The loans_out
     */
    @JsonProperty("loans_out")
    public void setLoansOut(Integer loansOut) {
        this.loansOut = loansOut;
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
     *     The eventPoints
     */
    @JsonProperty("event_points")
    public Integer getEventPoints() {
        return eventPoints;
    }

    /**
     * 
     * (Required)
     * 
     * @param eventPoints
     *     The event_points
     */
    @JsonProperty("event_points")
    public void setEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The pointsPerGame
     */
    @JsonProperty("points_per_game")
    public String getPointsPerGame() {
        return pointsPerGame;
    }

    /**
     * 
     * (Required)
     * 
     * @param pointsPerGame
     *     The points_per_game
     */
    @JsonProperty("points_per_game")
    public void setPointsPerGame(String pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The epThis
     */
    @JsonProperty("ep_this")
    public Object getEpThis() {
        return epThis;
    }

    /**
     * 
     * (Required)
     * 
     * @param epThis
     *     The ep_this
     */
    @JsonProperty("ep_this")
    public void setEpThis(Object epThis) {
        this.epThis = epThis;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The epNext
     */
    @JsonProperty("ep_next")
    public String getEpNext() {
        return epNext;
    }

    /**
     * 
     * (Required)
     * 
     * @param epNext
     *     The ep_next
     */
    @JsonProperty("ep_next")
    public void setEpNext(String epNext) {
        this.epNext = epNext;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The special
     */
    @JsonProperty("special")
    public Boolean getSpecial() {
        return special;
    }

    /**
     * 
     * (Required)
     * 
     * @param special
     *     The special
     */
    @JsonProperty("special")
    public void setSpecial(Boolean special) {
        this.special = special;
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
     *     The elementType
     */
    @JsonProperty("element_type")
    public Integer getElementType() {
        return elementType;
    }

    /**
     * 
     * (Required)
     * 
     * @param elementType
     *     The element_type
     */
    @JsonProperty("element_type")
    public void setElementType(Integer elementType) {
        this.elementType = elementType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The team
     */
    @JsonProperty("team")
    public Integer getTeam() {
        return team;
    }

    /**
     * 
     * (Required)
     * 
     * @param team
     *     The team
     */
    @JsonProperty("team")
    public void setTeam(Integer team) {
        this.team = team;
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
        return new HashCodeBuilder().append(id).append(photo).append(webName).append(status).append(code).append(firstName).append(secondName).append(squadNumber).append(news).append(nowCost).append(chanceOfPlayingThisRound).append(chanceOfPlayingNextRound).append(valueForm).append(valueSeason).append(costChangeStart).append(costChangeEvent).append(costChangeStartFall).append(costChangeEventFall).append(inDreamteam).append(dreamteamCount).append(selectedByPercent).append(form).append(transfersOut).append(transfersIn).append(transfersOutEvent).append(transfersInEvent).append(loansIn).append(loansOut).append(loanedIn).append(loanedOut).append(totalPoints).append(eventPoints).append(pointsPerGame).append(epThis).append(epNext).append(special).append(minutes).append(goalsScored).append(assists).append(cleanSheets).append(goalsConceded).append(ownGoals).append(penaltiesSaved).append(penaltiesMissed).append(yellowCards).append(redCards).append(saves).append(bonus).append(bps).append(influence).append(creativity).append(threat).append(ictIndex).append(eaIndex).append(elementType).append(team).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FantasyPremierLeaguePlayer) == false) {
            return false;
        }
        FantasyPremierLeaguePlayer rhs = ((FantasyPremierLeaguePlayer) other);
        return new EqualsBuilder().append(id, rhs.id).append(photo, rhs.photo).append(webName, rhs.webName).append(status, rhs.status).append(code, rhs.code).append(firstName, rhs.firstName).append(secondName, rhs.secondName).append(squadNumber, rhs.squadNumber).append(news, rhs.news).append(nowCost, rhs.nowCost).append(chanceOfPlayingThisRound, rhs.chanceOfPlayingThisRound).append(chanceOfPlayingNextRound, rhs.chanceOfPlayingNextRound).append(valueForm, rhs.valueForm).append(valueSeason, rhs.valueSeason).append(costChangeStart, rhs.costChangeStart).append(costChangeEvent, rhs.costChangeEvent).append(costChangeStartFall, rhs.costChangeStartFall).append(costChangeEventFall, rhs.costChangeEventFall).append(inDreamteam, rhs.inDreamteam).append(dreamteamCount, rhs.dreamteamCount).append(selectedByPercent, rhs.selectedByPercent).append(form, rhs.form).append(transfersOut, rhs.transfersOut).append(transfersIn, rhs.transfersIn).append(transfersOutEvent, rhs.transfersOutEvent).append(transfersInEvent, rhs.transfersInEvent).append(loansIn, rhs.loansIn).append(loansOut, rhs.loansOut).append(loanedIn, rhs.loanedIn).append(loanedOut, rhs.loanedOut).append(totalPoints, rhs.totalPoints).append(eventPoints, rhs.eventPoints).append(pointsPerGame, rhs.pointsPerGame).append(epThis, rhs.epThis).append(epNext, rhs.epNext).append(special, rhs.special).append(minutes, rhs.minutes).append(goalsScored, rhs.goalsScored).append(assists, rhs.assists).append(cleanSheets, rhs.cleanSheets).append(goalsConceded, rhs.goalsConceded).append(ownGoals, rhs.ownGoals).append(penaltiesSaved, rhs.penaltiesSaved).append(penaltiesMissed, rhs.penaltiesMissed).append(yellowCards, rhs.yellowCards).append(redCards, rhs.redCards).append(saves, rhs.saves).append(bonus, rhs.bonus).append(bps, rhs.bps).append(influence, rhs.influence).append(creativity, rhs.creativity).append(threat, rhs.threat).append(ictIndex, rhs.ictIndex).append(eaIndex, rhs.eaIndex).append(elementType, rhs.elementType).append(team, rhs.team).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
