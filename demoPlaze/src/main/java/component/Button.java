package component;

import org.openqa.selenium.By;

public class Button extends Label{

    public Button(By locator) {
        super(locator);
    }

    public void click() {driver.findElement(locator).click();}
    }


