package techproed.day15_FileExist;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.TestBase;

public class C03_File_Upload extends TestBase {
    // masaustunde bir deneme dosyası olusturun

// 'https://the-internet.herokuapp.com/upload' adresine gidiniz
// 'Dosya Seç' kısmına deneme dosyasını yükleyiniz
// 'Upload' butonuna basın
// 'File Uploaded!' yazısının goruntulendigini test edin


    @Test
    public void name() {

// 'https://the-internet.herokuapp.com/upload' adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/upload");
        bekle(3);
// 'Dosya Seç' kısmına deneme dosyasını yükleyiniz
        WebElement dosyaSec = driver.findElement(By.xpath("//input[@id='file-upload']"));

        bekle(3);

        //C:\Users\Harun ATASOY SCHOOL            \Desktop\deneme.txt
        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Desktop\\deneme.txt";

        String dosyaYolu = farkliKisim+ortakKisim;

        dosyaSec.sendKeys(dosyaYolu);


        // 'Upload' butonuna basın
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();

        bekle(3);

     // 'File Uploaded!' yazısının goruntulendigini test edin

        WebElement yazi = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        Assert.assertTrue(yazi.isDisplayed());


    }
}
