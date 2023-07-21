package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIService {
    protected RequestSpecification request;
    protected Response response;

    public APIService(RequestSpecification request) {
        this.request = request;
    }

    public APIService() {
    }

    public Response sendPostRequest(Component component) {

        this.request = RestAssured.given();
        this.request.headers(component.getHeaders());
        this.request.body(component.getRequestBody());
        this.response = (Response)this.request.post(component.getEndPoint(), new Object[0]);
        return response;

    }

    public Response sendGetRequest(Component component) {

        this.request = RestAssured.given();
        this.response = (Response)this.request.get(component.getEndPoint());
        return response;

    }
}
