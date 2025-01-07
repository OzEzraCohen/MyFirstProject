package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myCart extends BasePage {

	public myCart(WebDriver MyDriver) {
		super(MyDriver);
	}
	public void checkOut() {
		click(MyDriver.findElement(By.cssSelector("#checkout")));
	}

}
