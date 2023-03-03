import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testler extends BaseDriver {
    public static Actions actions= new Actions(driver);

    @Test
    public void Test1() {
        driver.get("http://demowebshop.tricentis.com/%22");
        BekleElement(20);
        WebElement register = driver.findElement(By.linkText("Register"));
        actions.moveToElement(register).click().build().perform();
        WebElement malegender=driver.findElement(By.id("gender-male"));
        WebElement firstname=driver.findElement(By.id("FirstName"));
        WebElement lastname=driver.findElement(By.id("LastName"));
        WebElement email=driver.findElement(By.id("Email"));
        WebElement password=driver.findElement(By.id("Password"));
        WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
        WebElement registerbtn=driver.findElement(By.id("register-button"));
//https://demowebshop.tricentis.com/registerresult/1
        actions.moveToElement(malegender).click().build().perform();
        actions.moveToElement(firstname).sendKeys("Grup").build().perform();
        actions.moveToElement(lastname).sendKeys("Dokuz").build().perform();
        actions.moveToElement(email).sendKeys("hasanftsagopa@hotmail.com").build().perform();
        actions.moveToElement(password).sendKeys("Armin1234").build().perform();
        actions.moveToElement(confirmpassword).sendKeys("Armin1234").build().perform();
        actions.moveToElement(registerbtn).click().build().perform();
        BekleSayfa(20);

        WebElement resulttext=driver.findElement(By.xpath("[text()='Your registration completed']"));
        System.out.println("resulttext.getText() = " + resulttext.getText());
        BekleKapat();




//        https://demowebshop.tricentis.com/errorpage.htm?aspxerrorpath=/%22

        /*[align='center']
        *
        *
        *
        * */
    }
}
