import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.naming.Context;

/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 05 13 10:13
 **/
public class S_TEXT_Click {
    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.get("file:///E:/qq%E9%BB%98%E8%AE%A4%E4%BF%9D%E5%AD%98%E6%96%87%E4%BB%B6/demo_clicks.html");
        Actions actions = new Actions(driver);
        System.out.println("11111");

        WebElement txtEle =driver.findElement(By.name("t2"));
        txtEle.sendKeys("hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement ele1 =driver.findElement(By.name("t1"));
        ele1.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement doubleEle =driver.findElement(By.xpath("/html/body/form/input[2]"));
        actions.doubleClick(doubleEle).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement ele3 =driver.findElement(By.xpath("/html/body/form/input[3]"));
        actions.click(ele3).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement ele4 =driver.findElement(By.xpath("/html/body/form/input[4]"));
        actions.contextClick(ele4).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement ele5 =driver.findElement(By.xpath("/html/body/form/input[5]"));
        actions.moveToElement(ele5).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
