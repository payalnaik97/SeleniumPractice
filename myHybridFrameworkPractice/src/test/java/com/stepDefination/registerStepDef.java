package com.stepDefination;

import org.junit.Assert;
import com.pages.registerPage;
import com.util.testUtil;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class registerStepDef {
registerPage register;

@Given("User is on signup page")
public void user_is_on_signup_page() {
	register=new registerPage();
	register.clickSignUp();
}

@When("User enter all details")
public void user_enter_all_details(io.cucumber.datatable.DataTable dataTable) {
	register.enterAllDetails(dataTable);
	register.selectGender();
  
}

@When("User click on continue")
public void user_click_on_continue() {
	register.clickonRegister();
}

@Then("User get register")
public void user_get_register() {
	Assert.assertEquals(register.getOTPtest(),"Create your account on Shoppers Stop");
}

//Negative Scenarios 
@When("User enter some details")
public void user_enter_some_details(io.cucumber.datatable.DataTable dataTable) {
	register.enterSomeDetails(dataTable);;
	register.selectGender();
  
}

@Then("User is on same signup page")
public void user_is_on_same_signup_page() {
	Assert.assertEquals(register.getEmailError(), "Please enter a valid email address");
	Assert.assertEquals(register.getMobError(), "Please provide a number");
	Assert.assertEquals(register.getSignUpPage(), "Create your account on Shoppers Stop");
}


@After("@register")
public void tearDown(Scenario sc)
{
	if(sc.isFailed())
		testUtil.getSS();
	register.closer();
}


}
