package stepDef;

import org.testng.Assert;

import Base.DriverManager;
import Pages.LoginPage;
import Pages.PreLoginPage;
import Utility.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends DriverManager {

	@Given("^User is navigated to the Dataserv Solution test website$")
	public void user_is_navigated_to_the_dataserv_solution_test_website() throws Throwable {
		Assert.assertEquals(Util.getURL(), Util.properties("config", "Applink"));
	}

	@When("^Both the email address and password fields are cleared$")
	public void both_the_email_address_and_password_fields_are_cleared() throws Throwable {
		LoginPage login = new LoginPage();
		login.clearTextFields();
	}

	@Then("^The login page is displayed correctly$")
	public void the_login_page_is_displayed_correctly() throws Throwable {
		Assert.assertEquals(Util.getURL(), "https://solution.dataserv-test.com/gandalf/#login");
	}

	@Then("^The Dashboard is displayed correctly$")
	public void the_dashboard_is_displayed_correctly() throws Throwable {
		Assert.assertEquals(Util.getURL(), "https://solution.dataserv-test.com/gandalf/#login");
	}

	@Then("^Error message is diplayed$")
	public void error_message_is_diplayed() throws Throwable {

	}

	@And("^User click the Test Login button$")
	public void user_click_the_test_login_button() throws Throwable {
		PreLoginPage p = new PreLoginPage();
		p.clickOnLoginButton();
	}

	@And("^User enter a valid input in the Email address field$")
	public void user_enter_a_valid_input_in_the_email_address_field() throws Throwable {
		LoginPage login = new LoginPage();
		login.enterEmail("QASupport@dataserv.us");
	}

	@And("^A valid input in the Password field$")
	public void a_valid_input_in_the_password_field() throws Throwable {
		LoginPage login = new LoginPage();
		login.enterPass("WF@PTH0Ptb9Ci6Al");
	}

	@And("^Click Login button$")
	public void click_login_button() throws Throwable {
		LoginPage login = new LoginPage();
		login.clickLoginButton();
	}

	@And("^A invalid input in the Password field$")
	public void a_invalid_input_in_the_password_field() throws Throwable {
		LoginPage login = new LoginPage();
		login.enterPass("WF@PTH0Ptb9Ci6Al+");
	}

	@And("^User enter a invalid input in the Email address field$")
	public void user_enter_a_invalid_input_in_the_email_address_field() throws Throwable {
		LoginPage login = new LoginPage();
		login.enterEmail("QASupport@dataserv.us+");
	}

//---------------------------------------------------------------------------------------------------
//	@Given("^User is on the CRM website$")
//	public void user_is_on_the_crm_website() throws Throwable {
//		Assert.assertEquals(Util.getURL(), Util.properties("config", "Applink"));
//	}
//
//	@When("^User clicks on Login button in the pre login page$")
//	public void user_clicks_on_login_button_in_the_pre_login_page() throws Throwable {
//		PreLoginPage p = new PreLoginPage();
//		p.clickOnLoginButton();
//	}
//
//	@Then("^Login page is displayed$")
//	public void login_page_is_displayed() throws Throwable {
//		Assert.assertEquals(Util.getURL(), "https://solution.dataserv-test.com/gandalf/#login");
//	}
//
//	@Then("^Dashboard page is displayed$")
//	public void dashboard_page_is_displayed() throws Throwable {
//
//	}
//
//	@And("^Enter the email and password and click on submit$")
//	public void enter_the_email_and_password_and_click_on_submit() throws Throwable {
//		LoginPage login = new LoginPage();
//		login.Login("QASupport@dataserv.us", "WF@PTH0Ptb9Ci6Al");
//	}

	// --------------------------------------------------------------------
//	@Then("^Login page is displayed$")
//	public void login_page_is_displayed() throws Throwable {
//		Assert.assertEquals(Util.getURL(), "https://solution.dataserv-test.com/gandalf/#login");
//	}
//
//	@And("^Enter the email and password and click on submit$")
//	public void enter_the_email_and_password_and_click_on_submit() throws Throwable {
//		LoginPage login = new LoginPage();
//		login.Login("QASupport@dataserv.us", "WF@PTH0Ptb9Ci6Al");
//	}
//	
//	@Given("^User is on the CRM website$")
//	public void user_is_on_the_crm_website() throws Throwable {
//		Assert.assertEquals(Util.getURL(), Util.properties("config", "Applink"));
//	}
//
//	@When("^User clicks on Login button in the pre login page$")
//    public void user_clicks_on_login_button_in_the_pre_login_page() throws Throwable {
//    	PreLoginPage p = new PreLoginPage();
//    	p.clickOnLoginButton();
//    }
//	
//	@Then("^Dashboard page is displayed$")
//	public void dashboard_page_is_displayed() throws Throwable {
//
//	}

}