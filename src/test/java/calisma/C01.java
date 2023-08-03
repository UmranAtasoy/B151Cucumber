package calisma;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.utilities.TestBase;

public class C01 extends TestBase {
    @Test
    public void name() {

        // 1. Tarayıcıyı başlatın
//2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");


        //          3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement home = driver.findElement(By.xpath("//a[@style='color: orange;']"));

        Assert.assertTrue(home.isDisplayed());



        //4. 'Bize Ulaşın' düğmesine tıklayın
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();


//5. "İLETİŞİME GEÇİN"in görünür olduğunu doğrulayın

        WebElement baslik = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(baslik.isDisplayed());

        //6. Adı, e-postayı, konuyu ve mesajı girin
        WebElement name = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        name.sendKeys("Umran");

        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        email.sendKeys("umrangunes@hotmail.com");

        WebElement subject = driver.findElement(By.xpath("//input[@name='subject']"));
        subject.sendKeys("Test");


         //7. Dosya yükleyin
         WebElement dosyaSec = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));

        //C:\Users\Harun ATASOY SCHOOL            \Desktop\deneme.txt
        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Desktop\\deneme.txt";

        String dosyaYolu = farkliKisim+ortakKisim;

        dosyaSec.sendKeys(dosyaYolu);


//8. 'Gönder' düğmesini tıklayın
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

 WebElement submit = driver.findElement(By.xpath("//input[@class='btn btn-primary pull-left submit_form']"));

       submit.click();




         //9. Tamam düğmesine tıklayın

driver.switchTo().alert().accept();


//10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
        WebElement msg = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));


        Assert.assertTrue(msg.isDisplayed());

//11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın

        WebElement homeButon = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
       homeButon.click();

        driver.switchTo().frame(1);

        WebElement carpi = driver.findElement(By.xpath("//div[@id='dismiss-button']"));

        carpi.click();

        Assert.assertTrue(home.isDisplayed());






    }
}