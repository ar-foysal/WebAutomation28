package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActions extends DriverSetup{

    By mouse_hover_section = By.xpath("//legend[normalize-space()='Mouse Hover Example']");
    By hover_button = By.xpath("//button[@id='mousehover']");
    By top_option = By.xpath("//a[text()='Top']");
    By iframe_section = By.xpath("//legend[normalize-space()='iFrame Example']");

    By autocomplete_input = By.xpath("//input[@id='autocomplete']");
    By switch_alert_name_input = By.xpath("//input[@id='name']");

    @Test
    public void testAction() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);
//        actions.scrollByAmount(0, 1000).build().perform();
        actions.scrollToElement(getElement(iframe_section)).build().perform();

        actions.moveToElement(getElement(hover_button)).build().perform();

        clickOneElement(top_option);

        getElement(autocomplete_input).sendKeys("Bangladesh");

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();

        actions.click(getElement(switch_alert_name_input)).keyDown(Keys.CONTROL).sendKeys("v").build().perform();

    }
}
