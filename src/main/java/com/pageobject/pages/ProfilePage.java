package com.pageobject.pages;

import com.pageobject.locators.ProfileLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends HeaderPage implements ProfileLocators {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка страницы Личный Кабинет")
    public void checkProfilePagePage() {
        checkHeaderPage();

        elementHasVisibility(buttonForSaveInProfile);
        elementHasVisibility(buttonForCancelInProfile);
        elementHasVisibility(buttonProfileInProfile);
        elementHasVisibility(buttonOrdersHistoryInProfile);
        elementHasVisibility(buttonLogOutInProfile);
    }

    @Step("Выход из учетной записи")
    public void clickLogOutInProfile(){
        clickToElement(buttonLogOutInProfile);
    }
}
