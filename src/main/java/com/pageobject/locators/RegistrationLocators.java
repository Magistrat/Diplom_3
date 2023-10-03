package com.pageobject.locators;

import org.openqa.selenium.By;

public interface RegistrationLocators {
    // Локаторы для страницы Регистрации

    public static final By hTwoRegistrationText = By.xpath(".//h2[text() = 'Регистрация']");
    public static final By inputName = By.xpath(".//label[text() = 'Имя']/../input");
    public static final By inputEmail = By.xpath(".//label[text() = 'Email']/../input");
    public static final By inputPassword = By.xpath(".//label[text() = 'Пароль']/../input");
    public static final By buttonForRegistrationForm = By.xpath(".//button[text() = 'Зарегистрироваться']");
    public static final By paragraphAlreadyRegistered = By.xpath(".//div/p[text() = 'Уже зарегистрированы?']");
    public static final By linkIfAlreadyRegistered = By.xpath(".//a[text() = 'Войти' and @href = '/login']");
}
