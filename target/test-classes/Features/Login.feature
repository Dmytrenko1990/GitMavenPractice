Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully