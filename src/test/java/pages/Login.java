package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base{
    public Login(WebDriver driver) {
        super(driver);
    }


    By emailBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginSubmit");
    By errorMessageUsernameBy = By.xpath("//*[@id=\"errorBox\"]");
    By errorMessagePasswordBy = By.xpath("//*[@id=\"errorBox\"]");
    By loggedInBy = By.id("logged-in-container");



    public Login loginToTrendyol (String email, String password){

        writeText(emailBy,email);

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

    public Login verifyLoggedIn (String expectedText) {
        assertEquals(loggedInBy, expectedText);
        return this;
    }


}
