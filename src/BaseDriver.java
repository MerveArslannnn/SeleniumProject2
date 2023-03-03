import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    //!        driver.manage().timeouts().pageLoadTimeout(dr);
    static {

        KalanOncekileriKapat();
        Logger logger = Logger.getLogger(""); // output a ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        driver=new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

    public static void BekleKapat() {
        Beklethr(3);
        driver.quit();
    }

    public static void Beklethr(int sn) {
        try {
            Thread.sleep(1000 * sn);//sn bekledi
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void BekleElement(int sn){
        Duration muhlet=Duration.ofSeconds(sn);//120 saniye mühlet verdim
        driver.manage().timeouts().implicitlyWait(muhlet);
    }
    public static void BekleSayfa(int sn){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sn));
    }
}