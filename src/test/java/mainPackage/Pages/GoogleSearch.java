package mainPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleSearch extends BasePage{

@FindBy(xpath = "//input[@title='Search']")
private WebElement sarchButton;

@FindBy(className ="gNO89b")
private WebElement clickButton;
@FindBy(partialLinkText = "Google Finance")
private WebElement financeLink;

    public WebElement getFinanceLink() {
        return financeLink;
    }

    public WebElement getSearchButton() {
        return sarchButton;
    }

    public WebElement getClickButton() {
        return clickButton;
    }
}
