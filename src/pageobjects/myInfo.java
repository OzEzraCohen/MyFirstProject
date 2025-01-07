package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myInfo extends BasePage {

	public myInfo(WebDriver MyDriver) {
		super(MyDriver);
		
	}
	public void login2(String firstName, String lastName,String zip) {
		fillText(MyDriver.findElement(By.cssSelector("#first-name")), "Oz Ezra");
		fillText(MyDriver.findElement(By.cssSelector("#last-name")), "Nabi Hacohen");
		fillText(MyDriver.findElement(By.cssSelector("#postal-code")), "7850323");
		click(MyDriver.findElement(By.cssSelector("#continue")));
		}

}
