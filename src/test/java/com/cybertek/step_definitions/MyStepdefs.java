package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.NextBasePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class MyStepdefs {

    NextBasePage nextBasePage = new NextBasePage();
    LoginPage loginPage = new LoginPage();

    @Given("User in login page")
    public void userInLoginPage() throws MalformedURLException {

        loginPage.login_method(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @And("Verify user logged in to the app")
    public void verifyUserLoggedInToTheApp() {

        nextBasePage.loginButton.click();


        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        nextBasePage.profileButton.click();
        nextBasePage.logOutButton.click();

    }

    @When("verify user can check {string} option")
    public void verifyUserCanCheckOption(String arg0) {


        //  nextBasePage.checkRemember.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='USER_REMEMBER']")));
        element.click();
        BrowserUtils.sleep(2);

    }

    @Then("Verify user can access to {string} link page")
    public void verifyUserCanAccessToLinkPage(String arg0) {
        BrowserUtils.sleep(2);
        nextBasePage.forgotpasswor.click();

        String expectedTitle = "Get Password";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.equals(expectedTitle));
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.sleep(1);
        Driver.getDriver().navigate().back();

        String password = ConfigurationReader.getProperty("password");
        nextBasePage.password.sendKeys(password);
        nextBasePage.loginButton.click();
        BrowserUtils.sleep(2);


    }

    @Given("Verify user an send message by clicking {string} tab")
    public void verifyUserAnSendMessageByClickingTab(String arg0) {
        //nextBasePage.sendMessageLocator.click();

        nextBasePage.messageTab.click();

        Driver.getDriver().switchTo().frame(nextBasePage.messageIframe);
        BrowserUtils.sleep(1);

        Faker faker = new Faker();
        faker.funnyName().name();

        nextBasePage.writeMessage.sendKeys(faker.funnyName().name());
        BrowserUtils.sleep(1);

        String expected= nextBasePage.textFromMessage.getText();



        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.sleep(2);
        nextBasePage.sendMessageButton.click();
        BrowserUtils.sleep(2);

        // Assert.assertTrue(nextBasePage.sendMessageButton.isDisplayed());
    }

    @And("Verify user can cancel message")
    public void verifyUserCanCancelMessage() {
        nextBasePage.MessageTab.click();
        BrowserUtils.sleep(3);
        nextBasePage.cancelButton.click();
    }
    @Then("Veriy users can attach link by clicking on the link icon")
    public void veriy_users_can_attach_link_by_clicking_on_the_link_icon() {
        nextBasePage.MessageTab.click();
        BrowserUtils.sleep(1);
        nextBasePage.linkButton.click();
        BrowserUtils.sleep(2);

        String childWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(childWindow);
        BrowserUtils.sleep(2);
        nextBasePage.linkMessage.sendKeys("google.com");
        BrowserUtils.sleep(1);
        nextBasePage.linkSaveButton.click();

        Driver.getDriver().navigate().refresh();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }

    }



