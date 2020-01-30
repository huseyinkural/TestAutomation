package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Base {


    public Home(WebDriver driver) {
        super(driver);
    }


    String baseURL = "https://www.trendyol.com/";


    By loginButtonBy = By.cssSelector(".login-register-button-container");
    By closePopupBy = By.cssSelector(".fancybox-item.fancybox-close");


    public Home goToTrendyol (){
        driver.get(baseURL);
        return this;
    }

    public Home closePopupWindow(){

        click(closePopupBy);
        return this;
    }

    public Login goToLogin (){
        click(loginButtonBy);
        return new Login(driver);
    }

    public NavigationTab goToTab (){
        return new NavigationTab(driver);
    }
}
