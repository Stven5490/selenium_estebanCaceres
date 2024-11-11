package unidad1.BCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.charset.StandardCharsets;

public class errorController {
    private static String rutExistente = "//*[@id=\"contenedorApp\"]/div[1]/div/app-error-cuenta-existente/div/div/div[1]";
    private static String errorDatos = "//*[@id=\"contenedorApp\"]/div[1]/div/app-error-envio-formulario/div/div/p";
    private static String bloqueoTemporal = "//*[@id=\"contenedorApp\"]/div[1]/div/app-error-rechazo/div/div/p";
    public static void validadorErrorBCI(WebDriver driver){
        System.out.println("Validando tipo de error");
        WebElement rutexiste;
        By byrutexiste = By.xpath(rutExistente);
        rutexiste = driver.findElement(byrutexiste);

        WebElement errordatos;
        By byerrordatos = By.xpath(errorDatos);
        errordatos = driver.findElement(byerrordatos);

        WebElement bloqueotemporal;
        By bybloqueotemporal = By.xpath(bloqueoTemporal);
        bloqueotemporal = driver.findElement(bybloqueotemporal);
    }
    private static String corregirEncoding(String textoIncorrecto){
        byte[] bytes = textoIncorrecto.getBytes(StandardCharsets.ISO_8859_1);
        String textoCorregido = new String(bytes, StandardCharsets.UTF_8);
        return textoCorregido;
    }
}
