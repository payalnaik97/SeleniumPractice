package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class serachProductPage {
    public WebDriver driver;
    By search=By.xpath("//input[@name='q']");
    By searchIcon=By.className("L0Z3Pu");
    By mobile=By.xpath("//*[@title='Mobiles']");
    By brand=By.xpath("//*[@title='SAMSUNG']");
    By flipkartAssured=By.className("_3U-Vxu");
    By hightoLowPrice=By.xpath("//*[@class='_5THWM1']/div[4]");
    By listofMobilePage1=By.xpath("//*[@class='_1YokD2 _3Mn1Gg'][2]/div");
    
    public serachProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
    
	public WebElement getSearch()
    {
    	return driver.findElement(search);
    }
    public WebElement serchProduct()
    {
    	return driver.findElement(searchIcon);
    }
    public WebElement getMobileCategory()
    {
    	return driver.findElement(mobile);
    }
    public WebElement getSamsungBrand()
    {
    	return driver.findElement(brand);
    }
    public WebElement getFlipkartAssured()
    {
    	return driver.findElement(flipkartAssured);
    }
    public WebElement getHightoLowPrice()
    {
    	return driver.findElement(hightoLowPrice);
    }
    public List<WebElement> getlistofMobileonPage1()
    {
    	return driver.findElements(listofMobilePage1);
    }
}
