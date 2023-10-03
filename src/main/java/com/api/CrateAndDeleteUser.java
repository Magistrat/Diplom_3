package com.api;

import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveResponseUserPojo;
import io.qameta.allure.Step;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static com.api.SettingsApiInterface.*;

public class CrateAndDeleteUser {
    // Класс для создания и удаления Тестового пользователя через API

    static {
        RestAssured.baseURI =BASE_URL;
    }

    @Step("Создание тестового Пользователя через API")
    public static RegisterPositiveResponseUserPojo creteUserByApi(RegisterPositiveRequestPojo body){
        return given()
                .header(CONTENT_TYPE, APPLICATION_JSON)
                .and()
                .body(body)
                .when()
                .post(REGISTER_USER_URL)
                .as(RegisterPositiveResponseUserPojo.class);
    }

    @Step("Удаление пользователя при помощи Bearer Token")
    public static void deleteUserByBearerToken(String bearerToken){
        given()
                .header("Authorization", bearerToken)
                .header(CONTENT_TYPE, APPLICATION_JSON)
                .when()
                .delete(DELETE_USER_URL);
    }
}
