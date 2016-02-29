package com.masha.pakhom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mashapakhom on 2/28/16.
 */
public class LoginPage extends BasePageObject {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement userPasswordInput;

    //I dislike using xpath or CSS, but the loginButton doesn not contain an id or name.
    @FindBy(css = "body > div > div > form > div.form-actions > button")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage openSite (){
        driver.get("http://qatest.jukinmedia.com/#/");

        WebDriverWait wait = new WebDriverWait(driver, 15); //you can play with the time integer  to wait for longer than 15 seconds.`
        wait.until(ExpectedConditions.urlContains("http://qatest.jukinmedia.com/#/"));
        return this;
    }

    public ACMEVacuumCleanerPage login(String username, String password){
        userNameInput.clear();
        userNameInput.sendKeys(username);
        userPasswordInput.clear();
        userPasswordInput.sendKeys(password);
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 15); //you can play with the time integer  to wait for longer than 15 seconds.`
        wait.until(ExpectedConditions.urlContains("http://qatest.jukinmedia.com/#/form"));

        return new ACMEVacuumCleanerPage(driver);
    }
}
