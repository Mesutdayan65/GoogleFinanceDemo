package mainPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFinance extends BasePage{
@FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement stockSearch;

@FindBy(xpath = "(//div[@class='onRPD'])[1]")
    private WebElement AlphabetC;

    public WebElement getStockSearch() {
        return stockSearch;
    }

    public WebElement getAlphabetC() {
        return AlphabetC;
    }
}
