package com.api.pojo.login;

public class LoginPositiveResponseAllPojo {
    // Pojo для позитивной авторизации пользователя (получение JSON)

    private boolean success;
    private String accessToken;
    private String refreshToken;
    private LoginPositiveResponseUserPojo user;

    public String getAccessToken() {
        return accessToken;
    }
}

