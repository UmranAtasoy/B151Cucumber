package techproed.day09_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_DropDown {
    /*
    -getFirsSelectedOption() ==> dropDown daki en son sectigimiz opsiyonu bize dondurur.

    -getOptions ==> dropdown daki tum opsiyonlari bize donrurur.

     */
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void test01 () {
        //  sayfasına gidiniz

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        // Select a State Dropdown'undan "Arizona" seciniz
        WebElement ddmSelectState = driver.findElement(By.xpath("//select[@id='state']"));
        Select select = new Select(ddmSelectState);
        select.selectByVisibleText("Arizona");


        // Select a State Dropdown'undan son secilen option'un "Arizona" oldugunu test ediniz
         WebElement sonSecilenOpsiyon = select.getFirstSelectedOption();
         String sonSecilenOpsiyonStr = sonSecilenOpsiyon.getText();

         Assert.assertEquals("Arizona",sonSecilenOpsiyonStr);



        // Select a State Dropdown'undaki tum optionları konsolda yazdırınız
     // List<WebElement> tumOpsiyonlar =  select.getOptions();
       // for (WebElement each:tumOpsiyonlar) {
         //   System.out.println(each.getText());

            /*
            String tumOpsiyonlar = ddmSelectState.getText();

            System.out.println(tumOpsiyonlar);
             */

            /*
            tumOpsiyonlar.
            stream().
            forEach(t-> System.out.println(t.getText()));
             */

            //************2.yol***********

        List<WebElement> tumOptions = driver.findElements(By.xpath("//select[@id='state']//option"));

        tumOptions.stream().forEach(t-> System.out.println(t.getText()));

        //   for (WebElement each: tumOptions) {
        //      System.out.println(each.getText());

        }
        }

