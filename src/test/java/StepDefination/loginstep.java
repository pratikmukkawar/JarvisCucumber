package StepDefination;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {

    @Given("user on homepage")
    public void user_on_homepage()  {
        System.out.println("Working Fine");


    }

    @When("user on login page")
    public void user_on_login_page()  {
        System.out.println("Working Fine");


    }

    @When("user enters uname and pass")
    public void user_enters_uname_and_pass()  {
        System.out.println("Working Fine");

    }

    @Then("click on login button")
    public void click_on_login_button() throws PendingException  {
        System.out.println("Working Fine");

    }
}
