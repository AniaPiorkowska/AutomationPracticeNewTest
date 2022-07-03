//Zadanie5
//Napisz test sprawdzający przejście ze strony logowania do strony głównej.


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie5 {
    WebDriver driver = new ChromeDriver();

    @Test
    void shouldVerifyHome() {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebElement yourLogo = driver.findElement(By.cssSelector("#header_logo > a > img"));
        yourLogo.click();
        WebElement popularButton = driver.findElement(By.cssSelector("#home-page-tabs > li.active > a"));

        Assertions.assertEquals("POPULAR", popularButton.getText());
        driver.quit();



    }

}
