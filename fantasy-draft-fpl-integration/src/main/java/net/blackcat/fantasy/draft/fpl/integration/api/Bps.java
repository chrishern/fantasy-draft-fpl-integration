
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
    "a",
    "h"
})
public class Bps {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("a")
    private List<A> a = new ArrayList<A>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("h")
    private List<H> h = new ArrayList<H>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The a
     */
    @JsonProperty("a")
    public List<A> getA() {
        return a;
    }

    /**
     * 
     * (Required)
     * 
     * @param a
     *     The a
     */
    @JsonProperty("a")
    public void setA(List<A> a) {
        this.a = a;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The h
     */
    @JsonProperty("h")
    public List<H> getH() {
        return h;
    }

    /**
     * 
     * (Required)
     * 
     * @param h
     *     The h
     */
    @JsonProperty("h")
    public void setH(List<H> h) {
        this.h = h;
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
        return new HashCodeBuilder().append(a).append(h).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bps) == false) {
            return false;
        }
        Bps rhs = ((Bps) other);
        return new EqualsBuilder().append(a, rhs.a).append(h, rhs.h).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
