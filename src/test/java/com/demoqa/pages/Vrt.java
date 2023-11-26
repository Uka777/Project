package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Vrt {
    private SelenideElement
            accountingTwo = $(By.xpath("(//*[@id='mainMenuForm']//*[@name='nName']//a/span[text()='Учет'])[last()]")),
            reestrVrt = $(By.xpath("(//*[@id='mainMenuForm']//*[@name='nItem']//a/span[text()='Реестр пациенток программы ВРТ'])[last()]")),
            vrtGridLkm = $(By.xpath("//*[@name='grVrtPat']")),
            vrtGrid = $(By.xpath("//*[@name='grVrtPat']")),
            vrtAdd = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Добавить']")),
            petientS = $(By.xpath("//*[@name='beVrtAgent']//div[@title='Выбрать из справочника']")),
            nameLkm = $(By.xpath("//*[@name='searchEditSURNAME']//input")),
            name = $(By.xpath("//*[@name='searchEditSURNAME']//input")),
            patinetSearch = $(By.xpath("//*[@name='PATIENTS_Row']//td/span[text()='07.03.1991']")),
            patinetSearchLkm = $(By.xpath("//*[@name='PATIENTS_Row']//td/span[text()='07.03.1991']")),
            genInformation = $(By.xpath("//*[@name='tabCommons']")),
            comission = $(By.xpath("//*[@name='tabCommissions']")),
            diagMkb = $(By.xpath("//*[@name='ueCommonMkb']//div[@title='Выбрать из справочника']")),
            codGiagLkm = $(By.xpath("//*[@cmptype='TMP']//input[@class='input-ctrl']")),
            codGiag =  $(By.xpath("//*[@cmptype='TMP']//input[@class='input-ctrl']")),
            diagOk = $(By.xpath("(//*[@cmptype='Button' and .//*[text()='Ок']])[last()]")),
            status = $(By.xpath("//*[@name='ueCommonStatus']//div[2]")),
            statusTwo = $(By.xpath("(//*[@cmptype='ComboBoxDL']//tr[@cmptype='ComboItem']//span[text()='Направлена на ВРТ'])[last()]")),
            statusFree = $(By.xpath("(//*[@cmptype='ComboBoxDL']//tr[@cmptype='ComboItem']//span[text()='Включена в реестр'])[last()]")),
            anamnez = $(By.xpath("//*[@name='tabAnamnesis']")),
            anamnezLifeLkm = $(By.xpath("//*[@name='ftaAnamLifeHistory']//*[@name='ftaAnamLifeHistory_Text']")),
            anamnezLife = $(By.xpath("//*[@name='ftaAnamLifeHistory']//*[@name='ftaAnamLifeHistory_Text']")),
            saveVrtVisible = $(By.xpath("//*[@class='formBottom']//div[@name='buttonSave']")),
            gridPatientLkm = $(By.xpath("//*[@name='grVrtPat_Row']")),
            gridPatient = $(By.xpath("//*[@name='grVrtPat_Row']")),
            exclude = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Исключить из реестра']")),
            yesButton = $(By.xpath("//*[@cmptype='Button']//*[text()='Да']")),
            uncoverDearch = $(By.xpath("//*[@cmptype='Form']//td/a[text()='Раскрыть поиск']")),
            check = $(By.xpath("//*[@cmptype='Form']//*[@cmptype='CheckBox']")),
            take = $(By.xpath("//*[@cmptype='Button']//*[text()='Отобрать']")),
            patientFreeLkm = $(By.xpath("//*[@name='grVrtPat_Row']//td[@cont='FIO']/a[text()='Покатилова Автотест ']")),
            patientFree = $(By.xpath("//*[@name='grVrtPat_Row']//td[@cont='FIO']/a[text()='Покатилова Автотест ']")),
            deleteVrt = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Удалить']")),
            message = $(By.xpath("//*[@cmptype='Base']//div/a[text()='Закрыть все']")),
            patientFreeNo = $(By.xpath("//*[@name='grVrtPat_Row']//td[@cont='FIO']/a[text()='Покатилова Автотест ']")),
            editVrt = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Редактировать']")),
            gridComission = $(By.xpath("//*[@name='grVrtCommission']//div[@cont='griddatacont']")),
            gridComissionTwo = $(By.xpath("//*[@name='grVrtCommission_Row']//td/span[text()='Направить на ЭКО']")),
            gridComissionLkm = $(By.xpath("//*[@name='grVrtCommission']//div[@cont='griddatacont']")),
            calendarComission = $(By.xpath("//*[@name='deDateCommission']//div[2]")),
            dateComission = $(By.xpath("//div[@class='calendar']//*[text()='Сегодня']")),
            conclusion = $(By.xpath("//div[@name='cbConclusion']//div[2]")),
            eko = $(By.xpath("//div[@cmptype='ComboBoxDL']//tr[@cmptype='ComboItem']//div/span[text()='1 - Направить на ЭКО']")),
            diagzNap = $(By.xpath("//div[@name='taMkbExact']//textarea")),
            moVrt = $(By.xpath("//div[@name='ueMoDirection']//input")),
            payment = $(By.xpath("//div[@name='cbPayKind']//div[2]")),
            paymentTwo = $(By.xpath("(//div[@cmptype='ComboBoxDL']//tr[@cmptype='ComboItem']//div/span[text()='1 - ОМС'])[last()]")),
            appeal = $(By.xpath("//div[@name='cbDirKind']//div[2]")),
            appealTwo = $(By.xpath("(//div[@cmptype='ComboBoxDL']//tr[@cmptype='ComboItem']//div/span[text()='Первичное'])[last()]")),
            chairman = $(By.xpath("//div[@name='ueCommChairman']//input")),
            employer = $(By.xpath("//div[@name='ueCommEmployer']//input")),
            okConclusion = $(By.xpath("//*[@cmptype='Button']//div[text()='ОК']")),
            continueVrt = $(By.xpath("//*[@name='buttonOk' and .//*[text()='Продолжить']]")),
            otmena = $(By.xpath("//*[@class='formBottom']//div[@name='buttonCancel']"));



    public Vrt accountingTwo() {
        accountingTwo.click();
        return this;
    }

    public Vrt otmena() {
        otmena.click();
        return this;
    }
    public Vrt continueVrt() {
        continueVrt.click();
        return this;
    }
    public Vrt gridComissionTwo() {
        gridComissionTwo.shouldBe(visible);
        return this;
    }
    public Vrt okConclusion() {
        okConclusion.click();
        return this;
    }
    public Vrt chairman(String Value){
        chairman.setValue(Value).pressEnter();
        return this;
    }
    public Vrt employer(String Value){
        employer.setValue(Value).pressEnter();
        return this;
    }
    public Vrt appealTwo() {
        appealTwo.click();
        return this;
    }
    public Vrt appeal() {
        appeal.click();
        return this;
    }
    public Vrt paymentTwo() {
        paymentTwo.click();
        return this;
    }
    public Vrt payment() {
        payment.click();
        return this;
    }
    public Vrt moVrt(String Value){
        moVrt.setValue(Value).pressEnter();
        return this;
    }
    public Vrt diagzNap(String Value){
        diagzNap.setValue(Value).pressEnter();
        return this;
    }
    public Vrt eko() {
        eko.click();
        return this;
    }
    public Vrt conclusion() {
        conclusion.click();
        return this;
    }
    public Vrt dateComission() {
        dateComission.click();
        return this;
    }
    public Vrt calendarComission() {
        calendarComission.click();
        return this;
    }
    public Vrt gridComissionLkm() {
        gridComissionLkm.contextClick();
        return this;
    }
    public Vrt gridComission() {
        gridComission.click();
        return this;
    }
    public  Vrt comission() {
        comission.click();
        return this;
    }
    public  Vrt statusFree() {
        statusFree.click();
        return this;
    }
    public Vrt editVrt() {
        editVrt.click();
        return this;
    }
    public Vrt patientFreeNo() {
        patientFreeNo.shouldNot(exist);
        return this;
    }
    public Vrt  message() {
        message.click();
        return this;
    }
    public Vrt deleteVrt() {
        deleteVrt.click();
        return this;
    }
    public Vrt patientFreeLkm() {
        patientFreeLkm.click();
        return this;
    }
    public Vrt patientFree() {
        patientFree.contextClick();
        return this;
    }

    public Vrt take() {
        take.click();
        return this;
    }
    public Vrt check() {
        check.click();
        return this;
    }
    public Vrt uncoverDearch() {
        uncoverDearch.click();
        return this;
    }
    public Vrt yesButton() {
        yesButton.click();
        return this;
    }
    public Vrt exclude() {
        exclude.click();
        return this;
    }
    public Vrt gridPatientLkm() {
        gridPatientLkm.click();
        return this;
    }
    public Vrt gridPatient() {
        gridPatient.contextClick();
        return this;
    }

    public Vrt saveVrtVisible() {
        saveVrtVisible.shouldBe(visible,appear).click();
        return this;
    }

    public Vrt anamnezLife(String Value){
        anamnezLife.setValue(Value).pressEnter();
        return this;
    }
    public Vrt anamnezLifeLkm() {
        anamnezLifeLkm.click();
        return this;
    }
    public Vrt anamnez() {
        anamnez.click();
        return this;
    }
    public Vrt statusTwo() {
        statusTwo.click();
        return this;
    }
    public Vrt status() {
        status.click();
        return this;
    }
    public Vrt diagOk() {
        diagOk.click();
        return this;
    }
    public Vrt codGiag(String Value){
        codGiag.setValue(Value).pressEnter();
        return this;
    }
    public Vrt codGiagLkm() {
        codGiagLkm.click();
        return this;
    }
    public Vrt diagMkb() {
        diagMkb.click();
        return this;
    }
    public Vrt genInformation() {
        genInformation.click();
        return this;
    }
    public Vrt patinetSearch() {
        patinetSearch.doubleClick();
        return this;
    }

    public Vrt name(String Value){
        name.setValue(Value).pressEnter();
        return this;
    }
    public Vrt nameLkm() {
        nameLkm.click();
        return this;
    }
    public Vrt petientS() {
        petientS.click();
        return this;
    }
    public Vrt reestrVrt() {
        reestrVrt.click();
        return this;
    }
    public Vrt vrtGridLkm() {
        vrtGridLkm.click();
        return this;
    }
    public Vrt vrtGrid() {
        vrtGrid.contextClick();
        return this;
    }
    public Vrt vrtAdd() {
        vrtAdd.click();
        return this;
    }
}
