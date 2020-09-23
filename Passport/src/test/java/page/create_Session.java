package page;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class create_Session {
	
	// ----------- POM Page Object model -----------------------------
	WebDriver driver = null;
	
	By getstarted = By.xpath("//a[@id='registerBtn']");
	By changeNumberBtn = By.xpath("//button[@id='changeBtn']");
	By pinInput = By.xpath("//input[@id='pin']");
	By signInBtn = By.xpath("//button[@id='loginBtn']");
	By acceptBtn = By.xpath("//*[@id='acceptTermsConditionsBtn']");
	By phoneNumInputField = By.xpath("//*[@id='regPhoneNo']");
	By callMeBtn = By.xpath("//*[@id='verify_call']");
	By yesBtn = By.xpath("//*[@id='verify']/div[4]/div/div[2]/button[1]//*[contains(text(), 'Yes')]");
	By ThreeDigitCode = By.xpath("//*[@id='verificationCode']");
	By verifyBtn = By.xpath("//*[@id='verifyCode']");
	By okBtn = By.xpath("//*[@id='mobileVerification']/div[4]/div/div[2]/button");
	By viewportOverlay = By.xpath("//*[@id='helpOverLayIdentifier']/div[2]//*[contains(text(), 'and discount your parking')]");
	By zoneNumber = By.xpath("//*[@id='zoneNumber']");
	By continueBtn = By.xpath("//*[@id='zoneNext']");
	By spaceNumber = By.xpath("//*[@id='spaceNumber']");
	By nextBtn = By.xpath("//*[@id='spaceNext']");
	By chooseStayBtn = By.xpath("//*[@id='lengthOfStayContent']//*[contains(text(), 'Choose Stay')]");
	By nextBtn2 = By.xpath("//*[@id='pickerNext']");
	By venusCard = By.xpath("//*[@id='creditCards']/div[4]/div/button//*[contains(text(), 'Venus')]");
	By confirm_YesBtn = By.xpath("//*[@id='creditCards']/div[6]/div/div[2]/button[1]/span//*[contains(text(), 'Yes')]");

	
	String pin = "6767";
	String phoneNum = "555-000-0012";
	String threeDigitCode = "777";
	String zoneNum = "6100";
	String spaceNum = "1";
	
	
	public create_Session (WebDriver driver) {
		this.driver = driver;
	}
	
   //--------------- Elements and Methods  -------------------------------
	
	 public void verifyGetStartedBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(getstarted)
	  		    
				));
	   }
	 
	
	 
	 public void verify_ChangeNumberBtn_Exist() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(changeNumberBtn)
	  		    
				)); 
	   }
	 
	 public void verify_PhoneNum_Field() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(phoneNumInputField)
	  		    
				)); 
	   }
	 
	 public void verify_YesBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(yesBtn)
	  		    
				)); 
	   }
	 
	 public void verify_Three_Digit_Code() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(ThreeDigitCode)
	  		    
				)); 
	   }
	 
	 public void verify_OkBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(okBtn)
	  		    
				)); 
	   }
	 
	 public void verify_ViewPort_Overlay() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(viewportOverlay)
	  		    
				)); 
	   }
	 
	 public void verify_Space_Number() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(spaceNumber)
	  		    
				)); 
	   }

	 public void verify_ZoneNumber() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(zoneNumber)
	  		    
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
	 
	 public void verify_Duration_NextBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(nextBtn2)
	  		    
				)); 
	   }
	 
	 public void verify_Venus_Card() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(venusCard)
	  		    
				)); 
	   }
	 
	 public void verify_Confirm_YesBtn() {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
		         .pollingEvery(Duration.ofMillis(600))
		         .ignoring(NoSuchElementException.class);
					
		wait.until(ExpectedConditions.or(
	  		    ExpectedConditions.elementToBeClickable(confirm_YesBtn)
	  		    
				)); 
	   }

	public void clickGetStarted() {
		
		driver.findElement(getstarted).click();
	}
	
	public void clickAcceptBtn() {
		driver.findElement(acceptBtn).click();
	}
	
	public void clickCallMeBtn() {
		driver.findElement(callMeBtn).click();
	}
	
	public void clickYesBtn() {
		driver.findElement(yesBtn).click();
	}
	
	public void clickVerifyBtn() {
		driver.findElement(verifyBtn).click();
	}
	
	public void clickOkBtn() {
		driver.findElement(okBtn).click();
	}
	
	public void click_ViewPortOverlay() {
		
		WebElement overlaywords = driver.findElement(By.xpath("//*[@id=\"helpOverLayIdentifier\"]/div[2]//*[contains(text(), 'and discount your parking')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", overlaywords);
		
		//driver.findElement(viewportOverlay).click();
	}
	
	public void click_ChooseStayBtn() {
		driver.findElement(chooseStayBtn).click();
	}
	
	public void click_VenusCard() {
		driver.findElement(venusCard).click();
	}
	
	public void click_Space_Next_Btn() {
		driver.findElement(venusCard).click();
	}
	
	
	
	

	public void click_PhoneNum_SendKeys() {
		driver.findElement(phoneNumInputField).click();
		driver.findElement(phoneNumInputField).sendKeys(Keys.CONTROL + "a");
		driver.findElement(phoneNumInputField).clear();
		driver.findElement(phoneNumInputField).sendKeys(phoneNum);
	}
	
	public void click_PinInputField_SendKeys() {
		driver.findElement(pinInput).click();
		driver.findElement(pinInput).sendKeys(Keys.CONTROL + "a");
		driver.findElement(pinInput).clear();
		driver.findElement(pinInput).sendKeys(pin);
	}
	
	public void click_ThreeDigitCode_SendKeys() {
		driver.findElement(ThreeDigitCode).click();
		driver.findElement(ThreeDigitCode).sendKeys(Keys.CONTROL + "a");
		driver.findElement(ThreeDigitCode).clear();
		driver.findElement(ThreeDigitCode).sendKeys(threeDigitCode);
	}
	
	public void click_ZoneInput_SendKeys() throws InterruptedException {
		driver.findElement(zoneNumber).click();
		driver.findElement(zoneNumber).sendKeys(Keys.CONTROL + "a");
		driver.findElement(zoneNumber).clear();
		Thread.sleep(2000);
		driver.findElement(zoneNumber).sendKeys(zoneNum);
	}
	
	public void click_SpaceNumber_SendKeys() {
		driver.findElement(spaceNumber).click();
		driver.findElement(spaceNumber).sendKeys(Keys.CONTROL + "a");
		driver.findElement(spaceNumber).clear();
		driver.findElement(spaceNumber).sendKeys(spaceNum);
	}
	
	public void clickSignInBtn() {
		driver.findElement(signInBtn).click();

	}
	
	public void clickContinueBtn() {
		driver.findElement(continueBtn).click();

	}
	
	public void clickNextBtn() {
		driver.findElement(nextBtn).click();

	}
	
	public void click_Duration_NextBtn() {
		driver.findElement(nextBtn2).click();

	}
	
	public void click_Confirm_YesBtn() {
		driver.findElement(confirm_YesBtn).click();

	}
	
	

	//-------------------- Functions Called --------------------
	
	public void Create_Session () throws InterruptedException {
		this.verifyGetStartedBtn();
		this.clickGetStarted();
		
		this.clickAcceptBtn();
		
		this.verify_PhoneNum_Field();
		this.click_PhoneNum_SendKeys();
		this.clickCallMeBtn();
		
  		this.verify_YesBtn();
  		this.clickYesBtn(); 
  		
  		this.verify_Three_Digit_Code();
  		this.click_ThreeDigitCode_SendKeys();
  		this.clickVerifyBtn();
  		
		Thread.sleep(2000);
		this.clickOkBtn();
		Thread.sleep(2000);
		
		
  		this.verify_ChangeNumberBtn_Exist();
  		this.click_PinInputField_SendKeys();
  		this.clickSignInBtn();
  		
		this.verify_ZoneNumber();
		this.click_ZoneInput_SendKeys();
		this.clickContinueBtn();
		
		this.verify_Space_Number();
		this.click_SpaceNumber_SendKeys();
		Thread.sleep(1000);
		
		this.clickNextBtn();
		
		this.verify_Choose_StayBtn();
		this.click_ChooseStayBtn();
		
		this.verify_Duration_NextBtn();
		this.click_Duration_NextBtn();
		
		this.verify_Venus_Card();
		this.click_VenusCard();
		
		this.verify_Confirm_YesBtn(); 
		this. click_Confirm_YesBtn();
		Thread.sleep(1000);
		
  		this.verify_ViewPort_Overlay();
		Thread.sleep(3000);
		this.click_ViewPortOverlay();
		Thread.sleep(3000);
	}
	

}
