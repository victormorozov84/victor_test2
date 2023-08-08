package config;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class EnvironmentConfiguration {

    private static final String ENDPOINT = "https://waarkoop-server.herokuapp.com/api/v1/search/demo/";

    public static String setUpUrl() {
        String envUrl;

        if (System.getenv("GITLAB_CI") != null) {
            envUrl = getApiUrlForCI();
        } else {
            envUrl = ENDPOINT;
        }
        return envUrl;
    }

    private static String getApiUrlForCI() {
        return System.getenv("API_URL");
    }
}
