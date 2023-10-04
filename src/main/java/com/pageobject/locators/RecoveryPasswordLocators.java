package com.pageobject.locators;

import org.openqa.selenium.By;

public interface RecoveryPasswordLocators {
    public static final By textRecoveryPassword = By.xpath(".//h2[text() = 'Восстановление пароля']");
    public static final By inputEmailForRecoveryPassword = By.xpath(".//label[text() = 'Email']/../input");
    public static final By paragraphRememberPassword = By.xpath(".//div/p[text() = 'Вспомнили пароль?']");
    public static final By linkIfRememberPassword = By.xpath(".//a[text() = 'Войти' and @href = '/login']");
    public static final By buttonForRecoveryPasswordForm = By.xpath(".//button[text() = 'Восстановить']");
}
