import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class app {
    static String cerrarPopUp = "//button[@aria-label=\"Cerrar\"]";
    static String bntSiguienteLogin = "//*[@id=\"__next\"]/main/main/section/div/form/button";
    static String textBoxPassWord = "//*[@id=\"new-password\"]";
    static String nextStep1 = "//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]";
    static String maleOption = "//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/fieldset/div/div/div[1]/label/span[1]";
    static String nextStep2 = "//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]";
    static String notMKT = "//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[1]/div/div/label/span[1]";
    static String shareMKT = "//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[2]/div/label/span[1]";
    static String Registrate = "//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]";
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
        System.out.println("<===== Paso 1 de 3 =====>");
        Thread.sleep(5000);
        System.out.println("Clickeando siguiente");
        driver.findElement(By.xpath(bntSiguienteLogin)).click();
        System.out.println("Ingresar contraseña....");
        driver.findElement(By.xpath(textBoxPassWord)).sendKeys(pages.passWord());
        System.out.println("Contraseña ingresada: ");
        System.out.println("Se pasa del paso 1 al 2");
        Thread.sleep(5000);
        driver.findElement(By.xpath(nextStep1)).click();
        System.out.println("<===== Paso 2 de 3 =====>");
        driver.findElement(By.id("displayName")).sendKeys(pages.usuario());
        driver.findElement(By.id("day")).sendKeys(pages.dia());
        driver.findElement(By.id("month")).sendKeys(pages.mes());
        driver.findElement(By.id("year")).sendKeys(pages.ano());
        driver.findElement(By.xpath(maleOption)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(nextStep2)).click();
        System.out.println("<===== Paso 3 de 3 =====>");
        driver.findElement(By.xpath(notMKT)).click();
        driver.findElement(By.xpath(shareMKT)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(Registrate)).click();
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"encore-web-main-content\"]/div/div/div/div/div/div/button/span[1]")).click();
        Thread.sleep(5000);


    }
}

