package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWin {

    public static void main(String[] args) {
        //first give the path, then initialize the driver. tho seems like when I comment it, it still works
        //because I've set the System variable Path to the location of the webdrivers folder :))
//        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//then initialize the driver
        String baseURL = "http://learn.letskodeit.com";
        driver.get(baseURL);
    }
}
