package sauceDemo.OR;

import org.openqa.selenium.By;

public class LoginPageObjects {

	public void loginpageobjects()
	{
		By login_Txt_Username = By.xpath("id=username");
		By login_Txt_Password = By.xpath("id=password");
		By login_Btn_Login = By.xpath("login-button");
	}
}
