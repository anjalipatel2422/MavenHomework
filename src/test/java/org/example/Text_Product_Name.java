package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Text_Product_Name
{
    static WebDriver driver;

    public static void main(String[]args)  {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[1]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/h2")).click();

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
        driver.findElement(By.cssSelector("span.close")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
        String pageText=driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).getText();
        System.out.println(pageText);
        String pageText1=driver.findElement(By.linkText("Nokia Lumia 1020")).getText();
        System.out.println(pageText1);



    }}
