package step_definations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCart {
    public static WebDriver driver;

    public ShoppingCart() {
        driver = Hooks.driver;
    }

    @When("^I open automationpractice website$")
    public void iOpenAutomationpracticeWebsite() throws Throwable {

        driver.get("http://www.automationpractice.com");

    }

    @Then("^I validate title and URL$")
    public void iValidateTitle() throws Throwable {
        assertEquals("My Store", driver.getTitle());
        assertEquals("http://automationpractice.com/index.php?", driver.getCurrentUrl());

    }

    @Then("^I am presented with My Account page$")
    public void iAmPresentedWithMyAccountPage() {

    }

    @When("^I provide email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iProvideEmailEmailAndPasswordPassword(String email, String password) {

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/span[1]/input[1]")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.name("SubmitLogin")).click();
    }
}

