package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Curso septiembre 2020" );
        String exePath = Paths.get("").toAbsolutePath().toString()+File.separator + "drive" + File.separator;// Tomando paht para driver en el sistema 
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// setear o Establecer la propiedad .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
