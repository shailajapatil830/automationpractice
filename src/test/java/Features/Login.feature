Feature: Login page feature

Scenario Outline: Login to Automaiton Practice website
  When I open automationpractice website for login
  And I click on Sign in button
  And I provide email "<email>" and password "<password>"
  Examples:
  | email                | password |
  | sunil_osho@yahoo.com | 12345    |