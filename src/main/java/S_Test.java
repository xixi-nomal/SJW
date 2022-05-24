import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S_Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        WebElement searchBox = driver.findElement(By.name("wd"));
        WebElement inputbox = driver.findElement(By.id("su"));
        searchBox.sendKeys("Selenium书");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.sendKeys(Keys.BACK_SPACE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.sendKeys(Keys.SPACE + "教程");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.sendKeys(Keys.CONTROL, "a");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.sendKeys(Keys.CONTROL, "x");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.sendKeys(Keys.CONTROL, "v");

        inputbox.click();
    }
}
