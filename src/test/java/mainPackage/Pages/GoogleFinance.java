package mainPackage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.ByteBuffer;

public class GoogleFinance extends BasePage{

@FindBy(xpath =  " //input[@class='gLFyf gsfi']")
private WebElement sarchButton;

@FindBy(xpath = " //input[@class='gNO89b']")
WebElement clickButton;


    public WebElement getSearchButton() {
        return sarchButton;
    }

    public WebElement getClickButton() {
        return clickButton;
    }
}
