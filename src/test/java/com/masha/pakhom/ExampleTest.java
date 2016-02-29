package com.masha.pakhom;

import org.testng.annotations.*;

/**
 * Created by mariyapakhom on 2/28/16.
 */
public class ExampleTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

}


