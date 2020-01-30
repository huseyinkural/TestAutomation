package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Base;
import pages.Home;

public class NavigationTabTest extends BaseTest {

    @Test
    public void checkImages(){
        Home homePage = new Home(driver);

        homePage.goToTrendyol()
                .closePopupWindow()
                .goToTab()
                .verifyImageLoading();
    }
}
