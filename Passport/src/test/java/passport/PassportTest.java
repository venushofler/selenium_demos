package passport;

import org.testng.annotations.Test;
import page.create_Session;
import page.extend_Session;
import page.stop_Session;


public class PassportTest extends BaseTest {
 
	  @Test(priority = 1, description = "Customer Created Session.")
	  public void create_Session() throws InterruptedException{
	  objCreateSession = new create_Session(driver);
	  objCreateSession.Create_Session();
	  
	  }
	   
	  @Test(priority = 2, description = "Customer Extends Session.")
	  public void extending_Session() throws InterruptedException{
	  objExtendSession = new extend_Session(driver);
	  objExtendSession.extending_Session();
	  }
	  
	  @Test(priority = 3, description = "Customer Stops Session.")
	  public void stoping_Session() throws InterruptedException{
	  objStopSession = new stop_Session(driver);
	  objStopSession .stoping_Session();
	  
	  }
	  
	  


	

	}
