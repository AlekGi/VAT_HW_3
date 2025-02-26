
package org.homework;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "image",
    "imageType",
    "usedIngredientCount",
    "missedIngredientCount",
    "missedIngredients",
    "usedIngredients",
    "unusedIngredients",
    "likes"
})
@Generated("jsonschema2pojo")
public class SearchRecipesByIngredient {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("image")
    private String image;
    @JsonProperty("imageType")
    private String imageType;
    @JsonProperty("usedIngredientCount")
    private Integer usedIngredientCount;
    @JsonProperty("missedIngredientCount")
    private Integer missedIngredientCount;
    @JsonProperty("missedIngredients")
    private List<MissedIngredient> missedIngredients;
    @JsonProperty("usedIngredients")
    private List<UsedIngredient> usedIngredients;
    @JsonProperty("unusedIngredients")
    private List<UnusedIngredient> unusedIngredients;
    @JsonProperty("likes")
    private Integer likes;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("imageType")
    public String getImageType() {
        return imageType;
    }

    @JsonProperty("imageType")
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @JsonProperty("usedIngredientCount")
    public Integer getUsedIngredientCount() {
        return usedIngredientCount;
    }

    @JsonProperty("usedIngredientCount")
    public void setUsedIngredientCount(Integer usedIngredientCount) {
        this.usedIngredientCount = usedIngredientCount;
    }

    @JsonProperty("missedIngredientCount")
    public Integer getMissedIngredientCount() {
        return missedIngredientCount;
    }

    @JsonProperty("missedIngredientCount")
    public void setMissedIngredientCount(Integer missedIngredientCount) {
        this.missedIngredientCount = missedIngredientCount;
    }

    @JsonProperty("missedIngredients")
    public List<MissedIngredient> getMissedIngredients() {
        return missedIngredients;
    }

    @JsonProperty("missedIngredients")
    public void setMissedIngredients(List<MissedIngredient> missedIngredients) {
        this.missedIngredients = missedIngredients;
    }

    @JsonProperty("usedIngredients")
    public List<UsedIngredient> getUsedIngredients() {
        return usedIngredients;
    }

    @JsonProperty("usedIngredients")
    public void setUsedIngredients(List<UsedIngredient> usedIngredients) {
        this.usedIngredients = usedIngredients;
    }

    @JsonProperty("unusedIngredients")
    public List<UnusedIngredient> getUnusedIngredients() {
        return unusedIngredients;
    }

    @JsonProperty("unusedIngredients")
    public void setUnusedIngredients(List<UnusedIngredient> unusedIngredients) {
        this.unusedIngredients = unusedIngredients;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

}
