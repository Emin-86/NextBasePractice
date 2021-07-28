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
    @FindBy(name = "USER_LOGIN")
    public WebElement login;

    @FindBy (name = "USER_PASSWORD")
    public WebElement password;

    @FindBy (id = "USER_REMEMBER")
    public WebElement rememberbutton;

    @FindBy (xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotpasswor;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement profileButton;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//input[@name='USER_REMEMBER']")
    public WebElement checkRemember;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")


    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageLocator;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageIframe;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement writeMessage;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement verifySendMessage;





}
