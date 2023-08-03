package techproed.day16_Wait;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import techproed.utilities.TestBase;

import java.time.Duration;

public class C03_FluentWait extends TestBase {

    /*
    Belirli bir kosul gerceklesene kadar max sure boyunca belirttigimiz araliklarla webelementi kontrol ederek
    bekleme yapacak

    Expilicit Wait te default olarak 500 mls saniye araliklarla check ederek bekleme yaparken
    FluentWait bizim belirttigimiz araliklarla check ederek bekleme yapar
     */

    //==> https://the-internet.herokuapp.com/dynamic_loading/1 sayfasına gidin
    //==> Start buttonuna tıklayın
    //==> Hello World! yazısının görünürlügünü test edin

    @Test
    public void name() {


        //==> https://the-internet.herokuapp.com/dynamic_loading/1 sayfasına gidin

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //==> Start buttonuna tıklayın
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        //==> Hello World! yazısının görünürlügünü test edin
        WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        Wait<WebDriver> wait = new FluentWait<>(driver).
                                            withTimeout(Duration.ofSeconds(30)). //Fluent wait icin max bekleme suresi
                                            pollingEvery(Duration.ofSeconds(3)). //her 3 sn de bir webelementi kontrol eder
                                            withMessage("Ignore Exeption"); // zorunlu degil hata durumunda msj vermek icin kullanilir

        Assert.assertTrue(helloWorld.isDisplayed());
        

    }
}