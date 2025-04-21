package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/");
    }

    @AfterSuite
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
