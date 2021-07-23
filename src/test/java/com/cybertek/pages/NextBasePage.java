package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NextBasePage {
    public NextBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
