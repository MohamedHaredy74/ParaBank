package utils;


import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory(){}

    public static WebDriver getDriver(String browserName) throws Exception {

        if (driver== null)
        {
            if (browserName.equalsIgnoreCase("firefox"))
            { driver = new FirefoxDriver();}
            else if (browserName.equalsIgnoreCase("chrome"))
            {driver=new ChromeDriver();}
            else if (browserName.equalsIgnoreCase("edge")) {driver=new EdgeDriver();}
            else throw new Exception("Browser is not correct");
            driver.manage().window().maximize();

        }

        return driver;
    }





}
