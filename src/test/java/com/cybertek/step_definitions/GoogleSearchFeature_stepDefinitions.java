package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchFeature_stepDefinitions {
GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
       String url= ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);
    }




    @When("User searches for apple")
    public void user_searches_for_apple() {
googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("User should see apple in the tile")
    public void user_should_see_apple_in_the_tile() {


        String actualTitle=Driver.getDriver().getTitle();
        String expectedInTitle="apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }









}
