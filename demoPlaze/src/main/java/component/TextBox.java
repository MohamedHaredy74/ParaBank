package component;

import org.openqa.selenium.By;

public class TextBox extends Element{

    public TextBox(By locator) {
        super(locator);
    }

   public void type(String text) {

        driver.findElement(locator).sendKeys(text);
   }

}
