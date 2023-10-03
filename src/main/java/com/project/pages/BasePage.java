package com.project.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
