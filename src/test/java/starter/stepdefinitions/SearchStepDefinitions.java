package starter.stepdefinitions;

import api.API;
import assertion.Assertion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {

    @When("Take Response from endpoint {string}")
    public void takeResponseFromEndpoint(String product) {
        API.getLastResponse(product);
    }

    @Then("Response Status Code is Match to Value {int}")
    public void responseStatusCodeIsMatchToValue(int statusCode) {
        Assertion.statusCode(statusCode);
    }

    @Then("Response return the results for {string}")
    public void responseReturnTheResultsDisplayedFor(String result) {
        Assertion.responseBodyContains("title", result);
    }

    @Then("he doesn not see the results")
    public void he_Doesn_Not_See_The_Results() {
        Assertion.errorDetailIsTrue("detail.error", true);
    }
}
