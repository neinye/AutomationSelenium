package browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ChromeProfileClass {
    /***
     * Windows
     * C:\Users\%USERNAME%\AppData\Local\Google\Chrome\User Data\Default\Extensions
     *
     * Mac
     * /users/<username>/Library/Application Support/Google/Chrome/Default/Extensions
     *
     * open chrome://extensions on Google Chrome, developer mode and pack extension
     * (when packing use the full path including version)
     */

    public static void main(String[] args) {
    String baseURL = "https://www.google.com";
    WebDriver driver;


    ChromeOptions options = new ChromeOptions();
    options.addExtensions(new File("C:\\Users\\nclima\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\imokeandodnlammaoenbgcnbhigjbpjh\\1.2_0.crx"));

    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseURL);
    }

}
