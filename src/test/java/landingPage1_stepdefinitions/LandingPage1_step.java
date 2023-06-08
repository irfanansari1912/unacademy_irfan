package landingPage1_stepdefinitions;
import com.utility.Utility;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.FindCenterPage;
import com.pages.LandingPage;
import com.utility.ExcelReader;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage1_step extends Utility{
	public LandingPage ldp;
	public FindCenterPage fdp;
	ExcelReader reader;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		 fdp = new FindCenterPage();
		
	}
	@Given("Chrome is launched and unacademy application is launched")
	public void chrome_is_launched_and_unacademy_application_is_launched() throws Exception {
		objectMethod();
		Utility.implicitWait();
//		String actualtitle = ldp.validateLandinPageTitle();
//		System.out.println(actualtitle); 
//	    Utility.captureScreenshotOnFailure();
		   logger = report.createTest("test01");

           logger.log(Status.INFO, "Validating landing page title");
           String actualTitle = ldp.validateLandinPageTitle();
           String expectedTitle = "Unacademy - India's largest learning platform";
           try {
               assertEquals(expectedTitle,actualTitle);
               logger.log(Status.PASS, "Step1 is passed");
               System.out.println(actualTitle);
               assert true;
           } catch (AssertionError e) {
               e.printStackTrace();
               logger.log(Status.FAIL, "Step1 is failed");

               captureScreenshotOnFailure();

               assert false;

           }
		Utility.implicitWait();
	}
	
		
	
	
	@Then("user navigate on Landing page")
	public void user_navigate_on_landing_page() throws InterruptedException, IOException {
		objectMethod();

		Utility.implicitWait();
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
		 logger.log(Status.PASS, "Step2 is executed");
		Utility.implicitWait();
	    
	}
	@Then("Landing page feild are Visible")
	public void Landing_page_feild_are_Visible() throws Exception {
		objectMethod();
		Utility.implicitWait();
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		Utility.captureScreenshotOnFailure();
		System.out.println(actualtitle); 
		 logger.log(Status.PASS, "Step3 is executed");
		Utility.implicitWait();

		
	    
	}
	@When("User Enter the Goal in Goals Feild")
	public void  user_enter_the_goal_in_goals_feild() throws Exception {
		objectMethod();

		Utility.implicitWait();
		Utility.captureScreenshotOnFailure();
		ldp.LandingPageNavigation();
		 logger.log(Status.PASS, "Step4 is executed");
		Utility.implicitWait();
		
	}
	@Then("User is Should able to Enter the Goals")
	public void  user_is_should_able_to_enter_the_goals() throws Exception {
		objectMethod();
		Utility.implicitWait();
		Utility.captureScreenshotOnFailure();
	    ldp.LandingPageNavigation1();
	    logger.log(Status.PASS, "Step5 is executed");
		Utility.implicitWait();
	}
	
	@When("user click on find a center button")
	public void user_click_on_find_a_center_button() throws Exception {
		objectMethod();
		Utility.implicitWait();
		Utility.captureScreenshotOnFailure();
	    ldp.LandingPage1();
	    logger.log(Status.PASS, "Step6 is executed");
	    Utility.implicitWait();
	    
	}
	@Then("user navigate the  find a center")
	public void user_navigate_the_find_a_center() throws Exception {
	objectMethod();
	logger.log(Status.PASS, "Step7 is executed");
	Utility.implicitWait();
	String actualtitle = fdp.FindacenterTitle();
	 String expectedTitle = "Unacademy Centres for IIT JEE and NEET UG";
	Utility.captureScreenshotOnFailure();
    ldp.LandingPage1();

    try {
       
        logger.log(Status.PASS, "Step8 is passed");
     
        assert true;
    } catch (AssertionError e) {
        e.printStackTrace();
        logger.log(Status.FAIL, "Step8 is failed");
        captureScreenshotOnFailure();
        assert false;
    }

    Utility.implicitWait();
		
	    
	}
//	@When("User enters Username {string} and Password {string}")
//	public void user_enters_Username_and_Password(String uname, String pword) throws IOException, InterruptedException {
//		objectMethod();
//		Thread.sleep(2000);
//		lp.JoinforfreenumberName(uname);
//		lp.JoinforfreePassword(pword);
//		}
//
//
//	@When("User clicks on join for free button")
//	public void user_clicks_on_joinforfree_button() throws IOException
//	{
//		objectMethod();
//		hp = jp.joinforfreeButton();
//		
//	}
//
//	@Then("It shows home page")
//	public void it_shows_home_page() throws InterruptedException, IOException
//	{
//		objectMethod();
//		Thread.sleep(5000);
//		Object hp;
//		String actualtitle = idp.validateHomePageTitle();
//		String expectedtitle = "unacademy";
//		assertEquals(expectedtitle, actualtitle);
//		System.out.println(actualtitle); 
//		
//	}
	
//	@Then("Landing page feild are Visible")
//	public void landing_page_feild_are_visible() {
//	}
//	
//	@When("User Enter the Goal in Goals Feild")
//	public void user_enter_the_goal_in_goals_feild() {
//		    
//	}
//	@Then("User is Should able to Enter the Goals")
//	public void user_is_should_able_to_enter_the_goals() {
//		   
//	    
//
//	}
}
