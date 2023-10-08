package com.pageobject.pages;

import com.pageobject.locators.HeaderLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage implements HeaderLocators {
    // Шапка страницы

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка Header (шапки) сайта")
    public void checkHeaderPage(){
        elementHasVisibility(headerConstructorButton);
        elementHasVisibility(headerOrderListButton);
        elementHasVisibility(headerWebSiteLogoButton);
        elementHasVisibility(headerProfileButton);
    }

    @Step("Клик на кнопку Конструктор из Header (шапки) сайта")
    public void clickToConstructorButtonFromHeader() {
        clickToElement(headerConstructorButton);
    }

    @Step("Клик на кнопку Лента Заказов из Header (шапки) сайта")
    public void clickToOrderListButtonFromHeader() {
        clickToElement(headerOrderListButton);
    }

    @Step("Клик на Логотип Сайта из Header (шапки) сайта")
    public void clickToWebSiteLogoButtonFromHeader() {
        clickToElement(headerWebSiteLogoButton);
    }

    @Step("Клик на кнопку Личный Кабинет из Header (шапки) сайта")
    public void clickToProfileButtonFromHeader() {
        clickToElement(headerProfileButton);
    }
}
