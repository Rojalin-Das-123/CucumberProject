package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {

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

    }
}
