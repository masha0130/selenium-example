package com.masha.pakhom.test;

import com.masha.pakhom.page.ACMEVacuumCleanerPage;
import com.masha.pakhom.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by mashapakhom on 2/28/16.
 */
public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setup (){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 25);
    }


    @AfterClass
    public void destroy(){
        driver.quit();
    }


    public void waitForElement(By element){
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

    }

    public void sleepy(int time){
        try {
            Thread.sleep(time);
        }catch (Exception e ){

        }
    }
}
