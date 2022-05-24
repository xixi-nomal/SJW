/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 05 02 09:10
 **/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
public class FirstDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //打开bing
        driver.get("https://www.zhihu.com/ ");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //打开百度
        driver.get("https://baidu.com/ ");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        //1、tab页前进后退
        driver.navigate().back();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        //2、tab页后退

        driver.navigate().forward();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        //tab页刷新
        driver.navigate().refresh();


        //获取tab页标题
        String title = driver.getTitle();
        System.out.println("title"+title);

        //5、退出
        driver.quit();
    }

}
