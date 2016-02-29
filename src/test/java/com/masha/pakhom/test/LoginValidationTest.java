package com.masha.pakhom.test;

import com.masha.pakhom.page.ACMEVacuumCleanerPage;
import com.masha.pakhom.page.LoginPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mashapakhom on 2/28/16.
 */
public class LoginValidationTest extends BaseTest{

    @Test
    public void doSomeTest(){

        LoginPage login = new LoginPage(driver);

        ACMEVacuumCleanerPage vacuumCleanerPage = login.openSite().login("jukinmedia", "qatest");
        vacuumCleanerPage.assertPageDidLoad();

    }
}
