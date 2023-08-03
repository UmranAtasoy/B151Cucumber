package techproed.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTableStepDefination {
    DataTablePage dataTablePage = new DataTablePage();

    @Then("kullanici sayfadaki tablodaki new butonuna tiklar")
    public void kullaniciSayfadakiTablodakiNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }


    @And("cikan pencerede verilen bilgiler girilir {string},{string},{string},{string},{string},{string},{string}")
    public void cikanPenceredeVerilenBilgilerGirilir(String name, String lastName, String position, String office, String extention, String date, String salary) {
    dataTablePage.firstname.sendKeys(name, Keys.TAB,
                                     lastName,Keys.TAB,
                                     position,Keys.TAB,
                                     office,Keys.TAB,
                                     extention,Keys.TAB,
                                     date,Keys.TAB,
                                      salary,Keys.TAB);
        }


    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        dataTablePage.createButton.click();
    }

    @And("kullanici searh bolumune {string} bilgisini girer")
    public void kullaniciSearhBolumuneBilgisiniGirer(String str) {
        dataTablePage.searchBox.sendKeys(str);
    }

    @And("kullanici {string} ile basarili giris yapildigini dogrular")
    public void kullaniciIleBasariliGirisYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablePage.verify.getText().contains(name));
    }
}

