package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTagsTest {
	@Given("Test one background")
	public void test_one_background() {
		System.out.println("Test one background");
	   
	}

	@When("Test two background")
	public void test_two_background() {
		System.out.println("Test two background");
	}

	@Then("Test three background")
	public void test_three_background() {
		System.out.println("Test three background");
	}

	@Given("Its a Smoke first step")
	public void its_a_Smoke_first_step() {
		System.out.println("Its a Smoke first step");
	}

	@When("Its a Smoke second step")
	public void its_a_Smoke_second_step() {
		System.out.println("Its a Smoke second step");
	}

	@Then("Its a Smoke thirdstep")
	public void its_a_Smoke_thirdstep() {
		System.out.println("Its a Smoke third step");
	}

	@Given("Its a Regression  first step")
	public void its_a_Regression_first_step() {
		System.out.println("Its a Regression first step");
	}

	@When("Its a Regression  second step")
	public void its_a_Regression_second_step() {
		System.out.println("Its a Regression second step");
	}

	@Then("Its a Regression  thirdstep")
	public void its_a_Regression_thirdstep() {
		System.out.println("Its a Regression third step");
	}

	@Given("Its a Integration  first step")
	public void its_a_Integration_first_step() {
		System.out.println("Its a Integration  first step");
	}

	@When("Its a Integration  second step")
	public void its_a_Integration_second_step() {
		System.out.println("Its a Integration  second step");
	}
	@Then("Its a Integration  thirdstep")
	public void its_a_Integration_thirdstep() {
		System.out.println("Its a Integration  third step");
	}
}
