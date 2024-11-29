package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverSetup{

    @Test
    public void testTitle(){

        // load google url
        driver.get("https://www.facebook.com");

        // Get title
        String actualTitle = driver.getTitle();

        // Assert actual result with expected result
        Assert.assertEquals(actualTitle, "Facebook – log in or sign up");
//        System.out.println(actualTitle);
    }

    @Test
    public void testURL(){
        // load google url
        driver.get("https://www.facebook.com");

        // Get title
        String actualURL = driver.getCurrentUrl();

        // Assert actual result with expected result
        Assert.assertEquals(actualURL, "https://www.facebook.com/");

    }



}
