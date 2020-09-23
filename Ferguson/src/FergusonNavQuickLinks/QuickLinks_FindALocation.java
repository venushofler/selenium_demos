package FergusonNavQuickLinks;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class QuickLinks_FindALocation {
	

	 static WebDriver driver;
	 QuickLinks_Showroom home;
	 
	 //initialize varibles with shortand path statement
	  By verifyHomePageHero = By.id("cac-hero");
	  By findALocation = By.xpath("//*[@id=\"wrapper\"]/header/div[4]/div/ul/li[2]/a");
	  By findALocationMap = By.xpath("//*[@id=\"wrapper\"]/main/div/div[3]/div[3]/div");
	  By goHome = By.className("header-logo");
	 
	 
	 @SuppressWarnings("static-access")
	public QuickLinks_FindALocation (WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 
	 //method that waits for hero banner to be visible before proceeding
	 public void verifyHomePageHeroVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(10))
					 .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.or(
		  		    ExpectedConditions.elementToBeClickable(verifyHomePageHero)
		  		    
					));
		}
	 
	 //click Find A Location link
	 public void findALocationLinkClick() {
		 
		 driver.findElement(findALocation).click();
		 
	 }
	 
	 public void verifyfindALocationMapVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(10))
					 .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.or(
		  		    ExpectedConditions.elementToBeClickable(findALocationMap)
		  		    
					));
		}
	 
	 
	 public void findALocationMapDisplayed() {
		 
		 boolean map =driver.findElements(findALocationMap).size() != 0;
		 if (map == true) {
			 Assert.assertEquals(true, map);
		 } else {
			 Assert.assertEquals(false, map);
		 }
		 
		/* try { 
			 
			 boolean bool =driver.findElement(findALocationMap).isDisplayed();
			 Assert.assertEquals(true, bool);
			// System.out.println((Assert.assertEquals(true, bool));
	
		 } catch(Exception e){
			 System.out.println("Error" + e);
		 }
		 */
		 
		
	 }
	 
	 //this function calls the ones in the class
	 public void findALocationLinkTest() {
		 
		 this.verifyHomePageHeroVisible();
		 this.findALocationLinkClick();
		 this.verifyfindALocationMapVisible();
		 this.findALocationMapDisplayed();
		 
		 //accesses goHome() from QuickLinks_Showroom Class
		 home = new QuickLinks_Showroom(driver);
		 home.goHome();
	 }

	 

}
