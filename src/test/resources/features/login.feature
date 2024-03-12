Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    Then user verifies Success message displayed
    And User quites browser

  @inavidPassword
  Scenario Outline: Check User can`t login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enter valid email and  invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then user verifies Error message displayed
    And User quites browser
    Examples:
      | email          | password   |
      | naan@gmail.com | 1Qazxsw231 |
      | naan@gmail.com | 1QAzxsw23@ |
      | naan@gmail.com | 1Qazxsw@#! |
      | naan@gmail.com | DFazxsw@#! |
