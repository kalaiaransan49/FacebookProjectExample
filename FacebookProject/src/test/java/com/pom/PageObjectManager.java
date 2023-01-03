package com.pom;
import org.openqa.selenium.WebDriver;
public class PageObjectManager {
 public static WebDriver driver;
 private LoginPage lp;
	public PageObjectManager(WebDriver driver1) {
	this.driver=driver1;
}
public LoginPage getLp() {
	lp= new LoginPage(driver);
	return lp;
	
}
}
