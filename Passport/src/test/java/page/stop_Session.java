package page;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class stop_Session {
	
	// ----------- POM Page Object model -----------------------------
	WebDriver driver = null;
	
	By stopParkingBtn = By.xpath("//*[@id=\"sessStopBtn\"]");
	By stop_Yes_Confirm_Btn = By.xpath("//*[@id=\"session\"]/div[7]/div/div[2]/button[1]//*[contains(text(), 'Yes')]");
	By okBtn = By.xpath("//*[@id=\"session\"]/div[7]/div/div[2]/button/span//*[contains(text(), 'Ok')]");

	
	
	public stop_Session (WebDriver driver) {
		this.driver = driver;
	}
	
   //---------------  Methods  -------------------------------
	
	public void verify_Stop_ParkingBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(stopParkingBtn)
	  		    
				)); 
	   }
	
	public void verify_Stop_Yes_Confirm_Btn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(stop_Yes_Confirm_Btn)
	  		    
				)); 
	   }
	
	public void verify_Ok_Btn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.visibilityOfElementLocated(okBtn)
	  		    
				)); 
	   }
	
	
		public void click_Stop_Parking_Btn() {
			driver.findElement(stopParkingBtn).click();
		}
		
		public void click_Stop_Yes_Confirm_Btn() {
			driver.findElement(stop_Yes_Confirm_Btn).click();
		}
		
		public void click_Confirm_Ok() {
			driver.findElement(okBtn).click();
		}
	

	//-------------------- Main Function Called --------------------
	
	public void stoping_Session() throws InterruptedException {
		
		this. verify_Stop_ParkingBtn();
		this.click_Stop_Parking_Btn();
		Thread.sleep(2000);
		this.verify_Stop_Yes_Confirm_Btn(); 
		this. click_Stop_Yes_Confirm_Btn();
		Thread.sleep(2000);
		this.verify_Ok_Btn();
		this.click_Confirm_Ok();
		Thread.sleep(3000);
	}
	
	

}
