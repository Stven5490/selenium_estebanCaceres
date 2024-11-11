package unidad1.configuraciones.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popUpController {
    public static void popUpAbretuCuenta(WebDriver driver){
        WebElement btnPopUpAbreCuenta;
        By bybtnPopUpAbreCuenta = By.id("closeModalHome");
        btnPopUpAbreCuenta = driver.findElement(bybtnPopUpAbreCuenta);
        System.out.println("Validando si abre Pop Up Abre tu Cuenta");
        if (btnPopUpAbreCuenta.isDisplayed()){
            System.out.println("Pop Up Abre tu cuenta cerrado");
            btnPopUpAbreCuenta.click();
        } else {
            String notPopUp = "No existe Pop Up";
            System.out.println(notPopUp);
        }
    }
}
