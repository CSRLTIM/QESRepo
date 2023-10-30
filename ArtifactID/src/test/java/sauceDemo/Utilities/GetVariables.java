package sauceDemo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class GetVariables {
	
	
	@Test
	public void GettingVariables() throws IOException 
	{
	
		Properties Props = new Properties();
		String projectPath = System.getProperty("user.dir");
		
		//System.out.println("Project folder is at " +projectPath);
		
		FileInputStream filename = new FileInputStream(projectPath+"\\src\\test\\java\\Resources\\Config.properties");
        Props.load(filename);
        
        String Browser = Props.getProperty("BrowserName");
        
        String URL = Props.getProperty("URL");
        
        String LoginName = Props.getProperty("UserName");
        String LoginPwd = Props.getProperty("Password");
        
        System.out.println("Browsername " +Browser + "\n" + "Application URL " + URL +"\n" + "Username " + LoginName + "\n" + "Password " +LoginPwd);
        Props.clear();
	}

}
