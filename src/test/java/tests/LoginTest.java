package tests;
import base.BaseTest;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTest extends BaseTest {
    
    @Test
    public void testValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        Assert.assertEquals(driver.getTitle(), "Just a moment...");
    }
}