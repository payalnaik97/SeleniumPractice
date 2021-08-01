package SeleniumPractice;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;;

public class AppTest {
public  WebDriver driver;
public Properties prop;

public WebDriver initializeDriver() throws IOException
{
String browserName="chrome";
System.out.println("Test executing on.."+browserName);

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "D:\\STSWorkplace\\chromedriver.exe");
	driver= new ChromeDriver();
   //execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
     //	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}
}
