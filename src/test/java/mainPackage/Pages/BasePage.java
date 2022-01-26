package mainPackage.Pages;

import mainPackage.Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
