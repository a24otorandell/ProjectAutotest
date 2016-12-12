package screen.AT2MDMOR0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMOR0011Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("departments_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("departments_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("departments_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("departments_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("departments_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("departments_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("departments_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("departments_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("departments_e_records", "//*[contains(@id, 'pc1:ot35')]");
        elements.put("lov_i_altgenericinput2", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_activity", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ck_group", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_ck_internet", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_ck_excursions", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_ck_active", "//*[contains(@id, 'qryId1:value60::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("add_i_department", "//*[contains(@id, 'pc1:pcgt1:desDepartamentoCId::content')]");
        elements.put("add_lov_department", "//*[contains(@id, 'pc1:pcgt1:desDepartamentoCId::lovIconId')]");
        elements.put("add_i_department_des", "//*[contains(@id, 'pc1:pcgt1:it4::content')]");
        elements.put("add_i_activity", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        elements.put("add_ck_group", "//*[contains(@id, 'pc1:pcgt1:sbc6::content')]");
        elements.put("add_ck_internet", "//*[contains(@id, 'pc1:pcgt1:sbc5::content')]");
        elements.put("add_ck_excursions", "//*[contains(@id, 'pc1:pcgt1:sbc8::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pc1:pcgt1:sbc7::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_department", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_department_des", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_activity", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_sl_group", "//*[contains(@id, 'soc4::content')]");
        elements.put("qbe_sl_internet", "//*[contains(@id, 'soc41::content')]");
        elements.put("qbe_sl_excursions", "//*[contains(@id, 'soc42::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'soc43::content')]");
    }
}
