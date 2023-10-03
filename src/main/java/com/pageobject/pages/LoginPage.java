package com.pageobject.pages;

import com.pageobject.locators.LoginLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements LoginLocators {
    // Page Object для страницы Авторизации

    public LoginPage(WebDriver driver) {
        super(driver);
    }


}
