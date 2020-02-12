package MyFeatureFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucu1 {

@Given("TESTME app is launched")
public void testme_app_is_launched() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("code for launching");
}

@Given("user accessing registration link in TESTME app")
public void user_accessing_registration_link_in_TESTME_app() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("code for registering");
	
}

@When("user providing valid data for all the required fields")
public void user_providing_valid_data_for_all_the_required_fields() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for providing the data");
}

@Then("user verifying registration status")
public void user_verifying_registration_status() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for verification");
}

@Given("TESTME  is launched and is accessible")
public void testme_is_launched_and_is_accessible() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for access");
}

@Then("user clicks on the login link available in the Homepage")
public void user_clicks_on_the_login_link_available_in_the_Homepage() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for clicking the link");
}

@Then("Provides the valid Credentials")
public void provides_the_valid_Credentials() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for valid data");
}

@Then("User checks the login status")
public void user_checks_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	System.out.println("code for login status checking");
}


	

}
