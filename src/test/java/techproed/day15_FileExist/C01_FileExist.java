package techproed.day15_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void fileExist() {
        System.out.println(System.getProperty("user.dir")); //icinde bulundugumuz dosya yolunu verir
        //C:\Users\Harun ATASOY SCHOOL\IdeaProjects\B151MavenJUnit

        System.out.println(System.getProperty("user.home")); //herkesin bilgisayarinda farkli olan yeri verir
        //C:\Users\Harun ATASOY SCHOOL


//********************** Soru ******************
        // Desktop(masaustu)'da bir text dosyası olusturun
       // Desktop(masaustu)'da text dosyasının olup olmadıgını test edin

              /*
        dosyanın,bilgisayarımda destop'da olup olmadıgını
        Java ile test edecegim.
        cunku selenium, web sayfalarını test eder.
        Selenium, benim bilgisayarımdaki desktop'a mudahele edemez
         */

        //C:\Users\Harun ATASOY SCHOOL\Desktop\Java icin.txt
        Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\Harun ATASOY SCHOOL\\Desktop\\Java icin.txt")));


    }
}
