package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IdXPATHDemo {

    public static void main(String[] args)  {
        String baseURL = "https://courses.letskodeit.com/login";
        WebDriver driver; //driver declaration
        driver = new ChromeDriver(); //driver initialization - opening the browser window
        driver.manage().window().maximize(); // maximize the browser window
        driver.manage().timeouts().
                implicitlyWait(10, TimeUnit.SECONDS);//used to handle browser
                                                                             //synchronization issues
        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //locating the element and inputting text
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).
                sendKeys("letskodeit@gmail.com");

    }

}
