
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
    "explain",
    "fixture"
})
public class Explain {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("explain")
    private Explain_ explain;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fixture")
    private Fixture fixture;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The explain
     */
    @JsonProperty("explain")
    public Explain_ getExplain() {
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
    public void setExplain(Explain_ explain) {
        this.explain = explain;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fixture
     */
    @JsonProperty("fixture")
    public Fixture getFixture() {
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
    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
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
        return new HashCodeBuilder().append(explain).append(fixture).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Explain) == false) {
            return false;
        }
        Explain rhs = ((Explain) other);
        return new EqualsBuilder().append(explain, rhs.explain).append(fixture, rhs.fixture).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
