
package mainPackage.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {private static Properties configFile;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("src/Configurations.properties");
            configFile = new Properties();
            configFile.load(fileInputStream);

            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static String getProperty(String key){

        return configFile.getProperty(key);
    }

}
