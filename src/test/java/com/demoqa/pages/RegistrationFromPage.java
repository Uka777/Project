package com.demoqa.pages;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.codeborne.selenide.Selenide.*;
import java.io.File;

public class RegistrationFromPage {


    private SelenideElement
            userName = $("input[type='text']"),
            passwordName = $("input[type='password']"),
            submitInput = $(".btn_caption.btn_center.minwidth"),
            choice = $(".btn_caption.btn_center.minwidth");


    public RegistrationFromPage openPage() {
        open("http://192.168.233.102/mis2302/?debug=1");
        return this;
    }
    public RegistrationFromPage userName(String Value) {
        userName.setValue(Value);
        return this;
    }

    public RegistrationFromPage passwordName(String Value) {
        passwordName.setValue(Value);
        return this;
    }
    public RegistrationFromPage setSubmit() {
        submitInput.click();
        return this;
    }
    public RegistrationFromPage choice() {
        choice.click();
        return this;
    }

}