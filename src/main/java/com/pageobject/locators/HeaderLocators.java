package com.pageobject.locators;

import org.openqa.selenium.By;

public interface HeaderLocators {
    public static final By headerConstructorButton = By.xpath(".//p[text() = 'Конструктор']/..");
    public static final By headerOrderListButton = By.xpath(".//p[text() = 'Лента Заказов']/..");
    public static final By headerWebSiteLogoButton = By.cssSelector("a.active svg");
    public static final By headerProfileButton = By.xpath(".//p[text() = 'Личный Кабинет']/..");
}
