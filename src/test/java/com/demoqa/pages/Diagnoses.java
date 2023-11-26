package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Diagnoses {
    private SelenideElement

            settings = $(By.xpath("//*[@id='mainMenuForm']//*[@name='nName']//a/span[text()='Настройки']")),
            settingsDP = $(By.xpath("//*[@name='nItem']//a/span[text()='Настройка диспансерного наблюдения']")),
            diagnos = $(By.xpath("//*[@name='nBody']//*[@name='nItem']//a/span[text()='Диагнозы туберкулеза: МКБ10']")),
            gridDiagnos = $(By.xpath("//*[@name='DTUB_MKB10_GRID']")),
            add = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Добавить']")),
            start = $(By.xpath("//table[@name='MKB_BEGIN_Ctrl']//img")),
            mkb = $(By.xpath("//*[@name='MKB_BEGIN_Ctrl']//input")),
            mkbZa = $(By.xpath("//*[@name='MKB_BEGIN_Ctrl']//input")),
            ok = $(By.xpath("//table[@name ='SelActiveRec']")),
            end = $(By.xpath("//table[@name='MKB_END_Ctrl']//input")),
            endTwo = $(By.xpath("//table[@name='MKB_END_Ctrl']//input")),
            mkbtwo = $(By.xpath("//table[@name ='SEARCH_CODE']//input")),
            type = $(By.xpath("//table[@name ='TYPE_Ctrl']//input")),
            oktwo = $(By.xpath("//*[@name='GENERATED_BUTTON_OK' and .//*[text()='ОК']]")),
            message = $(By.xpath("//*[@name = 'ERROR_TITLE']")),
            contin = $(By.xpath("//*[@cmptype='Form']//*[@name = 'CONTINUE_BUTTON']")),
            grid = $(".grid_data.box-sizing-force"),
            edit = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Редактировать']")),
            line = $(By.xpath("//span[text() ='A15.7']")),
            linepkm = $(By.xpath("//span[text() ='A15.7']")),
            page = $(By.xpath("//ul[@class='ctrl_range_pages']//li[4]")),
            vkFormlok = $(By.xpath(" //*[@cmptype='TabSheet']//*[text()='Форма и локализация']")),
            gridFormlok = $(By.xpath(" //div[@name='gCodes']")),
            gridFormlokpkm = $(By.xpath(" //div[@name='gCodes']")),
            addtwo = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Добавить']")),
            kodlkm = $(By.xpath(" //table[@name='AC_CODE_Ctrl']")),
            kod = $(".input-ctrl"),
            namelkm =$(By.xpath(" //table[@name='AC_NAME_Ctrl']")),
            name = $(By.xpath("//*[@name='AC_NAME_Ctrl']//textarea")),
            calendar = $(By.xpath(" //div[@class='img-calendar calendar-enable noselect']")),
            date = $(By.xpath(" //div[@class='calendar']//*[text()='Сегодня']")),
            okfre = $(By.xpath("//*[@cmptype='Button' and .//*[text()='ОК']]")),

    messagetwo = $(By.xpath("//*[@name = 'ERROR_TITLE']")),
            contintwo = $(By.xpath("//*[@name = 'CONTINUE_BUTTON']")),
            klinformlkm = $(By.xpath("//*[@name='CLINIC_FORM_NAME_Ctrl']//input")),
            klinform = $(By.xpath("//*[@name='CLINIC_FORM_NAME_Ctrl']//input")),
            okfour = $(By.xpath("//*[@cmptype='Button' and .//*[text()='ОК']]")),
            gridFormloktwo = $(By.xpath(" //div[@name='gCodes']")),
            accounting = $(By.xpath("(//*[@id='mainMenuForm']//*[@name='nName']//a/span[text()='Учет'])[last()]")),
            nozreg =$(By.xpath("(//*[@name='nBody']//*[@name='nItem']//a/span[text()='Нозологические регистры'])[last()] ")),
            nozregtub = $(By.xpath("(//*[@name='nBody']//*[@name='nItem']//a/span[text()='Регистр больных туберкулезом'])[last()] ")),
            cases = $(By.xpath("//li[@name='TabRegistr'][2]")),
            casesGrid = $(By.xpath("//*[@name='tubCasesGrid_Row']")),
            casesGridpkm = $(By.xpath("//*[@name='tubCasesGrid_Row']")),
            casesAdd = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Добавить']")),

    casesSurname = $(By.xpath("//*[@name='searchEditSURNAME']//input")),
            casesName = $(By.xpath("//*[@name='searchEditFIRSTNAME']//input")),
            find = $(By.xpath("//*[@cmptype='Button' and .//*[text()='Найти']]")),
            gridPatient = $(By.xpath("//*[@name='PATIENTS_Row']")),
            plus = $(".btn_icon_img"),
            groupLkm = $(By.xpath("//div[@name='userViewBlock']//div[@name='ctrlPAT_GROUP']")),
            group = $(By.xpath("//div[@name='win_content']//div[@name='ctrlPAT_GROUP']//input")),
            dispVkladka = $(By.xpath("//li[@name='DISP_OBSERVING']")),
            dispDateVz = $(By.xpath("//div[@name='ctrlDISP_DATE_IN']//div[@class='img-calendar']")),
            nauchet = $(By.xpath("//div[@name='win_content']//div[@name='ctrlDETECTION_DISCOVER_PATH']//input")),
            dispDateUc = $(By.xpath("//div[@name='ctrlDISP_DATA_DATE_IN']//div[@class='img-calendar']")),

    moNablud = $(By.xpath("//div[@name='win_content']//div[@name='ctrlDISP_LPU']//div[2]")),
            okSluchai =$(By.xpath("(//*[@cmptype='Button' and .//*[text()='Ок']])[last()]")),

    saveSluchai = $(By.xpath("(//*[@cmptype='Button' and .//*[text()='Сохранить']])[last()]")),
            status = $(By.xpath("//*[@name='CASES_GRID_Row']//td/span[@name='STATUS'][last()]")),
            pluSluchai = $(By.xpath("//*[@name='casesBTN_ADD']")),
            messagefree = $(By.xpath("//*[@name = 'ERROR_TITLE']")),
            editSluchai = $(By.xpath("//*[@name='casesBTN_UPD']")),
            gridDiagLkm = $(By.xpath("//div[@name ='GridMainDgns']//div[@scrollable='true']")),
            griDiag = $(By.xpath("//div[@name ='GridMainDgns']//div[@scrollable='true']")),
            mkbDiag = $(By.xpath("//div[@class='mainForm']//div[@name='ctrlMKB']//div[2]")),
            serachDiag = $(By.xpath("//*[@name='SEARCH_CODE']//input")),
            dateDiag = $(By.xpath("//div[@name='ctrlDATE_BEGIN']//div[@class='img-calendar']")),
            clinicForm = $(By.xpath("//div[@name='ctrlCLINIC_FORM']//input")),
            moDiag = $(By.xpath("//div[@name='ctrlMKB_LPU']//div[2]")),
            docDiag = $(By.xpath("//div[@name='ctrlEMPLOYER']//div[2]")),
            localization = $(By.xpath("//div[@name='ctrlLOCALIZATION']//input")),
            dateLocal = $(By.xpath("//div[@name='ctrlCREATE_DATE']//div[@class='img-calendar']")),
            phase = $(By.xpath("//div[@name='ctrlPHASE']//input")),
            datePhase = $(By.xpath("//div[@class='mainForm']//fieldset[2]//div[@name='ctrlCREATE_DATE']//div[2]")),
            saveDiag = $(By.xpath("(//*[@cmptype='Button' and .//*[text()='Сохранить']])[last()]")),
            recordingDiag = $(By.xpath("//tr[@name='GridMainDgns_Row']//td[@column_name='MKB_CODENAME']//span[contains(text(), 'A')]")),
            editDiag = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Редактировать']")),
            combinedDiag = $(By.xpath("//div[@class='mainForm']//div[@name='ctrlCOMBS_MKB']//div[2]")),
            dateCombined = $(By.xpath("//div[@class='mainForm']//fieldset[@class='form-fieldset'][last()]//div[@name='ctrlCREATE_DATE']//div[2]")),
            messageDiag = $(By.xpath("//*[@name = 'modal_win']//div[@caption='Сообщение системы']")),
            clearDiag = $(By.xpath("//*[@name='ctrlCOMBS_MKB']//div[@title='Очистить поле']")),
            editDiagtwo = $(By.xpath("//legend[text()='Диагноз сочетанный']/..//img[@name='BtnAdd']")),
            combinedDiagTwo = $(By.xpath("(//*[@onafter_clone='Form.onChangeCombsMKB();' and @style = '']//*[@title='Выбрать из справочника'])[last()] ")),
            dateCombinedTwo = $(By.xpath("(//*[@onafter_clone='Form.onChangeCombsMKB();' and @style = '']//*[@name='ctrlCREATE_DATE'])[last()]//div[2]")),
            comissionGrid = $(By.xpath("//div[@name='COMMISSION_GRID']")),
            comissionGridLkm = $(By.xpath("//div[@name='COMMISSION_GRID']")),
            targetLkm = $(By.xpath("//div[@name='COMM_PURPOSE']//input")),
            target = $(By.xpath("//div[@name='COMM_PURPOSE']//input")),
            dateCvkk = $(By.xpath("//div[@name='DATE_COMM']//div[2]")),
            resultCvkkLkm = $(By.xpath("//div[@name='COMM_RESULT']//input")),
            resultCvkk = $(By.xpath("//div[contains(@style,'display: block')]//tr[@cmptype='ComboItem']//span[contains(text(),'режим химиотерапии')] | //div[contains(@class,'ant-select-dropdown')]//*[contains(text(),'режим химиотерапии')]")),
            modeHimio = $(By.xpath("//div[@name='chemoMode']//input")),
            cvkk = $(By.xpath("//span[text()='Заключение центральной врачебно-контрольной комиссии']")),
            markNo = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Отметка о выполнении рекомендаций']")),
            mark = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Отметка о выполнении рекомендаций']")),
            findMo = $(By.xpath("(//div[contains(@class,'searchFilter') or contains(@class,'filter-search-button')])[last()] ")),
            codMo = $(By.xpath("//*[@name='DS_LPUDICT_DEFAULT_R_LPU_NAME_LPU_CODE_FilterItem']//input")),
            apply = $(By.xpath("(//*[@cmptype='Button' and .//*[text()='Применить']])[last()]")),
            deleteCvkk = $(By.xpath("//div[@cmptype='PopupMenu'][contains(@style,'display: block')]//span[text()='Удалить']")),
            сontinue = $(By.xpath("(//*[@name='buttonOk' and .//*[text()='Продолжить']])")),
            comissionGrigTwo = $(By.xpath("//*[@name='COMMISSION_GRID_Row'][.//*[contains(text(), 'Прочие цели')]]")),
            comissionGrigTwoLkm = $(By.xpath("//*[@name='COMMISSION_GRID_Row'][.//*[contains(text(), 'Прочие цели')]]")),
            markDate = $(By.xpath("//div[@name='DATE_OUTPUT']//div[2]")),
            comissionGrigFree = $(By.xpath("//*[@name='COMMISSION_GRID_Row'][.//*[contains(text(), 'Выполнены')]]")),
            treatment = $(By.xpath("//li[@name='TREATMENT']")),
            addtreatment = $(By.xpath("//*[@cmptype='Button']//*[text()='Добавить лечение'][last()]")),
            dateBedinTreatment = $(By.xpath("//div[@name='ctrlCHEMO_DATE_BEGIN']//div[2]")),
            zaklCvkk = $(By.xpath("//*[@name='chemoModeCommissions']//*[@class='ctrl_ButtonEdit_ButGuide']")),
            zaklCavkkOK = $(By.xpath("//*[@cmptype='Button']//div[text() = 'Ok']")),
            dateEndTreatment = $(By.xpath("//div[@name='ctrlCHEMO_DATE_END_PLAN']//div[2]")),
            chemoPlaceLkm = $(By.xpath("//div[@name='ctrlCHEMO_PLACE']//input")),
            chemoPlace = $(By.xpath("//div[@name='ctrlCHEMO_PLACE']//input")),
            patGroupLkm = $(By.xpath("//div[@name='ctrlDTUB_PAT_GROUP']//input")),
            patGroup = $(By.xpath("//div[@name='ctrlDTUB_PAT_GROUP']//input")),
            closeSluchai = $(By.xpath("//*[@name='modal_win']//div[@name='closeButton']")),
            patientSearch = $(By.xpath("//*[@name='byPatient']//span[text()='Поиск пациентов']")),
            filtrSurname = $(By.xpath("//*[@name='patSurName']//input")),
            filtrTake = $(By.xpath("(//div[@cmptype='Button'][contains(@class,'box-sizing-force')]//div[text()='Отобрать'])[last()]")),
            patient = $(By.xpath("//tr[@name='tubCasesGrid_Row']//td/span[text()='Покатилова Автотест']")),
            patientPkm = $(By.xpath("//tr[@name='tubCasesGrid_Row']//td/span[text()='Покатилова Автотест']")),
            diag = $(By.xpath("//li[@name='DIAGNOSIS']")),
            mbtGridLkm = $(By.xpath("//div[@name='GridDgnMbt'][contains(@class, 'box-sizing-force')]")),
            mbtGrid = $(By.xpath("//div[@name='GridDgnMbt'][contains(@class, 'box-sizing-force')]")),
            mbtAllocationLKm = $(By.xpath("//div[@name='ctrlMBT']//div[2]")),
            mbtAllocation = $(By.xpath("//div[@cmptype='ComboBoxDL']//div/span[text()='1 МБТ+ подтверждено бактериоскопически, с наличием или отсутствием роста культуры']")),
            metodLkm = $(By.xpath("//div[@name='ctrlMBT_DETECT_METHOD']//div[2]")),
            metod = $(By.xpath("//div[@cmptype='ComboBoxDL']//div/span[text()='Люминесцентная микроскопия']")),
            dateMbt = $(By.xpath("//div[@name='ctrlMBT_CREATE_DATE']//div[2]")),
            luLkm = $(By.xpath("//div[@name='ctrlDRUG_RESISTANCE']//input")),
            lu = $(By.xpath("//div[@name='ctrlDRUG_RESISTANCE']//input")),
            drugS = $(By.xpath("//div[@name='ctrlDRUG']//div[@title='Выбрать из справочника']")),
            dateDrug = $(By.xpath("//div[@name='ctrlCREATE_DATE']//div[2]")),
            nameDrug = $(By.xpath("//td[@name='HEAD_LABMED_ANTIBIOTICS_DEFAULT_COLUMN_A_NAME']//input")),
            mbtRecord = $(By.xpath("//*[@cmptype='GridRow']//td/span[text()='Люминесцентная микроскопия']")),
            mbtRecordLkm = $(By.xpath("//*[@cmptype='GridRow']//td/span[text()='Люминесцентная микроскопия']")),
            drugGrid = $(By.xpath("//*[@cmptype='GridRow']//td/span[text()='Apalcilline']")),
            okdelete = $(By.xpath("//*[@caption='Подтвердите действие']//div[@name='buttonOk']")),
            mtbRecordNo = $(By.xpath("//*[@cmptype='GridRow']//td/span[text()='Люминесцентная микроскопия']")),
            resultCvkkTwo = $(By.xpath("//div[contains(@style,'display: block')]//tr[@cmptype='ComboItem']//span[contains(text(),'Диагноз подтвержден')]")),
            choose = $(By.xpath("//*[@name='modal_win']//div[text()='Выбрать']")),
            deleteYes = $(By.xpath("//*[@cmptype='Button']//*[text()='Да']")),
            deleteNo = $(By.xpath("//*[@cmptype='Button']//*[text()='Нет']")),
            updateDi = $(By.xpath("//*[@class='HeaderRightTransition']//*[text()='Обновить']")),
            otmenaGiag = $(By.xpath("//*[@cmptype='Button']//td[text()='Отмена']"));


    public Diagnoses settings() {
        settings.click();
        return this;
    }
    public Diagnoses otmenaGiag() {
        otmenaGiag.click();
        return this;
    }
    public Diagnoses updateDi() {
        updateDi.click();
        return this;
    }
    public Diagnoses mkbZa(String Value){
        mkbZa.setValue(Value).pressEnter();
        return this;
    }

    public Diagnoses deleteNo() {
        deleteNo.click();
        return this;
    }
    public Diagnoses deleteYes() {
        deleteYes.click();
        return this;
    }
    public Diagnoses patientPkm() {
        patientPkm.contextClick();
        return this;
    }
    public Diagnoses choose() {
        choose.click();
        return this;
    }
    public Diagnoses resultCvkkTwo() {
        resultCvkkTwo.click();
        return this;
    }
    public Diagnoses mtbRecordNo() {
        mtbRecordNo.shouldNot(exist);
        return this;
    }
    public Diagnoses okdelete() {
        okdelete.click();
        return this;
    }
    public Diagnoses mbtRecordLkm() {
        mbtRecordLkm.contextClick();
        return this;
    }
    public Diagnoses drugGrid() {
        drugGrid.shouldBe(exist);
        return this;
    }
    public Diagnoses mbtRecord() {
        mbtRecord.shouldBe(exist);
        return this;
    }
    public Diagnoses nameDrug(String Value){
        nameDrug.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses dateDrug() {
        dateDrug.click();
        return this;
    }
    public Diagnoses drugS() {
        drugS.click();
        return this;
    }
    public Diagnoses luLkm() {
        luLkm.click();
        return this;
    }
    public Diagnoses lu(String Value){
        lu.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses dateMbt() {
        dateMbt.click();
        return this;
    }
    public Diagnoses metodLkm() {
        metodLkm.click();
        return this;
    }
    public Diagnoses metod(){
        metod.click();
        return this;
    }
    public Diagnoses mbtAllocation(){
        mbtAllocation.click();
        return this;
    }
    public Diagnoses mbtAllocationLKm() {
        mbtAllocationLKm.click();
        return this;
    }

    public Diagnoses mbtGrid() {
        mbtGrid.contextClick();
        return this;
    }
    public Diagnoses mbtGridLkm() {
        mbtGridLkm.click();
        return this;
    }

    public Diagnoses diag() {
        diag.click();
        return this;
    }

    public Diagnoses patient() {
        patient.shouldBe(exist);
        return this;
    }
    public Diagnoses filtrTake() {
        filtrTake.click();
        return this;
    }
    public Diagnoses filtrSurname(String Value){
        filtrSurname.setValue(Value);
        return this;
    }
    public Diagnoses patientSearch() {
        patientSearch.click();
        return this;
    }
    public Diagnoses closeSluchai() {
        closeSluchai.click();
        return this;
    }
    public Diagnoses patGroup(String Value){
        patGroup.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses patGroupLkm() {
        patGroupLkm.click();
        return this;
    }
    public Diagnoses chemoPlace(String Value){
        chemoPlace.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses chemoPlaceLkm() {
        chemoPlaceLkm.click();
        return this;
    }
    public Diagnoses dateEndTreatment() {
        dateEndTreatment.click();
        return this;
    }
    public Diagnoses zaklCavkkOK() {
        zaklCavkkOK.click();
        return this;
    }
    public Diagnoses zaklCvkk() {
        zaklCvkk.click();
        return this;
    }
    public Diagnoses dateBedinTreatment() {
        dateBedinTreatment.click();
        return this;
    }
    public Diagnoses addtreatment() {
        addtreatment.shouldBe(visible,exist).click();
        return this;
    }
    public Diagnoses treatment() {
        treatment.click();
        return this;
    }
    public Diagnoses gridDiagLkm() {
        gridDiagLkm.click();
        return this;
    }
    public Diagnoses comissionGrigFree() {
        comissionGrigFree.shouldBe(exist);
        return this;
    }
    public Diagnoses markDate() {
        markDate.click();
        return this;
    }
    public Diagnoses comissionGridLkm() {
        comissionGridLkm.click();
        return this;
    }
    public Diagnoses comissionGrigTwoLkm() {
        comissionGrigTwoLkm.click();
        return this;
    }
    public Diagnoses deleteCvkk() {
        deleteCvkk.click();
        return this;
    }
    public Diagnoses сontinue() {
        сontinue.click();
        return this;
    }
    public Diagnoses apply() {
        apply.click();
        return this;
    }
    public Diagnoses codMo(String Value){
        codMo.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses findMo() {
        findMo.click();
        return this;
    }
    public Diagnoses resultCvkkLkm() {
        resultCvkkLkm.click();
        return this;
    }
    public Diagnoses targetLkm() {
        targetLkm.click();
        return this;
    }
    public Diagnoses cvkk() {
        cvkk.click();
        return this;
    }
    public Diagnoses markNo() {
        markNo.shouldNot(exist);
        return this;
    }
    public Diagnoses mark() {
        mark.click();
        return this;
    }
    public Diagnoses modeHimio(String Value){
        modeHimio.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses resultCvkk(){
        resultCvkk.click();
        return this;
    }
    public Diagnoses dateCvkk() {
        dateCvkk.click();
        return this;
    }
    public Diagnoses target(String Value){
        target.setValue(Value).pressEnter().shouldBe(exist);
        return this;
    }
    public Diagnoses comissionGrid() {
        comissionGrid.contextClick();
        return this;
    }
    public Diagnoses comissionGrigTwo() {
        comissionGrigTwo.contextClick();
        return this;
    }
    public Diagnoses dateCombinedTwo() {
        dateCombinedTwo.click();
        return this;
    }
    public Diagnoses combinedDiagTwo() {
        combinedDiagTwo.click();
        return this;
    }
    public Diagnoses editDiagtwo() {
        editDiagtwo.click();
        return this;
    }
    public Diagnoses clearDiag() {
        clearDiag.click();
        return this;
    }
    public Diagnoses messageDiag() {
        messageDiag.shouldHave(text("Сочетанный диагноз не может совпадать с основным"));
        return this;
    }
    public Diagnoses dateCombined() {
        dateCombined.click();
        return this;
    }
    public Diagnoses combinedDiag() {
        combinedDiag.click();
        return this;
    }
    public Diagnoses  editDiag() {
        editDiag.click();
        return this;
    }
    public Diagnoses recordingDiag() {
        recordingDiag.shouldBe(exist);
        return this;
    }

    public Diagnoses settingsDP() {
        settingsDP.click();
        return this;
    }
    public Diagnoses  diagnos() {
        diagnos.click();
        return this;
    }
    public Diagnoses  gridDiagnos() {
        gridDiagnos.contextClick();
        return this;
    }
    public Diagnoses  add() {
        add.click();
        return this;
    }
    public Diagnoses start() {
        start.click();
        return this;
    }
    public Diagnoses mkb() {
        mkb.click();
        return this;
    }

    public Diagnoses ok() {
        ok.shouldBe(exist,visible).click();
        return this;
    }
    public Diagnoses end(){
        end.click();
        return this;
    }
    public Diagnoses endTwo(String Value){
        endTwo.setValue(Value);
        return this;
    }
    public Diagnoses mkbtwo(String Value) {
        mkbtwo.setValue(Value);
        return this;
    }
    public Diagnoses type(String Value) {
        type.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses oktwo(){
        oktwo.shouldBe(exist).click();
        return this;
    }
    public Diagnoses message() {
        message.shouldHave(text("Нарушено требование непересечения диагнозов туберкулеза."));
        return this;
    }
    public Diagnoses  contin() {
        contin.click();
        return this;
    }
    public Diagnoses grid() {
        grid.shouldHave(text("A15.7"));
        return this;
    }
    public Diagnoses  edit() {
        edit.click();
        return this;
    }
    public Diagnoses  line() {
        line.click();
        return this;
    }
    public Diagnoses  linepkm() {
        linepkm.contextClick();
        return this;
    }
    public Diagnoses  page() {
        page.click();
        return this;
    }
    public Diagnoses  vkFormlok() {
        vkFormlok.click();
        return this;
    }
    public Diagnoses  gridFormlok() {
        gridFormlok.click();
        return this;
    }
    public Diagnoses  gridFormlokpkm() {
        gridFormlokpkm.contextClick();
        return this;
    }
    public Diagnoses  addtwo() {
        addtwo.click();
        return this;
    }
    public Diagnoses kodlkm(){
        kodlkm.click();
        return this;
    }
    public Diagnoses kod(String Value){
        kod.setValue(Value);
        return this;
    }
    public Diagnoses namelkm(){
        namelkm.click();
        return this;
    }
    public Diagnoses name(String Value){
        name.setValue(Value);
        return this;
    }
    public Diagnoses  calendar() {
        calendar.click();
        return this;
    }
    public Diagnoses  date() {
        date.click();
        return this;
    }
    public Diagnoses  okfre() {
        okfre.click();
        return this;
    }
    public Diagnoses messagetwo() {
        messagetwo.shouldHave(text("Недопустимое сочетание значений полей [Тип кодировки], [Справочник РБТ: Клинические формы] раздела [Справочник РБТ: Диагнозы туберкулеза: Дополнительная кодировка]."));
        return this;
    }
    public Diagnoses  contintwo() {
        contintwo.click();
        return this;
    }
    public Diagnoses  klinformlkm() {
        klinformlkm.click();
        return this;
    }
    public Diagnoses klinform(String Value){
        klinform.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses  okfour() {
        okfour.click();
        return this;
    }
    public Diagnoses gridFormloktwo() {
        gridFormloktwo.shouldHave(text("777"));
        return this;
    }
    public Diagnoses  accounting() {
        accounting.click();
        return this;
    }
    public Diagnoses  nozreg() {
        nozreg.click();
        return this;
    }
    public Diagnoses  nozregtub() {
        nozregtub.click();
        return this;
    }
    public Diagnoses  cases() {
        cases.click();
        return this;
    }
    public Diagnoses  casesGrid() {
        casesGrid.click();
        return this;
    }
    public Diagnoses  casesGridpkm() {
        casesGridpkm.contextClick();
        return this;
    }
    public Diagnoses  casesAdd() {
        casesAdd.click();
        return this;
    }
    public Diagnoses casesSurname(String Value) {
        casesSurname.setValue(Value);
        return this;
    }
    public Diagnoses casesName(String Value) {
        casesName.setValue(Value);
        return this;
    }
    public Diagnoses  find() {
        find.click();
        return this;
    }
    public Diagnoses  gridPatient() {
        gridPatient.doubleClick();
        return this;
    }
    public Diagnoses  plus() {
        plus.click();
        return this;
    }
    public Diagnoses group(String Value){
        group.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses  groupLkm() {
        groupLkm.click();
        return this;
    }
    public Diagnoses dispVkladka() {
        dispVkladka.click();
        return this;
    }
    public Diagnoses dispDateVz() {
        dispDateVz.click();
        return this;
    }
    public Diagnoses nauchet(String Value){
        nauchet.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses dispDateUc() {
        dispDateUc.click();
        return this;
    }
    public Diagnoses moNablud() {
        moNablud.click();
        return this;
    }

    public Diagnoses okSluchai() {
        okSluchai.click();
        return this;
    }
    public Diagnoses saveSluchai() {
        saveSluchai.click();
        return this;
    }
    public Diagnoses status() {
        status.shouldHave(text("Новый случай"));
        return this;
    }
    public Diagnoses  pluSluchai() {
        pluSluchai.click();
        return this;
    }
    public Diagnoses messagefree() {
        messagefree.shouldHave(text("На контрагента Покатилова Автотест  уже есть открытый случай"));
        return this;
    }
    public Diagnoses  editSluchai() {
        editSluchai.click();
        return this;
    }
    public Diagnoses  griDiag() {
        griDiag.contextClick();
        return this;
    }
    public Diagnoses  mkbDiag() {
        mkbDiag.click();
        return this;
    }
    public Diagnoses serachDiag(String Value){
        serachDiag.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses dateDiag() {
        dateDiag.click();
        return this;
    }
    public Diagnoses clinicForm(String Value){
        clinicForm.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses moDiag() {
        moDiag.click();
        return this;
    }
    public Diagnoses docDiag() {
        docDiag.click();
        return this;
    }
    public Diagnoses localization(String Value){
        localization.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses dateLocal() {
        dateLocal.click();
        return this;
    }
    public Diagnoses phase(String Value){
        phase.setValue(Value).pressEnter();
        return this;
    }
    public Diagnoses datePhase() {
        datePhase.click();
        return this;
    }
    public Diagnoses saveDiag() {
        saveDiag.click();
        return this;
    }
}
