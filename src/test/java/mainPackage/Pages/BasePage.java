package mainPackage.Pages;

import mainPackage.Utils.Drivers;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    BasePage(){
        PageFactory.initElements(Drivers.getDriver(),this);
    }
}
