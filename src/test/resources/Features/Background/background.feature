Feature: Home Page
  In order to check my order details
  As a regitered user
  I want to specify the features of order details page

  Background: 
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user click on login button
    Then user navigates to order page

  Scenario: Check previous order details
    When user clicks on order link
    Then user checks the previous order details

  Scenario: Check open order details
    When user clicks on open orders link
    Then user checks the open order details

  Scenario: Check cancelled order details
    When user clicks on cancelled order links
    Then user checks the cancelled order details
