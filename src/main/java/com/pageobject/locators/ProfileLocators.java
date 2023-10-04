package com.pageobject.locators;

import org.openqa.selenium.By;

public interface ProfileLocators {
    public static final By buttonForSaveInProfile = By.xpath(".//button[text() = 'Сохранить']");
    public static final By buttonForCancelInProfile = By.xpath(".//button[text() = 'Отмена']");
    public static final By buttonProfileInProfile = By.xpath(".//a[text() = 'Профиль']");
    public static final By buttonOrdersHistoryInProfile = By.xpath(".//a[text() = 'История заказов']");
    public static final By buttonLogOutInProfile = By.xpath(".//button[text() = 'Выход']");
    public static final By helpMessageInProfile = By.xpath(
            "//p[text()='В этом разделе вы можете изменить свои персональные данные']"
    );
    public static final By labelNameInProfile = By.xpath("//label[text()='Имя']");
    public static final By labelLoginInProfile = By.xpath("//label[text()='Логин']");

}
