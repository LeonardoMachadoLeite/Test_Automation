package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm {
	
	@FindBy(how = How.ID, id = "email_create")
	private WebElement emailCampo;
	@FindBy(how = How.CSS, css = "#SubmitCreate > span")
	private WebElement createButton;

	public RegistrationForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
