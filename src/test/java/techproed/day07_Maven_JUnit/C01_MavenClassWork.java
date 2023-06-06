package techproed.day07_Maven_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenClassWork {
    public static void main(String[] args) throws InterruptedException {
        // http://zero.webappsecurity.com sayfasina gidin
        // Signin buttonuna tiklayin
        // Login alanina  "username" yazdirin
        // Password alanine "password" yazdirin
        // Sign in buttonuna tiklayin
        // Güvenlik problemini gecmek icin sayfada bir geri gelin
        // Online Banking bölümüne tıklamalın
        // Pay Bills yazan kısıma tıklayın
        // Amount kismina yatirmak istediginiz herhangi bir miktari yazin
        // Date kismina "2020-09-10" yazdirin
        // Pay buttonuna tiklayin
        // "The payment was successfully submitted." mesajinin ciktigini test edin
        // Sayfayi kapatın

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        // Signin buttonuna tiklayin
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButton.click();

        // Login alanina  "username" yazdirin
        WebElement loginSpace = driver.findElement(By.xpath("//input[@id='user_login']"));
        loginSpace.sendKeys("username");

       // Password alanine "password" yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

        // Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

        // Güvenlik problemini gecmek icin sayfada bir geri gelin
        driver.navigate().back();

        // Online Banking bölümüne tıklamalın
        driver.findElement(By.xpath("//a[@id='online-banking']")).click();

        // Pay Bills yazan kısıma tıklayın
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

        // Amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amountSpace = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amountSpace.sendKeys("10000");

        // Date kismina "2020-09-10" yazdirin
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(2000);

        // Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // "The payment was successfully submitted." mesajinin ciktigini test edin
        WebElement mesaj = driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));

        if(mesaj.isDisplayed()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }


        // Sayfayi kapatın
        driver.close();


    }

}
