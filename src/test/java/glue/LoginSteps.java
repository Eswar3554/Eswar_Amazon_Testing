package glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class LoginSteps {

    WebDriver driver;
    Login login = new Login(driver);

    @Before
    public void browserLaunch() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        login = new Login(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Client launches to the Amazon home page")
    public void homePage() {
        driver.get("https://www.amazon.ca/");
        driver.manage().window().maximize();
        login.clickMainSigninButton();
    }

    @When("Client enters the credentials")
    public void accountClick() throws Exception {
        login.credentials();
    }

//    @Then("Client CLicks the search box and enters the word electronics")
//    public void searchAndClick(){
//        login.clickSearchBox();
//    }

    @Then("Navigate to all electronics tab")
    public void allelectronicstab() throws Exception {
        login.shopByDepartment();
    }

    @Then("Navigate to echo and alexa tab")
    public void echoAndAlexaTab() throws Exception{
        login.setEchoandalexa();
    }
}
