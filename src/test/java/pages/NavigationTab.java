package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class NavigationTab extends Base {
    public NavigationTab(WebDriver driver) {
        super(driver);
    }


    By testTabKadin= By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[1]/a");
    By testTabErkek=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a");
    By testTabCocuk=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[3]/a");
    By testTabAyakkabiCanta=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[4]/a");
    By testTabSaatAksesuar=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[5]/a");
    By testTabKozmetik=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[6]/a");
    By testTabEvYasam=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[7]/a");
    By testTabElektronik=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[8]/a");
    By testTabSmarket=By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a");


    public NavigationTab verifyImageLoading(){

        checkTabImages(testTabKadin);
        checkTabImages(testTabErkek);
        checkTabImages(testTabCocuk);
        checkTabImages(testTabAyakkabiCanta);
        checkTabImages(testTabSaatAksesuar);
        checkTabImages(testTabKozmetik);
        checkTabImages(testTabEvYasam);
        checkTabImages(testTabElektronik);
        checkTabImages(testTabSmarket);

        return this;

    }



    public void checkTabImages(By byElement){
        click(byElement);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        List<WebElement> allImages = driver.findElements(By.className("image-container"));
        checkImageValidity(allImages);

    }

    public Boutique openRandomTab(){
        List<WebElement> tabs = driver.findElements(By.className("tab-link"));

        Random rand = new Random();
        int value = rand.nextInt(tabs.size());

        tabs.get(value).click();

        return new Boutique(driver);
    }


}
