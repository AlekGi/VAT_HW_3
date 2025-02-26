
package org.homework;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recipes"
})
@Generated("jsonschema2pojo")
public class GetRandomRecipes {

    @JsonProperty("recipes")
    public List<Recipe> recipes;

    @JsonProperty("recipes")
    public List<Recipe> getRecipes() {
        return recipes;
    }

    @JsonProperty("recipes")
    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

}
