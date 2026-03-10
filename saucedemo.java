package mini_project;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class saucedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		saucelocators locs = new saucelocators();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(locs.url);
		
		WebElement username = driver.findElement(By.id(locs.username));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id(locs.password));
		password.sendKeys("secret_sauce");
		driver.findElement(By.id(locs.login)).click();
		Actions mouseaction = new Actions(driver);
		WebElement tshirt = driver.findElement(By.id(locs.tshirt));
		mouseaction.scrollToElement(tshirt);
		tshirt.click();
		WebElement cart = driver.findElement(By.className(locs.cart));
		cart.click();
		driver.findElement(By.id(locs.checkout)).click();
		driver.findElement(By.cssSelector(locs.firstnamecss)).sendKeys("kumaresh");
		driver.findElement(By.xpath(locs.lastnamexpath)).sendKeys("kumar");
		driver.findElement(By.cssSelector(locs.postalcodecss)).sendKeys("600042");
		driver.findElement(By.id(locs.continuebtn)).click();;
		driver.findElement(By.id(locs.finish)).click();
		
		TakesScreenshot scrshot = (TakesScreenshot)driver; 
		saucelocators.takescreenshot(scrshot, locs.path); 
		
		System.out.println("order is placed");
		
		driver.quit();
	}

}
