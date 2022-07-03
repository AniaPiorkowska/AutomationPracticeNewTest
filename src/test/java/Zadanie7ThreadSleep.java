import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadanie7ThreadSleep {


    WebDriver driver = new ChromeDriver();

    @Test
    void shouldVerifyRemove() throws InterruptedException {
        {
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php");
            WebElement Tshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
            Thread.sleep(2000);
            Tshirts.click();
            WebElement fadedShortSleeveTshirtsDetails = driver.findElement
                    (By.cssSelector("div[class='right-block'] a[class='product-name']"));
            fadedShortSleeveTshirtsDetails.click();

            Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit")));
            WebElement addToCart = driver.findElement(By.name("Submit"));
            Thread.sleep(2000);
            addToCart.click();
            WebElement proceedToCheckout = driver.findElement(By.className("button-medium"));
            Thread.sleep(2000);
            proceedToCheckout.click();
            WebElement delete = driver.findElement(By.cssSelector("#\\31 _1_0_0"));
            Thread.sleep(2000);
            delete.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-warning")));

            WebElement yourShoppingCartIsEmpty = driver.findElement(By.cssSelector(".alert-warning"));

            Assertions.assertEquals("Your shopping cart is empty.", yourShoppingCartIsEmpty.getText());

            driver.quit();

        }
    }
}

