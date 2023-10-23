package GroupID.ArtifactID;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class edgeInvoke {
	 static WebDriver driver =null;	
	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub		
//		WebDriverManager.edgedriver().setup();		
//		//	    WebDriver driver = new EdgeDriver(); 	
//        EdgeOptions options = new EdgeOptions();
//        driver = new EdgeDriver(options);
		
		WebDriverManager.firefoxdriver().setup();
		
		try {
			driver = new FirefoxDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);      
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();	
//		driver.get("https://www.google.com/");  
		
		
		
//		WebElement GSearch = driver.findElement(By.className("a4bIc"));		
//		GSearch.sendKeys("test");
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SDkEP")));		
//		
//		TakesScreenshot scnshot = (TakesScreenshot)driver;
//		File srce = scnshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srce, new File("./SeleniumScreenshots/Screen.png"));
			
		//		driver.close();
//		WebElement GSearch = driver.findElement(By.className("a4bIc"));		
//		GSearch.sendKeys("test");
//		
//		TakesScreenshot scnshot1 = (TakesScreenshot)driver;
//		File srce1 = scnshot1.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srce1, new File("./SeleniumScreenshots/Searchstring1.png"));
//		
//		driver.quit();
	}
}