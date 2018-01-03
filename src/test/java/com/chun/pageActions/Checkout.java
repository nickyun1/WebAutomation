package com.chun.pageActions;

import com.chun.resources.Information;
import com.chun.webObjects.ID;
import com.chun.webObjects.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

    public static void SupremeCheckout() throws InterruptedException {

        // Open Web browser
        WebDriver driver = new ChromeDriver();
        driver.get(Information.Website.URL);

        // Click Shop Link
        PageObjects.getObject(driver, ID.Supreme.ShopLink).click();

        // Wait till we see 3rd product link then press
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ID.Supreme.SupremeObject1)));
        PageObjects.getObject(driver, ID.Supreme.SupremeObject3).click();

        //Select Size (medium for demo purposes.. Grab value from information text in future)
        WebElement mySelectElement = driver.findElement(By.cssSelector(ID.Supreme.SizeDropDown));
        Select DropdownSize = new Select(mySelectElement);
        //DropdownSize.selectByVisibleText("Medium");

        //Press Add to Cart
        //PageObjects.getObject(driver, ID.Supreme.AddToCart).click();
        CloseWebDriver.Close(driver);



    }

}
