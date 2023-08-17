Feature: Verify the product status code

  Scenario Outline: Verify the product status code
    When Take the response for product "<Product>"
    Then Response status code matches the value <StatusCode>

    Examples:
      | Product | StatusCode |
      | pasta   | 200        |
      | orange  | 200        |
      | cola    | 200        |
      | apple   | 200        |