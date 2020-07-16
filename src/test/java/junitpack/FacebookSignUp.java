package junitpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class FacebookSignUp {
    WebDriver driver;
    String fbURL;

    @Before
    public void setUp() throws Exception {
        driver  = new FirefoxDriver();
        fbURL = "https://www.facebook.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void fbLogin() throws Exception {
        driver.get(fbURL);

        WebElement fName = driver.findElement(By.id("u_0_m"));
        WebElement lName = driver.findElement(By.id("u_0_o"));
        WebElement mobNum = driver.findElement(By.id("u_0_r"));
        WebElement pass = driver.findElement(By.id("password_step_input"));
        WebElement bdMonth = driver.findElement(By.id("month"));
        Select bdMonthSel = new Select(bdMonth);
        WebElement bdDay = driver.findElement(By.id("day"));
        Select bdDaySel = new Select(bdDay);
        WebElement bdYear = driver.findElement(By.id("year"));
        Select bdYearSel = new Select(bdYear);
        List<WebElement> gender = driver.findElements(By.className("_8esa"));

        fName.sendKeys("TestSurname");
        lName.sendKeys("TestName");
        mobNum.sendKeys("+37379858964");
        pass.sendKeys("testpassword");
//        for (int i = 0; i<bdMonthSel.getOptions().size(); i++){
//            bdMonthSel.selectByIndex(i);
//            Thread.sleep(250);
//        }
//        for (int i = 0; i<bdDaySel.getOptions().size(); i++){
//            bdDaySel.selectByIndex(i);
//            Thread.sleep(250);
//        }
//        for (int i = 0; i<(bdYearSel.getOptions().size())/10; i++){
//            bdYearSel.selectByIndex(i);
//            Thread.sleep(250);
//        }
        bdMonthSel.selectByVisibleText("May");
        bdDaySel.selectByVisibleText("15");
        bdYearSel.selectByValue("1930");
        System.out.println("We will do some stuff here now");
        System.out.println("List size now is " + gender.size());
        for(int i = 0; i < gender.size(); i++){
            boolean isChecked = gender.get(i).isSelected();
            if(!isChecked) {
                gender.get(i).click();
                Thread.sleep(5000);
                System.out.println("Stuff number " + i + " is done");
            }
        }

        System.out.println("Now we'll click on \"Male\"");
        gender.get(1).click();
        System.out.println("The element \"Male\" is selected?: " + gender.get(1).isSelected());
        System.out.println("The element \"Female\" is selected?: " + gender.get(0).isSelected());


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(10000);
        driver.quit();
    }
}