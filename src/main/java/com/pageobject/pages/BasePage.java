package com.pageobject.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.pageobject.SettingsUiTestInterface.*;

public abstract class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Элемент отображается на странице и присутствует в DOM")
    public void elementHasVisibility(By locator){
        new WebDriverWait(driver, EXPLICITLY_TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @Step("Ввести текст в элемент")
    public void fillToInput(By locator, String textInput){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(textInput);
    }

    @Step("Кликнуть на элемент")
    public void clickToElement(By locator){
        elementHasVisibility(locator);
        driver.findElement(locator).click();
    }

    @Step("Открытие Главной страницы")
    public static void openMainPage(WebDriver driver){
        driver.get(BASE_URL);
    }

    @Step("Открытие страницы Регистрации")
    public static void openRegistrationPage(WebDriver driver){
        driver.get(REGISTER_URL);
    }

    @Step("Открытие страницы Восстановления пароля")
    public static void openForgotPasswordPage(WebDriver driver){
        driver.get(FORGOT_PASSWORD_FORM_URL);
    }

    @Step("Открытие страницы Авторизация")
    public static void openLoginPage(WebDriver driver){
        driver.get(LOGIN_URL);
    }
}
