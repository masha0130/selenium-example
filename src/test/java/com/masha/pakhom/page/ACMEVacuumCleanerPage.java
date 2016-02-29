package com.masha.pakhom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by mashapakhom on 2/28/16.
 */
public class ACMEVacuumCleanerPage extends BasePageObject{

    @FindBy(xpath = "/html/body/div/div[2]/form/div[1]/div/div[1]/label/input")
    private WebElement socialMedia;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[2]/div/div[1]/input")
    private WebElement rateExperienceOneRadio;

    @FindBy(name = "8")
    private WebElement recommendUsRadioButton;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[5]/div[1]/input")
    private WebElement contactFirstName;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[5]/div[2]/input")
    private WebElement contactLastName;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[6]/div[1]/input")
    private WebElement contactEmail;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement contactPhoneNumber;

    @FindBy(xpath = "/html/body/div/div[2]/form/div[7]/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button")
    private WebElement confirmForm;



    public boolean assertPageDidLoad(){

        WebDriverWait wait = new WebDriverWait(driver, 15); //you can play with the time integer  to wait for longer than 15 seconds.`
        wait.until(ExpectedConditions.urlContains("http://qatest.jukinmedia.com/#/form"));
        boolean didOpen = false;
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("http://qatest.jukinmedia.com/#/form"));
        didOpen = true;

        return didOpen;
    }


    public ACMEVacuumCleanerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public ACMEVacuumCleanerPage clickSocialMediaRadioButton(){
        socialMedia.click();
        Assert.assertTrue(socialMedia.isEnabled());
        return this;
    }

    public ACMEVacuumCleanerPage clickRateExperienceOneButton(){
        rateExperienceOneRadio.click();
        return this;
    }

    public ACMEVacuumCleanerPage inputFirstName(String first){
        contactFirstName.sendKeys(first);
        return this;
    }

    public ACMEVacuumCleanerPage inputLastName(String last){
        contactLastName.sendKeys(last);
        return this;
    }

    public ACMEVacuumCleanerPage inputEmail(String email){
        contactEmail.sendKeys(email);
        return this;
    }

    public ACMEVacuumCleanerPage inputPhoneNumber(String phoneNumber){
        contactPhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public ACMEVacuumCleanerPage clickSubmitButton(){
        Assert.assertTrue(submitButton.isEnabled());
        submitButton.click();
        return this;
    }

    public ACMEVacuumCleanerPage filloutFeadbackForm(String first, String last, String email, String number){
        clickSocialMediaRadioButton().clickRateExperienceOneButton().
        inputFirstName(first).inputLastName(last).inputEmail(email).inputPhoneNumber(number).clickSubmitButton();
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        Assert.assertTrue(confirmForm.isDisplayed());
        return this;
    }
}
