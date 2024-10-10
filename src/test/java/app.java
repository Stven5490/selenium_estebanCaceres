import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class app {
    public static void main(String[] args) {
        System.getProperty("webdriver.chome.driver", constantes.obtenerChromeDriver());

        WebDriver chromeDriver = new ChromeDriver();
        System.out.println("Inicializando prueba...");
        chromeDriver.get("https://www.google.cl");
        System.out.println("Ingresando a URL: " + chromeDriver.getCurrentUrl());
        System.out.println("Ingresando al sitio: " + chromeDriver.getTitle());
        System.out.println("Maximizando pagina web");
        chromeDriver.manage().window().maximize();

    }
}

