package com.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.TestBase;

public class testUtil extends TestBase {

	public static void getSS()
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File f=ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File("target/ss/ss.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
