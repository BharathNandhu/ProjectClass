package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	

	
	public static  WebDriver driver;
	 
	
	public static WebDriver launchBrowser(String[] args) {
		return driver;
		
		
	}
	
	//browser
	
	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		return driver;
		
		
	}
	

	public static void urllaunch(String url) {
	driver.get(url);
		
	}
	
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	//implicity
	public static void implicity(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		
		
	}
	//sendkeys
	public static void sendkeys(WebElement e,String value) { 
	e.sendKeys(value);
	
		
	}
	
	public static void click(WebElement e) {
		e.click();
		
		
	}
	
	//title
	public static String title() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public static void getfirstelectoption(WebElement e,String value) {
		Select s = new Select(e);
		s.getFirstSelectedOption();
		
		
	}
	
	public static void ismultipe (WebElement e) {
		Select s =new Select(e);
		s.isMultiple();
		
		
	}
	
	public static void deselectByIntex(WebElement e, int i) {
		Select s = new Select(e);
		s.deselectByIndex(i);
		
		
	}
	
	public static void deselectByvalue(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
	
	
	}
	public static void deselectByvisibleText(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByVisibleText(value);
	
	}
	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}
	
	
	public static void Screenshot(WebElement e, String value, Object FileUnits) throws IOException{
	TakesScreenshot t = (TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File des = new File(value);
FileUtils.copyFile(src, des);
	
	}
	
	
}
