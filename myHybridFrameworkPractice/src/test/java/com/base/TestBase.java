package com.base;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.exception.BrowserNotCompatatibleException;


public class TestBase {
	
	public static WebDriver driver;
	Properties prop;
	String browser;
	
	public TestBase()

	{
		prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("config//config.properties"));
			browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
			}	
			else if(browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "drivers//firefoxdriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "drivers//IEServer.exe");
				driver=new InternetExplorerDriver();
			}
			else
			{
				throw new BrowserNotCompatatibleException(browser+ "not supported");
			}
			
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			
		} catch (BrowserNotCompatatibleException e)
		{
			e.printStackTrace();
		}			
		
	}
	
	public void init()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
	}
	
	
	

}
