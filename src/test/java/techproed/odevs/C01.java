package techproed.odevs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {
    public static void main(String[] args) {


        //C01_TekrarTesti isimli bir class  olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//https://www.google.com/  adresine gidin
driver.get("https://www.google.com/");

//cookies uyarisini  kabul ederek kapatin
   //--cookies uyarisi cikmadi--

//Sayfa	basliginin	"Google"	ifadesi	icerdigini	test  edin
String actualTitle = driver.getTitle();
String expectedTitle = "Google";
if(actualTitle.contains(expectedTitle)){
    System.out.println("Test Pass");

}else {
    System.out.println("Test Fail");

}
//Arama cubuguna "Nutella" yazip aratin
        WebElement aramaCubugu = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
aramaCubugu.sendKeys("Nutella", Keys.ENTER);

//Bulunan sonuc sayisini yazdirin
        WebElement sonucYazsisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(sonucYazsisi.getText()); //Yaklaşık 116.000.000 sonuç bulundu (0,38 saniye)

        String [] sonucSayisi = sonucYazsisi.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));//[Yaklaşık, 155.000.000, sonuç, bulundu, (0,34, saniye)]
        System.out.println(sonucSayisi[1]); //116.000.000

//sonuc sayisinin 10 milyon'dan fazla oldugunu test  edin

        int sonuc= Integer.valueOf(sonucSayisi[1].replace(".",""));

        if (sonuc>10000000){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

//Sayfayi kapatin
        driver.close();




    }
}

