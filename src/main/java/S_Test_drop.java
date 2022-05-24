import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 05 13 11:08
 **/
public class S_Test_drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///E:/qq%E9%BB%98%E8%AE%A4%E4%BF%9D%E5%AD%98%E6%96%87%E4%BB%B6/demo_move_drag.html");
        Actions actions = new Actions(driver);

        WebElement Ele =driver.findElement(By.xpath("//*[@id=\"box1\"]"));
        WebElement recEle =driver.findElement(By.xpath("//*[@id=\"area1\"]"));
        actions.dragAndDrop(Ele,recEle).perform();

        actions.dragAndDropBy(Ele,recEle.getLocation().x+200,recEle.getLocation().y+0);
    }
}
