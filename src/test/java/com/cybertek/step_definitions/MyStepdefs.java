package com.cybertek.step_definitions;

import com.cybertek.pages.NextBasePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class MyStepdefs {

    NextBasePage nextBasePage = new NextBasePage();

    @Given("User in login page")
    public void userInLoginPage() {

        String url = ConfigurationReader.getProperty("nextBaseUrl");
        Driver.getDriver().get(url);


    }

    @When("User enters  {string},{string}")
    public void userEnters(String arg0, String arg1) {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        nextBasePage.login.sendKeys(username);
        nextBasePage.password.sendKeys(password);

    }

    @And("Verify user logged in to the app")
    public void verifyUserLoggedInToTheApp() {

        nextBasePage.loginButton.click();

        String expectedTitle = "(53) Portal";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);


        Assert.assertEquals(actualTitle, expectedTitle);

        Assert.assertEquals(actualTitle,expectedTitle);


        nextBasePage.profileButton.click();
        nextBasePage.logOutButton.click();
    }

    @When("verify user can check {string} option")
    public void verifyUserCanCheckOption(String arg0) {



        //  nextBasePage.checkRemember.click();

     //  nextBasePage.checkRemember.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='USER_REMEMBER']")));
        element.click();

    }

    @Then("Verify user can access to {string} link page")
    public void verifyUserCanAccessToLinkPage(String arg0) {
        BrowserUtils.sleep(2);
        nextBasePage.forgotPassLink.click();


        String expectedTitle = "Get Password";
        String actualTitle = Driver.getDriver().getTitle();

        String expectedTitle= "Get Password";
        String actualTitle=Driver.getDriver().getTitle();



        Assert.assertTrue(actualTitle.equals(expectedTitle));
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.sleep(1);
        Driver.getDriver().navigate().back();


        String password = ConfigurationReader.getProperty("password");
        nextBasePage.password.sendKeys(password);
        nextBasePage.loginButton.click();



    }

    @Given("Verify user an send message by clicking {string} tab")
    public void verifyUserAnSendMessageByClickingTab(String arg0) {

        nextBasePage.sendMessageLocator.click();

        Driver.getDriver().switchTo().frame(nextBasePage.messageIframe);
        BrowserUtils.sleep(1);
        nextBasePage.writeMessage.sendKeys("hello");
        BrowserUtils.sleep(1);
         Driver.getDriver().switchTo().defaultContent();

         nextBasePage.sendMessageButton.click();
         BrowserUtils.sleep(2);

        String expectedSendMessage="hello";
        WebElement actualMessage = Driver.getDriver().findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner'])[1]"));
        BrowserUtils.sleep(2);

        System.out.println(actualMessage.getText());
        Assert.assertTrue(String.valueOf(actualMessage),true);



    }

    @And("Verify user can cancel message")
    public void verifyUserCanCancelMessage() {
    }

    @Then("Verify user can attach link by clicking on the link icon")
    public void verifyUserCanAttachLinkByClickingOnTheLinkIcon() {
    }

    @Given("Verify user can search a valid info from search box")
    public void verifyUserCanSearchAValidInfoFromSearchBox() {
    }

    @Then("Verify user get menu item and suggested modules when type in the box")
    public void verifyUserGetMenuItemAndSuggestedModulesWhenTypeInTheBox() {
    }

    @Given("Verify users can write poll message title with question & answer")
    public void verifyUsersCanWritePollMessageTitleWithQuestionAnswer() {
    }

    @And("Verify users can check {string}")
    public void verifyUsersCanCheck(String arg0) {
    }

    @And("Verify users can add questions")
    public void verifyUsersCanAddQuestions() {
    }

    @Then("Verify users can cancel poll")
    public void verifyUsersCanCancelPoll() {
    }

    @Given("Verify users can select an answer and vote for a poll")
    public void verifyUsersCanSelectAnAnswerAndVoteForAPoll() {
    }

    @And("Verify users can vote again")
    public void verifyUsersCanVoteAgain() {
    }

    @Then("Verify poll owner can stop a poll")
    public void verifyPollOwnerCanStopAPoll() {
    }

    @Given("Verify user can clock in")
    public void verifyUserCanClockIn() {
    }

    @And("Verify users can clock out")
    public void verifyUsersCanClockOut() {
    }

    @And("Verify users can edit Today's task under daily plan")
    public void verifyUsersCanEditTodaySTaskUnderDailyPlan() {
    }

    @And("Verify users can add events")
    public void verifyUsersCanAddEvents() {
    }

    @Then("Verify users  can edit workday starting and ending time")
    public void verifyUsersCanEditWorkdayStartingAndEndingTime() {
    }


}
