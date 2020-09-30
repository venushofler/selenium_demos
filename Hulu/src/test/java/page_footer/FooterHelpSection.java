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


public class FooterHelpSection {
	
	WebDriver driver;
	
	By huluFooter = By.xpath("//footer[@id='FooterLg']");
	By acctBillingLink = By.xpath("//a[contains(text(),'Account & Billing')]");
	By plansPricingLink = By.xpath("//a[contains(text(),'Plans & Pricing')]");
	By supportedDevicesLink = By.xpath("//a[contains(text(),'Supported Devices')]");
	By accessibilityLink = By.xpath("//a[contains(text(),'Accessibility')]");
	
	public FooterHelpSection (WebDriver driver) {
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
	 
	 public void clickAcctBillingLink() {
		 driver.findElement(acctBillingLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickPlansPricingLink() {
		 driver.findElement(plansPricingLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickSupportedDevicesLink() {
		 driver.findElement(supportedDevicesLink).click();
		 driver.navigate().back();
	   }
	 
	 public void clickAccessibilityLink() {
		 driver.findElement(accessibilityLink).click();
		 driver.navigate().back();
	   }
	 

	 
	 
	 
	 
	 // --- main method called ---

	 public void scroll2Footer() throws InterruptedException {
			this.verifyHuluFooter();
			Thread.sleep(2000);
			this.scrollToFooter();
			Thread.sleep(2000);
			this.clickAcctBillingLink();
			Thread.sleep(2000);
			this.clickPlansPricingLink();
			Thread.sleep(2000);
			this.clickSupportedDevicesLink();
			Thread.sleep(2000);
			this.clickAccessibilityLink();	
			Thread.sleep(9000);
		   }
	 
	 public void column5() throws InterruptedException {
			// column5:
			this.clickAcctBillingLink();
			Thread.sleep(2000);
			this.clickPlansPricingLink();
			Thread.sleep(2000);
			this.clickSupportedDevicesLink();
			Thread.sleep(2000);
			this.clickAccessibilityLink();
			Thread.sleep(9000);
		   }
	 
}
