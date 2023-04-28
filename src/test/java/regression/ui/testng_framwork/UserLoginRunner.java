package regression.ui.testng_framwork;

import com.wikipedya.ApplicationConfig;
import com.wikipedya.DriverFactory;
import com.wikipedya.TestUtility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;

public class UserLoginRunner extends DriverFactory {

       TestUtility testUtility;
       LoginPage loginPage;

       @BeforeClass
       public void setup() {
        browserSetUp(ApplicationConfig.readFromConfigProperties("config.properties", "url"));
        testUtility = new TestUtility(driver);
        loginPage=new LoginPage(driver);


       }

        @Test(description = "part of integration test")
        public void Login(){
           loginPage.userLogin();

        }

       @AfterClass
        public void tearDown() {
        closeBrowser();
    }





}
