package assertion;

import net.serenitybdd.rest.SerenityRest;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.core.IsEqual.equalTo;

public class Assertion {

    public static void statusCode(int statusCode) { SerenityRest.lastResponse().then().statusCode(statusCode);}

    public static void responseBodyContains(String field, String expectedText) {SerenityRest.lastResponse().then().body(field, hasItems(containsStringIgnoringCase(expectedText)));}

    public static void errorDetailIsTrue(String field, Boolean shouldBe)
    {
        SerenityRest.lastResponse().then().body("detail.error", equalTo(shouldBe));
    }
}
