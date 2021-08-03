@all
Feature: Agile story:
  1. As a user, I should be able to login to the app
  2. As a user, I should be able to send message.
  3. As a user, I should be able to search people, document and more from search box"
  4. As a user, I should be able to create a poll
  5. As a user, I should be able to vote for a poll
  6. As a user, I should be able to log  work hours with time reporting"
  7. As a user, I should be able to do see posts from homepage. "
  8. As a user, I should be able to see all the tasks under Task module"
  9. As a user, I should be able to send an event.
  10. As a user, I should be able to assign tasks by clicking on Task tab."
  11. As a user, I should be able to access to time and reports module"
  12. As a user, I should be able to use ""Filter and search"" functionality on Active Stream."
  13. As a user, I should be able to access to main modules of the app. "
  14. As a user, I should be able to logout from the app"

  Background: As a user, I should be able to login to the app
    Given User in login page
  @us001
  Scenario: user can click "Remember me on this computer" and can "FORGOT YOUR PASSWORD?"
   When verify user can check "Remember me on this computer" option
    Then Verify user can access to "FORGOT YOUR PASSWORD?" link page

  @us002
  Scenario: As a user, I should be able to send message.
    Given Verify user an send message by clicking "MESSAGE" tab
    And Verify user can cancel message
    Then Veriy users can attach link by clicking on the link icon




