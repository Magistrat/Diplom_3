package com.pageobject.locators;

import org.openqa.selenium.By;

public interface MainLocators {
    public static final By textGatherBurger = By.xpath(".//h1[text() = 'Соберите бургер']");

    public static final By storeTabBread = By.xpath(".//span[contains(@class, 'text_type_main-default') and text() = 'Булки']");
    public static final By storeTabSauce = By.xpath(".//span[contains(@class, 'text_type_main-default') and text() = 'Соусы']");
    public static final By storeTabIngredient = By.xpath(".//span[contains(@class, 'text_type_main-default') and text() = 'Начинки']");
    public static final By storeItems = By.xpath(".//ul/a[@href and contains(@class, 'BurgerIngredient')]");
    public static final By storeSectionsBread = By.xpath(".//h2[text() ='Булки']");
    public static final By storeSectionsSauce = By.xpath(".//h2[text() ='Соусы']");
    public static final By storeSectionsIngredient = By.xpath(".//h2[text() ='Начинки']");

    public static final By buttonToLoginAccount = By.xpath(".//button[text() ='Войти в аккаунт']");

}
