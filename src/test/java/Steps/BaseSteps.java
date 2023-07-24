package Steps;


import api.APIService;
import api.BaseTest;
import api.Component;
import api.HTTPMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class BaseSteps extends BaseTest {

    protected static final String GET = "GET";
    protected static final String POST = "POST";
    protected static final String PUT = "PUT";
    protected static final String PATCH = "PATCH";
    protected static final String DELETE = "DELETE";

    public BaseSteps() {

    }

    @When("the {string} call is made")
    public void theCallIsMade(String requestType) {

        switch (requestType) {
            case GET:
                apiComponent = apiServices.sendRequest(HTTPMethod.GET, apiComponent, false);
                break;
            case POST:
                apiComponent = apiServices.sendRequest(HTTPMethod.POST, apiComponent, false);
                break;
            case PUT:
                apiComponent = apiServices.sendRequest(HTTPMethod.PUT, apiComponent, false);
                break;
            case PATCH:
                apiComponent = apiServices.sendRequest(HTTPMethod.PATCH, apiComponent, false);
                break;
            case DELETE:
                apiComponent = apiServices.sendRequest(HTTPMethod.DELETE, apiComponent, false);
                break;
        }
    }

    @Then("the status of the response should be {int}")
    public void theStatusOfTheResponseShouldBe(int statusCode) {
        assertEquals(apiComponent.getResponse().getStatusCode(), statusCode);


    }
}
