package SeleniumPractice;
import pageObject.serachProductPage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class searchProduct extends AppTest {
	@Test
	public void searchProduct() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://www.flipkart.com");
		//Mazimize current window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(5000);
		serachProductPage search=new serachProductPage(driver);
		search.getSearch().sendKeys("Samsung Galaxy S10");
		search.serchProduct().click();
		Thread.sleep(5000);	
		search.getMobileCategory().click();
		Thread.sleep(3000);	
		search.getSamsungBrand().click();
		Thread.sleep(3000);	
		search.getFlipkartAssured().click();
		Thread.sleep(3000);	
		search.getHightoLowPrice().click();
		Thread.sleep(3000);	
		int c=search.getlistofMobileonPage1().size();
		System.out.println("Count of mobile on page is .."+c);
		System.out.println("!!!!! List of mobile name that show on Page 1 !!!!!");
	    for(int j=2;j<=c-3;j++)
	    {	    
	    	String data=driver.findElement(By.xpath("//*[@class='_1YokD2 _3Mn1Gg'][2]/div["+j+"]/div/div/div/a/div[2]/div/div")).getAttribute("innerText");
	    	System.out.println(data);
	    }	
	}

}
