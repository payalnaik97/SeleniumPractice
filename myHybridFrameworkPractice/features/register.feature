@register
Feature: Registration to ShopperStop Application

Background:
Given User is on signup page 


@pos-register
Scenario: Positive Scenario
When User enter all details
|firstname|Payal            |
|lastname |Naik             |
|emailid  |admin97@gmail.com|
|mob      |8850926675       |
|pass     |asdfghjkl        |
And User click on continue
Then User get register


@neg-register
Scenario: Negative Scenario
When User enter some details
|firstname|Payal            |
|lastname |Naik             |
|pass     |asdfghjkl        |
And User click on continue
Then User is on same signup page



