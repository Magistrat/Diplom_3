package com.pageobject.pages;

import com.pageobject.locators.RegistrationLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage implements RegistrationLocators {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ввод во все поля на странице регистрации")
    public void fillToRegistrationFields(String textName, String textEmail, String textPassword){
        fillToInput(inputName, textName);
        fillToInput(inputEmail, textEmail);
        fillToInput(inputPassword, textPassword);
    }

}
