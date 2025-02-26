
package org.homework;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sweetness",
    "saltiness",
    "sourness",
    "bitterness",
    "savoriness",
    "fattiness",
    "spiciness"
})
@Generated("jsonschema2pojo")
public class TasteByID {

    @JsonProperty("sweetness")
    private Double sweetness;
    @JsonProperty("saltiness")
    private Double saltiness;
    @JsonProperty("sourness")
    private Double sourness;
    @JsonProperty("bitterness")
    private Double bitterness;
    @JsonProperty("savoriness")
    private Double savoriness;
    @JsonProperty("fattiness")
    private Double fattiness;
    @JsonProperty("spiciness")
    private Double spiciness;

    @JsonProperty("sweetness")
    public Double getSweetness() {
        return sweetness;
    }

    @JsonProperty("sweetness")
    public void setSweetness(Double sweetness) {
        this.sweetness = sweetness;
    }

    @JsonProperty("saltiness")
    public Double getSaltiness() {
        return saltiness;
    }

    @JsonProperty("saltiness")
    public void setSaltiness(Double saltiness) {
        this.saltiness = saltiness;
    }

    @JsonProperty("sourness")
    public Double getSourness() {
        return sourness;
    }

    @JsonProperty("sourness")
    public void setSourness(Double sourness) {
        this.sourness = sourness;
    }

    @JsonProperty("bitterness")
    public Double getBitterness() {
        return bitterness;
    }

    @JsonProperty("bitterness")
    public void setBitterness(Double bitterness) {
        this.bitterness = bitterness;
    }

    @JsonProperty("savoriness")
    public Double getSavoriness() {
        return savoriness;
    }

    @JsonProperty("savoriness")
    public void setSavoriness(Double savoriness) {
        this.savoriness = savoriness;
    }

    @JsonProperty("fattiness")
    public Double getFattiness() {
        return fattiness;
    }

    @JsonProperty("fattiness")
    public void setFattiness(Double fattiness) {
        this.fattiness = fattiness;
    }

    @JsonProperty("spiciness")
    public Double getSpiciness() {
        return spiciness;
    }

    @JsonProperty("spiciness")
    public void setSpiciness(Double spiciness) {
        this.spiciness = spiciness;
    }

}
