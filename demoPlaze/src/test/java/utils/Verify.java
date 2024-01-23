package utils;

import org.testng.asserts.SoftAssert;

public abstract class Verify {

   private static  SoftAssert softAssert;

    public static void verifyEqual(Object Expected , Object Actual)
    {
        if (Actual != null ){
        softAssert=new SoftAssert();
        softAssert.assertEquals(Expected,Actual);}
        else
            System.out.println("Actual Object is null");
    }

    public static void verifyTrue(Boolean condition)
    {
        softAssert=new SoftAssert();
        softAssert.assertTrue(condition);
    }

    public static void verifyFalse(Boolean condition)
    {
        softAssert=new SoftAssert();
        softAssert.assertFalse(condition);
    }
    public static void verifyAll()
    { softAssert.assertAll();}




}
