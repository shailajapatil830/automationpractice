Feature: Shopping cart on automation practice website

  Scenario: Launch home page and verify title
    When I open automationpractice website
    Then I validate title and URL



Scenario Outline: Login to Automaiton Practice website
  When I provide email "<email>" and password "<password>"
  Then I am presented with My Account page
  Examples:
  | email                | password |
  | sunil_osho@yahoo.com | 12345    |


