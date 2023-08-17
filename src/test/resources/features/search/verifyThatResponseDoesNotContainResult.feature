Feature: Verify that response does not contain result

  Scenario: Verify that response does not contain result
        When Take the response for product "car"
        Then Response does not contain the result