package com.project.locators;

import org.openqa.selenium.By;

public interface RegistrationLocators {
    public static final By inputName = By.name(".//label[text() = 'Имя']/../input");
    public static final By inputEmail = By.name(".//label[text() = 'Email']/../input");
    public static final By inputPassword = By.name(".//label[text() = 'Пароль']/../input");
}
