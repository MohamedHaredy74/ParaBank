package component;

import org.openqa.selenium.By;

public class Label extends Element{

    public Label(By locator) {
        super(locator);
    }

    public String getText()
    {
        return driver.findElement(locator).getText();
    }

}
