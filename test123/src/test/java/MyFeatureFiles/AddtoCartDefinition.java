package MyFeatureFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddtoCartDefinition {
	@Given("Application launched by registered user for cart")
	public void application_launched_by_registered_user_for_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for launching the application");
	}

	@Then("user verifying add item")
	public void user_verifying_add_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for verifying thr product");
	}

	@Then("user verifying remove item")
	public void user_verifying_remove_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for verifying the removed item");
	}

	@Then("user verifies max count of items in the cart")
	public void user_verifies_max_count_of_items_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

}
