package homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework {

    private static WebDriver driver;

    @BeforeAll
    public static void classSetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

//    @AfterAll
//    public static void classTearDown() {
//        driver.quit();
//    }

    @Test
    public void createNewAccount(){
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signIn.click();
        WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        createAccount.click();
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test
    public void xpathFind(){
        driver.get("https://mystore-testlab.coderslab.pl//index.php?controller=authentication&create_account=1");
        WebElement socialStatus = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/label"));
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[2]/label"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[3]/label"));
        WebElement email = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[4]/label"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[4]/label"));
        WebElement show = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[5]/div[1]/div/span/button"));
        WebElement birthdate = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[6]/label"));

    }
}
