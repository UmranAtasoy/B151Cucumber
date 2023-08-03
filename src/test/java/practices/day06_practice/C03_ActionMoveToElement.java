package practices.day06_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.utilities.TestBase;

import java.util.Set;

public class C03_ActionMoveToElement extends TestBase {
    // https://amazon.com adresine gidiniz
// sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
// Change country/region butonuna basiniz
// United States dropdown'undan 'Turkey (Türkiye)' seciniz
// Go to website butonuna tiklayiniz
// acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz

    @Test
    public void test01() {
        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");

        String pageOne = driver.getWindowHandle();
        System.out.println(pageOne);

        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        WebElement secenekMenusu = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(secenekMenusu).perform();
bekle(3);
        // Change country/region butonuna basiniz
      driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();



      // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        //dropdown gorunce select aramaliyiz

        WebElement ddm = driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Turkey (Türkiye)");

driver.findElement(By.xpath("//div[@class='a-row a-spacing-extra-large a-spacing-top-base a-ws-row']")).click();


        // Go to website butonuna tiklayiniz
      driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
 bekle(3);

          // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz

        Set<String> handles = driver.getWindowHandles();
        String pageTwo = "";

        for (String each : handles) {
            if (!each.equals(pageOne)){
                pageTwo = each;

            }
        }
        System.out.println(pageTwo);

        driver.switchTo().window(pageTwo);
        bekle(3);



        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains("Elektronik"));


    }

}
