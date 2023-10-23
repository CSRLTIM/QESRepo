package GroupID.ArtifactID;

import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiBrowserParallelexecution {
	
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
		
	@Parameters("bName")
	@BeforeTest
	public void browsersetup(String bName)
	{
		System.out.println("Selected Browser Name is "+bName);
		System.out.println("Selected Browser Name is "+bName + "started at " + new Timestamp(new Date().getTime()));
		if (bName.equalsIgnoreCase("Edge") )
		{
			WebDriverManager.chromedriver().setup();
			EdgeOptions options = new EdgeOptions();
	        driver = new EdgeDriver(options); 
			
		}
		else if (bName.equalsIgnoreCase("chrome") )
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
	        driver = new ChromeDriver(options); 
			
		}
		else if (bName.equalsIgnoreCase("Firefox") )
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
	        driver = new FirefoxDriver(options); 
			
		}
		else if (bName.equalsIgnoreCase(" ") )
		{
			System.out.println("Selected No Browser - Terminating test exeuction");
			System.exit(1);
			System.out.println("Selected No Browser - execution stopped");
		}
	}
	@Parameters("bName")
	@Test
	public void invokingBrowsers(String bName) 
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.google.com/");
		System.out.println(bName + " Browser navigated to "+driver.getTitle()+" at time of "+ new Timestamp(new Date().getTime()));
		
	}
	@AfterTest
	public void browserClose()
	{
		driver.quit();
		System.out.println(" Ended at " + new Timestamp(new Date().getTime()));
		System.out.println("After merging mcsekharamain to master1");
	}

}
