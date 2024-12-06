package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends DriverSetup{
    @Test
    public void testDropDownWithSelectTag() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        selectElement.click();

        Select select = new Select(selectElement);

        select.selectByIndex(2);
        Thread.sleep(3000);
        selectElement.click();
        select.selectByValue("option3");
        Thread.sleep(3000);
        selectElement.click();
        select.selectByVisibleText("Option1");
        Thread.sleep(3000);

        List<WebElement> options =  select.getOptions();

        for (WebElement op: options){
            System.out.println(op.getText());
        }

        System.out.println(select.getFirstSelectedOption().getText());
    }
}
