package api;

import net.serenitybdd.rest.SerenityRest;

import static Config.EnvironmentConfiguration.API_URL;

public class API {

    public static void getLastResponse(String product){
        SerenityRest.given().get(API_URL + product);
    }
}
