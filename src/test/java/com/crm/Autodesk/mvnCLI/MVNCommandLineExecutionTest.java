package com.crm.Autodesk.mvnCLI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MVNCommandLineExecutionTest {
	
	@Test
	public void  createContactTest()
	{
		System.out.println(" createContact done successfully ");
	}
	
	@Test
	public void  modifyContactTest()
	{
		System.out.println(" modify Contact done successfully ");
	}
	@Test
	public void launchBrowserTest(){
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equals("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			
				
			driver.quit();
		}
		else if(BROWSER.equals("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.get(URL);
			driver.quit();
		}
	}
}
	