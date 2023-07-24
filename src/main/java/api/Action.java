package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.logging.Log;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.LogManager.*;

public class Action {
   // private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Action.class));
    protected RequestSpecification request;
    protected Response response;
    protected void basicAuthentication(Component component) {
        if (component.getBasicAuthenticationUsername() != null && component.getBasicAuthenticationPassword() != null) {
            this.request.auth().preemptive().basic(component.getBasicAuthenticationUsername(), component.getBasicAuthenticationPassword());
        } else {
            if (component.getBasicAuthenticationUsername() != null && component.getBasicAuthenticationPassword() == null) {
                throw new NullPointerException("Basic Authentication: Username is set but Password is not set");
            }

            if (component.getBasicAuthenticationUsername() == null && component.getBasicAuthenticationPassword() != null) {
                throw new NullPointerException("Basic Authentication: Password is set but Username is not set");
            }
        }

    }
    public Action() {
    }


    public Response getSendRequest(HTTPMethod get, Component component, boolean skipSSLCertificationValidation) {
        RestAssured.baseURI = component.getBaseURL();
        if (skipSSLCertificationValidation) {
            RestAssured.useRelaxedHTTPSValidation();
        }

        this.request = RestAssured.given();
        this.basicAuthentication(component);
        if (component.getHeaders() != null) {
            this.request.headers(component.getHeaders());
        }

//        LOGGER.info("=========================================================================================================================");
//        LOGGER.info("GET Request:");
//        LOGGER.info("=========================================================================================================================");
        this.response = this.request.get(component.getEndpoint(), new Object[0]);
        System.out.println("response"+this.response);

        return this.response;
    }
}
