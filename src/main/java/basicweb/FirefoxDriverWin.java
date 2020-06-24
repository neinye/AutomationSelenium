package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWin {

    public static void main(String[] args) {
        //first give the path, then initialize the driver. tho seems like when I comment it, it still works
        //because I've set the System variable Path to the location of the webdrivers folder :))
//        System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\marionette\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//then initialize the driver
        String baseURL = "http://learn.letskodeit.com";
        driver.get(baseURL);
    }
}
