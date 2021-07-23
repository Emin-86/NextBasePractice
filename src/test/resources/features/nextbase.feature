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


  @us001
  Scenario: As a user, I should be able to login to the app
    Given User in login page
    When User enters  "username","password"
     And Verify user logged in to the app
    When verify user can check "Remember me on this computer" option
    Then Verify user can access to "FORGOT YOUR PASSWORD?" link page

  @us002
  Scenario: As a user, I should be able to send message.
    Given Verify user an send message by clicking "MESSAGE" tab
    And Verify user can cancel message
    Then Verify user can attach link by clicking on the link icon


  @us003
  Scenario: As a user, I should be able to search people, document and more from search box"
    Given Verify user can search a valid info from search box
    Then Verify user get menu item and suggested modules when type in the box

  @us004
  Scenario: As a user, I should be able to create a poll
    Given Verify users can write poll message title with question & answer
    And Verify users can check "allow multiple Choice"
    And Verify users can add questions
    Then Verify users can cancel poll


  @us005
  Scenario:  As a user, I should be able to vote for a poll
    Given Verify users can select an answer and vote for a poll
    And Verify users can vote again
    Then Verify poll owner can stop a poll

  @us006
  Scenario: As a user, I should be able to log  work hours with time reporting"
    Given Verify user can clock in
    And Verify users can clock out
    And Verify users can edit Today's task under daily plan
    And Verify users can add events
    Then Verify users  can edit workday starting and ending time