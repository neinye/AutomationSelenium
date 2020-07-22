package waittypes;

import junitpack.GenericMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class ExplicitWaitWithUtility {
    WebDriver driver;
    String baseURL;
    GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        baseURL = "https://sso.teachable.com/secure/42299/users/sign_in";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        gm = new GenericMethods(driver);
    }

    @Test
    public void explicitWaitTest() throws Exception {
        driver.get(baseURL);
        WebElement mailAddress = gm.waitForElementToBeVisible(By.xpath("//input[@id=\"user_email\"]"), 3);
        mailAddress.sendKeys("test");
        WebElement passwd = gm.waitForElementToBeVisible(By.id("user_password"), 3);
        passwd.sendKeys("password");
        gm.clickOnElement(driver, By.xpath("//input[@value=\"Log In\"]"), 3);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
