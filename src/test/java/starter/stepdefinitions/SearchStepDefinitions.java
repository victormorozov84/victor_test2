package starter.stepdefinitions;

import api.API;
import assertion.Assertion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class SearchStepDefinitions {

    @Then("Response returns the results for {string}")
    public void responseReturnsTheResultsFor(String result) {
        Assertion.responseBodyContains("title", result);
    }

    @When("Take the response for product {string}")
    public void takeTheResponseForProduct(String product) {
        API.getLastResponse(product);
    }

    @Then("Response does not contain the result")
    public void responseDoesNotContainTheResult() {
        Assertion.errorDetailIsTrue("detail.error", true);
    }

    @Then("Response status code matches the value {int}")
    public void responseStatusCodeMatchesTheValue(int statusCode) {
        Assertion.statusCode(statusCode);
    }
}
