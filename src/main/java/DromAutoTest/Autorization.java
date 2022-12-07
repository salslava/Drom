package DromAutoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autorization {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://auto.drom.ru/");

        WebElement login = driver.findElement(By.xpath("//*[text()='Вход']"));
            login.click();
        WebElement username = driver.findElement(By.xpath("//input[@name='sign']"));
            username.sendKeys("testrsvs");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            password.sendKeys("Hbi4Rt");
        WebElement enter = driver.findElement(By.id("signbutton"));
            enter.click();
        WebElement favorite =driver.findElement(By.cssSelector("div.css-1rozdag"));
            favorite.click();


        driver.close();
    }
}
