
Feature: Sign-Up feature
  As a user, I want to register new account

Scenario: As a user, I want to register new account
 Given that I am navigate to http://automationpractice.com/index.php
 Then click on Sign_In link
 When user entered emailAddress and click on create an account
 Then fill the registration form
    | FirstName      |  John                   |
    | LastName       |  Doe                    |
    | EMail          |  bamglobal+17@gmail.com |
    | Password       |  Password@1             |
    | Day            |  6                      |
    | Month          |  March                  |
    | Year           |  1989                   |
    | firstname      |  John                   |
    | lastname       |  QA                     |
    | Company        |  John Limited           |
    | Address        |  20 London Street       |
    | City           |  Brooklyn               |
    | State          |  New York               |
    | Zip/PostalCode |  11201                  |
    | Country        |  United States          |
    | Phone          |  0016545454545          |
    | EMail          |  bamglobal+13@gmail.com |                
 When user click on register button  
 Then user should see their account on the dashboard 
 Then click on log button
 And user should be able to close the browser