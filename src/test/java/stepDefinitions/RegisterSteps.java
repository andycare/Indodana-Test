package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on the register account page")
    public void i_am_on_the_register_account_page() {
        driver.navigate().to("https://www.cermati.com/app/gabung");
    }

    @When("I input phone no")
    public void i_input_phone_no() {
        WebElement phoneNo = driver.findElement(By.id("mobilePhone"));
        phoneNo.sendKeys("081245789878");
    }

    @And("I input email")
    public void i_input_email() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("uoroboros@gmail.com");
    }

    @And("I input firstname")
    public void i_input_firtname() {
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("tes");
    }

    @And("I input Lastname")
    public void i_input_lastname() {
        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("data");
    }

    @And("I click daftar")
    public void i_click_daftar() {
        WebElement daftarButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/button"));
        daftarButton.click();
    }

    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
    
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.cermati.com/app/gabung";

        Assert.assertEquals("The URL did not match the expected value.", expectedUrl, currentUrl);
    }

}
