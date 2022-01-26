package mainPackage.Pages;

import mainPackage.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AlphabetClassC extends BasePage{
    //I locate elements at a certain page and use  PageFactory Init elements with the help of inheritance(OOP)
    //I have different pages for different parts in application so that I have organized code
    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[6]")
    private WebElement Sep2021;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[7]")
    private WebElement Jun2021;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[8]")
    private WebElement Mar2021;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[9]")
    private WebElement Dec2021;

    @FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[10]")
    private WebElement Sep2020;

    @FindBy(xpath = "//table//tr[9]//td[2]")
    private WebElement costOfRevenue;

    @FindBy(xpath = "(//span[@jsname='V67aGc'])[4]")
    private WebElement quarterly;

    public WebElement getQuarterly() {
        return quarterly;
    }

    public WebElement getCostOfRevenue() {
        return costOfRevenue;
//        this will give only the cost of revenue rather that going through the whole data.
    }

    public WebElement getSep2021() {
        return Sep2021;
    }

    public WebElement getJun2021() {
        return Jun2021;
    }

    public WebElement getMar2021() {
        return Mar2021;
    }

    public WebElement getDec2021() {
        return Dec2021;
    }

    public WebElement getSep2020() {
        return Sep2020;
    }

    public List<String> getFinanceTable (){
        List<WebElement> table= Driver.getDriver().findElements(By.xpath("//table//td"));
        List<String> classes =new ArrayList<>();
        for(int i=0;i< table.size();i++ ){
            classes.add(table.get(i).getText());
        }

        return classes;
//  I created this method to loop through whole table data and derive the info that I want to use or assert.
}
}
