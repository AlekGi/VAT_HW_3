package org.homework;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SimilarRecipesTest extends AbstractTest {

    @Test
    void getSimilarRecipes_whenValid_shouldReturn() {
        List<GetSimilarRecipe> response = given()
                .queryParam("apiKey", getApiKey())
                .when()
                .get(getBaseUrl()+"715538/similar")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", GetSimilarRecipe.class);

        Assertions.assertEquals(response.size(),10);
        response.forEach(v -> {
            if (v.getId().equals(209128)) {
                Assertions.assertEquals(v.getTitle(),"Dinner Tonight: Grilled Romesco-Style Pork");
            }
            if (v.getId().equals(31868)) {
                Assertions.assertEquals(v.getTitle(),"Dinner Tonight: Chickpea Bruschetta");
            }
        });
    }
}
