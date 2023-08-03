package odevs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.utilities.TestBase;

public class C05 extends TestBase {
      /*
    1- "http://webdriveruniversity.com/Actions" sayfasina gidin
    2- Hover over  Me First" kutusunun ustune gelin
    3- Link 1" e tiklayin
    4- Popup mesajini yazdirin
    5- Popup'i tamam diyerek kapatin
    6- “Click and hold" kutusuna basili tutun
    7-“Click and hold" kutusunda cikan yaziyi yazdirin
    8- “Double click me" butonunu cift tiklayin. Tıklandığını test edin

     */

    @Test
    public void test01() {
        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2- Hover over  Me First" kutusunun ustune gelin
        WebElement kutu = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(kutu).perform();


        // 3- Link 1" e tiklayin
        WebElement link = driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));

        actions.moveToElement(link).click().perform();


        //4- Popup mesajini yazdirin
        String popUp = getTextAlert();
        System.out.println("Pop-Up msjı : " + popUp);

        //5- Popup'i tamam diyerek kapatin
        acceptAlert();

        //6- “Click and hold" kutusuna basili tutun
        WebElement clickHold = driver.findElement(By.xpath("//div[@id='click-box']"));
        actions.moveToElement(clickHold).clickAndHold().perform();

        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        String kutudakiYazi = driver.findElement(By.xpath("//div[@id='click-box']")).getText();

        System.out.println(kutudakiYazi);

        //8- “Double click me" butonunu cift tiklayin. Tıklandığını test edin
     /*  WebElement buton = driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
        actions.doubleClick(buton).perform();

        String actualClass = buton.getAttribute("class");
        String expectedClass = "div-double-click double";
        Assert.assertEquals(expectedClass, actualClass);
     */

        WebElement doubleClick = driver.findElement(By.xpath("//div[@id='double-click']"));
        actions.doubleClick(doubleClick).perform();

        bekle(3);



        String actualClass = doubleClick.getAttribute("class");
        String expectedClass = "div-double-click double";
        Assert.assertEquals(expectedClass, actualClass);


        //tıkladigini test edebilmek icin tikladiktan sonra olusan degisikligin attributesini alip assert etmeliyiz
    }
}
