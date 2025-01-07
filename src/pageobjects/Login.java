package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {

	public Login(WebDriver MyDriver) {
		super(MyDriver);

	}

	public void login(String user, String password) {
		fillText(MyDriver.findElement(By.cssSelector("#user-name")), "standard_user");
		fillText(MyDriver.findElement(By.cssSelector("#password")), "secret_sauce");
		click(MyDriver.findElement(By.cssSelector("#login-button")));
		}
}
