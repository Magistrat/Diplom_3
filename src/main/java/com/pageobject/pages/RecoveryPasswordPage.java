package com.pageobject.pages;

import com.pageobject.locators.RecoveryPasswordLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class RecoveryPasswordPage extends HeaderPage implements RecoveryPasswordLocators {
    public RecoveryPasswordPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка страницы Восстановления пароля")
    public void checkRecoveryPasswordPage(){
        checkHeaderPage();

        elementHasVisibility(textRecoveryPassword);
        elementHasVisibility(inputEmailForRecoveryPassword);
        elementHasVisibility(paragraphRememberPassword);
        elementHasVisibility(linkIfRememberPassword);
        elementHasVisibility(buttonForRecoveryPasswordForm);
    }

    @Step("Клик на кнопку 'Войти' на странице Восстановления пароля")
    public void clickIfRememberPassword(){
        clickToElement(linkIfRememberPassword);
    }
}
