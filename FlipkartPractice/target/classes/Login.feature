@login
Feature: Login to Filpkart application

    @positive
    Scenario: Positive login scenario
    Given User is on flipkart login page
    When User enter Username and password
    And User clicks on Login button
    When User enter mobile number
    And User clicks on continue
    When User enter password
    And User clicks on Login button
    Then User is on Flipkart Home page
    
    @negative
    Scenario Outline: Negative login scenario
    Given User is on flipkart login page
    When User enters "<Username>" and "<Password>"
    And User clicks on Login button
    Then User is on same Login page
    Examples:
    |Username|Password|
    |abc     |abc123  |
    |        |abc123  |
    |abc     |        |
    |        |        |
    
    
