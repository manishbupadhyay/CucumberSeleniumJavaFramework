# Author : Manish Upadhyay
# Date : 01-11-2020

Feature: feature to test login functionality

  Scenario: Check login is successful with valid crediantials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

