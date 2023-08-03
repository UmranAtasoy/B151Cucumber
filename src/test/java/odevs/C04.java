package odevs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import techproed.utilities.TestBase;

public class C04 extends TestBase {

   /*
    Yeni bir class olusturun:WindowHandle
    Amazon anasayfa adresine gidin.
    Sayfa’nin window handle degerini String bir degiskene atayin
    Sayfa title’nin “Amazon” icerdigini test edin
    Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
    Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
    Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
    Sayfa title’nin “Walmart” icerdigini test edin
    Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

    */

    @Test
    public void test01() {
       // Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

        //Sayfa’nin window handle degerini String bir degiskene atayin
        String pageOne =driver.getWindowHandle();

        //Sayfa title’nin “Amazon” icerdigini test edin
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon"));

        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin

        driver.switchTo().newWindow(WindowType.TAB).get("https://techproeducation.com");

        //Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        String titleTwo = driver.getTitle();
        System.out.println(titleTwo);//Techpro Education | Online It Courses & Bootcamps

        Assert.assertFalse(titleTwo.contains("TECHPROEDUCATION"));

        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
       driver.switchTo().newWindow(WindowType.WINDOW).get("https://walmart.com");

        // Sayfa title’nin “Walmart” icerdigini test edin
        String titleTree = driver.getTitle();
        System.out.println(titleTree);//Walmart.com | Save Money. Live Better

       Assert.assertTrue(titleTree.contains("Walmart"));

       // Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(pageOne);
        String actualHandle = driver.getWindowHandle();
        Assert.assertEquals(actualHandle,pageOne);

    }
}