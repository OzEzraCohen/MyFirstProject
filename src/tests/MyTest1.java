package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.CheckoutComplete;
import pageobjects.CheckoutOverviewPage;
import pageobjects.Login;
import pageobjects.ProductsPage;
import pageobjects.myCart;
import pageobjects.myInfo;
import pageobjects.productPage;

public class MyTest1 {
//	I chose different items.

	public static void main(String[] args) {
//		1. Login.
		WebDriver MyDriver = new ChromeDriver();
		MyDriver.manage().window().maximize();
		MyDriver.get("https://www.saucedemo.com/");
		Login Lp = new Login(MyDriver);
		Lp.login("user", "password");
//		2. Choose Item.
		ProductsPage Page1 = new ProductsPage(MyDriver);
		Page1.chooseProduct("Sauce Labs Bike Light");
		productPage P1 = new productPage(MyDriver);
//		3. Click on Add To Cart.
		P1.addtoCart();
		P1.back();
		Page1 = new ProductsPage(MyDriver);
		Page1.chooseProduct("Sauce Labs Bolt T-Shirt");
		productPage P2 = new productPage(MyDriver);
//		4. Click on Add To Cart.
		P2.addtoCart();
		P2.back();
		Page1 = new ProductsPage(MyDriver);
		Page1.openCart();
		myCart M1 = new myCart(MyDriver);
		M1.checkOut();
//		5. The Info Page.
		myInfo In1 = new myInfo(MyDriver);
		In1.login2("firstName", "lastName", "zip");
//		6. finish.
		CheckoutOverviewPage C1 = new CheckoutOverviewPage(MyDriver);
		C1.finish();
		CheckoutComplete CM2 = new CheckoutComplete(MyDriver);
		CM2.Thankyou();
		MyDriver.quit();
	}

}
