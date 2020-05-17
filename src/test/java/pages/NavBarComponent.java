package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarComponent {

	private WebDriver driver;
	
	public NavBarComponent(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMenuItem(String menuItem) {
		return driver.findElement(By.linkText(menuItem));
	}
	
}
