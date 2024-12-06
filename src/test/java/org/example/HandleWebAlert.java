package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup{
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());

        alert.dismiss();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());

        alert.sendKeys("Hello");

        alert.accept();

        Thread.sleep(2000);


    }
}
