package mainPackage.Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import mainPackage.Utils.Drivers;
import mainPackage.Utils.configReader;

import java.util.concurrent.TimeUnit;

public class hooks {
    @Before
    public void setup(){
        Drivers.getDriver().get(configReader.getProperty("url"));
        Drivers.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Drivers.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
//        if (scenario.isFailed()){
//            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(data, "image/png", scenario.getName());
//
//        }
//        Driver.closeDriver();
    }
}
