import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static BCI.btn.btnContinuarHazteCliente;
import static BCI.btn.btnHazteClienteBCI;
import static BCI.checkBox.checkBoxPolitica;
import static BCI.constantes.BCI;
import static BCI.errorController.*;
import static BCI.espera.*;
import static BCI.textBox.*;
import static configuraciones.driver.driverController.*;

public class test {
    private static WebDriver driver;
    private static final String rutaDriver = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";;
    private static WebDriverWait wait;

    @BeforeEach
    public void preCondiciones(){
        System.setProperty("webdriver.chrome.driver",rutaDriver);
        driver = new ChromeDriver();
        ampliarPantalla(driver);
    }

    @Test
    public void CP001_aperturarCtaRutExistente() throws InterruptedException {
        iniciandoProyecto();
        driver.get(BCI());
        ampliarPantalla(driver);
        obtenerTitulo(driver);
        btnHazteClienteBCI(driver);
        espera5Seg();

        //Page 2
        WebElement iframe;
        By byiframe = By.id("myFrame");
        iframe = driver.findElement(byiframe);
        driver.switchTo().frame(iframe);

        obtenerTitulo(driver);
        espera5Seg();
        txtBoxRut(driver);
        txtBoxNoDoc(driver);
        txtBoxFono(driver);
        txtBoxMail(driver);
        retxtBoxMail(driver);
        //Marcar check de politicas
        esperar15Seg();
        checkBoxPolitica(driver);
        //aplicar Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(10000, 10000);");
        esperar15Seg();
        btnContinuarHazteCliente(driver);

        //Page 3
        esperar15Seg();
        validadorErrorBCI(driver);
    }
}
