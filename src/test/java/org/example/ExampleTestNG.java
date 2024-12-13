package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ExampleTestNG {
    @Test(priority = 1)
    public void testCase2() {
        System.out.println("This is the A Normal Test Case 2");
    }
    @Test(priority = 0)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case 1");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }

    @Test
    public void testAssertion(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("sendkeys");
        Assert.assertEquals("one", "one");
        System.out.println("click");
        softAssert.assertEquals("one", "two");
        System.out.println("visible");
        System.out.println("enable");
        softAssert.assertTrue(true);
        System.out.println("click");
        softAssert.assertAll();
    }
}
