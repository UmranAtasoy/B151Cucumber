package odevs;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.utilities.TestBase;

public class C06 extends TestBase {
    /*

   - http://szimek.github.io/signature_pad/ sayfasına gidiniz
- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
- Çizimden sonra clear butonuna basınız
- Sayfayi kapatiniz

     */

    @Test
    public void test01() {
       // - http://szimek.github.io/signature_pad/ sayfasına gidiniz
       driver.get("http://szimek.github.io/signature_pad/");


        // - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement chart = driver.findElement(By.xpath("//div[@class='signature-pad--body']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(chart).moveByOffset(100,10).moveByOffset(20,30).moveByOffset(54,61).build().perform();

        actions.release().perform();
        bekle(3);

       // - Çizimden sonra clear butonuna basınız

        WebElement clearButton = driver.findElement(By.xpath("//button[@class='button clear']"));
        clearButton.click();
        bekle(3);

        //- Sayfayi kapatiniz

        driver.close();





    }
}
