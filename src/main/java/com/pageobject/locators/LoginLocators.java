package com.pageobject.locators;

import org.openqa.selenium.By;

public interface LoginLocators {
    // Локаторы для страницы Авторизации

    public static final By hTwoLoginText = By.xpath(".//h2[text() = 'Вход']");
    public static final By inputEmail = By.xpath(".//label[text() = 'Email']/../input");
    public static final By inputPassword = By.xpath(".//label[text() = 'Пароль']/../input");
    public static final By buttonForLoginForm = By.xpath(".//button[text() = 'Войти']");
    public static final By paragraphNewUser = By.xpath(".//div/p[contains(text(),'Вы') and contains(text(),'— новый пользователь?')]");
    public static final By linkIfNotRegistered = By.xpath(".//a[text() = 'Зарегистрироваться' and @href='/register']");
    public static final By paragraphForgotPassword = By.xpath(".//div/p[text() = 'Забыли пароль?']");
    public static final By linkRestorePassword = By.xpath(".//a[text() = 'Восстановить пароль' and @href = '/forgot-password']");
}
