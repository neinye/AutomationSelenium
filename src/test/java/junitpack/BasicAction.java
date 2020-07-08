package junitpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BasicAction {
    WebDriver driver;
    String baseURL = "https://www.facebook.com";
    String currentPage,
            pageToNavigate = "https://www.wikipedia.org/";

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
    driver.findElement(By.id("email")).sendKeys("test@email.com");
    driver.findElement(By.id("email")).clear();
    currentPage = driver.getCurrentUrl();
        System.out.println("The current page is: " + currentPage);
        Thread.sleep(6000);

    driver.navigate().to(pageToNavigate);
        System.out.println("Navigated to: " + pageToNavigate);
    currentPage = driver.getCurrentUrl();
        System.out.println("The current page is: " + currentPage);
        Thread.sleep(6000);

        System.out.println("Navigating back");
    driver.navigate().back();
    currentPage = driver.getCurrentUrl();
        System.out.println("Now we're on the " + currentPage + " page");
        Thread.sleep(6000);
        System.out.println("Going forward");
    driver.navigate().forward();
    currentPage = driver.getCurrentUrl();
        System.out.println("We're on the " + currentPage + " page");
        System.out.println("The page title is " + driver.getTitle());

    }

    @After
    public void tearDown() throws Exception {
      //  driver.quit();
    }

}