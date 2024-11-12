package unidad2.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import unidad2.pages.homePage;
import unidad2.pages.loginPage;
import unidad2.pages.newAccountPage;
import unidad2.utils.encoding;

import static unidad2.utils.metodoGenerico.correoAleatorio;

public class tests {
    private WebDriver driver;
    private homePage homePage;
    private loginPage loginPage;
    private newAccountPage newAcountPage;
    static String rutaDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    @BeforeEach
    public void preCondiciones(){
        //preparo el driver y las page's
        homePage = new homePage(driver);
        homePage.conexionDriver("Chrome",rutaDriver,"webdriver.chrome.driver");
        loginPage = new loginPage(homePage.getDriver());
        newAcountPage = new newAccountPage(homePage.getDriver());
        homePage.cargarSitio("https://open.spotify.com/intl-es");
        homePage.maximizarBrowser();
    }
    @AfterEach
    public void posCondiciones(){
        driver.close();
    }
    @Test
    public void CP001_ErrorLogin(){
        homePage.irALoginPage();
        loginPage.iniciarSesion("usuariuoalgo@sdfsda.com","");
        Assertions.assertEquals(encoding.corregirEncoding("Nombre de usuario o contraseña incorrectos.")
                ,loginPage.obtenerErrorLogin());
    }
    @Test
    public void CP002_CreacionCtaSpotify(){
        homePage.irARegisterPage();
        newAcountPage.crearCtaSpotify(
                correoAleatorio(),
                "asdf@123456",
                "User Prueba",
                "31",
                "Diciembre",
                "1990",
                0,
                true,
                true);
        Assertions.assertEquals(encoding.corregirEncoding("User Prueba")
                ,homePage.obtenerUsername());
    }
}