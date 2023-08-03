package calisma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import techproed.utilities.TestBase;

public class C04 extends TestBase {
    // https://www.teknosa.com/ adresine gidin
    // arama cubuguna oppo yazip enter'a basınız
    // sonuc yazısını yazdiriniz
    // ilk urunun fotografını cekin


    @Test
    public void test01() {
        driver.get("https://www.teknosa.com/");

      try{
          driver.findElement(By.xpath("//div[@id='ins-editable-button-1580496494']")).click();

      } catch (Exception e) {
          System.out.println("cookies cikmadi");
      }

        WebElement aramaCubugu = driver.findElement(By.xpath("//input[@id='search-input']"));

        aramaCubugu.sendKeys("oppo" + Keys.ENTER);

        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='plp-panel-block1']"));

        System.out.println(sonucYazisi.getText());
        WebElement ilkUrun = driver.findElement(By.xpath("(//a[@class=' prd-link '])[1]"));
        webElementResmi(ilkUrun);

    }
}
