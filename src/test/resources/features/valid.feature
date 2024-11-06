Feature: valid login
@pass
  Scenario: Successful login with valid credentials

    Given the user navigates to the login page
    When the user enters valid credentials "username" and "password"
    Then the user should be clicked on login button
