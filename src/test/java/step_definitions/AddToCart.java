package step_definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.bdd.learning.DriverLogic.DriverFactory;
import com.bdd.learning.Hooks.MyHooks;
import com.bdd.learning.Pages.AddToCartPage;
import com.bdd.learning.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	public WebDriver driver ;
	public MyHooks myhooks;
	public HomePage homepage;
	public AddToCartPage addtocart;
	
	 @Given("User first open the application")
	 public void firstOpenApplication() {
		 driver = DriverFactory.getDriver();
		// homepage = new HomePage(driver);
		 
		 driver.get("https://tutorialsninja.com/demo/");
	 }
	 
	 @When("User enters the valid product in the search box {string}")
	 public void entersValidProductInSearchBox(String validProductText) {
		// addtocart.enterValidProduct(validProductText);
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(validProductText);
	 }
	 
	 @And("User clicks on the Product search button")
	 public void clickOnSearchButton() throws Exception {
		// addtocart.productSearcButton();
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		 Thread.sleep(2000);
	 }
	   
	 @And("User clicks on the add to cart button")
	 public void clickOnAddToCartOption() {
		 //addtocart.addTocartfunction();
		 driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
	 }
	 
	 @Then("User should see the product added successfully to the cart message")
	 public void productAddedSuccessfullyMassage() {
		String expectedSuccessMassage = "Success: You have added Samsung Galaxy Tab 10.1 to your shopping cart!";
		String actualsuccessMassage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(actualsuccessMassage);
		Assert.assertTrue(actualsuccessMassage.contains(expectedSuccessMassage));
	 }

}
