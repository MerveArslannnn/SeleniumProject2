import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Testler extends BaseDriver {
    public static Actions actions = new Actions(driver);
    public static String email = "grupdokuzzz@hotmail.com";

    @Test
    public void Test1() {
        //*Thr  sleep
        //*Tab tuşu
        driver.get("http://demowebshop.tricentis.com/");
        BekleElement(20);
        WebElement register = driver.findElement(By.linkText("Register"));
        actions.moveToElement(register).click().build().perform();
        WebElement malegender = driver.findElement(By.id("gender-male"));
        WebElement firstname = driver.findElement(By.id("FirstName"));
        WebElement lastname = driver.findElement(By.id("LastName"));
        WebElement email = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
        WebElement registerbtn = driver.findElement(By.id("register-button"));
//https://demowebshop.tricentis.com/registerresult/1
        Action action1 = actions.moveToElement(malegender).click().build();
        action1.perform();
        Beklethr(1);

        Action action2 = actions.moveToElement(firstname).click().sendKeys("Grup").build();
        action2.perform();
        Beklethr(1);


        Action action3 = actions.moveToElement(lastname).click().sendKeys("Dokuz").build();
        action3.perform();
        Beklethr(1);


        Action action4 = actions.moveToElement(email).click().sendKeys("ggroup9zzzz@hotmail.com").build();
        action4.perform();
        Beklethr(1);


        Action action5 = actions.moveToElement(password).click().sendKeys("Armin1234").build();
        action5.perform();
        Beklethr(1);


        Action action6 = actions.moveToElement(confirmpassword).click().sendKeys("Armin1234").build();
        action6.perform();
        Beklethr(1);


        Action action7 = actions.moveToElement(registerbtn).click().build();
        action7.perform();
        BekleSayfa(20);
//        WebElement resulttext = driver.findElement(By.xpath("[text()='Your registration completed']"));
//        System.out.println("resulttext.getText() = " + resulttext.getText());
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://demowebshop.tricentis.com/registerresult/1");
        BekleKapat();
    }

    @Test
    public void Test2() {
        driver.get("http://demowebshop.tricentis.com/");
        BekleElement(20);
        WebElement register = driver.findElement(By.linkText("Register"));
        actions.moveToElement(register).click().build().perform();
        WebElement malegender = driver.findElement(By.id("gender-male"));
        WebElement firstname = driver.findElement(By.id("FirstName"));
        WebElement lastname = driver.findElement(By.id("LastName"));
        WebElement email = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
        WebElement registerbtn = driver.findElement(By.id("register-button"));
//https://demowebshop.tricentis.com/registerresult/1
        Action action1 = actions.moveToElement(malegender).click().build();
        action1.perform();
        Beklethr(1);

        Action action2 = actions.moveToElement(firstname).click().sendKeys("Grup").build();
        action2.perform();
        Beklethr(1);


        Action action3 = actions.moveToElement(lastname).click().sendKeys("Dokuz").build();
        action3.perform();
        Beklethr(1);


        Action action4 = actions.moveToElement(email).click().sendKeys("cezaftsago@hotmail.com").build();
        action4.perform();
        Beklethr(1);


        Action action5 = actions.moveToElement(password).click().sendKeys("Armin1234").build();
        action5.perform();
        Beklethr(1);


        Action action6 = actions.moveToElement(confirmpassword).click().sendKeys("Armin1234").build();
        action6.perform();
        Beklethr(1);


        Action action7 = actions.moveToElement(registerbtn).click().build();
        action7.perform();
        BekleSayfa(20);
        WebElement errormessage = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
//        System.out.println(errormessage.getText());
//        if (errormessage.getText().equals("The specified email already exists")){
//            System.out.println("Hata mesajı doğru,The specified email already exists");
//        }else System.out.println("Farklı hata mesajı");
//        String url = driver.getCurrentUrl();
//
        Assert.assertEquals(errormessage.getText(), "The specified email already exists");

        BekleKapat();
    }

    @Test
    public void test3() {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action1 = actions.moveToElement(login).click().build();
        action1.perform();
        BekleSayfa(10);
        WebElement email = driver.findElement(By.id("Email"));
        Action action2 = actions.moveToElement(email).sendKeys("cezaftsago@hotmail.com").build();
        action2.perform();
        Beklethr(1);
        WebElement password = driver.findElement(By.id("Password"));
        Action action3 = actions.moveToElement(password).click().sendKeys("Armin1234").build();
        action3.perform();
        Beklethr(1);

        WebElement loginbtn = driver.findElement(By.cssSelector(" [class='button-1 login-button']"));
        Action action4 = actions.moveToElement(loginbtn).click().build();
        action4.perform();
        Beklethr(1);

        //WebElement loginbtn=driver.findElement(By.xpath("(//div[@class='buttons'])[3]/input"));
        BekleSayfa(10);
        Beklethr(20);
//        try {
//            driver.switchTo().alert().accept();
//        }catch (NoAlertPresentException ex){
//
//        }

        WebElement loginyazi = driver.findElement(By.xpath("//a[text()='cezaftsago@hotmail.com']"));
//        System.out.println(loginyazi.getText());
//        if (loginyazi.getText().equals("cezaftsago@hotmail.com")) {
//            System.out.println("Giriş başarılır");
//        } else {
//            System.out.println("Yanlış");
//        }
        Assert.assertEquals(loginyazi.getText(), "cezaftsago@hotmail.com");
        BekleKapat();
    }

    @Test
    public void Test4() {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action1 = actions.moveToElement(login).click().build();
        action1.perform();
        BekleSayfa(10);
        WebElement email = driver.findElement(By.id("Email"));
        Action action2 = actions.moveToElement(email).sendKeys("yanlisemailadresiyimben@hotmail.com").build();
        action2.perform();
        Beklethr(1);
        WebElement password = driver.findElement(By.id("Password"));
        Action action3 = actions.moveToElement(password).click().sendKeys("Armin1234").build();
        action3.perform();
        Beklethr(1);

        WebElement loginbtn = driver.findElement(By.cssSelector(" [class='button-1 login-button']"));
        Action action4 = actions.moveToElement(loginbtn).click().build();
        action4.perform();
        Beklethr(1);

        //WebElement loginbtn=driver.findElement(By.xpath("(//div[@class='buttons'])[3]/input"));
        BekleSayfa(10);
        WebElement errmessage = driver.findElement(By.cssSelector("[class='validation-summary-errors']>span"));
//        System.out.println(errmessage.getText());
//        if (errmessage.getText().contains("unsuccessful.")){
//            System.out.println("Hata mesajı geldi ");
//        }else {
//            System.out.println("Farklı mesaj");
//        }
        Assert.assertTrue("Hata mesajı geldi mi ? ", errmessage.getText().contains("unsuccessful."));

        BekleKapat();
    }

    @Test
    public void Test5() {
        driver.manage().deleteAllCookies();
        driver.get("http://demowebshop.tricentis.com/");
        //Giriş yap
        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action1 = actions.moveToElement(login).click().build();
        action1.perform();
        BekleSayfa(10);
        WebElement email = driver.findElement(By.id("Email"));
        Action action2 = actions.moveToElement(email).sendKeys("ggroup9zzzz@hotmail.com").build();
        action2.perform();
        Beklethr(1);
        WebElement password = driver.findElement(By.id("Password"));
        Action action3 = actions.moveToElement(password).click().sendKeys("Armin1234").build();
        action3.perform();
        Beklethr(1);

        WebElement loginbtn = driver.findElement(By.cssSelector(" [class='button-1 login-button']"));
        Action action4 = actions.moveToElement(loginbtn).click().build();
        action4.perform();
        Beklethr(1);

        //WebElement loginbtn=driver.findElement(By.xpath("(//div[@class='buttons'])[3]/input"));
        BekleSayfa(10);
        WebElement computer = driver.findElement(By.cssSelector("ul[class='top-menu']>:nth-child(2)>a"));
//        List<WebElement> notebooks=driver.findElements(By.cssSelector("ul[class='sublist firstLevel']>:nth-child(2)>a"));
//        WebElement notebook=notebooks.get(0);
        WebElement notebook = driver.findElement(By.xpath("(//div[@class='header-menu']/ul//li)[4]/a"));
        Action action = actions.moveToElement(computer).build();
        action.perform();
        Beklethr(1);
        Action action5 = actions.moveToElement(notebook).click().build();
        action5.perform();
        Beklethr(1);
        WebElement addtoCard = driver.findElement(By.cssSelector("[class='button-2 product-box-add-to-cart-button']"));
        Action action6 = actions.moveToElement(addtoCard).click().build();
        action6.perform();
        BekleElement(2);
        //!Assert YAZ
        WebElement succes = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
        System.out.println("succes.getText() = " + succes.getText());
        WebElement shoppingcart = driver.findElement(By.cssSelector("a[class='ico-cart']>span[class='cart-label']"));
        Action action7 = actions.moveToElement(shoppingcart).click().build();
        action7.perform();
        BekleSayfa(10);
        //!AssertYaz
        WebElement scc = driver.findElement(By.cssSelector("td[class='product']>a"));
        System.out.println("scc.getText() = " + scc.getText());
        WebElement agreecbx = driver.findElement(By.id("termsofservice"));
        Action action8 = actions.moveToElement(agreecbx).click().build();
        action8.perform();
        WebElement checkout = driver.findElement(By.id("checkout"));
        Action action9 = actions.moveToElement(checkout).click().build();
        action9.perform();
        BekleSayfa(10);
        WebElement companyinput = driver.findElement(By.id("BillingNewAddress_Company"));
        Action action10 = actions.moveToElement(companyinput).click().sendKeys("TechnoStudy").build();
        action10.perform();
        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select countryselect = new Select(country);
        countryselect.selectByVisibleText("Turkey");
        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        Action action11 = actions.moveToElement(city).click().sendKeys("Ankara").build();
        action11.perform();
        WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
        Action action12 = actions.moveToElement(address1).click().sendKeys("Pursaklar").build();
        action12.perform();
        WebElement address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
        Action action13 = actions.moveToElement(address2).click().sendKeys("Ulus").build();
        action13.perform();
        WebElement zip = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Action action14 = actions.moveToElement(zip).click().sendKeys("34290").build();
        action14.perform();
        WebElement phone = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Action action15 = actions.moveToElement(phone).click().sendKeys("05330276771").build();
        action15.perform();
        WebElement fax = driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        Action action16 = actions.moveToElement(phone).click().sendKeys("08508006006").build();
        action16.perform();
        WebElement continuebtn = driver.findElement(By.cssSelector("div[id='billing-buttons-container']>input"));
        Action action17 = actions.moveToElement(continuebtn).click().build();
        action17.perform();
        BekleSayfa(5);
//        WebElement input1=driver.findElement(By.id("[id='PickUpInStore']"));
        WebElement input1 = driver.findElement(By.xpath("//label[text()='In-Store Pickup']"));
        Action action18 = actions.moveToElement(input1).click().build();
        action18.perform();
        BekleSayfa(5);
        WebElement continuebtn1 = driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        Action action19 = actions.moveToElement(continuebtn1).click().build();
        action19.perform();
//        driver.switchTo().alert().dismiss();


        BekleSayfa(5);
        Beklethr(2);
        WebElement paymentmethod3 = driver.findElement(By.cssSelector("[id='paymentmethod_3']"));
        Action action20 = actions.moveToElement(paymentmethod3).click().build();
        action20.perform();
        Beklethr(2);
        WebElement continuebtn2 = driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        Action action24 = actions.moveToElement(continuebtn2).click().build();
        action24.perform();
        BekleSayfa(5);

//        WebElement inputpo = driver.findElement(By.id("CardholderName"));
//        Action action21 = actions.moveToElement(inputpo).click().sendKeys("Grup Dokuz").build();
//        action21.perform();
        WebElement inputcn = driver.findElement(By.id("PurchaseOrderNumber"));
        Action action25 = actions.moveToElement(inputcn).click().sendKeys("123456789").build();
        action25.perform();
//        WebElement carday = driver.findElement(By.id("ExpireMonth"));
//        Select selectay=new Select(carday);
//        selectay.selectByValue("07");


        WebElement continubtn = driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        Action action22 = actions.moveToElement(continubtn).click().build();
        action22.perform();
Beklethr(2);
        WebElement confirmbtn = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        Action action23 = actions.moveToElement(confirmbtn).click().build();
        Beklethr(2);
        action23.perform();
        BekleSayfa(5);
        Beklethr(2);
        WebElement title = driver.findElement(By.cssSelector("div[class='title']>strong"));
//        System.out.println(title.getText());
//        if (title.getText().equals("Your order has been successfully processed!")) {
//            System.out.println("Başarılı");
//        } else {
//            System.out.println("Maalesef");
//        }
        Assert.assertEquals(title.getText(),"Your order has been successfully processed!");
    }
}
