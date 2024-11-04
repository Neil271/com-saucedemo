package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        //Base URL
        String baseUrl = "https://www.saucedemo.com/";

        //1. Set up Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //Maximise the Browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //5. Print the page source.
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //6. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.id("user-name"));
        emailId.sendKeys("abc123@gmail.com");

        //7. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("xyz123@");

        //8. Click on the Login Button.
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //9. Print the current URL.
        System.out.println("Get Current Url :" + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();
    }
}
