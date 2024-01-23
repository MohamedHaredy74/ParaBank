package pages;

import component.Button;
import component.Element;
import component.Link;
import component.TextBox;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {

    private WebDriver driver;
    public Home(WebDriver driver)
    {
        this.driver=driver;
        Element.setDriver(this.driver);
    }

    //page elements
    Link signupLink =new Link(By.id("signin2"));
    TextBox userName=new TextBox(By.id("sign-username"));
    TextBox passWord=new TextBox(By.id("sign-password"));
    Button signupButton=new Button(By.xpath("//button[contains(.,'Sign up')]"));



    public Home open()
    {
        driver.navigate().to("https://www.demoblaze.com/");
        return new Home(driver);
    }
   public Home clickSignUpLink()
   {
           signupLink.click();
       return new Home(driver);
   }

   public String signUp(String username , String password)  {
       WebElement usernameField = driver.findElement(By.id("sign-username"));

       Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
       try {
           wait.until(ExpectedConditions.elementToBeClickable(usernameField));
           userName.type(username);
           passWord.type(password);
           signupButton.click();
       } catch (ElementNotInteractableException e) {
           System.out.println("Element not intractable: " + e.getMessage());
       }

       Alert alert=wait.until(ExpectedConditions.alertIsPresent());
       String text=alert.getText();
       alert.accept();
       return   text;

   }





}
