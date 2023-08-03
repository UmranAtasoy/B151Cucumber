package techproed.day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import techproed.utilities.TestBase;

public class C03_WindowHandle extends TestBase {
    @Test
    public void windowHandle() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
driver.get("https://www.techproeducation.com");
String techproedWindowHandle = driver.getWindowHandle();

//Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

//Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:

        driver.switchTo().newWindow(WindowType.WINDOW);// -->Yeni bir pencereye driver'i taşır
                                                      //WindowType.TAB --> Yeni bir sekme açar

        driver.get("https://www.youtube.com");
        String youtubeHandle = driver.getWindowHandle();


//Window 3'te https://www.linkedin.com sayfasını açınız:

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        String linkedinHandle = driver.getWindowHandle();
//techproeducation sayfasına geçiniz:

        driver.switchTo().window(techproedWindowHandle);
        bekle(2);

//youtube sayfasına geçiniz:

        driver.switchTo().window(youtubeHandle);
        bekle(2);

//linkedIn sayfasına geçiniz:

        driver.switchTo().window(linkedinHandle);
        bekle(2);
    }
}
