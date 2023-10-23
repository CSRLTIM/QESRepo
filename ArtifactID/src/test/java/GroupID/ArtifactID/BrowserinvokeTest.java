package GroupID.ArtifactID;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserinvokeTest {
  
  public static WebDriver driver;
	 
  @Test
  public void f() {

	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.get("https://www.google.com/");  
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	System.out.println("Waiting for searh box");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SDkEP")));
	
	System.out.println("Wait completed");
	
//	driver.close();
	driver.quit();
	System.out.println("Execution completed");
  }
}
