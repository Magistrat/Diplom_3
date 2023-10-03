package com.project;

import java.util.List;

public interface SettingsInterface {
    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site/";

    public static final List<String> LIST_CHROME_OPTIONS = List.of(
            "--no-sandbox",
            "--disable-dev-shm-usage",
            "--remote-allow-origins=*"
    );

    public static final int EXPLICITLY_TIMEOUT = 40;

}
