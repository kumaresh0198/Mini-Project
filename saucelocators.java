package mini_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class saucelocators {
	String url = "https://www.saucedemo.com/";
	String path = "C:\\Users\\kumut\\eclipse-workspace\\Selenium_Learn\\screenshot\\img.png";
	String username = "user-name";
	String password = "password";
	String login = "login-button";
	String tshirt1 = "add-to-cart-test.allthethings()-t-shirt-(red)";
	String tshirt = "add-to-cart-sauce-labs-fleece-jacket";
	String cart = "shopping_cart_link";
	String checkout = "checkout";
	String firstnamecss = "input[name='firstName']";
	String lastnamexpath = "(//div/input)[2]";
	String postalcodecss = "input[placeholder='Zip/Postal Code']";
	String continuebtn = "continue";
	String finish = "finish";
	
	public static void takescreenshot(TakesScreenshot scrshot, String path) throws IOException{
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileUtils.copyFile(source, dst);

}
}
