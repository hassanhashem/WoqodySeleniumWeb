package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	@Given("user is on login page")
	public void verifyvalidlogin() {
		System.out.println("user is on login page ");
	}
	
	@When("user enters username and password")
	public void logindata() {
		System.out.println("user enters username and password ");
	}

	@And("clicks on login button")
	public void loginbuttonclicked() {
		System.out.println("clicks on login button ");
	}
	
	@Then("user is navigated to home page")
	public void useronhomepage() {
		System.out.println("user is navigated to home page ");
	}
	

}
