package Yahootesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Selenium {

    public void validregisteredUPtocaptcha() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
        driver.manage().window().maximize();
        //Firstname is set
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("John");
        //lastName is set
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Doe");
        //emialid is set
        driver.findElement(By.id("usernamereg-userId")).sendKeys("johndoe1234664");
        //password is set
        driver.findElement(By.id("usernamereg-password")).sendKeys("@Password1357");
        //month is set
        driver.findElement(By.id("usernamereg-month")).sendKeys("January");
        //day is set
        driver.findElement(By.id("usernamereg-day")).sendKeys("01");
        //year is set
        driver.findElement(By.id("usernamereg-year")).sendKeys("2000");

        //click button
        driver.findElement(By.id("reg-submit-button")).click();

        // Enter the phone number with more than 10 digits
        //error will apper if you clear the error then the otp will be generated
        driver.findElement(By.id("usernamereg-phone")).sendKeys("9921123222");

        driver.findElement(By.id("reg-submit-button")).click();
        System.out.println("validated registration upto captcha");
        driver.quit();
        // if you want to quit the driver then un comment the ext line˳


    }
    public void Verificationoflongphonenumber(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
        driver.manage().window().maximize();
        //Firstname is set
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("John");
        //lastName is set
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Doe");
        //emialid is set
        driver.findElement(By.id("usernamereg-userId")).sendKeys("johndoe1234664");
        //password is set
        driver.findElement(By.id("usernamereg-password")).sendKeys("@Password1357");
        //month is set
        driver.findElement(By.id("usernamereg-month")).sendKeys("January");
        //day is set
        driver.findElement(By.id("usernamereg-day")).sendKeys("01");
        //year is set
        driver.findElement(By.id("usernamereg-year")).sendKeys("2000");

        //click button
        driver.findElement(By.id("reg-submit-button")).click();

        // Enter the phone number with more than 10 digits
        //error will apper if you clear the error then the otp will be generated
        driver.findElement(By.id("usernamereg-phone")).sendKeys("9921123222900");

        driver.findElement(By.id("reg-submit-button")).click();
        // if you want to quit the driver then un comment the ext line˳

        WebElement e = driver.findElement(By.id("reg-error-phone"));
        String kk = e.getText();
        if (Objects.equals(kk, "That doesn’t look right, please re-enter your phone number.")) {
            System.out.println("validated error messege");
        }
        driver.quit();
    }
    public void termsandconditionspage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
        driver.manage().window().maximize();
        // Click on the "Terms" link
        driver.findElement(By.linkText("Terms")).click();
        // Verify if the user is redirected to the terms and conditions page
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://policies.yahoo.com/us/en/yahoo/terms/utos/index.htm"));
        driver.get("https://policies.yahoo.com/us/en/yahoo/terms/utos/index.htm");
        System.out.println("validated terms page");
        driver.quit();
    }

    public static <bool> void main(String args[]) {
        System.out.println("hello world");
        Selenium validated = new Selenium();
        validated.validregisteredUPtocaptcha();
        validated.termsandconditionspage();
        validated.Verificationoflongphonenumber();

        /* IM USING DRIVER.QUIT() TO EXIT AND GO TO NEXT TEST CASE IF WANT TO STOP AND CHECK PLEASE REMOVE THAT */

    }
}
