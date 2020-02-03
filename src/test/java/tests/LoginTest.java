package tests;

import org.testng.annotations.Test;
import pages.Home;

public class LoginTest extends BaseTest {



    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {
        System.out.println("Verify invalid login test is started.");
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
        System.out.println("Verify empty user empty pass test is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToLogin()
                .loginToTrendyol("","")
                .verifyLoginUserName("Lütfen email adresinizi giriniz.")
                .verifyLoginPassword("Lütfen email adresinizi giriniz.");
    }

    @Test (priority = 2)
    public void validLoginTest_CorrectUserAndPass () {
        System.out.println("Verify correct user and pass test is started.");
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToLogin()
                .loginToTrendyol("hus.trendyol@gmail.com","test.trendyol")
                .verifyLoggedIn("Hesabım");
    }

}
