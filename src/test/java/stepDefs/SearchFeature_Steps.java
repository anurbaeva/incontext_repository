package stepDefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.Config;
import utilities.Driver;

import java.util.ArrayList;


public class SearchFeature_Steps {

    HomePage homePage = new HomePage();
    WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(driver);
    String link ;
    ArrayList<String> tabs;

    @Given("user on the main page")
    public void user_on_the_main_page() {

        driver.get(Config.getProperty("url"));

    }


    @Then("user should see confirmation cookie pop up window")
    public void user_should_see_confirmation_cookie_pop_up_window() {

        Assert.assertTrue(homePage.cookiePopUp.isDisplayed());

    }

    @Then("user should decline it")
    public void user_should_decline_it() {

        Assert.assertTrue(homePage.cookiePopUp.isDisplayed());
        homePage.cookieDeclineButton.click();

    }

    @When("user click on the search button")
    public void user_click_on_the_search_button() {

        homePage.searchButton.click();
    }

    @When("user search for \\\"([^\\\"]*)\\\"")
    public void user_search_for(String string) {

        homePage.searchField.sendKeys("Challenge");


    }

    @When("user should see auto suggested result items")
    public void user_should_see_auto_suggested_result_items() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 6);
        webDriverWait.until(ExpectedConditions.visibilityOf(homePage.firstAutoSuggestedResult));

        link = homePage.firstAutoSuggestedResult.getAttribute("href");


    }

    @Then("user should be able to open first auto suggested item in the new tab")
    public void user_should_be_able_to_open_first_auto_suggested_item_in_the_new_tab() throws InterruptedException {

       //actions.contextClick(homePage.firstAutoSuggestedResult).perform();
        //actions.moveToElement(homePage.firstAutoSuggestedResult).sendKeys("t" + Keys.COMMAND);
        //homePage.firstAutoSuggestedResult.sendKeys(Keys.COMMAND + "t");
        //homePage.firstAutoSuggestedResult.sendKeys(Keys.chord(Keys.COMMAND, "t"));
        //Thread.sleep(3000);
        //actions.moveByOffset(600, 203).click().build().perform();
        //actions.sendKeys(Keys.chord(Keys.CONTROL, "t"));

//        String select = Keys.chord(Keys.COMMAND, Keys.RETURN);
//        String link = homePage.firstAutoSuggestedResult.getAttribute("href");
//        driver.findElement(By.linkText(link)).sendKeys(select);

      //   actions.keyDown(Keys.SHIFT).click(homePage.firstAutoSuggestedResult).keyUp(Keys.SHIFT).build().perform();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open()");
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(link);

    }

    @Then("user should able to go back to the first tab")
    public void user_should_able_to_go_back_to_the_first_tab() throws InterruptedException {

        //Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));
    }

    @Then("user should be able to see results after pressing enter")
    public void user_should_be_able_to_see_results_after_pressing_enter() throws InterruptedException {

        //Thread.sleep(3000);
        homePage.searchField.sendKeys(Keys.ENTER);
    }

    @Then("user should open first result in the new tab")
    public void user_should_open_first_result_in_the_new_tab() throws InterruptedException {

        //Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open()");
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        driver.get(link);
    }


    @Then("user should able to go back to the parent tab")
    public void user_should_able_to_go_back_to_the_parent_tab() throws InterruptedException {

       // Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));

    }


    @Then("user searches for \\\"([^\\\"]*)\\\"")
    public void user_searches_for(String string) {

        homePage.searchField.clear();
        homePage.searchField.sendKeys("mixed reality" + Keys.ENTER);

    }

    @Then("user should open first item in the current tab")
    public void user_should_open_first_item_in_the_current_tab() throws InterruptedException {

        homePage.AutoSuggestedMixedReality.click();

    }

    @Then("user verify the title of the page")
    public void user_verify_the_title_of_the_page() {

       Assert.assertTrue(driver.getTitle().contains("Mixed Reality"));

    }



}
