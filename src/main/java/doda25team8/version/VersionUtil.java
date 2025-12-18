package doda25team8.version;

import java.util.Properties;

public final class VersionUtil {
    public static String getVersion() {
        try {
            Properties p = new Properties();
            p.load(VersionUtil.class.getResourceAsStream("/META-INF/maven/doda25team8/lib-version/pom.properties"));    // change to read the SSOT version from the pom.properties
            return p.getProperty("version");
        } catch (Exception e) {
            return "unknown-dev"; 
        }
    }
}
