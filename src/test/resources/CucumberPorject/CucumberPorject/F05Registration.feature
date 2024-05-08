Feature: Registration Process

  Background: 
    Given open the registration page

  Scenario: To test thee registration process
    When Pass the data as follow
      | Naina  | F | SHOBHA  | 9414435719 | BANGLORE |
      | Nainag | M | SHOBHAJ | 9414435718 | GLORE    |
    Then Regisration should be success

  Scenario: To test thee registration process new
    When Passisg the data as following
      | f_name | Gender | Address | Phone      | City   |
      | Akash  | M      | MALviya | 9413435719 | jaipur |
      | daksh  | M      | gt      | 9413435718 | Pune   |
    Then Regisration page should be success
