package com.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class registerPage extends TestBase {
	@FindBy(className="main-signup")
	WebElement signUp;
	
	@FindBy(id="signupFullName")
	WebElement fullName;
	
	@FindBy(id="signupEmail")
	WebElement emailId;
	
	@FindBy(id="signupMobileNumber")
	WebElement mobile;
	
	@FindBy(id="signupPassword")
	WebElement password;
	
	@FindBy(id="men")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[1]/div[1]/button")
	WebElement register;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[1]/h5")
	WebElement otpText;
	
	@FindBy(id="signupEmail-error")
	WebElement emailError;
	
	@FindBy(id="signupMobileNumber-error")
	WebElement mobError;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[1]/h5")
	WebElement signupPage;
	

	 public registerPage()
	 {
		init();
		PageFactory.initElements(driver,this);
	 }
	 
	 public void clickSignUp()
	 {
	    signUp.click();
	 }
	 public void enterAllDetails(io.cucumber.datatable.DataTable dataTable)
	 {
		Map<String,String> map=dataTable.asMap(String.class,String.class);
		System.out.println("First name is .."+map.get("firstname"));
		fullName.sendKeys(map.get("firstname") +" "+ map.get("lastname"));
		emailId.sendKeys(map.get("emailid"));
		mobile.sendKeys(map.get("mob"));
		password.sendKeys(map.get("pass"));		
	 }
	 
	 public void enterSomeDetails(io.cucumber.datatable.DataTable dataTable)
	 {
		Map<String,String> map=dataTable.asMap(String.class,String.class);
		System.out.println("First name is .."+map.get("firstname"));
		fullName.sendKeys(map.get("firstname") +" "+ map.get("lastname"));
		password.sendKeys(map.get("pass"));		
	 }
	 public void selectGender()
	 {
		 gender.click();
	 }
	 public void clickonRegister()
	 {
		 register.click();
	 }
	 public String getOTPtest()
	 {
		return otpText.getAttribute("innerText");
	 }
	 public String getEmailError()
	 {
		return emailError.getAttribute("innerText");
	 }
	 public String getMobError()
	 {
		return mobError.getAttribute("innerText");
	 }
	 public String getSignUpPage()
	 {
		return signupPage.getAttribute("innerText");
	 }
	 
	 public void closer()
	 {
		this.driver.close();
	 }	 
	 
	 
}
