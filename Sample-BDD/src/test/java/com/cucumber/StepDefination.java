package com.cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	
	 static WebDriver driver;

	    @Given("User is on the login page of the application")
	    public void user_is_on_the_login_page_of_the_application() throws Throwable {
	    	System.setProperty("webdriver.gecko.driver", "C:/P_E_R_S_O_N_A_L/RNTBCI/Java/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.bankbazaar.com/");
			driver.manage().window().maximize();
		 	//driver.findElement(By.xpath("//a[@class='bbicons-cc']")).click();
	    }

	    @When("User clicks on the credit card")
	    public void user_clicks_on_the_credit_card() throws InterruptedException{
	    driver.findElement(By.xpath("//a[@class='bbicons-cc']")).click();
	    Thread.sleep(7000);
	 	   
	    }

		
	    @Then("user click on the student login button")
	    public void user_click_on_the_student_login_button() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@value='STUDENT']")).click();
	    Thread.sleep(3000);
	      
	    }

	    @Then("enter the pin number")
	    public void enter_the_pin_number() {
	    	driver.findElement(By.xpath("//input[@class='fontMedium']")).sendKeys("senthil");
	    	driver.findElement(By.xpath("//a[@class='btn btn-large ']")).click();
	    
	    }

	    @Then("select any city")
	    public void select_any_city() {
	    	driver.findElement(By.xpath("//input[@class='fontMediumundefined']")).sendKeys("senthil");
	 
	    }

}
