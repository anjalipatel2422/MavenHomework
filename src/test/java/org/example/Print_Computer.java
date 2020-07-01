package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Print_Computer
{
    static WebDriver driver;
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//a[text()=\" Desktops \"]")).click();
        String pageText=driver.findElement(By.xpath("//a[text()=\"Build your own computer\"]")).getText();
        System.out.println(pageText);

    }}
