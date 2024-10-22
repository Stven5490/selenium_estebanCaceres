package BCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class btn {
    private static String botonHazteClienteBCI = "//*[@id=\"header\"]/nav[2]/div[2]/ul/li[1]/a";
    private static String botonContinuarHazteClienteBCI = "#contenedorApp > div > div > app-datos-basicos > form > div > div.foot > button";
    public static void btnHazteClienteBCI(WebDriver driver){
        WebElement btnhazteclientebci;
        By bybtnhazteclientebci = By.xpath(botonHazteClienteBCI);
        btnhazteclientebci = driver.findElement(bybtnhazteclientebci);
        System.out.println("Validando si existe el boton 'Hazte Cliente'");
        if (btnhazteclientebci.isDisplayed()){
            System.out.println("Ingresando a sitio para crear cta en BCI");
            btnhazteclientebci.click();
        } else {
            System.err.println("El boton no existe");
        }
    }
    public static void btnContinuarHazteCliente(WebDriver driver){
        WebElement btncontinuarhaztecliente;
        //By bybtncontinuarhaztecliente = By.xpath(botonContinuarHazteClienteBCI);
        By bybtncontinuarhaztecliente = By.cssSelector(botonContinuarHazteClienteBCI);
        btncontinuarhaztecliente = driver.findElement(bybtncontinuarhaztecliente);
        btncontinuarhaztecliente.click();
    }
}
