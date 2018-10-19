package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class signupstepdefs {

    WebDriver driver;

    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\IdeaProjects\\Free2\\src\\test\\resources\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.freecrm.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^I click sign up$")
    public void iClickSignUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[2]/a/font")).click();

    }

    @And("^I select free edition from the drop down$")
    public void iSelectFreeEditionFromTheDropDown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Select droplist = new Select(driver.findElement(By.xpath("//select[@size='1']")));
        droplist.selectByVisibleText("Free Edition");

    }

    @And("^I enter first name$")
    public void iEnterFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jo");
    }

    @And("^I enter last name$")
    public void iEnterLastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("ming");
    }

    @And("^I enter email$")
    public void iEnterEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mingelj@yahoo.com");
    }

    @And("^I enter confirm email$")
    public void iEnterConfirmEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Confirm Email']")).sendKeys("mingelj@yahoo.com");
    }

    @And("^I enter username$")
    public void iEnterUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mingelj");
    }

    @And("^I enter password$")
    public void iEnterPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kayodelem11");
    }

    @And("^I enter confirm password$")
    public void iEnterConfirmPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Kayodelem11");
    }

    @And("^i tick i agree to terms and conditions$")
    public void iTickIAgreeToTermsAndConditions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    @Then("^I am registered$")
    public void iAmRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^I click the submit button$")
    public void iClickTheSubmitButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//div[@class='myButton']")).click();
    }

    @And("^I enter the company name$")
    public void iEnterTheCompanyName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys("jmingltd");
    }

    @And("^I enter the phone number$")
    public void iEnterThePhoneNumber() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("02086754321");
    }

    @And("^I enter the fax$")
    public void iEnterTheFax() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@placeholder='Fax']")).sendKeys("02036859072");
    }

    @And("^I enter the company website$")
    public void iEnterTheCompanyWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("www.jmingltd.co.uk");
    }

    @And("^I enter the company Email,$")
    public void iEnterTheCompanyEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email']")).sendKeys("jo.ming@jmingltd.co.uk");
    }

    @And("^I enter Description$")
    public void iEnterDescription() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//textarea[@rows='3' and @cols='10' and @id='service']")).sendKeys("shipping and moving company");
    }

    @And("^I enter address$")
    public void iEnterAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("15,bright st,lm5 1ex");
    }

    @And("^I enter city$")
    public void iEnterCity() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("London");
    }

    @And("^I enter state/province$")
    public void iEnterStateProvince() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@placeholder='State/Province']")).sendKeys("London");
    }

    @And("^I enter zip/postal code$")
    public void iEnterZipPostalCode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("+44");
    }

    @And("^I choose country$")
    public void iChooseCountry() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Select droplist = new Select(driver.findElement(By.xpath("//select[@size='1']")));droplist.selectByVisibleText("United Kingdom");
    }

    @And("^I tick this is also the billing address$")
    public void iTickThisIsAlsoTheBillingAddress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//input[@value='checked']")).click();
    }

    @And("^I click continue$")
    public void iClickContinue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
    }
}
