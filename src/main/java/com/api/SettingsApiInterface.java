package com.api;

public interface SettingsApiInterface {
    // Настройки для работы с API

    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site/";

    public static final String REGISTER_USER_URL = "/api/auth/register";
    public static final String LOGIN_USER_URL = "/api/auth/login";
    public static final String DELETE_USER_URL = "/api/auth/user";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";

}
