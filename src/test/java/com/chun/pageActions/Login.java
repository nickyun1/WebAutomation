package com.chun.pageActions;

import com.chun.resources.Information;
import org.openqa.selenium.WebDriver;

import com.chun.webObjects.ID;
import com.chun.webObjects.PageObjects;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    /**
     * Logging into Facebook
     */
    public static void FacebookLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get(Information.Website.URL);
        PageObjects.getObject(driver, ID.Facebook.Email).sendKeys(Information.AccountInformation.Email);
        PageObjects.getObject(driver, ID.Facebook.Password).sendKeys(Information.AccountInformation.Password);
        PageObjects.getObject(driver, ID.Facebook.Login).click();
        //CloseWebDriver.Close(driver);
    }

    /**
     * Logging into EXCLUCITYLIFE
     */
    public static void ExclucitylifeLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get(Information.Website.URL);
        PageObjects.getObject(driver, ID.Exclucitylife.Account).click();
        PageObjects.getObject(driver, ID.Exclucitylife.Email).sendKeys(Information.AccountInformation.Email);
        PageObjects.getObject(driver, ID.Exclucitylife.Password).sendKeys(Information.AccountInformation.Password);
        PageObjects.getObject(driver, ID.Exclucitylife.Login).click();
        CloseWebDriver.Close(driver);
    }
}
