package regression.cucumbertest.cucumber_framworksteps;

import com.wikipedya.ApplicationConfig;
import com.wikipedya.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class MyStepdefs extends DriverFactory {

    LoginPage loginPage;
    String configFile="config.properties";

    @Before("@LoginTest")
    public void setUp() {
        browserSetUp(ApplicationConfig.readFromConfigProperties
                (configFile,"url"));}

    @Given("user already on the login page")
    public void userAlreadyOnTheLoginPage() {
            loginPage= new LoginPage(driver);

        }


    @When("user enter valid username and valid password to click on login button")
    public void userEnterValidUsernameAndValidPasswordToClickOnLoginButton() {
        loginPage.userLogin();

        }

        @After("@Logintest")
        public void tearDown() {
            closeBrowser();
        }

    }




