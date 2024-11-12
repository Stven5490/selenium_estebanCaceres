package unidad2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import unidad2.utils.claseBase;

public class homePage extends claseBase {
    By byBtnIniciarSesion = By.xpath("//button[@data-testid=\"login-button\"]");
    By btnRegistrase = By.xpath("//button[contains(text(),'Registrarte')]");
    By byBtnTextUsername = By.xpath("//button[@data-testid='user-widget-link']");
    public homePage(WebDriver driver) {
        super(driver);
    }
    public void irARegisterPage(){
        click(esperaExplicita(btnRegistrase));
    }
    public void irALoginPage(){
        click(esperaExplicita(byBtnIniciarSesion));
    }
    public String obtenerUsername(){
        return obtenerAtributoWebElement(esperaExplicita(byBtnTextUsername),"aria-label");
    }
}