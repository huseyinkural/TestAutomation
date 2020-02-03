package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Base;
import pages.Home;

import java.util.List;
import java.util.Random;

public class NavigationTabTest extends BaseTest {

    @Test(priority = 0)
    public void checkImages(){
        System.out.println("Verify check all images test is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .verifyImageLoading();
    }

    @Test
    public void verifyOpenRandomTab(){
        System.out.println("Verify open random tab is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab();

    }




}
