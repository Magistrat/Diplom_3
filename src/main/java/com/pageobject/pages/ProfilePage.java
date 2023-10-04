package com.pageobject.pages;

import com.pageobject.locators.ProfileLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends HeaderPage implements ProfileLocators {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка страницы Личный Кабинет")
    public void checkProfilePagePage(String textName, String textEmail) {
        checkHeaderPage();

        checkLoginAndNameInProfilePage(textName, textEmail);
        elementHasVisibility(buttonForSaveInProfile);
        elementHasVisibility(buttonForCancelInProfile);
        elementHasVisibility(buttonProfileInProfile);
        elementHasVisibility(buttonOrdersHistoryInProfile);
        elementHasVisibility(buttonLogOutInProfile);
        elementHasVisibility(helpMessageInProfile);
        elementHasVisibility(labelNameInProfile);
        elementHasVisibility(labelLoginInProfile);
    }

    @Step("Выход из учетной записи из Личного Кабинета")
    public void clickLogOutInProfile(){
        clickToElement(buttonLogOutInProfile);
    }

    @Step("Проверка текущего Имени и Логина в Личном Кабинете")
    private void checkLoginAndNameInProfilePage(String textName, String textEmail){
        String inputNameString = "//input[@value = '" + textName + "']";
        String inputEmailString = "//input[@value = '" + textEmail + "']";

        elementHasVisibility(By.xpath(inputNameString));
        elementHasVisibility(By.xpath(inputEmailString));
    }
}
