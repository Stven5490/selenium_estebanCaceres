package BCI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static BCI.constantes.*;
import static configuraciones.driver.rutRandom.*;

public class textBox {

    private static String textBoxRut = "#contenedorApp > div > div > app-datos-basicos > form > div > bci-wk-input-text:nth-child(2) > input[type=text]";
    private static String textBoxNoDocu = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/bci-wk-input-text[2]/input";
    private static String textBoxNoFono = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/bci-wk-input-phone/input";
    private static String textBoxEmail = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[1]/input";
    private static String retextBoxEmail = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[2]/input";
    public static void txtBoxRut(WebDriver driver){
        WebElement txtboxrut;
        By bytxtboxrut = By.cssSelector(textBoxRut);
        txtboxrut = driver.findElement(bytxtboxrut);
        System.out.println("Ingresando el RUT del posible cliente...");
        txtboxrut.sendKeys(rut());
    }
    public static void txtBoxNoDoc(WebDriver driver){
        WebElement txtboxnodoc;
        By bytxtboxnodoc = By.xpath(textBoxNoDocu);
        txtboxnodoc = driver.findElement(bytxtboxnodoc);
        System.out.println("Ingresando el numero de documento");
        txtboxnodoc.sendKeys(ingresarNoDocu());
    }
    public static void txtBoxFono(WebDriver driver){
        WebElement txtboxfono;
        By bytxtboxfono = By.xpath(textBoxNoFono);
        txtboxfono = driver.findElement(bytxtboxfono);
        System.out.println("Ingresando Nro. de telefono: " + ingresarNoFono());
        txtboxfono.sendKeys(ingresarNoFono());
    }
    public static void txtBoxMail(WebDriver driver){
        WebElement txtboxemail;
        By bytxtboxemail = By.xpath(textBoxEmail);
        txtboxemail = driver.findElement(bytxtboxemail);
        System.out.println("Ingresando correo electronico: " + ingresarEmail());
        txtboxemail.sendKeys(ingresarEmail());
    }

    public static void retxtBoxMail(WebDriver driver){
        WebElement retxtboxemail;
        By byretxtboxemail = By.xpath(retextBoxEmail);
        retxtboxemail = driver.findElement(byretxtboxemail);
        System.out.println("Reingresando correo");
        retxtboxemail.sendKeys(ingresarEmail());
        retxtboxemail.sendKeys(Keys.TAB);
    }

}
