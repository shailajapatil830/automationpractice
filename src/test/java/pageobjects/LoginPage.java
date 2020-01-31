package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public WebElement signin_link;

    @FindBy(how= How.ID, using="email")
    public WebElement email;

    @FindBy(how=How.ID, using="passwd")
    public WebElement password;

    @FindBy(how=How.ID, using="SubmitLogin")
    public WebElement signin_button;


    @FindBy(how=How.ID, using="email_create")
    public WebElement email_create;

    @FindBy(how=How.ID, using="SubmitCreate")
    public WebElement submit_create;

    @FindBy(how=How.CSS, using ="#login_form > div > p.lost_password.form-group > a")
    public WebElement forgot_password;

    public void loadLoginPage() {

        signin_link = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
        signin_link.click();
        PageFactory.initElements(driver, this);
    }

    public void clickLogin(String username, String pwd) {
        email.sendKeys(username);
        password.sendKeys(pwd);
        signin_button.click();
    }

}
