package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Base {


    public Home(WebDriver driver) {
        super(driver);
    }


    String baseURL = "https://www.trendyol.com/";


    By signInButtonBy = By.className("btnSignIn");
    By closePopupBy = By.cssSelector(".fancybox-item.fancybox-close");


    //*********Page Methods*********
    //Go to Homepage
    public Home goToTrendyol (){
        driver.get(baseURL);
        return this;
    }

    public Home closePopupWindow(){
        click(closePopupBy);
        return this;
    }

    //Go to LoginPage
    public Login goToLogin (){
        click(signInButtonBy);
        return new Login(driver);
    }
}
