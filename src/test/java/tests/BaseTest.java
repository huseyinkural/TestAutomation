package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup () {
        //System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {

        //driver.quit();
    }
}
