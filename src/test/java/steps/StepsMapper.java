package steps;

import org.junit.Before;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class StepsMapper {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@When("^o usuário abrir o site$")
	public void abrirSite() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	@When("^entrar na tela de login$")
	public void abrirTelaDeLogin() {
	    driver.findElement(By.linkText("Sign in")).click();
	}
	
	@When("^entrar na tela de cadastro com um novo email$")
	public void abrirTelaDeCadastro() {
		driver.findElement(By.id("email_create")).sendKeys("email");
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	}
	
	
	
}
