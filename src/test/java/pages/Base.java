package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.*;


public class Base {

    public WebDriver driver;
    public WebDriverWait wait;

    public Base (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }


    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }


    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }


    public String getText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }


    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(getText(elementBy), expectedText);

    }

    public void checkImageValidity(List<WebElement> imageList){


        for (WebElement img : imageList) {
            Boolean imageLoaded = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", img.findElement(By.tagName("img")));



            if (!imageLoaded) {

                System.out.println("Image not displayed.");
            } else {
               // System.out.println(img.findElement(By.tagName("img")).getAttribute("alt"));
                System.out.println("Image displayed.");
            }
        }


    }
}
