package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Boutique extends Base {

    public Boutique(WebDriver driver) {
        super(driver);
    }

    By addToBasketButtonBy = By.className("add-to-bs-tx");
    By basketItemCountBy = By.id("titleBasketCount");
    By basketBy = By.className("basket-button-container");


    public Boutique openRandomBoutique(){

        List<WebElement> boutiques = driver.findElements(By.className("component-item"));
        Random rand = new Random();
        int boutiqueRand = rand.nextInt(boutiques.size());
        System.out.println("val"+boutiques.size());

        boutiques.get(boutiqueRand).click();

        return this;

    }

    public void checkProductImages(){

        List<WebElement> allImages = driver.findElements(By.className("image-container"));
        checkImageValidity(allImages);

    }

    public Boutique openProductDetail(){

        List<WebElement> allProducts = driver.findElements(By.className("image-container"));
        Random rand = new Random();
        int productRandom = rand.nextInt(allProducts.size());

        allProducts.get(productRandom).click();
        return this;
    }

    public Boutique addToBasket(){

        click(addToBasketButtonBy);

        click(basketBy);
        return this;

    }

    public Boutique verifyAddedToBasket (String expectedText) {
        assertEquals(basketItemCountBy, expectedText);
        return this;
    }


}
