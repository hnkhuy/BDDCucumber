package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class PropertiesFileReader {
    private static Properties prop;
    private static InputStream input;

    public static void openFileProperty() throws Exception {
        prop = new Properties();
        input = new FileInputStream("src/main/resources/private/login.properties");
        prop.load(input);
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static void closePropertiesFileInputStream() {
        if (input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
