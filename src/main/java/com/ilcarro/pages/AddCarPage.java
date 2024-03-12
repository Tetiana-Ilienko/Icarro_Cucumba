package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AddCarPage extends BasePage{
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="1")
    WebElement menu;

    public AddCarPage clickOnCarWork() {
        click(menu);
        return this;
    }

    @FindBy(id ="pickUpPlace")
    WebElement place;


    public AddCarPage enterAddress(String cityname) {
        type(place,cityname );
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        place.sendKeys(Keys.ARROW_DOWN);
        place.sendKeys(Keys.ENTER);

        return this;
    }
    @FindBy(id ="make")
    WebElement makeInput;
    @FindBy(id ="model")
    WebElement modelInput;
    @FindBy(id ="year")
    WebElement yearInput;
    @FindBy(id ="fuel")
    WebElement fuelOptional;
    @FindBy(id ="seats")
    WebElement seatsInput;
    @FindBy(id ="class")
    WebElement classInput;
    @FindBy(id ="serialNumber")
    WebElement serialInput;
    @FindBy(id ="price")
    WebElement priceInput;
    @FindBy(id ="about")
    WebElement aboutInput;



    public AddCarPage fillFields(String makeValue, String modelValue,String yearValue,
                                 String optionValue,String seatsValue, String classValue,
                                 String serialValue, String priceValue, String aboutValue) {
        type(makeInput,makeValue);
        type(modelInput,modelValue);
        type(yearInput,yearValue);

        Select select = new Select(fuelOptional);
        select.selectByValue(optionValue);

        type(seatsInput,seatsValue);
        type(classInput,classValue);
        type(serialInput,serialValue);
        type(priceInput,priceValue);
        type(aboutInput,aboutValue);

        return this;
    }

    @FindBy(xpath = "//*[text()='Add photos of your car']")
    WebElement photoInput;

    public AddCarPage upload(String filePath) {
        photoInput.sendKeys(filePath);
        return this;
    }

    @FindBy(xpath ="//*[text()='Submit']")
    WebElement submitKl;

    public AddCarPage submit() {
        click(submitKl);
        return this;
    }

    @FindBy(xpath ="//*[text()='Toyota Camry added successful']")
    WebElement successMessage;

    public AddCarPage verifies() {
        assert isElementDisplayed(successMessage);
        return this;
    }
}
