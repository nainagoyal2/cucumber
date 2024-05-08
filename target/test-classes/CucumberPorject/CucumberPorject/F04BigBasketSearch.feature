Feature: Big Basket Search

Background:
 Given open "https://www.bigbasket.com/"

  Scenario: Test Search functionality on Big Basket
   
    When I Search the "Mango"
    And I hit Enter
    Then Search for Mango should display

  Scenario: Test Search the apple functionality on Big Basket
 
    When I Search for "Apple"
    And  hit Enter
    Then Search for apple should be display
