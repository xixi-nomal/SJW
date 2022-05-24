import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 05 06 11:27
 **/
public class S_Test_Tabs {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "D:/tools/rjcs/WebDriverromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //打开bing
        driver.get("https://cn.bing.com/ ");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.niit.edu.cn/ ");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.manage().window().minimize();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //新建window

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.niit.edu.cn/ ");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.close();
    }
}
