package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver MyDriver) {
		super(MyDriver);

	}

	public void chooseProduct(String name) {
		List<WebElement> List = MyDriver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement Il : List) {
			if (getText(Il).equalsIgnoreCase(name)) {
				click(Il);
				break;
			}
		}
	}

	public void openCart() {
		click(MyDriver.findElement(By.cssSelector(".shopping_cart_link")));

	}
	public void addtoCart() {
		click(MyDriver.findElement(By.cssSelector("#add-to-cart")));
	}

}
