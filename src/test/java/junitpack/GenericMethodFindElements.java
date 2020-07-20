package junitpack;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import junitpack.GenericMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GenericMethodFindElements {

    private WebDriver driver;
    private String baseURL;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception{
        baseURL = "https://letskodeit.teachable.com/pages/practice";
        driver = new FirefoxDriver();
        gm = new GenericMethods(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFindElementsMethod() throws Exception{
        driver.get(baseURL);
        WebElement element = gm.getElement("id", "name");
        element.sendKeys("test");
    }
    @Test
    public void testFindElementsListMethod() throws Exception{
        driver.get(baseURL);
        List<WebElement> elements = gm.getElementsList("xpath", "//input[@type='radio']");
        for(int i =0; i<elements.size(); i++){
            elements.get(i).click();
            Thread.sleep(1000);
        }
        System.out.println("The list has " + elements.size() + " elements");
    }
    @Test
    public void elementsExistenceCheck() throws Exception{
        driver.get(baseURL);
        boolean result1 = gm.isElementPresent("xpath", "//input[@type='radio']");
        System.out.println("Are there elements in the list? "  + result1);
        boolean result2 = gm.isElementPresent("xpathna", "//input[@type='radio']");
        System.out.println("Are there elements in the list? "  + result2);}


    @After
    public void tearDown() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }


}