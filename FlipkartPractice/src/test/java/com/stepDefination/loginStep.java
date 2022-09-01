package com.stepDefination;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class loginStep {
 WebDriver driver;
 
@Given("User is on flipkart login page")
public void user_is_on_flipkart_login_page() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");  
    driver=new ChromeDriver();
    Thread.sleep(4000);
    driver.get("https://www.flipkart.com/");
    Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");  
    driver.manage().window().maximize();   
 
}


@When("User enter Username and password")
public void user_enter_username_and_password() throws InterruptedException {
   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("payalnaik97@gmail.com");
   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("pj8087731441");
   Thread.sleep(10000);
   
}

@When("User clicks on Login button")
public void user_clicks_on_login_button() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	Thread.sleep(5000);
}


@When("User enter mobile number")
public void user_enter_mobile_number() throws InterruptedException {	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8087731441");
	Thread.sleep(5000);
}


@When("User clicks on continue")
public void user_clicks_on_continue() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	Thread.sleep(5000);
	
}


@When("User enter password")
public void user_enter_password() {
   driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("pj8087731441");
}



@Then("User is on Flipkart Home page")
public void user_is_on_flipkart_home_page() {
   Assert.assertTrue(driver.getTitle().contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
   String username=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).getAttribute("innerText");
   Assert.assertEquals(username, "Payal");
 
   
}

//Negative scenario

@When("User enters {string} and {string}")
public void user_enters_and(String un, String pw) throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(un);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pw);
	  Thread.sleep(10000);
}


@Then("User is on same Login page")
public void user_is_on_same_login_page() {
	String loginPage=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/span/span")).getAttribute("innerText");
	Assert.assertEquals(loginPage, "Login");	
	String loginButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).getAttribute("innerText");
	Assert.assertEquals(loginButton, "Login");	

}

@After
public void close()
{
	driver.quit();

}

}


