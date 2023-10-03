package com.pageobject.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.pageobject.SettingsUiTestInterface.EXPLICITLY_TIMEOUT;

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

}
