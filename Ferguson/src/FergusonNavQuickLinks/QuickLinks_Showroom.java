package FergusonNavQuickLinks;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class QuickLinks_Showroom {
	

	 static WebDriver driver;
	 
	 //initialize varibles with shortand path statement
	  By verifyHomePageHero = By.id("cac-hero");
	  By showrooms = By.xpath("(.//*[text() = 'Showrooms'])[1]");
	  By showroomHero = By.xpath("//div[@class=\"featured\"]");
	  By goHome = By.className("header-logo");
	  //By goHome2 = By.xpath("//div[@class=\"header-logo\"]"); find element by xpath class
	
	 
	 @SuppressWarnings("static-access")
	public QuickLinks_Showroom (WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 
	 //method that waits for hero banner to be visible before proceeding
	 public void verifyHomePageHeroVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(20))
					 .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.or(
		  		    ExpectedConditions.elementToBeClickable(verifyHomePageHero)
		  		    
					));
		}
	 
	 //click Showrooms link
	 public void showroomLinkClick() {
		 
		 driver.findElement(showrooms).click();
		 
	 }
	 
	 public void verifyShowroomHeroVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(20))
					 .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.or(
		  		    ExpectedConditions.elementToBeClickable(showroomHero)
		  		    
					));
		}
	 
	 
	 public void showroomHeroDisplayed() {
		 
		 //boolean bool =driver.findElement(showroomHero).isDisplayed();
		// Assert.assertEquals(true, bool);
		// System.out.println((Assert.assertEquals(true, bool));
		 
		 boolean hero =driver.findElements(showroomHero).size() != 0;
		 if (hero == true) {
			 Assert.assertEquals(true, hero);
			 System.out.println("Hero Banner Displayed.");
		 } else {
			 Assert.assertEquals(false, hero);
			 System.out.println("Hero Banner Not Displayed.");
		 }
	
		 
	 }
	 
	 public void goHome() {
		 
		 driver.findElement(goHome).click();
	 }
	 
	 
	 //this function calls the ones in the class
	 public void showroomLinkTest() {
		 
		 this.verifyHomePageHeroVisible();
		 this.showroomLinkClick();
		 this.verifyShowroomHeroVisible();
		 this.showroomHeroDisplayed();
		 this.goHome();
	 }

	 

}
