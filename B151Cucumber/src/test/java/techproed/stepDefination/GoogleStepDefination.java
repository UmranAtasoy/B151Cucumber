package techproed.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefination {
    GooglePage googlePage = new GooglePage();
    @Given("kullanici {string} sayfasina gitti")
    public void kullaniciSayfasinaGitti(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("kullanici google arama kutusunda {string} aratir")
    public void kullaniciGoogleAramaKutusundaAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
    }

    @And("google sayfasinda basligin {string} icerdigini test eder")
    public void googleSayfasindaBasliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("kullanici google arama kutusunda {string} aratti")
    public void kullaniciGoogleAramaKutusundaAratti(String araclar) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(araclar),Keys.ENTER);
    }

    @And("google sayfasinda basligin {string} icerdigini test etti")
    public void googleSayfasindaBasliginIcerdiginiTestEtti(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }


}
