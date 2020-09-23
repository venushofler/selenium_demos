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

public class extend_Session {
	
	// ----------- POM Page Object model -----------------------------
	WebDriver driver = null;
	
	By stopParkingBtn = By.xpath("//*[@id='sessStopBtn']");
	By extendBtn = By.xpath("//*[@id='extendBtn']");
	By chooseStayBtn = By.xpath("//*[@id='lengthOfStayContent']//*[contains(text(), 'Choose Stay')]");
	By changeNumberBtn = By.xpath("//button[@id='changeBtn']");
	By pinInput = By.xpath("//input[@id='pin']");
	By signInBtn = By.xpath("//button[@id='loginBtn']");
	By minutePlus = By.xpath("//*[@id='minPlus']");
	By extendBtn2 = By.xpath("//*[@id='pickerNext']");
	By extend_YesBtn = By.xpath("/html/body/div[82]/div/div[2]/button[1]//*[contains(text(), 'Yes')]");

	
	public extend_Session (WebDriver driver) {
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
	
	public void verify_Choose_StayBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(chooseStayBtn)
	  		    
				)); 
	   }
	
	public void verify_Minute_Up_Arrow() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(minutePlus)
	  		    
				)); 
	   }
	
	public void verify_Extend_YesBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(extend_YesBtn)
	  		    
				)); 
	   }
	
	
	public void click_ExtendBtn() {
		driver.findElement(extendBtn).click();
	}
	
	public void click_ChooseStayBtn() {
		driver.findElement(chooseStayBtn).click();
	}
	
	public void click_Minute_Up_Arrow() {
		driver.findElement(minutePlus).click();
	}
	
	public void click_ExtendBtn2() {
		driver.findElement(extendBtn2).click();
	}
	
	public void click_Extend_YesBtn() {
		driver.findElement(extend_YesBtn).click();
	}
	
	
	
	//-------------------- Functions Called --------------------
	
	public void extending_Session() throws InterruptedException {
		this.click_ExtendBtn();
		this.verify_Choose_StayBtn(); 
		this.click_ChooseStayBtn();
		this.verify_Minute_Up_Arrow(); 
		//-------minute up arrow -----
		this.click_Minute_Up_Arrow();
		Thread.sleep(1000);
		this.click_Minute_Up_Arrow();
		Thread.sleep(1000);
		//---this will extend time to 35 minutes
		//------------------------------
		this.click_ExtendBtn2();
		Thread.sleep(1000);
		this.verify_Extend_YesBtn();
		Thread.sleep(1000);
		this.click_Extend_YesBtn();
		Thread.sleep(1000);
		this. verify_Stop_ParkingBtn();
	

	}
	
	

}
