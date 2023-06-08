package landingPage_Excel_stepdefinitions;

import static org.testng.Assert.assertEquals;
import com.utility.Config;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Sheet;

//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.configuration.Config;
import com.pages.LandingPage;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Landing_Excel extends Utility{
	public LandingPage ldp;
	ExcelReader reader;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();

		
	}
	@Given("Chrome is launched and unacademy application is launched")
	public void chrome_is_launched_and_unacademy_application_is_launched() throws IOException {
		objectMethod();
		Utility.implicitWait();
	
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle); 
		Utility.captureScreenshot();
		Utility.implicitWait();
	}
	
	@Then("user navigate on Landing page")
	public void user_navigate_on_landing_page() throws IOException {
		objectMethod();
		Utility.implicitWait();
		
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
		Utility.implicitWait();
	}

	@When("User enters Goal from given sheetname {string} and rownumber {int}")
	public void user_enters_goal_from_given_sheetname_and_rownumber_row_number(String sheetName,int rowNumber) throws IOException, InterruptedException, InvalidFormatException {
		objectMethod();
        Utility.implicitWait();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        Thread.sleep(1000);
        String str = testData.get(rowNumber).get("Courses");
        ldp.search(str);
        Thread.sleep(5000);
	}
	@Then("User is Should able to Enter the Goals")
	public void user_is_should_able_to_enter_the_goals() throws IOException {
		objectMethod();
		Utility.implicitWait();
		Utility.captureScreenshot();
		Utility.implicitWait();
	    
	}


}
