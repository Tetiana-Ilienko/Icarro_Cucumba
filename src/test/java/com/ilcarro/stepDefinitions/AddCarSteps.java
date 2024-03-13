package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on \"Let the car work\" link")
    public void clicks_on_CarWork(){
        new AddCarPage(driver).clickOnCarWork();
    }


    @And("User enter address")
    public void enter_address(){
        new AddCarPage(driver).enterAddress("Kan");
    }

    @And("User fills  all fields")
    public void fills_fields(){
        new AddCarPage(driver).fillFields("Toyota", "Camry","2022",
                "Petrol","5","Business",
                "12358777","12",
                "Comfortable and reliable business class car. Ideal for business trips and travel.");
    }

//    @And("User uploads a photo of the car")
//    public void upload_photo(){
//        try {
//            new AddCarPage(driver).upload("C:/AIT/QA/2.jpg");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    //  And User uploads a photo of the car

    @And("User clicks on Submit button")
    public void click_submit(){
        new AddCarPage(driver).submit();
    }

    @And("user verifies Success message Add Car")
    public void verifies_success_message_addCar(){
        new AddCarPage(driver).verifies();
    }


}
