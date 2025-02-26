package org.gomework;

import org.hamcrest.Matchers;
import org.homework.TasteByID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TasteByIdTest extends AbstractTest{

    @Test
    void getConvertAmounts_whenValid_shouldReturn() {
        TasteByID response = given()
                .queryParam("apiKey", getApiKey())
                .when()
                .get(getBaseUrl()+"702060/tasteWidget.json")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(20000l))
                .extract()
                .response()
                .body().as(TasteByID.class);

        Assertions.assertEquals(response.getSweetness(), 98.61);
        Assertions.assertEquals(response.getSaltiness(), 76.57);

    }
}
