package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverWin {

    public static void main(String[] args) {
        String baseURL = "https://letskodeit.teachable.com/pages/practice";
        WebDriver driver;
        /*
        * Even if we have windows 64-bit version, we must use IEDriverServer 32-bit version
        * **All protected zones settings should be the same (Disabled/Enabled)
        * **Zoom Level should be 100%
        * **then try the capabilities settings
        * -------use only when having issues with IE--------
        * Use Desired Capabilities class to set IE properties
        *
        ***************       UNCOMMENT LINES BELLOW IF NEEDED, NOT ALL AT ONCE        *******************
        */

//        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//        caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
//        caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
//        caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
//        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);


        //first give the path, then initialize the driver. tho seems like when I comment it, it still works
        //because I've set the System variable Path to the location of the webdrivers folder :))
        //
        //        System.setProperty("webdriver.ie.driver","C:\\webdrivers\\ie\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();//then initialize the driver
        driver.get(baseURL);
    }
}
