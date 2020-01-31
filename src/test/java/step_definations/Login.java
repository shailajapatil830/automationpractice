package step_definations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class Login {

    LoginPage loginPage;

    @When("^I open automationpractice website for login$")
    public void iOpenAutomationpracticeWebsite() {
        loginPage = new LoginPage();
        loginPage.loadLoginPage();
    }

    @When("^I click on Sign in button$")
    public void iClickOnSigninButton() {

        loginPage.signin_button.click();
    }

    @And("^I provide email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iProvideEmailEmailAndPasswordPassword(String email, String password) {

        loginPage.clickLogin(email, password);

    }
}
