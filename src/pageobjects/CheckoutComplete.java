package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete extends BasePage {

	public CheckoutComplete(WebDriver MyDriver) {
		super(MyDriver);

	}

	public void Thankyou() {
		WebElement Item = (MyDriver.findElement(By.cssSelector(".complete-text")));

		System.out.println(getText(Item));
	}

}
