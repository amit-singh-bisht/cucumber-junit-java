package test.java.stepDefinitions;

import io.cucumber.java.en.*;

public class Login {
	@Given("^I open browserstack.com$")
	public void i_open_browserstack_com() {
	    System.out.println("I open browserstack.com");
	}

	@When("^I visit sign in page$")
	public void i_visit_sign_in_page() {
		System.out.println("I visit sign in page");
	}

	@When("^I enter (.*) and (.*)$")
	public void i_enter_username_and_password(String username, String password) {
		System.out.println("I enter username as: " + username + " and password as: " + password);
	}

	@Then("^I should not be able to see my dashboard$")
	public void i_should_not_be_able_to_see_my_dashboard() {
		System.out.println("I should not be able to see my dashboard");
	}
}
