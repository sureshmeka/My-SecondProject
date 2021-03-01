package com.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\umesh\\OneDrive\\Desktop\\2021 Selenium Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		
		
		
		
		
		
	}

}
