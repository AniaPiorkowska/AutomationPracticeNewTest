
//Zadanie 1
//Napisz test, który zweryfikuje działanie aplikacji, gdy przypróbie logowania nie podano loginu.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {


    WebDriver driver = new ChromeDriver();

    @Test
    void shouldVerifyNoLogin() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        WebElement sigInButton = driver.findElement(By.className("login"));
        Thread.sleep(2000);
        sigInButton.click();
        Thread.sleep(2000);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement submitButton = driver.findElement(By.id("SubmitLogin"));
        passwordInput.sendKeys("ania1234Z");
        submitButton.click();
        WebElement myAccountPageTitle = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > p"));
        Assertions.assertEquals("There is 1 error", myAccountPageTitle.getText());
        driver.quit();

    }
}
