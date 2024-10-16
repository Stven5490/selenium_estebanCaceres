import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class btn {
    private static WebElement btnCerrarPopUp;
    By bybtnCerrarPopUp = By.xpath("//button[@aria-label=\"Cerrar\"]");
    private static WebElement nextLogin;
    By byNextLogin = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/button");
    public static WebElement cerrarPopUp(){
        return btnCerrarPopUp;
    }
    public static WebElement btnNextLogin(){
        return nextLogin;
    }
}
