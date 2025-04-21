package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import utils.BaseTest;

public class SignUpTest extends BaseTest {

    @Test
        public void testValidSignUp(){
            SignUpPage SignUpPage = new SignUpPage();
            SignUpPage.signup("joy1234567", "joy2111121@gmail.com", "87654112","87654112");

       // String expectedUrl = "https://labsqajobs.qaharbor.com/candidate-registration/?status=success";
       // String actualUrl = driver.getCurrentUrl();
       // System.out.println("Actual URL: " + actualUrl);

      // Assert.assertEquals(actualUrl, expectedUrl, "Registration failed!");
    }

}
