package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends BaseTest {

  @Given("user on login page")
  public void userIsOnloginPage() {
    //kosong
  }

  @When("user input email {string}")
  public void userInputemail(String email) {
    loginPage.Inputemail(email);
  }

  @And("user input password {string}")
  public void userInputpassword(String password) {
    loginPage.userInputpassword(password);
  }

  @And("click login button")
  public void spanloginButton() { loginPage.clickloginBtn();}

  @Then("task successfully created")
  public void taskSuccessfullyCreated() {
    //isDisplayed
    boolean isDisplayed = verificationPage.checkHamburgerBtnAppear();
    Assertions.assertTrue(isDisplayed);
    //Hamcrest
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
    //isDisplayed
    boolean isDisplayed = verificationPage.checkHamburgerBtnAppear();
    Assertions.assertTrue(isDisplayed);
    //Hamcrest
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }

}
