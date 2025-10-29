package com.example.demo.Bai3;

import jdk.jshell.EvalException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login1 {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void DangKyTest() throws InterruptedException {
        driver.get("https://torano.vn/account/register");
        Thread.sleep(1000);
        driver.findElement(By.id("last_name")).sendKeys("Nguyen");
        Thread.sleep(500);
        driver.findElement(By.id("first_name")).sendKeys("Nguyen");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("label[for='radio1']")).click();
        Thread.sleep(500);
        driver.findElement(By.id("birthday")).sendKeys("12/01/2025");
        Thread.sleep(500);
        driver.findElement(By.id("email")).sendKeys("linh@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("Linh29202!");
        Thread.sleep(500);

//        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
        driver.findElement(By.cssSelector("input.button")).click();

        System.out.println("✅ Đăng nhập thành công");
        Thread.sleep(1000);
    }

    @Test
    public void DangNhapTest() throws InterruptedException {
        driver.get("https://torano.vn/account/login");
        Thread.sleep(1000);
        driver.findElement(By.id("customer_email")).sendKeys("linh@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("customer_password")).sendKeys("Linh29202!");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input.button")).click();

        System.out.println("✅ Đăng nhập thành công");
        Thread.sleep(1000);
    }

    @AfterTest
    public void tearDown() {
    }
}
