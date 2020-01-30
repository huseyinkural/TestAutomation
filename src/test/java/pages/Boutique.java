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

    public void openProductDetail(){

    }
}
