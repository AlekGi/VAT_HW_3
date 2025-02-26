package org.homework;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RandomRecipesTest extends AbstractTest {

    @Test
    public void testGetRecipesRandomly() {
        GetRandomRecipes response = given()
                .queryParam("apiKey", getApiKey())
                .queryParam("number", 4)
                .when()
                .get(getBaseUrl() + "random")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .response()
                .body().as(GetRandomRecipes.class);

        Assertions.assertEquals(response.recipes.size(),4);
    }
}
