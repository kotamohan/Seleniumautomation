package tests;
import base.BaseTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Log;
public class LoginTest extends BaseTest {
    
    @Test
    public void testValidLogin() throws InterruptedException {
    	
    	Log.info("Starting login test...");
    	
        LoginPage loginPage = new LoginPage(driver);
        Log.info("Adding credentials");
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        Log.info("Verifying page title");
        Assert.assertEquals(driver.getTitle(), "Just a moment...");
    }
}