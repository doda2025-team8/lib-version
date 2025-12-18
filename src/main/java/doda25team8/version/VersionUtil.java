package doda25team8.version;

import java.io.InputStream;
import java.util.Properties;

public final class VersionUtil {
    public static String getVersion() {
        try (InputStream input = VersionUtil.class.getClassLoader().getResourceAsStream("version.properties")) {
            if (input == null) {
                return "DEV";
            }
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("version", "DEV");
        } catch (Exception ex) {
            return "DEV";
        }
    }
}
