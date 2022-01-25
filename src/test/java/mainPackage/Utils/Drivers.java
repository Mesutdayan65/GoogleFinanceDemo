package mainPackage.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Drivers {private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    //Singlton Drive

    private Drivers(){

    }

    public static WebDriver getDriver(){

        if(driverPool.get() == null) {

            synchronized (Driver.class) {
                switch (configReader.getProperty("browser")) {

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver());
                        break;
                    case "headless":
                        WebDriverManager.edgedriver().setup();
                        //    driverPool.set(new );
                        break;


                    default:
                        System.out.println("The Driver is NOT Found");
                }
            }
        }

        return driverPool.get();

    }


    public static void closeDriver(){
        if(driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }


}
