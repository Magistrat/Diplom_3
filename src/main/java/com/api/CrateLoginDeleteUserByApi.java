package com.api;

import com.api.pojo.login.LoginPositiveRequestPojo;
import com.api.pojo.login.LoginPositiveResponseAllPojo;
import com.api.pojo.register.RegisterPositiveRequestPojo;
import com.api.pojo.register.RegisterPositiveResponseAllPojo;
import io.qameta.allure.Step;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static com.api.SettingsApiInterface.*;

public class CrateLoginDeleteUserByApi {
    // Класс для создания и удаления Тестового пользователя через API

    static {
        RestAssured.baseURI =BASE_URL;
    }

    @Step("Создание тестового Пользователя через API и получение Bearer Token из ответа")
    public static String creteUserByApiAndGetBearerToken(RegisterPositiveRequestPojo body){
        RegisterPositiveResponseAllPojo responsePojo = given()
                .header(CONTENT_TYPE, APPLICATION_JSON)
                .and()
                .body(body)
                .when()
                .post(REGISTER_USER_URL)
                .as(RegisterPositiveResponseAllPojo.class);

        return responsePojo.getAccessToken();
    }

    @Step("Авторизация под Пользователем и получение Bearer Token через API")
    public static String loginUserByApiAndGetBearerToken(LoginPositiveRequestPojo body){
        LoginPositiveResponseAllPojo responsePojo = given()
                .header(CONTENT_TYPE, APPLICATION_JSON)
                .and()
                .body(body)
                .when()
                .post(LOGIN_USER_URL)
                .as(LoginPositiveResponseAllPojo.class);

        return responsePojo.getAccessToken();
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
