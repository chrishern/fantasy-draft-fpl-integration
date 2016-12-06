
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
    "id",
    "kickoff_time_formatted",
    "started",
    "event_day",
    "deadline_time",
    "deadline_time_formatted",
    "stats",
    "code",
    "kickoff_time",
    "team_h_score",
    "team_a_score",
    "finished",
    "minutes",
    "provisional_start_time",
    "finished_provisional",
    "event",
    "team_a",
    "team_h"
})
public class Fixture {

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
    @JsonProperty("kickoff_time_formatted")
    private String kickoffTimeFormatted;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("started")
    private Boolean started;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event_day")
    private Integer eventDay;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deadline_time")
    private String deadlineTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deadline_time_formatted")
    private String deadlineTimeFormatted;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    private List<Stat> stats = new ArrayList<Stat>();
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
    @JsonProperty("kickoff_time")
    private String kickoffTime;
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
    @JsonProperty("finished")
    private Boolean finished;
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
    @JsonProperty("provisional_start_time")
    private Boolean provisionalStartTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("finished_provisional")
    private Boolean finishedProvisional;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event")
    private Integer event;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_a")
    private Integer teamA;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_h")
    private Integer teamH;
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
     *     The started
     */
    @JsonProperty("started")
    public Boolean getStarted() {
        return started;
    }

    /**
     * 
     * (Required)
     * 
     * @param started
     *     The started
     */
    @JsonProperty("started")
    public void setStarted(Boolean started) {
        this.started = started;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eventDay
     */
    @JsonProperty("event_day")
    public Integer getEventDay() {
        return eventDay;
    }

    /**
     * 
     * (Required)
     * 
     * @param eventDay
     *     The event_day
     */
    @JsonProperty("event_day")
    public void setEventDay(Integer eventDay) {
        this.eventDay = eventDay;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The deadlineTime
     */
    @JsonProperty("deadline_time")
    public String getDeadlineTime() {
        return deadlineTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param deadlineTime
     *     The deadline_time
     */
    @JsonProperty("deadline_time")
    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The deadlineTimeFormatted
     */
    @JsonProperty("deadline_time_formatted")
    public String getDeadlineTimeFormatted() {
        return deadlineTimeFormatted;
    }

    /**
     * 
     * (Required)
     * 
     * @param deadlineTimeFormatted
     *     The deadline_time_formatted
     */
    @JsonProperty("deadline_time_formatted")
    public void setDeadlineTimeFormatted(String deadlineTimeFormatted) {
        this.deadlineTimeFormatted = deadlineTimeFormatted;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stats
     */
    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    /**
     * 
     * (Required)
     * 
     * @param stats
     *     The stats
     */
    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
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
     *     The finished
     */
    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    /**
     * 
     * (Required)
     * 
     * @param finished
     *     The finished
     */
    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
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
     *     The provisionalStartTime
     */
    @JsonProperty("provisional_start_time")
    public Boolean getProvisionalStartTime() {
        return provisionalStartTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param provisionalStartTime
     *     The provisional_start_time
     */
    @JsonProperty("provisional_start_time")
    public void setProvisionalStartTime(Boolean provisionalStartTime) {
        this.provisionalStartTime = provisionalStartTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The finishedProvisional
     */
    @JsonProperty("finished_provisional")
    public Boolean getFinishedProvisional() {
        return finishedProvisional;
    }

    /**
     * 
     * (Required)
     * 
     * @param finishedProvisional
     *     The finished_provisional
     */
    @JsonProperty("finished_provisional")
    public void setFinishedProvisional(Boolean finishedProvisional) {
        this.finishedProvisional = finishedProvisional;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The event
     */
    @JsonProperty("event")
    public Integer getEvent() {
        return event;
    }

    /**
     * 
     * (Required)
     * 
     * @param event
     *     The event
     */
    @JsonProperty("event")
    public void setEvent(Integer event) {
        this.event = event;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The teamA
     */
    @JsonProperty("team_a")
    public Integer getTeamA() {
        return teamA;
    }

    /**
     * 
     * (Required)
     * 
     * @param teamA
     *     The team_a
     */
    @JsonProperty("team_a")
    public void setTeamA(Integer teamA) {
        this.teamA = teamA;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The teamH
     */
    @JsonProperty("team_h")
    public Integer getTeamH() {
        return teamH;
    }

    /**
     * 
     * (Required)
     * 
     * @param teamH
     *     The team_h
     */
    @JsonProperty("team_h")
    public void setTeamH(Integer teamH) {
        this.teamH = teamH;
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
        return new HashCodeBuilder().append(id).append(kickoffTimeFormatted).append(started).append(eventDay).append(deadlineTime).append(deadlineTimeFormatted).append(stats).append(code).append(kickoffTime).append(teamHScore).append(teamAScore).append(finished).append(minutes).append(provisionalStartTime).append(finishedProvisional).append(event).append(teamA).append(teamH).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fixture) == false) {
            return false;
        }
        Fixture rhs = ((Fixture) other);
        return new EqualsBuilder().append(id, rhs.id).append(kickoffTimeFormatted, rhs.kickoffTimeFormatted).append(started, rhs.started).append(eventDay, rhs.eventDay).append(deadlineTime, rhs.deadlineTime).append(deadlineTimeFormatted, rhs.deadlineTimeFormatted).append(stats, rhs.stats).append(code, rhs.code).append(kickoffTime, rhs.kickoffTime).append(teamHScore, rhs.teamHScore).append(teamAScore, rhs.teamAScore).append(finished, rhs.finished).append(minutes, rhs.minutes).append(provisionalStartTime, rhs.provisionalStartTime).append(finishedProvisional, rhs.finishedProvisional).append(event, rhs.event).append(teamA, rhs.teamA).append(teamH, rhs.teamH).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
