package techproed.day19_ExtentReport_WebTable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.TestBase;

import java.util.List;

public class C03_WebTables extends TestBase {
    /*
  WEBTABLE;
      <table> tagı ile başlar
          <thead> başlıklar için bu tag ile devam eder
              <tr> başlıkların satırı
              <th> table head
                  <td> başlıktaki veriler
              <tbody> başlıklar altındaki verileri temsil eder
                      <tr> table row(satır)
                          <td> table data (tablodaki veri)

   */
    @Test
    public void test01() {
        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");

        //    Task 1 : Table1’i yazdırın
        WebElement table1 = driver.findElement(By.xpath("(//table)[1]"));
        System.out.println("Tablo 1");
        System.out.println(table1.getText());

        //    Task 2 : 3. Satır verilerini yazdırın
        WebElement ucuncuSatir = driver.findElement(By.xpath("(//table)[1]//tr[3]"));
        System.out.println("*********************************************");
        System.out.println(ucuncuSatir.getText());


        //    Task 3 : Son satırın verilerini yazdırın

        WebElement sonSatir = driver.findElement(By.xpath("(//table)[1]//tr[4]"));
        //tr[4] yerine (//tbody)[1]//tr[last()]yazarsak son satiri aliriz
        System.out.println("************************************");
        System.out.println(sonSatir.getText());


        //    Task 4 : 5. Sütun verilerini yazdırın
        WebElement besinciSutunBasligi = driver.findElement(By.xpath("(//thead)[1]//th[5]"));
        System.out.println("*************");
        System.out.println("5. sutun basligi : "+besinciSutunBasligi.getText());

        System.out.println("********* ");

       List<WebElement> besinciSutunVerileri = driver.findElements(By.xpath("(//table)[1]//td[5]"));
       besinciSutunVerileri.forEach(t-> System.out.println(t.getText()));


        System.out.println("**************");

        List<WebElement> birVeİkinciSutun = driver.findElements(By.xpath("(//tbody)[1]//tr[3]//td[position()>=1 and position()<=2]"));
        birVeİkinciSutun.forEach(t-> System.out.print(t.getText()+"\t") );
        System.out.println("***************");

        //    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
        //    Parameter 1 = satır numarası
        //    Parameter 2 = sütun numarası
        //    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.

        WebElement ikinciSatirUcuncuSutun = driver.findElement(By.xpath("(//tbody)[1]//tr[2]//td[3]"));

        System.out.println("*************");
        printData(2,3);
    }

    private void printData(int satir, int sutun) {

        WebElement satirsutun = driver.findElement(By.xpath("(//tbody)[1]//tr["+satir+"]//td["+sutun+"]"));
        //dinamik hale getirdik
        System.out.println(satirsutun.getText()+"\t");

    }

}
