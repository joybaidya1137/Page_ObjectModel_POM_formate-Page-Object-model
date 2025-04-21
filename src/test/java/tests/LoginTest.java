package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {


    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("joy2111121@gmail.com", "87654112");

       // String expectedUrl = "https://labsqajobs.qaharbor.com/account/";
     //   String actualUrl = driver.getCurrentUrl();
       // Assert.assertEquals(actualUrl, expectedUrl, "Login in failed!");
    }
}