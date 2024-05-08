Feature: Understanding DDF

  Scenario Outline: Test the Login to ohrm  via ddf
    Given open the Orange HM application with ddf

    When i enter "<Username>" and "<Password>"
    And Click on submit button for login
    Then login  succesfully

    Examples: 
      | Username | Password  |
      | admin    | admin123  |
      | admin1   | admin1234 |
      | admin2   | admin1235 |
      | admin3   | admin1236 |
      | admin    | admin123  |
      | admin4   | admin1237 |
