package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.DriverManager;


public class SignUpPage {
    private WebDriver driver;

    public SignUpPage() {
        this.driver = DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/candidate-registration/");
    }

    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys(username);
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='conf-pass']"));
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'REGISTER NOW')]"));
        button.click();
    }

    public void signup(String username, String email, String password, String confirmPassword) {
        enterUsername(username);
        enterEmail(email);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        clickRegisterButton();
    }
}


