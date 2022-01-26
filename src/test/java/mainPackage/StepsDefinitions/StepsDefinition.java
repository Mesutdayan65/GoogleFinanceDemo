package mainPackage.StepsDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mainPackage.Pages.AlphabetClassC;
import mainPackage.Pages.GoogleFinance;
import mainPackage.Pages.GoogleSearch;
import mainPackage.Utils.Driver;
import mainPackage.Utils.configReader;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StepsDefinition {
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
    GoogleSearch googleSearch= new GoogleSearch();
    GoogleFinance googleFinance=new GoogleFinance();
    AlphabetClassC alphabetClassC=new AlphabetClassC();
    //I create the object from Pages (POM).

    @Given("the user wants to navigate to google finance")
    public void the_user_wants_to_navigate_to_google_finance() throws InterruptedException {
        Driver.getDriver().get(configReader.getProperty("url"));
        //I use property file for easy configurations later on
        googleSearch.getSearchButton().sendKeys("google finance");
      wait.until(ExpectedConditions.visibilityOf(googleSearch.getClickButton()));
//         As per the official Selenium documentation it is suggested not to mix
//         both implicit wait and explicit waits. Mixing both wait types might cause unpredictable wait times.
//         So, I used only explicit  waits in framework wherever it is needed in code.
         googleSearch.getClickButton().click();

        googleSearch.getFinanceLink().click();





    }
    @Then("the user wants to get the page for google's shares on stock market")
    public void the_user_wants_to_get_the_page_for_google_s_shares_on_stock_market() {

        googleFinance.getStockSearch().sendKeys("google");
        wait.until(ExpectedConditions.visibilityOf(googleFinance.getAlphabetC()));
        googleFinance.getAlphabetC().click();
        //I call my methods from POM and do necessary actions


    }
    @Then("the user wants to get the data for sep2021")
    public void the_user_wants_to_get_the_data_for_sep2021() throws InterruptedException {
        String titleVerify=Driver.getDriver().getTitle();
        System.out.println("titleVerify = " + titleVerify);
        //I did title verification to make sure that I am at correct page.
        wait.until(ExpectedConditions.visibilityOf(alphabetClassC.getDec2021()));
        alphabetClassC.getSep2021().click();
        alphabetClassC.getQuarterly().click();

        System.out.println("September 2021 " + alphabetClassC.getFinanceTable());
        Assert.assertTrue(alphabetClassC.getFinanceTable().toString().contains("65.12B"));
        // I checked certain information from data table and made assertion.

    }
    @Then("the user wants to get the data for june2021")
    public void the_user_wants_to_get_the_data_for_june2021() {

        alphabetClassC.getQuarterly().click();
        alphabetClassC.getJun2021().click();
        System.out.println("June 2021 " + alphabetClassC.getFinanceTable());
        Assert.assertTrue(alphabetClassC.getFinanceTable().toString().contains("61.88B"));
    }
    @Then("the user wants to get the data for mar2021")
    public void the_user_wants_to_get_the_data_for_mar2021() {
        alphabetClassC.getQuarterly().click();
        alphabetClassC.getMar2021().click();
        System.out.println("March 2021 " + alphabetClassC.getFinanceTable());
        Assert.assertTrue(alphabetClassC.getFinanceTable().toString().contains("55.31B"));
    }
    @Then("the user wants to get the data for dec2021")
    public void the_user_wants_to_get_the_data_for_dec2021() {

        alphabetClassC.getQuarterly().click();
        alphabetClassC.getDec2021().click();
        System.out.println("December 2020 " + alphabetClassC.getFinanceTable());
        Assert.assertTrue(alphabetClassC.getFinanceTable().toString().contains("6.34B"));
    }
    @Then("the user wants to get the data for sep2020")
    public void the_user_wants_to_get_the_data_for_sep2020() {

        alphabetClassC.getQuarterly().click();
        alphabetClassC.getSep2020().click();
        System.out.println("September 2020 " + alphabetClassC.getFinanceTable());
        Assert.assertTrue(alphabetClassC.getFinanceTable().toString().contains("21.12B"));
    }
    @Then("the user wants to verify that Cost of Revenue for Sep2020 equals {string}")
    public void the_user_wants_to_verify_that_cost_of_revenue_for_sep2020_equals(String CostOfRevParameter)
    {
        alphabetClassC.getQuarterly().click();
        String ActualCostOfRevenue=alphabetClassC.getCostOfRevenue().getText();
        System.out.println("getCostOfRevenue " + ActualCostOfRevenue);
        Assert.assertEquals(ActualCostOfRevenue,CostOfRevParameter);
        //I checked only the Cost of revenue for Sep 2020 by using parameter.

    }
}
