package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroUsuarioPageObject {

	//Forms 1: Usuario
	private WebElement 
		primeiroNomeUsuarioCampo, 
		ultimoNomeUsuarioCampo,
		senhaCampo,
		dataNascimentoDiaDropbox,
		dataNascimentoMesDropbox,
		dataNascimentoAnoDropbox,
		newsletterCheckbox,
		optionCheckbox;
	
	//Forms 2: Endereco
	
	public CadastroUsuarioPageObject(WebDriver driver) {
		primeiroNomeUsuarioCampo = driver.findElement(By.id("customer_firstname"));
	    driver.findElement(By.id("customer_lastname"));
	    driver.findElement(By.id("passwd"));
	    driver.findElement(By.id("days"));
	    driver.findElement(By.id("months"));
	    driver.findElement(By.id("years"));
	    driver.findElement(By.id("newsletter"));
	    driver.findElement(By.id("optin"));
	    driver.findElement(By.id("firstname"));
	    driver.findElement(By.id("lastname"));
	    driver.findElement(By.id("company"));
	    driver.findElement(By.id("address1"));
	    driver.findElement(By.id("city"));
	    driver.findElement(By.id("id_state"));
	    driver.findElement(By.id("postcode"));
	    driver.findElement(By.id("id_country"));
	    driver.findElement(By.id("other"));
	    driver.findElement(By.id("phone"));
	    driver.findElement(By.id("phone_mobile"));
	    driver.findElement(By.id("alias"));
	    driver.findElement(By.cssSelector("#submitAccount > span")).click();
	}
	
}
