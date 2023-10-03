package com.pageobject.pages;

import com.pageobject.locators.LoginLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements LoginLocators {
    // Page Object для страницы Авторизации

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка страницы Авторизации")
    public void checkLoginPage(){
        elementHasVisibility(hTwoLoginText);
        elementHasVisibility(inputEmail);
        elementHasVisibility(inputPassword);
        elementHasVisibility(buttonForLoginForm);
        elementHasVisibility(paragraphNewUser);
        elementHasVisibility(linkIfNotRegistered);
        elementHasVisibility(paragraphForgotPassword);
        elementHasVisibility(linkRestorePassword);
    }


}
