package page;

import com.wikipedya.ApplicationConfig;
import com.wikipedya.DriverFactory;
import com.wikipedya.TestUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DriverFactory {

    WebDriver driver;
    TestUtility testUtility;


   /* @BeforeMethod
    public void setUp() {
        // Initialize the WebDriver instance
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginTest() {
        // Navigate to the login page
        driver.get("https://tr.wikipedia.org/wiki/Anasayfa");

        // Click on  login button

        driver.findElement(By.cssSelector(" a[title='Oturum açmanız tavsiye edilmektedir; ancak bu zorunlu " +
                "değildir [alt-shift-o]'] > span")).click();

        // Enter valid login credentials
        driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("AZIGULIMAIHEMUTI");
        driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("hbdca6tl3p");

        // Click the login button
        driver.findElement(By.cssSelector("button#wpLoginAttempt[type='submit']")).click();


    }*/

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        testUtility = new TestUtility(driver);
    }

        @FindBy(css="a[title='Oturum açmanız tavsiye edilmektedir; ancak bu zorunlu \" +\n" +
                " \"değildir [alt-shift-o]'] > span")
        WebElement loginField;

        @FindBy(xpath = "//input[@id='wpName1']")
        WebElement usernameField;

        @FindBy(xpath = "//input[@id='wpPassword1']")
        WebElement passwordField;

        @FindBy(css = "button#wpLoginAttempt[type='submit']")
         WebElement loginButton;

        public void userLogin() {

            testUtility.waitForElementPresent(loginField);
            loginField.click();
            testUtility.waitForElementPresent(usernameField);
            usernameField.sendKeys(ApplicationConfig.readFromConfigProperties("Config.properties","username"));
            testUtility.waitForElementPresent(passwordField);
            passwordField.sendKeys(ApplicationConfig.readFromConfigProperties("Config.properties","passWord"));
            testUtility.waitForElementPresent(loginButton);
            loginButton.click();
        }


}











