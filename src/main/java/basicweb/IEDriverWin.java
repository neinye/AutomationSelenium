package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverWin {

    public static void main(String[] args) {
        String baseURL = "http://learn.letskodeit.com";
        WebDriver driver;
        //first give the path, then initialize the driver. tho seems like when I comment it, it still works
        //because I've set the System variable Path to the location of the webdrivers folder :))
//        System.setProperty("webdriver.ie.driver","C:\\webdrivers\\ie\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();//then initialize the driver
        driver.get(baseURL);
    }
}
