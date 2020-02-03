package tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.Base;

public class BaseTest {

    public WebDriver driver;
    static final Logger logger = Logger.getLogger(BaseTest.class);


    @BeforeClass
    @Parameters("browser")
    public void setup (String browser) {

        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        System.out.println(browser);
        driver.manage().window().maximize();

    }

    @AfterClass
    public void teardown () {

        driver.quit();
    }
}
