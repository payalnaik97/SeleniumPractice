package SeleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import SeleniumPractice.AppTest;


public class flikartHomePage extends AppTest {
	
	@Test
	public void basePagenavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.flipkart.com");
		//Mazimize current window
		driver.manage().window().maximize();
		System.out.println("Flipkart page title is .."+driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("Click on closee");
		
		
	}
}
