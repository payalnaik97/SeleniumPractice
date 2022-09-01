package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class loginPage extends TestBase {
	@FindBy(className="signinwithemail")
	WebElement email;
	
	@FindBy(id="j_username")
	WebElement userName;
	
	@FindBy(id="j_password")
	WebElement password;
	
	@FindBy(id="loginajax")
	WebElement login;
	
	@FindBy(xpath="/html/body/main/header/div[1]/div/div[1]/div[2]/a/img")
	WebElement homepageTilte;
	
	@FindBy(xpath="//*[@id=\"member-scroller\"]/div/div[1]/h2")
	WebElement loginpageTitle;
	
	public loginPage()
	{
		init();
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignWithEmail()
	{
		email.click();
	}	
	public void enterUserName(String us)
	{
		userName.sendKeys(us);
	}
	public void enterPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void clickLogin()
	{
		login.click();
	}
	public String getHomePageTitle()
	{
		return homepageTilte.getAttribute("title");
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	public String getloginPageTitle()
	{
		return loginpageTitle.getAttribute("innerText");
	}
	public void closer()
	{
		this.driver.close();
	}
	

}
