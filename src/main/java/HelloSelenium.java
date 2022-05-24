import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();

        driver.get("https://www.baidu.com");

        driver.getTitle(); // => "Google"

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchBox = driver.findElement(By.name("wd"));
        WebElement inputbox= driver.findElement(By.id("su"));

        searchBox.sendKeys("Selenium");
        inputbox.sendKeys("Selenium");
        inputbox.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"

        driver.quit();
    }
}
