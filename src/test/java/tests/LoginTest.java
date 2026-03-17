package tests;
import base.BaseTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;
public class LoginTest extends BaseTest {
    
    @Test
    public void testValidLogin() throws InterruptedException {
    	
    	Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test - ");

		test.info("Navigating to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials");
		test.info("Adding Credentails");
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");

		test.pass("Login Successful");
    }
    
    @Test
    public void testValidLoginWithInvalidCredentials() throws InterruptedException {
    	
    	Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test - ");

		test.info("Navigating to URL");
		LoginPage loginPage = new LoginPage(driver);

		Log.info("Adding credentials");
		test.info("Adding Credentails");
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin1");
        loginPage.clickLogin();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Log.info("Verifying page title");
		test.info("Verifying page title");
		Assert.assertEquals(driver.getTitle(), "Just a moment...84");

		test.pass("Login Successful");
    }
}