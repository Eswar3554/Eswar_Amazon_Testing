package pages;

import cucumber.api.java.gl.E;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {

    WebDriver driver;

    @FindBy(id = "nav-link-yourAccount")
    WebElement mainsigninbutton;

    @FindBy(id = "ap_email")
    WebElement enteremail;

    @FindBy(id = "continue")
    WebElement continuebtn;

    @FindBy(id = "ap_password")
    WebElement enterpwd;

    @FindBy(id = "signInSubmit")
    WebElement signinbtn;

    @FindBy(id = "nav-link-shopall")
    WebElement shopdepartment;

    @FindBy(xpath = "//*[@data-nav-panelkey='ElectronicsPanel']")
    WebElement electronicshover;

    @FindBy(xpath = "//*[contains(@href,'ref=nav_shopall_mj_all_electronics')]")
    WebElement allelectronicsclick;

    @FindBy(xpath = "//*[@class='nav-logo-link']")
    WebElement mainlogo;

    @FindBy(xpath = "//*[@data-nav-panelkey='AuccPanel']")
    WebElement echoandalexa;

    @FindBy(xpath = "//*[contains(@href,'ref=nav_shopall_k_ods_ha_rr')]")
    WebElement echo;


 //   @FindBy(xpath = "//*[@class=\"a-row a-size-base-plus cvf-text-truncate\"]")
   // WebElement accountclick;

    //@FindBy(id = "twotabsearchtextbox")
    //WebElement searchbox;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickMainSigninButton(){
        mainsigninbutton.click();
    }

    public void credentials() throws Exception{
        enteremail.sendKeys("eswarvemulamanda@gmail.com");
        continuebtn.click();
        enterpwd.sendKeys("eswar3554");
        signinbtn.click();

//        Thread.sleep(1000);
//        continuebtn.click();
    }

    public void shopByDepartment() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(shopdepartment).build().perform();
        Thread.sleep (200);
        actions.moveToElement(electronicshover).build().perform();
        Thread.sleep (1000);
        allelectronicsclick.click();
       // actions.dragAndDrop(source,destinaiton).build().perform();

    }

    public void setEchoandalexa() throws Exception{
        Actions actions = new Actions(driver);
        mainlogo.click();
        actions.moveToElement(shopdepartment).build().perform();
        Thread.sleep(200);
        actions.moveToElement(echoandalexa).build().perform();
        Thread.sleep(200);
        echo.click();
        mainlogo.click();

    }
}
