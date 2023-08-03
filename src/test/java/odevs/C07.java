package odevs;

import org.junit.Test;
import org.openqa.selenium.By;
import techproed.utilities.TestBase;

public class C07 extends TestBase {
    /*
    //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver adresine gidelim
//Click me to open an Alert buttonuna basalım
//Çıkan Alert'ü kapatalım
     */

    @Test
    public void test01() {
        //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver adresine gidelim
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

//Click me to open an Alert buttonuna basalım
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        alertWait(6);
//Çıkan Alert'ü kapatalım
acceptAlert();
    }
}
