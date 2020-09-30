package page_main;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Login {
	
	WebDriver driver;
	
	By huluHeader = By.xpath("//h1[@id='regionMasthead']//img");
	//By loginBtn = By.xpath("//button[starts-with(@class,'jsx-') and contains(@class,'navigation__login-button navigation__action-button navigation__cta')]");
	By loginBtn = By.xpath("//button[@class='navigation__login-button navigation__action-button navigation__cta']");
	
	By emailInputField = By.xpath("//input[@id='email_id']");
	By passwordInputField = By.xpath("//input[@id='password_id']");
	//By loginBtn2 = By.xpath("(//button[starts-with(@class,'jsx-') and contains(@class,'login-button')])[2]");
	By loginBtn2 = By.xpath("//button[@class='jsx-1761454348 login-button']");
	
	
	// pop-up "Watch Pen 15 modal"
	By pen15modal = By.xpath("//div[@class='Modal__dialog Modal__dialog--visible']");
	By pen15ModalCloseBtn = By.xpath("//button[@class='WelcomeModal__cta cu-welcomemodal-cta btn Button Button--cta']");
	
	String email = "vhofler@gmail.com";
	String password = "@nother1";
	
	public Login (WebDriver driver) {
		this.driver = driver;
	}
	
   //--------------- Elements and Methods  -------------------------------
	
	 public void verifyHuluHeader() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(huluHeader)
	  		    
				));
	   }
	 
	 public void clickLoginButton() {
		 driver.findElement(loginBtn).click();	 
	   }
	 
	 
	 public void enterEmailAddress() {
		 driver.findElement(emailInputField).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		 driver.findElement(emailInputField).clear();
		 driver.findElement(emailInputField).sendKeys(email);	 
	   }
	 
	 
	 public void enterPassword() {
		 driver.findElement(passwordInputField).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		 driver.findElement(passwordInputField).clear();
		 driver.findElement(passwordInputField).sendKeys(password);	 
	   }
	 
	 public void clickLoginBtn2() {
		 driver.findElement(loginBtn2).click();	 
	   }
	
	 // --- main method called ---
	 public void huluLogin() throws InterruptedException {
		this.verifyHuluHeader();
		this.clickLoginButton();
		Thread.sleep(2000);
		this.enterEmailAddress();
		Thread.sleep(2000);
		this.enterPassword();
		this.clickLoginBtn2();
		
		Thread.sleep(9000);
	   }
	 
	 
}
