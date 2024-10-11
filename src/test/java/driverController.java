import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class driverController extends JFrame{
    public void webDriver(){
        setTitle("Pruebas automaticas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        //Chrome driver
        JButton chromeButton = new JButton("Chrome");
        chromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarPrueba("chrome");
            }
        });
        add(chromeButton);

        //Edge driver
        JButton edgeButton = new JButton("Edge");
        edgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarPrueba("edge");
            }
        });
        add(edgeButton);

        //Mozilla driver
        JButton firefoxButton = new JButton("Mozilla");
        firefoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarPrueba("firefox");
            }
        });
        add(firefoxButton);

        //Boton cerrar
        JButton closeButton = new JButton("Cerrar");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(closeButton);

        setVisible(true);
    }

    private void ejecutarPrueba(String browser){
        WebDriver driver = null;
        String rutaDriver = null;

        try {
            switch (browser){
                case "chrome":
                    rutaDriver = constantes.obtenerChromeDriver();
                    System.setProperty("webdriver.chrome.driver", rutaDriver);
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    rutaDriver = constantes.obtenerEdgeDriver();
                    System.setProperty("webdriver.edge.driver", rutaDriver);
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    rutaDriver = constantes.obtenerFireFoxDriver();
                    System.setProperty("webdriver.gecko.driver", rutaDriver);
                    driver = new FirefoxDriver();
                    break;
            }

            if(driver != null){
                driver.get("https://www.google.cl");
                driver.manage().window().maximize();

            }
        } catch (Exception exception){
            JOptionPane.showMessageDialog(this, "Error: Webdriver no configurado: " + browser);
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new driverController();
    }
}
