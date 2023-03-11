package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
    System.out.println("validated home page");
    System.out.println("second commit");
	}

    @When("^User login application with username password$")
    public void user_login_application_with_username_password() throws Throwable {
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    }

    @And("^card is displayed$")
    public void card_is_displayed() throws Throwable {
        
    }
}
