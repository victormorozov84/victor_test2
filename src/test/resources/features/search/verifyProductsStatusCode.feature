Feature: Verify Products Status Code

  Scenario Outline: Verify Products Status Code
    When Take Response for product "<Product>"
    Then Response Status Code is Match to Value <StatusCode>

    Examples:
      | Product | StatusCode |
      | orange  | 200        |
      | apple   | 200        |
      | cola    | 200        |
      | pasta   | 200        |