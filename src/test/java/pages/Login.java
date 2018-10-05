package pages;

import cucumber.api.java.en_old.Ac;
import cucumber.api.java.gl.E;
import gherkin.lexer.Th;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

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

    @FindBy(xpath = "//*[@id='credit2']")
    WebElement target1;

    @FindBy(xpath = "//*[@id='bank']")
    WebElement drop1;

    @FindBy(xpath = "//*[@id='fourth']")
    WebElement target2;

    @FindBy(xpath = "//*[@data-id='6']")
    WebElement target3;

    @FindBy(xpath = "//*[@id='amt7']")
    WebElement drop2;

    @FindBy(xpath = "//*[@id='loan']")
    WebElement drop3;

    @FindBy(xpath = "//*[@id='amt8']")
    WebElement drop4;


    //   @FindBy(xpath = "//*[@class=\"a-row a-size-base-plus cvf-text-truncate\"]")
    // WebElement accountclick;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;

    @FindBy(id = "sort")
    WebElement sort;

    @FindBy(xpath = "//*[@value='price-desc-rank']")
    WebElement hightolowselect;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement searchsubmit;

    @FindBy(xpath = "//*[contains(@href,'Music-Computing-MCLCDTTV8410')]/h2")
    WebElement extv;

    @FindBy(xpath = "//*[@id='a-autoid-5-announce']")
    WebElement smallestinches;

    @FindBy(xpath = "//*[@id='a-autoid-10-announce']")
    WebElement twotouchselection;

    @FindBy(id = "add-to-cart-button")
    WebElement addtocartbutton;

    @FindBy(id = "hlb-ptc-btn-native")
    WebElement proceedtocheckout;

    @FindBy(xpath = "//*[@class='quantity-delete-button a-size-mini a-declarative']")
    WebElement deleteproduct;

    @FindBy(xpath = "//*[@class='a-declarative change-quantity-button a-size-mini']")
    WebElement qtychangebtn;

    @FindBy(xpath = "//*[@class='sc-empty-cart sc-java-remote-feature']")
    WebElement emptyCart;

    @FindBy(xpath = "//*[@data-attribute='Sony XBR75X940E 75-Inch 4K HDR Ultra HD TV (2017 Model)']")
    WebElement secextv;

    @FindBy(xpath = "//*[@class='asin-title']")
    WebElement verifysecondtv;

    @FindBy(xpath = "//*[@data-action='a-popover-close']")
    WebElement closenocoveragepopup;

    @FindBy(xpath = "//*[contains(@href, \'https://www.amazon.ca/5-Year-DOP-Television-Plan-5000-6000/dp/B01BRUC1RQ/ref=psd_si_lm_B01N1VMTBE_B01BRUC1RQ\')]")
    WebElement leaenmorebutton;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void waitForVisibleAndClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        new WebDriverWait(driver,10);
        element.click();
    }

    public void waitForVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickMainSigninButton() {
        mainsigninbutton.click();
    }

    public void credentials() throws Exception {
        enteremail.sendKeys("eswarvemulamanda@gmail.com");
        continuebtn.click();
        enterpwd.sendKeys("eswar3554");
        signinbtn.click();

//        Thread.sleep(1000);
//        continuebtn.click();
    }

    public void shopByDepartment() throws Exception {
        Actions actions = new Actions(driver);
        actions.moveToElement(shopdepartment).build().perform();
        Thread.sleep(200);
        actions.moveToElement(electronicshover).build().perform();
        Thread.sleep(1000);
        allelectronicsclick.click();
        // actions.dragAndDrop(source,destinaiton).build().perform();

    }

    public void setEchoandalexa() throws Exception {
        Actions actions = new Actions(driver);
        mainlogo.click();
        actions.moveToElement(shopdepartment).build().perform();
        Thread.sleep(200);
        actions.moveToElement(echoandalexa).build().perform();
        Thread.sleep(200);
        echo.click();
        mainlogo.click();

    }

    public void dragAndDropTest() throws Exception {
        waitForVisible(driver, target1);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(target1, drop1);
        actions.keyDown(Keys.ENTER).build().perform();



        //       actions.dragAndDropBy(boxone, 50, 50).build().perform();
        actions.dragAndDrop(target2, drop2).build().perform();
        actions.dragAndDrop(target3, drop3).build().perform();
        actions.dragAndDrop(target2, drop4).build().perform();
    }


    public void setHightolowselect() throws Exception {
        searchbox.click();
        searchbox.sendKeys("telivisions");
        searchsubmit.click();
        Thread.sleep(500);
        sort.click();
        hightolowselect.click();
    }

    public void selectProductAndAddToCart() throws Exception {
        waitForVisibleAndClick(driver, extv);
        waitForVisibleAndClick(driver, smallestinches);
        Thread.sleep(2000);
        waitForVisibleAndClick(driver, twotouchselection);
        Thread.sleep(2000);
        waitForVisibleAndClick(driver, addtocartbutton);
        Thread.sleep(2000);
        waitForVisibleAndClick(driver, searchbox);
        searchbox.clear();
//        searchbox.click();
        searchbox.sendKeys("telivisions");
        searchsubmit.click();
        Thread.sleep(500);
        sort.click();
        hightolowselect.click();
        waitForVisibleAndClick(driver, secextv);
        waitForVisibleAndClick(driver, addtocartbutton);
        Thread.sleep(3000);
//        String parent= driver.getWindowHandle();
//        waitForVisibleAndClick(driver, leaenmorebutton);
//        driver.switchTo().window(child);
        waitForVisibleAndClick(driver, closenocoveragepopup);
//        waitForVisibleAndClick(driver, addtocartbutton);
        waitForVisibleAndClick(driver, proceedtocheckout);
    }

    public void setDeleteproduct() throws Exception {
        waitForVisibleAndClick(driver, qtychangebtn);
        waitForVisibleAndClick(driver, deleteproduct);
    }

    public String getEmptyCartMessage(){
        waitForVisible(driver,emptyCart);
        return emptyCart.getText().trim();
    }

    public String verifySecondProduct(){
        waitForVisible(driver, verifysecondtv);
        return verifysecondtv.getText().trim();
    }

}
