package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage {

	public CheckoutOverviewPage(WebDriver MyDriver) {
		super(MyDriver);
		
	}
	public void finish() {
		click(MyDriver.findElement(By.cssSelector("#finish")));
		
	}

}
