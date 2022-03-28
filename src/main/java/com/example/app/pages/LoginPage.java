package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  public void clickplusBtn() {
    By locator = MobileBy.id("com.yoesuv.androidroom:id/fabMain");
    AndroidElement btnPlus = driver.findElement(locator);
    btnPlus.click();
    click(MobileBy.id("com.yoesuv.androidroom:id/fabMain"));
  }

  public void Inputemail(String email) {
    By locator = MobileBy.id("org.owline.kasirpintar:id/edt_email");
    AndroidElement emailElmnt = driver.findElement(locator);
    emailElmnt.clear();
    emailElmnt.sendKeys(email);
    type(MobileBy.id("org.owline.kasirpintar:id/edt_email"), email);
  }

  public void userInputpassword(String password) {
    By locator = MobileBy.id("org.owline.kasirpintar:id/edt_password");
    AndroidElement PasswordElmnt = driver.findElement(locator);
    PasswordElmnt.clear();
    PasswordElmnt.sendKeys(password);
    type(MobileBy.id("org.owline.kasirpintar:id/edt_password"), password);
  }

  public void clickloginBtn() {
    By locator = MobileBy.id("org.owline.kasirpintar:id/btn_login");
    AndroidElement btnlogin = driver.findElement(locator);
    btnlogin.click();
    click(MobileBy.id("org.owline.kasirpintar:id/btn_login"));
  }

}
