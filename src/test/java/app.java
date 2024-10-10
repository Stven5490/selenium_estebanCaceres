import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class app {
    public static void main(String[] args) {
        //System.getProperty("webdriver.chome.driver", constantes.obtenerChromeDriver());
        System.getProperty("webdriver.edge.driver", constantes.obtenerEdgeDriver());

        //Configuracion Chrome
/*
        WebDriver chromeDriver = new ChromeDriver();
        System.out.println("Inicializando prueba...");
        chromeDriver.get("https://www.google.cl");
        System.out.println("Ingresando a URL: " + chromeDriver.getCurrentUrl());
        System.out.println("Ingresando al sitio: " + chromeDriver.getTitle());
        System.out.println("Maximizando pagina web");
        chromeDriver.manage().window().maximize();

 */

        //Configuracion Edge

        WebDriver edgeDriver = new EdgeDriver();
        System.out.println("Inicializando prueba...");
        edgeDriver.get("https://www.google.cl");
        System.out.println("Ingresando a URL: " + edgeDriver.getCurrentUrl());
        System.out.println("Ingresando al sitio: " + edgeDriver.getTitle());
        System.out.println("Maximizando pagina web");
        edgeDriver.manage().window().maximize();

    }
}

