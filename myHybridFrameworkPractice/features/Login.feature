@login
Feature: Login feature

 @positive
 Scenario: Positive Scenario
 Given User is on login page
 When User enter Username and password 
 When User clicks on login button
 Then User is on home page 
 
 @negative
 Scenario Outline: Negative Scenario
 Given User is on login page
 When User enter "<Username>" and "<Password>" 
 When User clicks on login button
 Then User is on same page
 Examples:
 |Username|Password| 
 |abc     |1234    |
 |abc     |        |
 |        |1234    |
 |        |        |
 