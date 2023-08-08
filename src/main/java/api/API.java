package api;

import net.serenitybdd.rest.SerenityRest;

import static config.EnvironmentConfiguration.API_URL;

public class API {

    public static void getLastResponse(String product){
        SerenityRest.given().get(API_URL + product);
    }
}
