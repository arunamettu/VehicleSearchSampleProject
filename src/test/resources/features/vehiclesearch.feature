@tag
Feature: Search Vehicles with Drive Away Insurance
  @tag1
  Scenario: Search a vehicle with valid vehicle registration number
    Given I am on vehicle search page
    And I validate if title is "Dealer Portal"
    And I validate if "Drive Away Insurance" heading is displayed
    And I enter "OV12UYY" as vehicle registration number
    When I click the search button
    Then I validate if Result grid is displayed
    
Scenario Outline: Search a vehicle with invalid vehicle registration number
    Given I am on vehicle search page
    And I validate if title is "Dealer Portal"
    And I validate if "Drive Away Insurance" heading is displayed
    And I enter "<RegistrationNumber>" as vehicle registration number
    When I click the search button
    Then I validate if "<ErrorMessage>" message is displayed
    
    Examples:
    |RegistrationNumber|ErrorMessage|
    |1234|Sorry record not found|
    |@!@!|Please enter a valid car registration|
    
