package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class ExplicitWait {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        baseURL = "https://sso.teachable.com/secure/42299/users/sign_in";
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void explicitWaitTest() throws Exception {
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement mailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"user_email\"]")));
        mailAddress.sendKeys("test");
        //will fail, there is security check
        WebElement passwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_password")));
        passwd.sendKeys("password");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
