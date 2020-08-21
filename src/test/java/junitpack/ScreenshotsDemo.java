package junitpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenshotsDemo {
    private WebDriver driver;
    private String baseURL;
    GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        gm = new GenericMethods(driver);
        baseURL = "https://www.facebook.com/";
    }

    @Test
    public void testScreenshots() throws Exception{
        driver.get(baseURL);
        gm.clickOnElement(driver, "");

    }


    @After
    public void tearDown() throws Exception {

    }

    public static String getRandomString(int length){
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        return sb.toString();
    }
}