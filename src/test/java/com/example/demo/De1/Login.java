package com.example.demo.De1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;

public class Login {
    public static void main(String [] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yue20\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String randomId = UUID.randomUUID().toString().substring(0, 8);
        String userEmail = "testuser_" + randomId + "@gmail.com";
        String userPassword = "MatKhauAnToan@123";
        String userName = "Test User " + randomId;

        String baseUrl = "https://torano.vn";
        driver.get(baseUrl);

        try {
            WebElement accountIcon = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("site-account-handle")));
            accountIcon.click();
            System.out.println("Đã bấm vào icon tài khoản.");

            WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("a[href='/account/register']")));
            registerBtn.click();
            System.out.println("Đã bấm nút Đăng ký trong popup đăng nhập.");

            System.out.println("Bắt đầu kịch bản Đăng ký...");
            WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Đăng ký")));
            registerLink.click();
            System.out.println("Đã bấm link Đăng ký.");

            WebElement hoInput = driver.findElement(By.id("last_name"));
            hoInput.sendKeys("Nguyen");

            driver.findElement(By.id("first_name")).sendKeys("Linh");

            WebElement femaleLabel = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='radio1']")));
            femaleLabel.click();

            driver.findElement(By.id("birthday")).sendKeys("07/29/2007");
            driver.findElement(By.id("email")).sendKeys(userEmail);
            driver.findElement(By.id("password")).sendKeys(userPassword);

            driver.findElement(By.cssSelector("input[type='submit'][value='Đăng ký']")).click();
            System.out.println("Đã điền thông tin đăng ký và gửi form thành công!");

            Thread.sleep(3000);

            System.out.println("Bắt đầu kịch bản Đăng nhập...");

            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Đăng nhập")));
            loginLink.click();
            System.out.println("Đã bấm link Đăng nhập.");

            driver.get(baseUrl);

            // Chờ ô Email xuất hiện
            WebElement emailLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")));
            emailLogin.sendKeys(userEmail);
            driver.findElement(By.id("field-password")).sendKeys(userPassword);
            System.out.println("Đã nhập thông tin đăng nhập: " + userEmail);

            // Bấm nút Đăng nhập
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println("Đã gửi form đăng nhập.");

            // Chờ trang tải xong và kiểm tra trạng thái đăng nhập
            Thread.sleep(4000);

            // Kiểm tra xem có phần tử hiển thị tên người dùng hay không
            // (Ví dụ: "Tài khoản của tôi" hoặc "Xin chào")
            WebElement accountInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("a.account span")));
            System.out.println("Đăng nhập thành công! Hiển thị: " + accountInfo.getText());

            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi trong quá trình test:");
            e.printStackTrace();
        } finally {
//            // 4. Đóng trình duyệt
//            System.out.println("Hoàn tất kịch bản, đóng trình duyệt.");
//            driver.quit();
        }
    }
}
