Feature: Back ground

  Background: Valid username account
    Given I enter 12345678
    And I select "the account owner"

    #No captures for demo purposes
  Scenario: user account tab
    Given I click account tab
    When I scroll to DOB
    Then displayed DOB matches DOB in DB

  Scenario: alerts flow tab
    Given I click alerts tab
    When alert section is expanded
    Then 1 or more alerts are displayed

  Scenario: care management tab
    Given I click care tab
    When I expand recent visits section
    Then if any, information about doctor visits is displayed

  Scenario: emergency room tab
    Given I click emergency tab
    When I click hospital details link
    Then my hospital account opens in a new Window

  Scenario: drugs prescriptions tab
    Given I click drugs tab
    When I organize drug name by date
    Then Drugs name list is organized in descending order