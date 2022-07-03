//Napisz test sprawdzający przejście ze strony głównejdo strony”Kontakt”

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie4 {
    WebDriver driver = new ChromeDriver();

    @Test
    void shouldVerifyContact() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        WebElement contactUs = driver.findElement(By.id("contact-link"));
        Thread.sleep(2000);
        contactUs.click();
       WebElement contact =driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
        Thread.sleep(2000);
       Assertions.assertEquals("CUSTOMER SERVICE - CONTACT US", contact.getText());
        driver.quit();

    }
}



