package browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import java.util.concurrent.TimeUnit;

public class FirefoxProfileClass {
    public static void main(String[] args) {
        /***
         * somehow doesn't work, needs review
         */
        WebDriver driver;
        String baseURL = "https://www.google.com/";

        ProfilesIni profile = new ProfilesIni();  //initializing profiles
        FirefoxProfile ffProfile = profile.getProfile("automation"); //initializing firefox profile
        FirefoxOptions options = new FirefoxOptions(); //initializing Firefox options
        options.setProfile(ffProfile); //setting profile options for our Firefox Options

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }
}

