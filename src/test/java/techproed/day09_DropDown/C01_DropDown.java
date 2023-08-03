package techproed.day09_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropDown {

    /*
    DropDown: Alt basliklarin oldugu menu listesidir.
    DropDown uc adimda handle edilir.
    1)DropDown locate edilmelidir.
    2)Select objesi olusturulmalidir.
    Select select = new Select(ddm);
    3)Opsiyonlardan bir tanesi secilir
     -selectByVisibleText() ==> opsiyona gorunur metin ile ulasmak icin kullanilir
     -selectByIndex() ==>opsiyona index ile ulasmak icin kullanilir.(index 0 dan baslar)
     -selectByValue() ==>opsiyona value ile ulasmak icin kullanilir.

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
    public void test01() {
        // https://testcenter.techproeducation.com/index.php?page=dropdown sayfasına gidiniz
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        // Yıl Drodown'undan "2020" seciniz
        WebElement ddmYil = driver.findElement(By.xpath("//select[@id='year']"));
        Select select = new Select(ddmYil);
        select.selectByVisibleText("2020"); //secmek istedigimiz opsiyonu gorundugu sekilde yazmaliyiz
       // select.deselectByIndex(3);
       // select.deselectByValue("2020");

// Ay Dropdown'undan "August" seciniz
        WebElement ddmAy = driver.findElement(By.xpath("//select[@id='month']"));
        Select select1 = new Select(ddmAy);
        select1.selectByVisibleText("August");

        //select1.selectByIndex(7);
        //select1.selectByValue("7");

       // Gün Dropdown'undan "5" seciniz
        WebElement ddmGun = driver.findElement(By.xpath("//select[@id='day']"));
        Select select2 = new Select(ddmGun);
        select2.selectByVisibleText("5");

        //select2.selectByIndex(4);
        //select2.selectByValue("5");


    }
}


