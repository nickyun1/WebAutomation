package com.chun.pageActions;

import org.openqa.selenium.WebDriver;

public class CloseWebDriver {

    public static void Close (WebDriver driver) {
        driver.close();
        driver.quit();
    }
}
