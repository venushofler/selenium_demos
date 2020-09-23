package FergusonNavQuickLinks;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class QuickLinks_MyLists {
	

	 static WebDriver driver;
	 
	 //initialize varibles with shortand path statement
	  By verifyHomePageHero = By.id("cac-hero");
	  By myLists = By.id("jsSt-lists");
	  By loginForm = By.xpath("//*[@id=\"wrapper\"]/main/div/div[2]/div[1]");
	  By email = By.id("email");
	  By password = By.id("js-loginpage-password");
	  By goHome = By.className("header-logo");
	  
	  //By goHome2 = By.xpath("//div[@class=\"header-logo\"]"); find element by xpath class
	
	 
	 @SuppressWarnings("static-access")
	public QuickLinks_MyLists (WebDriver driver) {
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
	 
	 //click My Lists tab
	 public void MyListsTabClick() {
		 
		 driver.findElement(myLists).click();
		 
	 }
	 
	 public void verifyLoginFormVisible() {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(Duration.ofSeconds(20))
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
		 
	 }
	 
	 
	 public void goHome() {
		 
		 driver.findElement(goHome).click();
	 }
	 
	 
	 //----- myLists login -----------------------
	 
    public void setPassword(String strPassword) {
		 
		 driver.findElement(password).sendKeys(strPassword);
			 
		 }
    
    public void setMyListCredentials(String strEmailAddress, String strPassword) {
    	
    	driver.findElement(email).sendKeys(strEmailAddress);
    	driver.findElement(password).sendKeys(strPassword);
    }
 
 
	/* 
	public void emailAddress() {
		 
		driver.findElement(email).sendKeys("venus.hofler@ferguson.com");
	}
	

	public void password() {
		 
		 driver.findElement(password).sendKeys("venhof9089");
	 }
	
	*/
	

	 //this function calls the ones in the class
	 public void myListsLinkTest(String strEmailAddress, String strPassword) {
		 
		 this.verifyHomePageHeroVisible();
		 this.MyListsTabClick();
		 this.loginFormDisplayed();
		 this.setMyListCredentials(strEmailAddress, strPassword);
		 this.goHome();
	 }

	 

}
