Feature: Registration feature
  As user I want to register a new account

  Scenario Outline: As user I want to register a new account 
    Given that I navigate to http://automationpractice.com/index.php
    And click on the sign-in link
    When user enter emails as "<EmailAddress>" and password as "<Password>"
    And click on submit button
    Then user should see the welcome message
    And click on logout button
    And close the brows

   Examples:
       | EmailAddress           | Password   |
       | bamglobal+12@gmail.com | Password@1 |
       | bamglobal+13@gmail.com | Password@1 |