package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Home;

import java.util.List;
import java.util.Random;

public class BoutiqueTest extends BaseTest {

    @Test(priority = 0)
    public void verifyOpenRandomBoutique(){
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique();

    }

    @Test(priority = 1)
    public void verifyProductImage(){
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique()
                .checkProductImages();

    }



}
