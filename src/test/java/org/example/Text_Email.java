package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Text_Email
{
    static WebDriver driver;
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()=\"Computers \"]")).click();
        driver.findElement(By.xpath("//a[text()=\" Desktops \"]")).click();

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/h2/a[1]")).click();

        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
        String enterFriendEmailErrorMessage=driver.findElement(By.xpath("//span[@id=\"FriendEmail-error\"]")).getText();
        System.out.println(enterFriendEmailErrorMessage);
        String enterYourEMailErrorMessage=driver.findElement(By.xpath("//span[@id=\"YourEmailAddress-error\"]")).getText();
        System.out.println(enterYourEMailErrorMessage);
    }
}
