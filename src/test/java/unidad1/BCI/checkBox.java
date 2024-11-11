package unidad1.BCI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkBox {
    static String checkPoliticas = "//*[@id=\"contenedorApp\"]/div/div/app-datos-basicos/form/div/div[2]/bci-wk-checkbox";

    public static void checkBoxPolitica(WebDriver driver){
        WebElement checkBoxPolitica;
        By bycheckBoxPolitica = By.xpath(checkPoliticas);
        checkBoxPolitica = driver.findElement(bycheckBoxPolitica);
        System.out.println("He leído y acepto las Políticas de Privacidad y autorizo el tratamiento de mis datos personales en Chile o en el extranjero.");
        checkBoxPolitica.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll hacia abajo 500 píxeles
        js.executeScript("window.scrollBy(0, 500);");
    }
}
