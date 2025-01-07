package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage extends BasePage {


	public productPage(WebDriver MyDriver) {
		super(MyDriver);

	}

	public void back() {
		click(MyDriver.findElement(By.cssSelector("#back-to-products")));
	}
	public void addtoCart() {
		click(MyDriver.findElement(By.cssSelector("#add-to-cart")));
	}
	public void Remove() {
		click(MyDriver.findElement(By.cssSelector("#remove-sauce-labs-bike-light")));
	}
	

}
