package src.main.java.com.doda25team8.version;
public final class VersionUtil {
    public static String getVersion(){
        String version = VersionUtil.class.getPackage().getImplementationVersion();
        if(version != null){
            return version;
        } else {
            return "DEV";
        }
    }
}
