
package org.homework;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nutrients"
})
@Generated("jsonschema2pojo")
public class Nutrition {

    @JsonProperty("nutrients")
    private List<Nutrient> nutrients;

    @JsonProperty("nutrients")
    public List<Nutrient> getNutrients() {
        return nutrients;
    }

    @JsonProperty("nutrients")
    public void setNutrients(List<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }

}
