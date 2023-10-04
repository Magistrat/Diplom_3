package com.pageobject.pages;

import com.pageobject.locators.LoginLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HeaderPage implements LoginLocators {
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

    @Step("Ввод Email и пароля на странице Авторизации")
    public void fillToLoginFields(String textEmail, String textPassword){
        fillToInput(inputEmail, textEmail);
        fillToInput(inputPassword, textPassword);
    }

    @Step("Клик на кнопку 'Войти' на странице Авторизации")
    public void clickToLoginInForm(){
        clickToElement(buttonForLoginForm);
    }


}
