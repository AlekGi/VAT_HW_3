package org.gomework;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractTest {

    static Properties prop = new Properties();
    private static InputStream configFile;
    private static String apiKey;
    private static String baseUrl;
    private static int counter = 0;

    @BeforeAll
    static void initTest() throws IOException {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        configFile = new FileInputStream("src/test/resources/spoonacular.properties");
        prop.load(configFile);

        apiKey =  prop.getProperty("apiKey");
        baseUrl= prop.getProperty("baseUrl");
        counter = 0;
        System.out.println("Запуск тестов");
    }

    @BeforeEach
    public void before() {
        counter++;
        System.out.println("Запуск теста: " + counter);
    }

    @AfterEach
    public void after() {
        counter--;
        System.out.println("Тест: " + counter + " пройден");
    }

    @AfterAll
    public static void afterAll() {
        counter = 0;
        System.out.println("Тестирование окончено");
    }

    public static String getApiKey() {
        return apiKey;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }
}

