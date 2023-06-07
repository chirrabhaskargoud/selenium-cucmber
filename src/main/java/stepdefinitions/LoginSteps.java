package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^User is on login screen$")
	public void user_is_on_login_screen() {
		System.out.println("User is on login screen");
	}
	
	@When("^User enters valid creds$")
	public void validCreds() {
		System.out.println("User enters valid creds");
	}
	
	@Then("^User should see Home screen$")
	public void success() {
		System.out.println("User should see Home screen");
	}
	
	@When("^User enters below credentials$")
	public void belowCredentials(DataTable dataTable) {
			List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
			
			System.out.println(list.get(0).get("UserName"));
			System.out.println(list.get(0).get("Passwor"));
	}
	
	
	@Then("^User should see error screen$")
	public void errorScreen() {
		System.out.println("error screen");
	}
	
	
	@When("^User enters UserName as (.+)$")
	public void entersUsername(String userName) {
		System.out.println("Username"+userName);
	}
	
	@And("^User enters Password as (.+)$")
	public void entersPassword(String password) {
		System.out.println("password"+password);
	}
	
	@But("^User should not see login screen$")
	public void noLoginScreen() {
		System.out.println("User should not see login screen");
	}
}
