package com.pages;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;
public class FindCenterPage extends Utility{
	public LandingPage ldp;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		

		
	}
	public FindCenterPage() throws IOException
	{
	
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{

		return driver.getTitle();
	}
//	public String FindacenterTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public String FindacenterTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
