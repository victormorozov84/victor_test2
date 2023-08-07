package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static Config.EnvironmentConfiguration.API_URL;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class SearchStepDefinitions {

    @Steps
    public CarsAPI carsAPI;
    public Actor actor;

    @When("Take Response from endpoint {string}")
    public void takeResponseFromEndpoint(String product) {
        API.getLastResponse(product);
    }

    @Then("Response Status Code is Match to Value {int}")
    public void responseStatusCodeIsMatchToValue(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

/*    @Then("he sees the results displayed for apple")
    public void heSeesTheResultsDisplayedForApple() {
        restAssuredThat(response -> response.statusCode(200));
    }*/

    @Then("Response return the results for {string}")
    public void responseReturnTheResultsDisplayedFor(String result) {
        restAssuredThat(response -> response.body("title", hasItems(containsStringIgnoringCase(result))));
    }

   /* @Then("he doesn not see the results")
    public void he_Doesn_Not_See_The_Results() {
        restAssuredThat(response -> response.body("error", containsStringIgnoringCase("true")));
    }
*/
    @Then("he doesn not see the results")
    public void he_Doesn_Not_See_The_Results() {
        restAssuredThat(response -> response.body("detail.error", equalTo(true)));
    }
}
