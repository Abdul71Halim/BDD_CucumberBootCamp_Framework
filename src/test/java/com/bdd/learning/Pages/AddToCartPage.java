package com.bdd.learning.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartPage {
	public WebDriver driver;
	
	
	 @FindBy(xpath="//input[@placeholder='Search']")
	 private WebElement enterValidProduct ;
	 
	 
	 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	 private WebElement productSearcButton ;
	 
	 
	 @FindBy(xpath="//span[normalize-space()='Add to Cart']")
	 private WebElement addTocartfunction ;
	 
	 
	 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	 private WebElement successfullyItameadded ;
	 
	 
	 public AddToCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	/* @Then("User should see the product added successfully to the cart message")
	 public void productAddedSuccessfullyMassage() {
		String expectedSuccessMassage = "Success: You have added Samsung Galaxy Tab 10.1 to your shopping cart!";
		String actualsuccessMassage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(actualsuccessMassage);
		Assert.assertTrue(actualsuccessMassage.contains(expectedSuccessMassage));
	 }*/

	
	 public void enterValidProduct(String validProductText) {
		 enterValidProduct.sendKeys(validProductText);
		}
     public void productSearcButton() {
    	 productSearcButton.click();
     }
     
	public void addTocartfunction() {
		addTocartfunction.click();
	}
	public void successfullyItameadded() {
		successfullyItameadded.isDisplayed();
	}
}
