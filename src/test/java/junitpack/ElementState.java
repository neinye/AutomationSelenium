package junitpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class ElementState {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        baseURL = "https://letskodeit.teachable.com/p/practice";
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        WebElement el = driver.findElement(By.id("displayed-text"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        Thread.sleep(6000);
        System.out.println("the text area is shown? "+ el.isDisplayed());
    }

    @After
    public void tearDown() throws Exception {

        Thread.sleep(3000);
        driver.quit();
    }
}