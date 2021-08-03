package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends NextBasePage {


        @FindBy(name = "USER_LOGIN")
        public WebElement loginBox;

        @FindBy (name = "USER_PASSWORD")
        public WebElement passwordBox;

        @FindBy(xpath = "//input[@type='submit']")
        public WebElement loginButton;

    public void login_method(String username, String password) {

        loginBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
}
