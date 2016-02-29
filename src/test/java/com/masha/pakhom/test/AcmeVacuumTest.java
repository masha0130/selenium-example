package com.masha.pakhom.test;

import com.masha.pakhom.page.ACMEVacuumCleanerPage;
import com.masha.pakhom.page.LoginPage;
import org.testng.annotations.Test;

/**
 * Created by mashapakhom on 2/28/16.
 */
public class AcmeVacuumTest extends BaseTest{

    @Test
    public void submitFormSimpleTest(){
        LoginPage login = new LoginPage(driver);
        ACMEVacuumCleanerPage vacuumCleanerPage = login.openSite().login("jukinmedia", "qatest");
        vacuumCleanerPage.assertPageDidLoad();

        sleepy(1000);
        vacuumCleanerPage.filloutFeadbackForm("Masha", "Pakhom", "Masha0130@gmail.com", "555-555-5555");
        //Test is too fast, added this sleep to show submission
        sleepy(5000);
    }
}
