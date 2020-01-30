package tests;

import org.testng.annotations.Test;
import pages.Home;

public class LoginTest extends BaseTest {



    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        Home homePage = new Home(driver);


        homePage.goToTrendyol()
                .closePopupWindow()
                .goToLogin()
                .loginToTrendyol("wrong@email.com", "password")
                .verifyLoginPassword(("Hatalı E-Posta / Şifre. Tekrar Deneyin."))
                .verifyLoginPassword(("Hatalı E-Posta / Şifre. Tekrar Deneyin."));
    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword () {
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .goToLogin()
                .loginToTrendyol("","")
                .verifyLoginUserName("Lütfen email adresinizi giriniz.")
                .verifyLoginPassword("Lütfen email adresinizi giriniz.");
    }

    @Test (priority = 2)
    public void validLoginTest_CorrectUserAndPass () {

        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .goToLogin()
                .loginToTrendyol("hus.trendyol@gmail.com","test.trendyol")
                .verifyLoggedIn("Hesabım");
    }

}
