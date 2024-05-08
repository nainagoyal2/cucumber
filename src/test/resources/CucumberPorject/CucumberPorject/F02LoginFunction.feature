
Feature: Login functionaliy on OHRM

  Background: 
    Given open OHRM in Browser

  Scenario: validate the valid credentials
    Then Enter the valid email "admin" and password "admin123"
    And click on Login button
    Then Dashboard page should be open

  Scenario: validate the invalid credentials
    Then Enter the invalid username "naina" and password "naina@123"
    And click on the Login button
    Then Error message should be display
