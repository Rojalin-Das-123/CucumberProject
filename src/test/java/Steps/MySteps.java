package Steps;

import api.BaseTest;
import com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps extends BaseTest {



    @Given("the user should login first")
    public void the_user_should_login_first() {
        System.out.println("login");
    }
    @When("enter the creds")
    public void enter_the_creds() {
        System.out.println("creds");

    }
    @When("click on submit")
    public void click_on_submit() {
        System.out.println("click on submit");

    }
    @Then("he should login")
    public void he_should_login() {
        System.out.println("login successfully");

    }

    @Then("nothing")
    public void nothing() {

        System.out.println("yes");

    }

    @Given("base URL is set to {string}")
    public void baseURLIsSetTo(String baseUrl) {
        apiComponent.setBaseUrl(baseUrl);
    }

    @Given("endPoint is set to {string}")
    public void endpointIsSetTo(String endPoint) {
        apiComponent.setEndPoint(endPoint);
    }

    @And("request body is set for user creation")
    public void requestBodyIsSetForUserCreation() {
        JsonObject object = new JsonObject();
        object.addProperty("name","Rojalin");
        object.addProperty("job","SDET");
        apiComponent.setRequestBody(object.toString());
    }

    @And("request body is set to update user details")
    public void requestBodyIsSetToUpdateUserDetails() {

        JsonObject object = new JsonObject();
        object.addProperty("name","Rojalin");
        object.addProperty("job","SDET-2");
        apiComponent.setRequestBody(object.toString());

    }

    @And("request body is set for user creation {string} and {string}")
    public void requestBodyIsSetForUserCreationAnd(String user, String job) {
        JsonObject object = new JsonObject();
        object.addProperty("name",user);
        object.addProperty("job",job);
        apiComponent.setRequestBody(object.toString());

    }
}
