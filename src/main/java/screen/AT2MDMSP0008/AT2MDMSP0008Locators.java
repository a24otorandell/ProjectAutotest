package screen.AT2MDMSP0008;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0008Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0008Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("supplier_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("supplier_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("supplier_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("supplier_b_actions", "//*[contains(@id, 'pcgm19:dc_m1')]");
        elements.put("supplier_b_actions_b_audit_data", "//*[contains(@id, 'pcgm19:dc_cmi0')]/td[2]");
        elements.put("supplier_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("supplier_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("supplier_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("supplier_e_records", "//*[contains(@id, 'pc1:ot22')]");
        elements.put("supplier_qbe_reset", "//*[contains(@id, 'pc1:resId1::ch::t')]/tbody/tr[2]/th/a");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'value10::lovIconId')]");
        elements.put("search_i_supplier", "//*[contains(@id, 'value20::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'value20::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_application_date", "//*[contains(@id, 'value40::content')]");
        elements.put("search_i_amount", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'value60::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'value60::lovIconId')]");
        elements.put("search_i_commission", "//*[contains(@id, 'value70::content')]");
        elements.put("search_ck_inhouse", "//*[contains(@id, 'value80::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_company", "//*[contains(@id, 'codEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'codEmpId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'codOfiId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'codOfiId::lovIconId')]");
        elements.put("add_i_supplier", "//*[contains(@id, 'nomCortoId::content')]");
        elements.put("add_lov_supplier", "//*[contains(@id, 'nomCortoId::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'it2::content')]");
        elements.put("add_i_application_date", "//*[contains(@id, 'id2::content')]");
        elements.put("add_i_amount", "//*[contains(@id, 'it1::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'codDivisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'codDivisaId::lovIconId')]");
        elements.put("add_i_commission", "//*[contains(@id, 'it3::content')]");
        elements.put("add_ck_inhouse", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        //QBE
        elements.put("qbe_i_company", "//*[contains(@id, '_afr_resId1c1::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, '_afr_resId1c2::content')]");
        elements.put("qbe_i_supplier", "//*[contains(@id, '_afr_resId1c3::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_afr_resId1c4::content')]");
        elements.put("qbe_i_application_date", "//*[contains(@id, 'resId1:id1::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, '_afr_resId1c6::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, '_afr_resId1c7::content')]");
        elements.put("qbe_i_commission", "//*[contains(@id, 'pc1:resId1:in1::content')]");
        elements.put("qbe_sl_inhouse", "//*[contains(@id, 'pc1:resId1:soc55::content')]");
    }
}
