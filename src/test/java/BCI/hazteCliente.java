package BCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static BCI.constantes.*;
import static configuraciones.driver.driverController.*;
import static configuraciones.driver.popUpController.*;

public class hazteCliente {
    static String textBoxRut = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/bci-wk-input-text[1]/div[1]";
    static String textBoxNoDoc = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/bci-wk-input-text[2]/input";
    static String textBoxNoFono = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/bci-wk-input-phone/input";
    static String textBoxEmail = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[1]/input";
    static String textBoxReEmail = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[2]/input";
    static String checkPoliticas = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[2]/bci-wk-checkbox/label";

    public static void main(String[] args) throws InterruptedException {
        System.getProperty(WebChrome(), obtenerChromeDriver());
        WebDriver driver = new ChromeDriver();
        //System.getProperty(WebEdge(), obtenerEdgeDriver());
        //WebDriver driver = new EdgeDriver();

        System.out.println("Iniciando prueba...");
        driver.get(BCI());
        System.out.println("Validando si existe un 2do monitor");
        validar2daPantalla(driver);
        ampliarPantalla(driver);
        obtenerTitulo(driver);
        popUpAbretuCuenta(driver);
        WebElement btnhazteCliente;
        By bybtnhazteCliente = By.cssSelector("#header > nav.navbar.header__navbar-bottom > div.header__navbar-center > ul > li:nth-child(1) > a");
        btnhazteCliente = driver.findElement(bybtnhazteCliente);
        btnhazteCliente.click();
        Thread.sleep(5000);
        String abrirCtaCte = driver.getTitle();
        System.out.println("Sitio actual: " + abrirCtaCte);
        System.out.println("Ingresando el RUT del posible cliente...");
        Thread.sleep(5000);
        driver.findElement(By.xpath(textBoxRut)).sendKeys(ingresarRUT());
        System.out.println("Ingresando el numero de documento");
        driver.findElement(By.xpath(textBoxNoDoc)).sendKeys(ingresarNoDocu());
        System.out.println("Ingresando Nro. de telefono: " + ingresarNoFono());
        driver.findElement(By.xpath(textBoxNoFono)).sendKeys(ingresarNoFono());
        System.out.println("Ingresando correo electronico: " + ingresarEmail());
        driver.findElement(By.xpath(textBoxEmail)).sendKeys(ingresarEmail());
        driver.findElement(By.xpath(textBoxReEmail)).sendKeys(ingresarEmail());
        System.out.println("Aceptando politicas de seguridad de :" + obtenerTitulo(driver));
        driver.findElement(By.xpath(checkPoliticas)).click();
    }

}
