//Zadanie 3
//Sprawdź, czy strona główna oraz strona logowania zawiera logo i pole wyszukiwania

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    WebDriver driver = new ChromeDriver();

    @Test
    void shouldVerifyLogo() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        WebElement logoImg = driver.findElement(By.cssSelector("#header_logo > a > img"));
        WebElement Search = driver.findElement(By.id("search_query_top"));

        driver.quit();
    }



        @Test
        void shouldVerifyLogin () throws InterruptedException {
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

            WebElement logoImg = driver.findElement(By.cssSelector("#header_logo > a > img"));
            WebElement Search = driver.findElement(By.id("search_query_top"));

            driver.quit();
        }


    }



