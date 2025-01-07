package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver MyDriver;

	public BasePage(WebDriver MyDriver) {
		this.MyDriver = MyDriver;
	}

	public void fillText(WebElement Item, String text) {
		Item.clear();
		Item.sendKeys(text);
	}

	public void click(WebElement el) {
		el.click();
	}

	public String getText(WebElement Item) {
		return Item.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
