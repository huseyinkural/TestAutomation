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
        System.out.println("Verify open random boutique is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique();

    }

    @Test(priority = 1)
    public void verifyProductImage(){
        System.out.println("Verify product image is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique()
                .checkProductImages();

    }

    @Test(priority = 2)
    public void verifyOpenProductDetail(){
        System.out.println("Verify open random Product detail is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique()
                .openProductDetail();
    }

    @Test(priority = 3)
    public void verifyAddToBasket(){
        System.out.println("Verify add to basket is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .openRandomTab()
                .openRandomBoutique()
                .openProductDetail()
                .addToBasket()
                .verifyAddedToBasket("1 Ürün");

    }



}
