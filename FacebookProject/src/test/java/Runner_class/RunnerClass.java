package Runner_class;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.org.Base;
import com.pom.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber",
		glue = "com/stepdefinition",
		stepNotifications = true,
		monochrome = true,
		dryRun = false,
		publish = true,
		plugin = {//"pretty"
		         //  "usage"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//"html:target/cucumber-reports/facebookproject.html"
	      //"json:target/cucumber-reports/facebookproject.json"
		    //"junit:target/cucumber-reports/facebookproject.xml"
				
		}
		)
public class RunnerClass {
public static WebDriver driver;
@BeforeClass
public static void Launch() throws IOException {
	String launchrowser = FileReaderManager.getInstance().getcrInstance().Launchrowser();
    driver=Base.getBrowser(launchrowser);
}
@AfterClass
  public static void browser() {
	driver.quit();

}
}
