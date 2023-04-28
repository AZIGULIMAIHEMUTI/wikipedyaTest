package com.wikipedya;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtility {

    public TestUtility(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    private int timeout = Integer.parseInt(ApplicationConfig.readFromConfigProperties(
            "config.properties", "timeout"));

    Faker faker = new Faker();

    public String fakeEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }
    public String fakeName(){
        String name=faker.name().name();
        return name;
    }

    public void waitForElementPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }




}
