Feature: Find the most expensive dress and add it to the cart 
  As a user I want to Find the most expensive dress and add it to the cart, logout and login to view the items

 Scenario Outline: Find the most expensive dress and add it to the cart 
    Given that I am on the http://automationpractice.com/index.php
    And I Iogin with my credentials and should see logout button
    When I enter product as "<Product>" and click on search button
    Then I should see all the related items
    When I add items into the cart and items
    Then items count should be displayed in the Cart 
    When I logout and login, items should be displayed in the cart
    And logout and close the browser

Examples:
    | Product |
    | Shirt   |
    | Hat     |

   # Test 123
   # Test 124
   # Test 125
