package practices.day06_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.utilities.TestBase;

public class C02_ActionsDragAndDrop extends TestBase {
    // https://demoqa.com/droppable adresine gidiniz
// 'Drag me' butonunu tutup 'Drop here' kutusunun ustune birakiniz
// 'Drop here' yazisi yerine 'Dropped!' oldugunu test ediniz


    @Test
    public void test01() {
        // https://demoqa.com/droppable adresine gidiniz
         driver.get("https://demoqa.com/droppable");



         // 'Drag me' butonunu tutup 'Drop here' kutusunun ustune birakiniz

        WebElement dragMeButon = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(dragMeButon).perform();

        WebElement dropHereButon = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        actions.moveToElement(dropHereButon).release().build().perform();




// 'Drop here' yazisi yerine 'Dropped!' oldugunu test ediniz
        String expectedValue = "Dropped!";
        String actualValue = dropHereButon.getText();

        Assert.assertEquals(expectedValue,actualValue);

    }
}
