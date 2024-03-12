package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void clicks_on_LoginLink(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enter valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("naan@gmail.com","1Qazxsw23@");
    }

    @And("User clicks on Yalla button")
    public void clicks_on_YallaButton(){
        new LoginPage(driver).clickLoginButton();
    }

    @Then("user verifies Success message displayed")
    public void verifies_Success_massage(){
        new LoginPage(driver).isSuccessMessageDisplayed();
    }

    @And("User enter valid email and  invalid password")
    public void enter_invalid_password(DataTable dataTable){
        new LoginPage(driver).enterInvalidPassword(dataTable);
    }

    @Then("user verifies Error message displayed")
    public void verifies_Error_massage(){
        new LoginPage(driver).isErrorDisplayed();
    }
}
