package configuraciones.driver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class driverController {
    private static String rutaProyecto = System.getProperty("user.dir");
    private static String driver = "\\src\\test\\resources\\drivers\\";
    private static String chrome = "chromedriver.exe";
    private static String chromeWebDriver = "webdriver.chrome.driver";
    private static String edge = "msedgedriver.exe";
    private static String edgeWebDriver = "webdriver.edge.driver";
    private static String firefox = null;
    private static String fireFoxWebDriver = "webdriver.gecko.driver";
    private static String chromeDriver = rutaProyecto + chrome;
    private static String edgeDriver = rutaProyecto + edge;
    private static String fireFoxDriver = rutaProyecto + firefox;
    public static String obtenerChromeDriver(){
        return chromeDriver;
    }
    public static String WebChrome(){return chromeWebDriver;}
    public static String obtenerEdgeDriver() {
        return edgeDriver;
    }
    public static String WebEdge(){return edgeWebDriver;}
    public static String obtenerFireFoxDriver(){
        return fireFoxDriver;
    }
    public static String WebFireFox(){return fireFoxWebDriver;}

    public static void validar2daPantalla(WebDriver driver){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screens = ge.getScreenDevices();
        if (screens.length > 1){
            System.out.println("Moviendo a 2da pantalla");
            driver.manage().window().setPosition(new Point(0, -1080));
        } else {
            System.out.println("Solo existe 1 pantalla conectada.");
        }
    }
    public static void ampliarPantalla(WebDriver driver){
        System.out.println("Ampliando vista");
        driver.manage().window().maximize();
    }
    public static String obtenerTitulo(WebDriver driver){
        String tituloSitio = driver.getTitle();
        System.out.println("Ingresando al sitio de: " + tituloSitio);
        return tituloSitio;
    }
}
