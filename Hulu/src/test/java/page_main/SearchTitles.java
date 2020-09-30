package page_main;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import test_hulu_main_page.BaseTestHulu;


public class SearchTitles extends BaseTestHulu {

		WebDriver driver;
		
		// declare page objects/elements
		
		By searchIcon = By.xpath("//a[@class='GlobalNavigation__search']//*[local-name()='svg']");
		By searchTextBox = By.xpath("//input[@placeholder='Search']");
		By pauseBtn = By.xpath("//div[@class='PlayerButton PlayerControlsButton PlaybackControls__item PauseButton']");
		By playBtn = By.xpath("//div[@class='PlayerButton PlayerControlsButton PlaybackControls__item PlayButton']");
		

		
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
		 
		 // list methods
		 public void clickLoginButton() {
			 driver.findElement(loginBtn).click();	 
		   }
		 
		 
		 
		
		 // --- main method called ---
		 public void huluLogin() throws InterruptedException {
			this.verifyHuluHeader();
			this.clickLoginButton();
			Thread.sleep(2000);
			
			//call other methods
			
			
			Thread.sleep(9000);
		   }

}
