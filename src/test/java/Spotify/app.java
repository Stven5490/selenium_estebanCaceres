package Spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static configuraciones.driver.driverController.*;

public class app {
    public static void main(String[] args) throws InterruptedException {
        //System.getProperty(WebChrome(), obtenerChromeDriver());
        //WebDriver driver = new ChromeDriver();
        System.getProperty(WebEdge(), obtenerEdgeDriver());
        WebDriver driver = new EdgeDriver();

        iniciandoProyecto();
        driver.get("https://www.google.cl");
        System.out.println("Ingresando a URL: " + driver.getCurrentUrl());
        System.out.println("Ingresando al sitio: " + driver.getTitle());
        System.out.println("Maximizando pagina web");
        driver.manage().window().maximize();
        System.out.println("Redirigiendo a Spotify: ");
        driver.get("https://www.spotify.com/cl/premium/?utm_source=cl-es_brand_contextual_text&utm_medium=paidsearch&utm_campaign=alwayson_latam_cl_performancemarketing_core_brand+contextual+text+cl-es+google&gclsrc=aw.ds&gad_source=1&gclid=Cj0KCQjwgrO4BhC2ARIsAKQ7zUlbeDLI3_bjViN3kludgPlwpEKfBmAaR6e668q8EiynTrnS39jP_C8aAp3PEALw_wcB");
        System.out.println("Redirigiendo a portar de Registro de Spotify");
        driver.get("https://www.spotify.com/cl/signup/");
        driver.findElement(By.id("username")).sendKeys("esteban.caceres@tsoftglobal.com");
        System.out.println("Ingresando correo de registro...");
        Thread.sleep(5000);
        WebElement btncerrarpopup;
        By bybtncerrarpopup = By.xpath("//button[@aria-label=\"Cerrar\"]");
        btncerrarpopup = driver.findElement(bybtncerrarpopup);
        if (btncerrarpopup.isDisplayed()){
            System.out.println("Cerrando PopUp");
            btncerrarpopup.click();
        } else {
            System.out.println("No existe PopUp");
        }
        System.out.println("<===== Paso 1 de 3 =====>");
        Thread.sleep(5000);
        System.out.println("Clickeando siguiente");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/button")).click();
        System.out.println("Ingresar contraseña....");
        driver.findElement(By.xpath("//*[@id=\"new-password\"]")).sendKeys("Tsoft2025.");
        System.err.println("<=>");
        System.out.println("Contraseña ingresada: ");
        System.out.println("Se pasa del paso 1 al 2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]")).click();
        System.out.println("<===== Paso 2 de 3 =====>");
        System.out.println("Ingresando datos....");
        driver.findElement(By.id("displayName")).sendKeys("Esteban");
        System.out.println("Ingresando dia de nacimiento");
        driver.findElement(By.id("day")).sendKeys("5");
        System.out.println("Ingresando mes de nacimiento");
        driver.findElement(By.id("month")).sendKeys("Abril");
        System.out.println("Ingresando año de nacimiento");
        driver.findElement(By.id("year")).sendKeys("1990");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/fieldset/div/div/div[1]/label/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]")).click();
        System.out.println("<===== Paso 3 de 3 =====>");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[1]/div/div/label/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[2]/div/label/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]")).click();
        Thread.sleep(15000);
        //agregar el check manual (ROBOT)
        driver.findElement(By.xpath("//*[@id=\"encore-web-main-content\"]/div/div/div/div/div/div/button/span[1]")).click();
        System.out.println(driver.getTitle());

    }
}

