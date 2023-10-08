package com.api.pojo.register;

public class RegisterPositiveResponseAllPojo {
    // Pojo для регистрации пользователя (получение JSON)

    private boolean success;
    private RegisterPositiveResponseUserPojo user;
    private String accessToken;
    private String refreshToken;

    public String getAccessToken() {
        return accessToken;
    }
}
