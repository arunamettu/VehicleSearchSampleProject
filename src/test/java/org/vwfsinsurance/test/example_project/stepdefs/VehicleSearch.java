package org.vwfsinsurance.test.example_project.stepdefs;

 
import org.vwfsinsurance.test.example_project.tests.TestVWFS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class VehicleSearch
{

@Given("^I am on vehicle search page$")
public void i_am_on_vehicle_search_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    TestVWFS.driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
}

@Given("^I enter \"([^\"]*)\" as vehicle registration number$")          
public void i_enter_as_vehicle_registration_number(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    TestVWFS.driver.findElement(By.id("vehicleReg")).sendKeys(arg1);
}

@When("^I click the search button$")
public void i_click_the_search_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	TestVWFS.driver.findElement(By.name("btnfind")).click();
	Thread.sleep(5000);
}

@Then("^I validate if Result grid is displayed$")
public void i_validate_if_Result_grid_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement CoverStartresult = TestVWFS.driver.findElement(By.xpath("//div[contains(text(),'Cover start')]"));
	WebElement CoverEndresult = TestVWFS.driver.findElement(By.xpath("//div[contains(text(),'Cover end')]"));
	System.out.println("Result grid is displayed with Cover start and End Dates");
	
}
@Given("^I validate if title is \"([^\"]*)\"$")
public void i_validate_if_title_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String title = "//title[contains(text(),'" + arg1 + "')]";
	System.out.println(TestVWFS.driver.findElement(By.xpath(title)));
}

@Given("^I validate if \"([^\"]*)\" heading is displayed$")
public void i_validate_if_heading_is_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(TestVWFS.driver.findElement(By.id("dlg-dealersearch-title")).getText());
	//TestVWFS.driver.quit();
}

@Then("^I validate if \"([^\"]*)\" message is displayed$")
public void i_validate_if_message_is_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String errorMsg = "'" + arg1 + "')]";
	String xPath = "//div[contains(text(),"+ errorMsg;
	TestVWFS.driver.findElement(By.xpath(xPath));
	//TestVWFS.driver.quit();
}

}