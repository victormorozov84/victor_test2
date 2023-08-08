Feature: Verify endpoint result

  Scenario Outline: Verify response for products
      When Take Response for product "<Product>"
      Then Response return the results for "<ResultContains>"

    Examples:
      | Product | ResultContains |
      | orange  | orange         |
      | apple   | apple          |
      | cola    | cola           |
      | pasta   | pasta          |

