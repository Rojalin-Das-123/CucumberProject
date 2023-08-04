package api;

import io.restassured.response.Response;

import java.util.HashMap;

public class APIHelper  {
     Response abstractAPIAction;
    public APIHelper() {
    }

    public Response sendRequest(HTTPMethod httpMethod, Component component, boolean skipSSLCertificationValidation) {
        switch(httpMethod) {
            case GET:
                abstractAPIAction = new Action().getSendRequest(HTTPMethod.GET,component, false);
                break;
            case PUT:
                abstractAPIAction = new Action().putSendRequest(HTTPMethod.PUT,component, false);
                break;

        }

        return abstractAPIAction;
    }
}
