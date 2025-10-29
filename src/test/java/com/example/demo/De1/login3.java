package com.example.demo.De1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login3 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void DangKyTest() throws InterruptedException {
        driver.get("https://hoctotlamhay.vn/register");
        Thread.sleep(1000);

        driver.findElement(By.id("name")).sendKeys("letuanh");
        Thread.sleep(500); // 🕐 chờ 0.5s giữa mỗi thao tác

        driver.findElement(By.id("user_email")).sendKeys("letuanh@gmai.com");
        Thread.sleep(500);

        driver.findElement(By.id("password")).sendKeys("25052007");
        Thread.sleep(500);

        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
        System.out.println("✅ Đăng ký thành công");
        Thread.sleep(1000);
    }

    @Test
    public void DangNhapTest() throws InterruptedException {
        driver.get("https://hoctotlamhay.vn/login");
        Thread.sleep(1000);

        driver.findElement(By.id("user_email")).sendKeys("letuanh@gmai.com");
        Thread.sleep(500);

        driver.findElement(By.id("password")).sendKeys("25052007");
        Thread.sleep(500);

        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
        System.out.println("✅ Đăng nhập thành công");
        Thread.sleep(1000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
