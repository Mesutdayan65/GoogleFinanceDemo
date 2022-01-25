package mainPackage.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainPackage.Pages.GoogleFinance;
import mainPackage.Utils.Drivers;
import mainPackage.Utils.configReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepsDefinition {
    WebDriver driver;


    @Given("the user wants to navigate to google finance")
    public void the_user_wants_to_navigate_to_google_finance() throws InterruptedException {
      Drivers.getDriver().get("https://www.google.com/");
   WebElement searchButton= Drivers.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    searchButton.sendKeys("google finance");

    WebElement click=Drivers.getDriver().findElement(By.className("gNO89b"));
   Thread.sleep(2000);
    click.click();
        Drivers.getDriver().manage().window().maximize();
    Drivers.getDriver().findElement(By.partialLinkText("Google Finance")).click();




    }
    @Then("the user wants to get the page for google's shares on stock market")
    public void the_user_wants_to_get_the_page_for_google_s_shares_on_stock_market() {
        Drivers.getDriver().manage().window().maximize();
      WebElement stockSearch=  Drivers.getDriver().findElement(By.xpath("(//input[@type='text'])[2]"));
      stockSearch.sendKeys("google");
      Drivers.getDriver().findElement(By.id("yDmH0d"));
      Drivers.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      Drivers.getDriver().findElement(By.xpath("(//div[@class='onRPD'])[2]")).click();
    }
    @Then("the user wants to get the data for sep2021")
    public void the_user_wants_to_get_the_data_for_sep2021() {

      WebElement Sep2021=Drivers.getDriver().findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[6]"));
      Sep2021.click();
       String sept2021 =Sep2021.getAttribute("class");

//        Assert.assertTrue(sept2021.contains("Sep2021"));


        List<WebElement> tableSep2021=Drivers.getDriver().findElements(By.xpath("//table//td"));
        List<String> classesSEp2021 =new ArrayList<>();
        for(int i=0;i< tableSep2021.size();i++ ){
            classesSEp2021.add(tableSep2021.get(i).getText());
            classesSEp2021.add(tableSep2021.get(i).getAttribute("class"));
        }
        System.out.println("classes = " + classesSEp2021);


    }
    @Then("the user wants to get the data for june2021")
    public void the_user_wants_to_get_the_data_for_june2021() {
        WebElement Jun2021=Drivers.getDriver().findElement(By.
                xpath("(//span[@class='VfPpkd-vQzf8d'])[7]"));
        Jun2021.click();
        List<WebElement> tableJun2021=Drivers.getDriver().findElements(By.xpath("//table//td"));
        List<String> classesJun =new ArrayList<>();
        for(int i=0;i< tableJun2021.size();i++ ){
            classesJun.add(tableJun2021.get(i).getText());
            classesJun.add(tableJun2021.get(i).getAttribute("class"));
        }
        System.out.println("classes = " + classesJun);
    }
    @Then("the user wants to get the data for mar2021")
    public void the_user_wants_to_get_the_data_for_mar2021() {
        WebElement March2021=Drivers.getDriver().findElement(By.
                xpath("(//span[@class='VfPpkd-vQzf8d'])[8]"));
        March2021.click();
        List<WebElement> tableMarch2021=Drivers.getDriver().findElements(By.xpath("//table//td"));
        List<String> classesMarch2021 =new ArrayList<>();
        for(int i=0;i< tableMarch2021.size();i++ ){
            classesMarch2021.add(tableMarch2021.get(i).getText());
            classesMarch2021.add(tableMarch2021.get(i).getAttribute("class"));
        }
        System.out.println("classes = " + classesMarch2021);
    }
    @Then("the user wants to get the data for dec2021")
    public void the_user_wants_to_get_the_data_for_dec2021() {
        WebElement Dec2021=Drivers.getDriver().findElement(By.
                xpath("(//span[@class='VfPpkd-vQzf8d'])[9]"));
        Dec2021.click();
        List<WebElement> tableDec2021=Drivers.getDriver().findElements(By.xpath("//table//td"));
        List<String> classesDec2021 =new ArrayList<>();
        for(int i=0;i< tableDec2021.size();i++ ){
            classesDec2021.add(tableDec2021.get(i).getText());
            classesDec2021.add(tableDec2021.get(i).getAttribute("class"));
        }
        System.out.println("classes = " + classesDec2021);
    }
    @Then("the user wants to get the data for sep2020")
    public void the_user_wants_to_get_the_data_for_sep2020() {
        WebElement Sep2020=Drivers.getDriver().findElement(By.
                xpath("(//span[@class='VfPpkd-vQzf8d'])[10]"));
        Sep2020.click();
        List<WebElement> tableSep2020=Drivers.getDriver().findElements(By.xpath("//table//td"));
        List<String> classesSep2020 =new ArrayList<>();
        for(int i=0;i< tableSep2020.size();i++ ){
            classesSep2020.add(tableSep2020.get(i).getText());
            classesSep2020.add(tableSep2020.get(i).getAttribute("class"));
        }
        System.out.println("classes = " + classesSep2020);
    }
}
