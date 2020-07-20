package junitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getElement(String type, String locator){
        type = type.toLowerCase();
        if(type.equals("id")){
            System.out.println("Element found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.id(locator));
        }
        else if(type.equals("xpath")){
            System.out.println("Element found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.xpath(locator));
        }
        else if(type.equals("class")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.className(locator));
        }
                else if(type.equals("css")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.cssSelector(locator));
        }
        else if(type.equals("linktext")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.linkText(locator));
        }
        else if(type.equals("partiallinktext")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.partialLinkText(locator));
        }
        else if(type.equals("name")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.name(locator));
        }
        else if(type.equals("tagname")){
            System.out.println("Elements found with " + type +" \"" + locator + "\"");
            return this.driver.findElement(By.tagName(locator));
        }
        else {
            System.out.println("Locator type not supported");
            return null;
        }
    }
    public List<WebElement> getElementsList(String type, String locator){
        type = type.toLowerCase();
        List<WebElement> elementList = new ArrayList<WebElement>();
        if(type.equals("id")){elementList = this.driver.findElements(By.id(locator));}
        else if(type.equals("xpath")){elementList = this.driver.findElements(By.xpath(locator));}
        else if(type.equals("class")){elementList = this.driver.findElements(By.className(locator));}
        else if(type.equals("css")){elementList = this.driver.findElements(By.cssSelector(locator));}
        else if(type.equals("linktext")){elementList = this.driver.findElements(By.linkText(locator));}
        else if(type.equals("partiallinktext")){elementList = this.driver.findElements(By.partialLinkText(locator));}
        else if(type.equals("name")){elementList = this.driver.findElements(By.name(locator));}
        else if(type.equals("tagname")){elementList = this.driver.findElements(By.tagName(locator));}
        else {System.out.println("Locator type not supported");}
        if(elementList.isEmpty()){System.out.println("element with " + type + ": " + locator + " not found.");}
        else{System.out.println("Element found with " + type + ": " + locator);}
        return elementList;
    }
    public boolean isElementPresent(String type, String locator){
        List<WebElement> elementList = getElementsList(type, locator);
        int size = elementList.size();
        if(size>0){
            return true;
        }else {
            return false;}
    }
}
