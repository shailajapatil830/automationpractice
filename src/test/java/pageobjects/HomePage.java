package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    @FindBy(how= How.CSS, using ="#contact-link > a")
    public WebElement contact_us;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

}
