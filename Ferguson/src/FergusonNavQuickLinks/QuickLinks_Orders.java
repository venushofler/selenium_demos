package FergusonNavQuickLinks;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class QuickLinks_Orders {
	

	 static WebDriver driver;
	 QuickLinks_Showroom home;
	 
	 //initialize varibles with shortand path statement
	  By verifyHomePageHero = By.id("cac-hero");
	  By orders = By.xpath("(.//*[text() = 'Orders'])[1]");
	  By loginForm = By.xpath("//*[@id=\"wrapper\"]/main/div/div[2]/div[1]");
	  By goHome = By.className("header-logo");
	 
	 
	 @SuppressWarnings("static-access")
	public QuickLinks_Orders (WebDriver driver) {
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
	 
	 //click Orders link
	 public void ordersLinkClick() {
		 
		 driver.findElement(orders).click();
		 
	 }
	 
	 public void verifyloginFormVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(10))
					 .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.or(
		  		    ExpectedConditions.elementToBeClickable(loginForm)
		  		    
					));
		}
	 
	 
	 public void loginFormDisplayed() {
		 
		 boolean map =driver.findElements(loginForm).size() != 0;
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
	 public void ordersLinkTest() {
		 
		 this.verifyHomePageHeroVisible();
		 this.ordersLinkClick();
		 this.verifyloginFormVisible();
		 this.loginFormDisplayed();
		 
		 //accesses goHome() from QuickLinks_Showroom Class
		 home = new QuickLinks_Showroom(driver);
		 home.goHome();
	 }

	 

}
