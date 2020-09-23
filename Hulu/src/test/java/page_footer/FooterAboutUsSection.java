package page_footer;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class FooterAboutUsSection {
	
	WebDriver driver;
	
	By huluFooter = By.xpath("//footer[@id='FooterLg']");
	By streamingLibLink = By.xpath("//a[contains(text(),'Streaming Library')]");
	By liveTVLink = By.xpath("//div[@class='footer-section-container col-lg-8 col-md-12 footer-section-container-single col-xs-12']//div[@class='footer-row-expandable footer-row-collapsed']//div[1]//a[2]");
	By liveNewsLink = By.xpath("//a[contains(text(),'Live News')]");
	By liveSportsLink = By.xpath("//a[contains(text(),'Live Sports')]");
	
	public FooterAboutUsSection (WebDriver driver) {
		this.driver = driver;
	}
	
   //--------------- Elements and Methods  -------------------------------
	
	 public void verifyHuluFooter() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(huluFooter)
	  		    
				));
	   }
	
	 public void scrollToFooter() throws InterruptedException {
		 WebElement element = driver.findElement(By.xpath("//div[@class='jsx-4066518690 footer--row footer--site-links']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
	   }
	 
	 public void clickStreamingLibrary() {
		 driver.findElement(streamingLibLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveTVLink() {
		 driver.findElement(liveTVLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveNewsLink() {
		 driver.findElement(liveNewsLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickLiveSportsLink() {
		 driver.findElement(liveSportsLink).click();
		 driver.navigate().back();
	   }
	 

	 
	 
	 
	 
	 // --- main method called ---

	 public void scroll2Footer() throws InterruptedException {
			this.verifyHuluFooter();
			Thread.sleep(2000);
			this.scrollToFooter();
			Thread.sleep(2000);
			this.clickStreamingLibrary();
			Thread.sleep(2000);
			this.clickLiveTVLink();
			Thread.sleep(2000);
			this.clickLiveNewsLink();
			Thread.sleep(2000);
			this.clickLiveSportsLink();	
			Thread.sleep(9000);
		   }
	 
}
