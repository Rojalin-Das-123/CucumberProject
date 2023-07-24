package api;

import io.restassured.response.Response;

import java.util.Dictionary;
import java.util.HashMap;

public class Component {
    private String baseUrl;
    private String endPoint;
    private HashMap<String,String> headers;
    private Object requestBody;
    private String basicAuthenticationUsername;
    private String basicAuthenticationPassword;
    private Response response;


    public Component() {
    }


    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public  Object getRequestBody() {
        return this.requestBody;
    }

    public void setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
    }


    public String getBaseURL() {
        return baseUrl;
    }

    public String getEndpoint() {
        return endPoint;
    }
    public String getBasicAuthenticationUsername() {
        return this.basicAuthenticationUsername;
    }

    public String getBasicAuthenticationPassword() {
        return this.basicAuthenticationPassword;
    }

    public void setBasicAuthentication(String username, String password) {
        this.basicAuthenticationUsername = username;
        this.basicAuthenticationPassword = password;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


    public String getEndPoint() {
        return endPoint;
    }

    public Response getResponse() {
        return response;
    }
}
