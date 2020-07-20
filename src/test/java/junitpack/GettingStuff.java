package junitpack;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GettingStuff {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception{
        baseURL = "https://letskodeit.teachable.com/pages/practice/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testGetText() throws Exception{
        driver.get(baseURL);

        WebElement openTabElm = driver.findElement(By.id("opentab"));
        String elemName = openTabElm.getText();

        System.out.println("The name of the element with the id equal to \"name\" is: " + elemName);
    }

    @Test
    public void testGetValue() throws Exception{
        driver.get(baseURL);
        WebElement nameElm = driver.findElement(By.id("name"));
        String attributeValue = nameElm.getAttribute("class");

        System.out.println("The value of class attribute in the element with id \"name\" is: " + attributeValue);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }

}