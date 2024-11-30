package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Locators extends DriverSetup{
    @Test
    public void testLocator() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchBox;
//      searchBox  = driver.findElement(By.id("APjFqb"));
//      searchBox = driver.findElement(By.name("q"));
//      searchBox = driver.findElement(By.className("gLFyf"));
        searchBox = driver.findElement(By.tagName("textarea"));
        searchBox.sendKeys("1");
        Thread.sleep(2000);
        searchBox.clear();
        Thread.sleep(2000);
//        WebElement howSearchWorkLink = driver.findElement(By.linkText("সার্চ কীভাবে কাজ করে"));
//        WebElement howSearchWorkLink = driver.findElement(By.partialLinkText("সার্চ কীভাবে কাজ"));
//        howSearchWorkLink.click();

//        WebElement input_btn = driver.findElement(By.cssSelector("input[class='RNmpXc']"));
        WebElement input_btn = driver.findElement(By.xpath("//input[@class='RNmpXc']"));
        String text= input_btn.getAttribute("value");
        System.out.println(text);
        Thread.sleep(5000);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
//        driver.findElements(By.cssSelector("a"));
//        driver.findElements(By.xpath("//a"));

        System.out.println(linkElements.size());
        for (WebElement linkElement:linkElements ){
            System.out.println(linkElement.getText());
            System.out.println(linkElement.getAttribute("href"));
        }
    }

    @Test
    public void testInteractionWithElement(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='radio2']"));
        System.out.println(radioButton2.isSelected());
        radioButton2.click();
        System.out.println(radioButton2.isSelected());
        WebElement displayedText = driver.findElement(By.id("displayed-text"));
        System.out.println(displayedText.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(displayedText.isDisplayed());
        System.out.println(displayedText.isEnabled());
        WebElement element = driver.findElement(By.xpath("//legend[text()='Dropdown Example']"));
        System.out.println(element.getCssValue("background-color"));
    }
}
