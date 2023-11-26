package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.pages.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.EventAttributeValue;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import static io.qameta.allure.Allure.attachment;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class  RegistrationFormWithPageObjects {

    RegistrationFromPage registrationFromPage = new RegistrationFromPage();
    Diagnoses diagnoses = new Diagnoses();
    Vrt vrt = new Vrt();
    WebSteps steps = new WebSteps();

    @BeforeAll
    static void setUp() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = 10000;

    }

    @Test
    void fillFormTests() {
        steps.registration();


    }
    @Test
    void fillFormTests1() {
        steps.addSluchai();

    }
    @Test
    void fillFormTests2() {
        steps.editSluchai();

    }
    @Test
    void fillFormTests3() {
        steps.editDiagnoz();

    }
    @Test
    void fillFormTests4(){
        steps.addCvkk();

    }
    @Test
    void fillFormTests5() {
        steps.addRec();

    }
    @Test
    void fillFormTests6() {
        steps.deleteSluchai();

    }


    @Test
    void fillFormTests7() {
        steps.addSettings();

    }


    @Test
    void fillFormTests8() {
        steps.editSettings();


    }
    @Test
    void fillFormTests9() {
        steps.addForm();

    }
    @Test
    void fillFormTests10() {
        steps.addVrt();

    }
    @Test
    void fillFormTests11() {
        steps.editVrt();

    }
    @Test
    void fillFormTests12() {
        steps.deleteVrt();

    }

}