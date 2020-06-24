package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; //APIs or methods from selenium webdriver, used to automate web apps

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebElement element = driver.findElement(By.id("name"));
    }
}
