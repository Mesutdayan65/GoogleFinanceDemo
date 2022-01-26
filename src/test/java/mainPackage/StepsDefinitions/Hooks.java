package mainPackage.StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import mainPackage.Utils.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before//I use before and after annotations in my hooks class
           // for actions that I want to repeat at each test
    public void setup(){
        Driver.getDriver().manage().window().maximize();


    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());

        }
        Driver.closeDriver();

        //it will provide a screenshot of failed part
    }
}
