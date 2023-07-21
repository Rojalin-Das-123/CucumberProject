package Steps;

import api.APIService;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;

import java.awt.*;


public class BaseSteps extends APIService{

    protected static final String GET = "GET";
    protected static final String POST = "POST";
    protected static final String PUT = "PUT";
    protected static final String PATCH = "PATCH";
    protected static final String DELETE = "DELETE";
    protected static Component apiComponent ;


    public BaseSteps() {

    }


    @When("the {string} call is made")
    public void theCallIsMade(String requestType) {

        switch (requestType){
            case POST:




        }



    }
}
