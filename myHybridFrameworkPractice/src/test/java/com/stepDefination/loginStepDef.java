package com.stepDefination;

import org.junit.Assert;
import com.pages.loginPage;
import com.util.testUtil;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class loginStepDef{
loginPage login;

@Given("User is on login page")
public void user_is_on_login_page() {
   login=new loginPage();
   login.clickSignWithEmail();
}

@When("User enter Username and password")
public void user_enter_username_and_password() {
    login.enterUserName("admin");
	login.enterPassword("admin123456");
  
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
	login.clickLogin();
}

@Then("User is on home page")
public void user_is_on_home_page() {
    Assert.assertTrue(login.getTitle().contains("Online Shopping India"));
    Assert.assertEquals(login.getHomePageTitle(),"SHOPPERS STOP");
}


@When("User enter {string} and {string}")
public void user_enter_and(String user, String pass) {
  login.enterUserName(user);
  login.enterPassword(pass);
}

@Then("User is on same page")
public void user_is_on_same_page() {
	System.out.println("login page.."+login.getloginPageTitle().trim());
	Assert.assertEquals(login.getloginPageTitle().trim(), "SIGN IN");
	Assert.assertTrue(login.getTitle().contains("Online Shopping India"));
}





@After("@login")
public void tearDown(Scenario sc)
{
	if(sc.isFailed())
		testUtil.getSS();
	
	login.closer();
}
	

}
