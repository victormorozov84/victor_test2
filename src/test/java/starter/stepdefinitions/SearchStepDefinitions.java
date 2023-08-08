package starter.stepdefinitions;

import api.API;
import assertion.Assertion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class SearchStepDefinitions {

    @When("Take Response for product {string}")
    public void takeResponseForProduct(String product) {
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

    @Then("Response doesn't contain the result")
    public void responseDoesntContainTheResult() {
        Assertion.errorDetailIsTrue("detail.error", true);
    }
}
