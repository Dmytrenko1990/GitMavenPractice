package StepDefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Login {
    WebDriver driver = new FirefoxDriver();
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
       driver.manage().window().maximize();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("admin");
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        passwordTextBox.sendKeys("Hum@nhrm123");
    }
    @When("click on login button")
    public void click_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        System.out.println("User logged in");
    }

}
