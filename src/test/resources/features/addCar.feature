Feature: Add car

  @positiveData
  Scenario: Check if a vehicle with valid data can be added
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button

    And User clicks on "Let the car work" link
    And User enter address
    And User fills  all fields
    And User uploads a photo of the car
    And User clicks on Submit button
    And user verifies Success message Add Car
    And User quites browser