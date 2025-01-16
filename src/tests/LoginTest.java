package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Login;

public class LoginTest {

	public  void main(String[] args) {
		WebDriver MyDriver = new ChromeDriver();
		MyDriver.manage().window().maximize();
		MyDriver.get("https://www.saucedemo.com/");
		Login Lp=new Login(MyDriver);
		Lp.login("user","password");
		
	}

}
