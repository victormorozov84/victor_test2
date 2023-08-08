package api;

import config.EnvironmentConfiguration;
import net.serenitybdd.rest.SerenityRest;

public class API {

    public static void getLastResponse(String product){
        SerenityRest.given().get( EnvironmentConfiguration.setUpUrl() + product);
    }
}
