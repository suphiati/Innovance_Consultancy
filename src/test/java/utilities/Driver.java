package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Set;

public class Driver {

    /*
     JUnit'de WebDriver objesi TestBase'den geliyordu

     TestNG extends ile baglanma zorunlulugunu ortadan kaldirmak
     ve testi yazanlara daha fazla kontrol imkani vermek icin
     TestBase yerine Driver class'inda static 2 method ile
     driver olusturma ve kapatma islemlerini yapmayi tercih etmistir
     */

    private Driver(){
        // Bu constructor default constructor ile ayni islevi yapan parametresiz constructor'dir
        // buna erisimi kontrol edebilecegimiz icin bu constructor'i olusturduk
    }

    public static WebDriver driver; // biz deger atamadigimiz icin Java default olarak null point eder
    public static WebDriver getDriver(){

        String browser = ConfigReader.getProperty("browser");

        if (driver == null){

            switch (browser){

                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver= new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }



        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }

    public static void switchPage(){

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.get("https://innovance.com.tr/");

        //String origin = Driver.getDriver().getWindowHandle();
        //Driver.getDriver().switchTo().window(origin);

        driver.get("https://innovance.com.tr/");
        String innovanceWindowhandle=Driver.driver.getWindowHandle();
        driver.switchTo().window(innovanceWindowhandle);





    }

    public static void yeniPencereHandle(){
        driver.get("https://innovance.com.tr/");
        String innovanceWindowhandle=Driver.driver.getWindowHandle();
        Set<String> whdSeti=driver.getWindowHandles();
        String ikinciWhd="";

        for (String each: whdSeti
             ) {
            if (!each.equals(innovanceWindowhandle)){
                ikinciWhd=each;
            }

            driver.switchTo().window(ikinciWhd);
        }


    }
}
