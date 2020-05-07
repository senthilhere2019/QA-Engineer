package com.cucumber;

import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeositeStepDefination {

	static WebDriver driver;


	@Given("Launch the url of the application")
	public void launch_the_url_of_the_application() {
		System.setProperty("webdriver.gecko.driver", "C:/P_E_R_S_O_N_A_L/RNTBCI/Java/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();

	}

	@When("enter the user name and password to login")
	public void enter_the_user_name_and_password_to_login() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("senthilhere07@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Senthil@86");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
	}

	@Then("click on the contacs menu")
	public void click_on_the_contacs_menu() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ui fluid container']/div/a[3]/span[text()='Contacts']")).click();
		Thread.sleep(2000);

	}
	@Then("click on the New in conact")
	public void click_on_the_New_in_conact() {
		driver.findElement(By.xpath("//div//a//button[@class='ui linkedin button']")).click();

		/*
		 * WebElement contactnew =
		 * driver.findElement(By.xpath("//div//a//button[@class='ui linkedin button']"))
		 * ; JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click(), contactnew");
		 */	   
	}

}
