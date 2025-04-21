package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.DriverManager;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/login/");
    }



     public void setUsernameField(String email1) {
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='email']"));
        userNameField.sendKeys(email1);
        System.out.println("email1 field input");
    }

    public void setPasswordField(String password) {
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys(password);
        System.out.println("Password field input");
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
        System.out.println("Login button clicked");
    }

    public void login(String email1, String password) {
        setUsernameField(email1);
        setPasswordField(password);
        clickLoginButton();
    }
}

