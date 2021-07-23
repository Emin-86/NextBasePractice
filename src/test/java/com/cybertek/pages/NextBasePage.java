package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NextBasePage {
    public NextBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='login-inp']")
    public WebElement login;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement profileButton;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement remember;


    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;


    @FindBy(xpath = "//div[@class='feed-add-post-text']")
    public WebElement messageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement messageSend;


}
