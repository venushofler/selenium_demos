package test_hulu_main_page;

import org.testng.annotations.Test;
import page_main.Login;


public class HuluLogin extends BaseTestHulu {
	
	  @Test(priority = 1, description = "accountLogin")
	  public void accountLogin() throws InterruptedException{
		  
		  objlogin = new Login(driver);
		  objlogin.huluLogin();
	  
	  }
	   

}
