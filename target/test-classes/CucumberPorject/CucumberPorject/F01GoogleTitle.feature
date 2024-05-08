Feature: Google title functionality

  Scenario: Validate Google title
    Given open google
    When Read title
    Then Title should be Google

  Scenario: Validate the search finctionality of google
    Given open the google
    When Enter valid data in search box
    And Hit enter
    Then Search should be shown
