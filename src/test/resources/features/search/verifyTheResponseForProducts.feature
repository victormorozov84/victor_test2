Feature: Verify the response for products

  Scenario Outline: Verify the response for products
      When Take the response for product "<Product>"
      Then Response returns the results for "<ResultContains>"

    Examples:
      | Product | ResultContains |
      | apple   | apple          |
      | orange  | orange         |
      | pasta   | pasta          |
      | cola    | cola           |