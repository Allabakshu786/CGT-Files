package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mul {
	int a;
	int b;
	int mul;

	@Given("^I have variable a$")
	public void i_have_variable_a(int arg1) {
		// Write code here that turns the phrase above into concrete actions
		a = arg1;
	}

	@Given("^I have variable b$")
	public void i_have_variable_b(int arg2) {
		// Write code here that turns the phrase above into concrete actions
		b = arg2;
	}

	@When("^I multiplication a and b$")
	public void i_multiplication_a_and_b() {
		// Write code here that turns the phrase above into concrete actions
		mul = a * b;
	}

	@Then("^I display the Result$")
	public void i_display_the_Result() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Multiplication of "+a+" and "+b+" is " + mul);

	}

}
