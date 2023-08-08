Feature: Verify response doesn't contains result

  Scenario: Verify response doesn't contains result
        When Take Response for product "car"
        Then Response doesn't contain the result