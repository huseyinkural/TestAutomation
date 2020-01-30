package tests;

import org.testng.annotations.Test;
import pages.Home;

public class LoginTest extends BaseTest {

    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {


        Home home = new Home(driver);

        //*************PAGE METHODS********************
        home.goToTrendyol()
                .closePopupWindow()
                .goToLogin()
                .loginToTrendyol("onur@swtestacademy.com", "11223344")
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"))
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword () {

        Home homePage = new Home(driver);


        homePage.goToTrendyol()
                .goToLogin()
                .loginToTrendyol("","")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }
}
