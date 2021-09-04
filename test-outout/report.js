$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "registration functionality",
  "description": "",
  "id": "registration-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "As a user I want to login",
  "description": "",
  "id": "login-functionality;as-a-user-i-want-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "that I am on https://www.takealot.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on login link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter the EmailAddress as \"\u003cEmailAddress\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "application should display MyAccount and the account holder name.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-functionality;as-a-user-i-want-to-login;",
  "rows": [
    {
      "cells": [
        "EmailAddress",
        "password"
      ],
      "line": 16,
      "id": "login-functionality;as-a-user-i-want-to-login;;1"
    },
    {
      "cells": [
        "deledpe@gmail.com",
        "Password@1"
      ],
      "line": 17,
      "id": "login-functionality;as-a-user-i-want-to-login;;2"
    },
    {
      "cells": [
        "ooooo@gmail.com",
        "password234"
      ],
      "line": 18,
      "id": "login-functionality;as-a-user-i-want-to-login;;3"
    },
    {
      "cells": [
        "password234",
        "xyz"
      ],
      "line": 19,
      "id": "login-functionality;as-a-user-i-want-to-login;;4"
    },
    {
      "cells": [
        "$$£%%^%^^^\u0026",
        "password234"
      ],
      "line": 20,
      "id": "login-functionality;as-a-user-i-want-to-login;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.uri("searchForItem.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "As user I want search for phones",
  "description": "",
  "id": "search-functionality;as-user-i-want-search-for-phones",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "that user is on https://www.takealot.com",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter the product name as \"\u003cItemName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "all the related items should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on add to basket and item price should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on Got-To-Cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should see the items in Cart summary",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click on proceed to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should prompt to login",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "application should display order summary and total price",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the browserb",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "search-functionality;as-user-i-want-search-for-phones;",
  "rows": [
    {
      "cells": [
        "ItemName"
      ],
      "line": 22,
      "id": "search-functionality;as-user-i-want-search-for-phones;;1"
    },
    {
      "cells": [
        "Garmin Forerunner 45S Sports Watch Black"
      ],
      "line": 23,
      "id": "search-functionality;as-user-i-want-search-for-phones;;2"
    },
    {
      "cells": [
        "Garmin QuickFit 22mm Silicone Watch Band"
      ],
      "line": 24,
      "id": "search-functionality;as-user-i-want-search-for-phones;;3"
    }
  ],
  "keyword": "Examples"
});
});