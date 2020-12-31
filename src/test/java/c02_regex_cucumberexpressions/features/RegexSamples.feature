Feature: Regular expressions (regex) and Cucumber-expressions samples

  Scenario: Capture Groups
    Given I have $70

  Scenario: Alternation
    Given they have $30

  Scenario: Dot
    Given it has $000

  Scenario: Start Modifier
    Given It was $9898

  Scenario: Character classes
    Given It is $4050

  Scenario: Shorthand Character Classes with +
    Given it costs $300
    And it is named coat
    And it is for either winter or fall

  Scenario: Multiple captures
    Given she has $10 in her blue purse

  Scenario: Question mark
    Given we have 1 car
    And we have 10 cars

  Scenario: Noncapturing Groups
    Given I visit the homepage
    And I go to the homepage

  Scenario: Default Cucumber Expression since Cucumber 3
    Given I have 1 car
    When I "drive"
    Then I go to "the park"
    And I commute for about 3.3 miles
    And I commute for about 232.2425 minutes