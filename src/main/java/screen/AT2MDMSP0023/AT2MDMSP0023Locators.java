package screen.AT2MDMSP0023;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMSP0023Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0023Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("suppliers_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("suppliers_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("suppliers_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("suppliers_b_actions", "//*[contains(@id, 'PCGenericMenu5:dc_m1')]");
        elements.put("suppliers_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu5:dc_cmi0')]/td[2]");
        elements.put("suppliers_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("suppliers_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("suppliers_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("suppliers_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_supplier", "//*[contains(@id, 'value00::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'value10::content')]");
        elements.put("search_ck_web", "//*[contains(@id, 'value20::content')]");
        elements.put("search_ck_send", "//*[contains(@id, 'value30::content')]");
        elements.put("search_ck_allotment", "//*[contains(@id, 'value40::content')]");
        elements.put("search_ck_finished", "//*[contains(@id, 'value50::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_supplier", "//*[contains(@id, 'codProveSap1Id::content')]");
        elements.put("add_lov_supplier", "//*[contains(@id, 'codProveSap1Id::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_ck_web", "//*[contains(@id, 'pcgt1:sbc4::content')]");
        elements.put("add_ck_send", "//*[contains(@id, 'pcgt1:sbc2::content')]");
        elements.put("add_ck_allotment", "//*[contains(@id, 'pcgt1:sbc3::content')]");
        elements.put("add_ck_finished", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        //QBE
        elements.put("qbe_i_suppliers", "//*[contains(@id, '_pc1_afr_t1_afr_c5::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_pc1_afr_t1_afr_c3::conten')]");
        elements.put("qbe_sl_web", "//*[contains(@id, 'pc1:t1:wxq51::content')]");
        elements.put("qbe_sl_send", "//*[contains(@id, 'pc1:t1:wxq2::content')]");
        elements.put("qbe_sl_allotment", "//*[contains(@id, 'pc1:t1:wxq3::content')]");
        elements.put("qbe_sl_finished", "//*[contains(@id, 'pc1:t1:wxq4::content')]");
    }
}
