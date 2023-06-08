package landingPage2_stepdefinitions;
import com.utility.Utility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import com.pages.LandingPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage2_step extends Utility {
	public LandingPage ldp;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
	}
	@Given("Chrome is launched and unacademy application is launched")
	public void chrome_is_launched_and_unacademy_application_is_launched() throws Exception {
		objectMethod();
		Utility.implicitWait();
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle); 
		Utility.captureScreenshot();
		Utility.implicitWait();
	}
	@Then("user navigate on Landing page")
	public void user_navigate_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
		Utility.implicitWait();
	
	}
	
	@When("User enters Goal {string}")
	public void user_enters_goal(String str) throws Exception{
		objectMethod();
		Utility.implicitWait();
		ldp.search(str);
		Utility.implicitWait();
	}
	@Then("It shows  Goal in the list")
	public void it_shows_goal_in_the_list() throws Exception{
		objectMethod();
		Utility.implicitWait();
//		ldp.LandingPage1();
//		Utility.implicitWait();
	}

	@Then("It shows  Not Goal in the list")
	public void it_shows_not_goal_in_the_list() throws Exception{
		objectMethod();

		Utility.implicitWait();
//		ldp.LandingPage1();
//		Utility.implicitWait();
//	   
	}
	
}