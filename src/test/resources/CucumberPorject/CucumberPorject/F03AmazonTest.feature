@Amazonlinks
Feature: Amazon link test

  Background: 
    Given open the Amazon Browser

  @Sell
  Scenario: To test Sell Link
    When I click on sell
    Then Sell page should be open

  @BestSeller
  Scenario: To test BestSeller Link
    When I click on BestSeller
    Then BestSeller page should be open

  @Mobile
  Scenario: To test Mobile Link
    When I click on Mobile
    Then Mobile page should be open

  @Electronic
  Scenario: To test Electronic Link
    When I click on Electronic
    Then Electronic page should be open
