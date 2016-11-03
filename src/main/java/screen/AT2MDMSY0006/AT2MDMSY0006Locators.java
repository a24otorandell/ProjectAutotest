package screen.AT2MDMSY0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMSY0006Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0006Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pc1:PCGenericToolbar5:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pc1:PCGenericToolbar5:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pc1:PCGenericToolbar5:boton_edit')]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pc1:PCGenericToolbar5:btn_commitExit')]");
        elements.put("add_i_spooler", "//*[contains(@id, 'pc1:PCGenericToolbar5:it4::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pc1:PCGenericToolbar5:it5::content')]");
        elements.put("add_i_abbreviation", "//*[contains(@id, 'pc1:PCGenericToolbar5:it10::content')]");
        elements.put("add_i_code", "//*[contains(@id, 'pc1:PCGenericToolbar5:gtimCodTipoImpresoraId::content')]");
        elements.put("add_lov_code", "//*[contains(@id, 'pc1:PCGenericToolbar5:gtimCodTipoImpresoraId::lovIconId')]");
        elements.put("add_e_printer_type", "//*[contains(@id, 'pc1:PCGenericToolbar5:it6::content')]");
        elements.put("add_i_company", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGofiPempCodEmp1Id::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGofiPempCodEmp1Id::lovIconId')]");
        elements.put("add_e_company_description", "//*[contains(@id, 'pc1:PCGenericToolbar5:it8::content')]");
        elements.put("add_i_office", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGofiCodOfi1Id::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGofiCodOfi1Id::lovIconId')]");
        elements.put("add_e_office_description", "//*[contains(@id, 'pc1:PCGenericToolbar5:it7::content')]");
        elements.put("add_i_department", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGdepCodDepart1Id::content')]");
        elements.put("add_lov_department", "//*[contains(@id, 'pc1:PCGenericToolbar5:gdofGdepCodDepart1Id::lovIconId')]");
        elements.put("add_e_department_description", "//*[contains(@id, 'pc1:PCGenericToolbar5:it9::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_spooler", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_abbreviation", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_printer_type", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_company_description", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_i_office_description", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("search_i_department_description", "//*[contains(@id, 'qryId1:value100::content')]");
        //QBE
        elements.put("qbe_i_spooler", "//*[contains(@id, 'afr_t1_afr_c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_t1_afr_c5::content')]");
        elements.put("qbe_i_abbreviation", "//*[contains(@id, 'afr_t1_afr_c4::content')]");
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("qbe_i_printer_type", "//*[contains(@id, 'afr_t1_afr_c1::content')]");
    }
}