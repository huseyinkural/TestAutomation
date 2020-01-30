package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base{
    public Login(WebDriver driver) {
        super(driver);
    }


    By usernameBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginButton");
    By errorMessageUsernameBy = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordBy = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");



    public Login loginToTrendyol (String username, String password){

        writeText(usernameBy,username);

        writeText(passwordBy, password);

        click(loginButtonBy);
        return this;
    }


    public Login verifyLoginUserName (String expectedText) {
        assertEquals(errorMessageUsernameBy, expectedText);
        return this;
    }


    public Login verifyLoginPassword (String expectedText) {
        assertEquals(errorMessagePasswordBy, expectedText);
        return this;
    }


}
