package com.pageobject.pages;

import com.pageobject.locators.RegistrationLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends HeaderPage implements RegistrationLocators {
    // Page Object для страницы Регистрации

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка страницы Регистрации")
    public void checkRegistrationPage(){
        checkHeaderPage();

        elementHasVisibility(hTwoRegistrationText);
        elementHasVisibility(inputName);
        elementHasVisibility(inputEmail);
        elementHasVisibility(inputPassword);
        elementHasVisibility(buttonForRegistrationForm);
        elementHasVisibility(paragraphAlreadyRegistered);
        elementHasVisibility(linkIfAlreadyRegistered);
    }

    @Step("Ввод во все поля на странице Регистрации")
    public void fillToRegistrationFields(String textName, String textEmail, String textPassword){
        fillToInput(inputName, textName);
        fillToInput(inputEmail, textEmail);
        fillToInput(inputPassword, textPassword);
    }

    @Step("Клик на кнопку 'Зарегистрироваться' на странице Регистрации")
    public void clickToRegisterInForm(){
        clickToElement(buttonForRegistrationForm);
    }

    @Step("Проверка уведомления о некорректном пароле")
    public void checkMessageOfIncorrectPassword(){
        elementHasVisibility(messageIncorrectPassword);
    }

    @Step("Клик на кнопку 'Уже зарегистрированы?' на странице Регистрации")
    public void clickToLoginFromRegistrationPage(){
        clickToElement(linkIfAlreadyRegistered);
    }

}
