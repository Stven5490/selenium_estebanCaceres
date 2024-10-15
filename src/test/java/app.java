import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class app {

    static String cerrarPopUp = "//button[@aria-label=\"Cerrar\"]";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chome.driver", constantes.obtenerChromeDriver());
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.edge.driver", constantes.obtenerEdgeDriver());
        //WebDriver driver = new EdgeDriver();

        System.out.println("Inicializando prueba...");
        driver.get("https://www.google.cl");
        System.out.println("Ingresando a URL: " + driver.getCurrentUrl());
        System.out.println("Ingresando al sitio: " + driver.getTitle());
        System.out.println("Maximizando pagina web");
        driver.manage().window().maximize();
        System.out.println("Redirigiendo a Spotify: ");
        driver.get(constantes.irSpotify());
        System.out.println("Redirigiendo a portar de Registro de Spotify");
        driver.get(constantes.signIn());
        driver.findElement(By.id("username")).sendKeys(pages.email());
        System.out.println("Ingresando correo de registro...");
        Thread.sleep(5000);
        System.out.println("Cerrando Pop Up");
        driver.findElement(By.xpath(cerrarPopUp)).click();
    }
}

