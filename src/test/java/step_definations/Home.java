package step_definations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Home  {

    HomePage homePage;

    @When("^I open automationpractice website$")
    public void iOpenAutomationpracticeWebsite() {

        homePage = new HomePage();
    }

    @Then("^I validate title and URL$")
    public void iValidateTitle() throws Throwable {

        assertEquals("My Store", homePage.getTitle());
        assertEquals("http://automationpractice.com/index.php", homePage.getURL());

    }

      @And("^I click on Contact us button$")
       public void i_click_on_Contact_us_buttons() throws Throwable{
        homePage.contact_us.click();
      }
}

