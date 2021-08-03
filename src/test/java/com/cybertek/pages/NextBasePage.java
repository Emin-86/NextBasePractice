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
    public WebElement forgotPassLink;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMessageLocator;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageIframe;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement writeMessage;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement MessageTab;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement linkSaveButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkMessage;

    @FindBy(xpath = "//div[.='Tad Moore']")
    public WebElement textFromMessage;





}
