Feature: Search for the product

### Please use endpoint GET https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product} for getting the products.
### Available products: "orange", "apple", "pasta", "cola"
### Prepare Positive and negative scenarios

  Scenario: Verify Status code from endpoint orange
    When Take Response from endpoint "orange"
    Then Response Status Code is Match to Value 200

  Scenario: Verify response from endpoint for apples
      When Take Response from endpoint "apple"
      Then Response return the results for "apple"

  Scenario: Verify that user doesn't get result
        When Take Response from endpoint "car"
        Then he doesn not see the results