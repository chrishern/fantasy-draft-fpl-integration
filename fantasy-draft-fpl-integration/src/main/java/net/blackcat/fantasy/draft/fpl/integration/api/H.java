
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
    "value",
    "element"
})
public class H {

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
    @JsonProperty("element")
    private Integer element;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return new HashCodeBuilder().append(value).append(element).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof H) == false) {
            return false;
        }
        H rhs = ((H) other);
        return new EqualsBuilder().append(value, rhs.value).append(element, rhs.element).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
