package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Element {
    protected  static  WebDriver driver;
    protected By locator;

    public Element(By locator)
    {
        this.locator=locator;
    }

    public Boolean isEnabled()
    {
       return driver.findElement(locator).isEnabled();
    }
    public Boolean isDisplayed(){return driver.findElement(locator).isDisplayed();}
    public static  void setDriver(WebDriver webDriver)
    {
        driver=webDriver;
    }
//    public void getBtnState()
//    {
//        System.out.println("Element is enabled: "+isEnabled()
//                +"\nElement is displayed: "+isDisplayed() );
//    }

}
