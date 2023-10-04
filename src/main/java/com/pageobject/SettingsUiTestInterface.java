package com.pageobject;

import java.util.List;

public interface SettingsUiTestInterface {
    // Настройки для Автотестов UI через Selenium

    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site/";
    public static final String REGISTER_URL = "https://stellarburgers.nomoreparties.site/register";
    public static final String LOGIN_URL = "https://stellarburgers.nomoreparties.site/login";
    public static final String FORGOT_PASSWORD_FORM_URL = "https://stellarburgers.nomoreparties.site/forgot-password";

    public static final List<String> LIST_CHROME_OPTIONS = List.of(
            "--no-sandbox",
            "--disable-dev-shm-usage",
            "--remote-allow-origins=*"
    );

    public static final int EXPLICITLY_TIMEOUT = 40;

}
