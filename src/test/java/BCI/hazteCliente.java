package BCI;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;


import static BCI.btn.*;
import static BCI.checkBox.*;
import static BCI.constantes.*;
import static BCI.textBox.*;
import static configuraciones.driver.driverController.*;

public class hazteCliente {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty(WebEdge(), obtenerEdgeDriver());
        WebDriver driver = new EdgeDriver();
        //Page 1
        iniciandoProyecto();
        driver.get(BCI());
        ampliarPantalla(driver);
        obtenerTitulo(driver);
        btnHazteClienteBCI(driver);
        Thread.sleep(10000);

        //Page 2
        WebElement iframe;
        By byiframe = By.id("myFrame");
        iframe = driver.findElement(byiframe);
        driver.switchTo().frame(iframe);

        obtenerTitulo(driver);
        Thread.sleep(5000);
        txtBoxRut(driver);
        txtBoxNoDoc(driver);
        txtBoxFono(driver);
        txtBoxMail(driver);
        retxtBoxMail(driver);
        Thread.sleep(15000);
        checkBoxPolitica(driver);
        //aplicar Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(10000, 10000);");
        Thread.sleep(15000);
        btnContinuarHazteCliente(driver);
    }

}
