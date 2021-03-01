package com.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest

{
	public static WebDriver driver;
	
	
	public static void openBrowser(String Browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
	}
	

	public static void navigateUrl(String Url)
	{
		driver.get(Url);
		
	}
	
}
