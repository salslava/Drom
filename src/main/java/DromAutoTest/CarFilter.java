package DromAutoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CarFilter {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://auto.drom.ru/");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement brand = driver.findElement(By.xpath("//input[@placeholder='Марка']"));
            brand.click();
        WebElement toyota = driver.findElement(By.xpath("//*[contains(text(),'Toyota (')]"));
            toyota.click();

            WebElement wait = new WebDriverWait (driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Модель']")));

        WebElement model = driver.findElement(By.xpath("//input[@placeholder='Модель']"));
            model.click();
        WebElement wait2 = new WebDriverWait (driver,Duration.ofSeconds(10))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Любая модель']")));
        WebElement findHarrier = driver.findElement(By.xpath("//input[@placeholder='Модель']"));
            findHarrier.sendKeys("harr");
        WebElement wait3 = new WebDriverWait (driver,Duration.ofSeconds(10))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='css-109956f e1x0dvi10']")));
        WebElement harrier = driver.findElement(By.xpath("//div[@class='css-109956f e1x0dvi10']"));
            harrier.click();

        WebElement fuel = driver.findElement(By.xpath("//button[text()='Топливо']"));
            fuel.click();
        WebElement hybrid = driver.findElement(By.xpath("//div[text()='Гибрид']"));
            hybrid.click();

        WebElement unsold = driver.findElement(By.xpath("//label[text()='Непроданные']"));
            unsold.click();

        WebElement advsrch = driver.findElement(By.xpath("//span[text()='Расширенный поиск']"));
            advsrch.click();

        WebElement mileage = driver.findElement(By.xpath("//input[@placeholder='от, км']"));
            mileage.sendKeys("1");

        WebElement year = driver.findElement(By.xpath("//*[text()='Год от']"));
            year.click();
        WebElement y2007 = driver.findElement(By.xpath("//div[@class='css-u25ii9 e154wmfa0'] //div[text()='2007']"));
            y2007.click();

        WebElement show = driver.findElement(By.xpath("//div[text()='Показать']"));
            show.click();

    }
}
