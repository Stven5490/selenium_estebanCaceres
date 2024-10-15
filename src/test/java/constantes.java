public class constantes {
    private static String rutaProyecto = System.getProperty("user.dir");
    private static String driver = "\\src\\test\\resources\\drivers\\";
    private static String chrome = "chromedriver.exe";
    private static String edge = "msedgedriver.exe";
    private static String firefox = null;
    private static String chromeDriver = rutaProyecto + chrome;
    private static String edgeDriver = rutaProyecto + edge;
    private static String fireFoxDriver = rutaProyecto + firefox;
    private static String Spotify = "https://www.spotify.com/cl/premium/?utm_source=cl-es_brand_contextual_text&utm_medium=paidsearch&utm_campaign=alwayson_latam_cl_performancemarketing_core_brand+contextual+text+cl-es+google&gclsrc=aw.ds&gad_source=1&gclid=Cj0KCQjwgrO4BhC2ARIsAKQ7zUlbeDLI3_bjViN3kludgPlwpEKfBmAaR6e668q8EiynTrnS39jP_C8aAp3PEALw_wcB";
    private static String registrateSpotify = "https://www.spotify.com/cl/signup/";

    public static String obtenerChromeDriver(){
        return chromeDriver;
    }

    public static String obtenerEdgeDriver() {
        return edgeDriver;
    }
    public static String obtenerFireFoxDriver(){
        return fireFoxDriver;
    }
    public static String irSpotify(){
        return Spotify;
    }
    public static String signIn(){
        return registrateSpotify;
    }
}
