package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ExcelReader;
import com.utility.Utility;

public class LandingPage extends Utility 
{
	
	@FindBy(xpath="//*[@id=\"search-wrapper\"]/div[2]/div/div[1]/div/input")
	private WebElement Search; 
	@FindBy(xpath="//span[text()='IIT JEE']")
	private WebElement select; 
	@FindBy(xpath="//span[text()='Find a centre']")
	private WebElement center;
	
	ExcelReader reader;
	//driver.manage().window().maxmize();
	
   //	@FindBy(xpath="//*[@id=\"search-wrapper\"]/div[2]/div/div[2]/ul")
   //	private WebElement UpscCse;
	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle();
	} 
	
    public void LandingPageNavigation() throws IOException
    {
    Search.click();
        
    }
    public void LandingPageNavigation1() throws IOException
    {
   	select.click(); 
    }
 
	public void search(String str) {
		Search.sendKeys(str);
	}
	public  void LandingPage1() throws IOException
    {
   	center.click(); 
    }

	public String FindacenterTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

//	public String textCapture() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	
//	public void clickOnexam(){
//	       WebElement exam = null;
//		exam.click();
//	   }
//	
//	WebElement r = driver.findElement(By.name("q"));
//    r.sendKeys("exam");
//    // press ENTER
//    r.sendKeys(Keys.RETURN);
//    }
	
}

