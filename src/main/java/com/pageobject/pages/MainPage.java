package com.pageobject.pages;

import com.pageobject.locators.MainLocators;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MainPage extends HeaderPage implements MainLocators {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка главной страницы")
    public void checkMainPage(boolean hasLogged){
        checkHeaderPage();

        elementHasVisibility(textGatherBurger);
        elementHasVisibility(storeTabBun);
        elementHasVisibility(storeTabSauce);
        elementHasVisibility(storeTabIngredient);
        elementHasVisibility(storeItems);
        elementHasVisibility(storeSectionsBread);
        elementHasVisibility(storeSectionsSauce);
        elementHasVisibility(storeSectionsIngredient);

        if (hasLogged){
            elementHasVisibility(buttonToConfirmOrder);
        } else {
            elementHasVisibility(buttonToLoginAccount);
        }
    }

    @Step("Клик по кнопке «Войти в аккаунт» на главной странице")
    public void clickToLoginToAccountFromMainPage(){
        clickToElement(buttonToLoginAccount);
    }

    @Step("Клик на таб «Булки» на главной странице")
    public void clickToTabBunFromMainPage(){
        clickToElement(storeTabBun);
    }

    @Step("Клик на таб «Соусы» на главной странице")
    public void clickToTabSauceFromMainPage(){
        clickToElement(storeTabSauce);
    }

    @Step("Клик на таб «Начинки» на главной странице")
    public void clickToTabIngredientFromMainPage(){
        clickToElement(storeTabIngredient);
    }

}
