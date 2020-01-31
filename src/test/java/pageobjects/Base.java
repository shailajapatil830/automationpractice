package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver driver;

    public Base() {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

}
