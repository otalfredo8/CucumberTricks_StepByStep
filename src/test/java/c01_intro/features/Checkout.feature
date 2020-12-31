Feature: Checkout

  Scenario: Banana checkout
    Given the price of a "banana" is 40
    When I checkout  1 "banana"
    Then the total price should be 40