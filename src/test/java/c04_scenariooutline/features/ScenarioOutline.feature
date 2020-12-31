Feature: Checkout

  Scenario Outline: Banana checkout
    Given the price of a "banana" is 40
    When I checkout  <qty> "banana"
    Then the total price should be <totalToPay>

    Examples:
      | qty | totalToPay |
      | 1   | 40         |
      | 2   | 80         |
      | 3   | 120        |
      | 4   | 160        |