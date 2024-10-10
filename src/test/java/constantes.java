public class constantes {
    private static String rutaProyecto = System.getProperty("user.dir");
    private static String driver = "\\src\\test\\resources\\driveres\\";
    private static String chrome = "chromedriver.exe";
    private static String edge = "msedgedriver.exe";
    private static String chromeDriver = rutaProyecto + chrome;
    private static String edgeDriver = rutaProyecto + edge;
    public static String obtenerChromeDriver(){
        return chromeDriver;
    }
}
