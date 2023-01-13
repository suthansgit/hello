package stepdefinition.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	WebDriver driver;
	@Given("user is on adactin hotel login page.")
	public void user_is_on_adactin_hotel_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	

	@When("user should enter the username and password.")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Tamil001");
		driver.findElement(By.id("password")).sendKeys("Tamil@001");
	}
	

	@And("user should click the login button.")
	public void user_should_click_the_login_button() {
		driver.findElement(By.id("login")).click();
	}

	
	@Then("user should verify the success msg.")
	public void user_should_verify_the_success_msg() {
		
		String text = driver.findElement(By.xpath("//td[contains(text(),'Group')]")).getText();
	}



}
