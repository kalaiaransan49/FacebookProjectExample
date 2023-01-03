package com.cucumber.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Base {
	public static WebDriver driver;
public static WebDriver getBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\FacebookProject\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			    driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        return driver;
		        }
    public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}
  public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void directClick(WebElement element) 
	{
		element.click();
	}
	
	public static void contextClick(WebElement element) 
	{
		Actions act =new Actions(driver);
		act.contextClick(element);
	}
	
	public static void doubleClick(WebElement element) 
	{
		Actions act =new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public static void click(WebElement element) 
	{
		Actions act =new Actions(driver);
		act.click(element).perform();
	}
	
}



