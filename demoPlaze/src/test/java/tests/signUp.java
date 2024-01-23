package tests;


import data.SignUpData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Home;
import utils.Verify;

import static utils.DriverFactory.getDriver;

public class signUp {

   public static  WebDriver driver;
   SignUpData data;
    Home home;


    @Parameters("browser")
    @BeforeTest
    public void setUp(String browser) throws Exception {
        driver=getDriver(browser);
        home=new Home(driver);
    }

    @Test
    public void verifySignWithValidData()  {
        data=new SignUpData();
       String message= home.open()
                .clickSignUpLink()
                .signUp(data.username(), data.password());
        Verify.verifyEqual(message,"Sign up successful.");
        Verify.verifyAll();
    }


    @Test
    public void verifySignupNotAllowedWithUserAlreadyExist()
    {
        String message= home.open()
                .clickSignUpLink()
                .signUp("axswedc56","uio877");
        Verify.verifyEqual(message,"This user already exist.");
        Verify.verifyAll();
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }


}
