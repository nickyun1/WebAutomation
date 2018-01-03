package com.chun.webObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

    /**
     * Get an object from web page via CSS selector
     *
     * @param driver    Web driver to invoke actions on
     * @param elementID CSS for the element
     * @return Return found element
     */
    public static WebElement getObject(WebDriver driver, String elementID) {
        WebElement element = driver.findElement(By.cssSelector(elementID));
        return element;
    }

    public static WebElement getObject1(WebDriver driver, String elementID) {
        WebElement element = driver.findElement(By.xpath(elementID));
        return element;
    }
}
