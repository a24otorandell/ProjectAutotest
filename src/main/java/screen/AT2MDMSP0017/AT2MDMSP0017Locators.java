package screen.AT2MDMSP0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMSP0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0017Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("suppliers_b_add", "//*[contains(@id, 'pcgtid1:boton_add')]");
        elements.put("suppliers_b_delete", "//*[contains(@id, 'pcgtid1:boton_remove')]");
        elements.put("suppliers_b_edit", "//*[contains(@id, 'pcgtid1:boton_edit')]");
        elements.put("suppliers_b_actions", "//*[contains(@id, 'pcgmid1:dc_m1')]");
        elements.put("suppliers_b_actions_b_audit_data", "//*[contains(@id, 'pcgmid1:dc_cmi0')]/td[2]");
        elements.put("suppliers_b_qbe", "//*[contains(@id, 'pcid1:_qbeTbr')]");
        elements.put("suppliers_b_detach", "//*[contains(@id, 'pcid1:_dchTbr')]");
        elements.put("suppliers_e_result", "//*[contains(@id, 'pcid1:vccSuppTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("suppliers_e_records", "//*[contains(@id, 'pcid1:ot1id1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_supplier", "//*[contains(@id, 'value00::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_i_comercial", "//*[contains(@id, 'value10::content')]");
        elements.put("search_sl_vcc", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_from", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_to", "//*[contains(@id, 'value40::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_days", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_expiration", "//*[contains(@id, 'value70::content')]");
        elements.put("search_ck_cost", "//*[contains(@id, 'value80::content')]");
        elements.put("search_ck_card", "//*[contains(@id, 'value90::content')]");
        elements.put("search_ck_advice", "//*[contains(@id, 'value100::content')]");
        elements.put("search_ck_cvc", "//*[contains(@id, 'value110::content')]");
        elements.put("search_i_days_previous", "//*[contains(@id, 'value120::content')]");
        elements.put("search_sl_address_book", "//*[contains(@id, 'value130::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgtid1:btn_commitExit')]");
        elements.put("add_i_supplier", "//*[contains(@id, 'codProveId::content')]");
        elements.put("add_lov_supplier", "//*[contains(@id, 'codProveId::lovIconId')]");
        elements.put("add_sl_vcc", "//*[contains(@id, 'soc6::content')]");
        elements.put("add_i_from", "//*[contains(@id, 'id6::content')]");
        elements.put("add_i_to", "//*[contains(@id, 'id5::content')]");
        elements.put("add_sl_type_", "//*[contains(@id, 'pcid1:pcgtid1:soc7::content')]");
        elements.put("add_i_days", "//*[contains(@id, 'it9::content')]");
        elements.put("add_i_expiration_days", "//*[contains(@id, 'it7::content')]");
        elements.put("add_ck_cost", "//*[contains(@id, 'pcgtid1:sbc7::content')]");
        elements.put("add_ck_card", "//*[contains(@id, 'pcgtid1:sbc5::content')]");
        elements.put("add_ck_advice", "//*[contains(@id, 'pcgtid1:sbc8::content')]");
        elements.put("add_ck_cvc", "//*[contains(@id, 'pcgtid1:sbc6::content')]");
        elements.put("add_i_days_previous", "//*[contains(@id, 'it10::content')]");
        elements.put("add_sl_address_book", "//*[contains(@id, 'soc8::content')]");
        //QBE
        elements.put("qbe_i_supplier", "//*[contains(@id, '_pcid1_afr_vccSuppTb_afr_c7::content')]");
        elements.put("qbe_i_comercial", "//*[contains(@id, '_pcid1_afr_vccSuppTb_afr_c3::content')]");
        elements.put("qbe_sl_vcc", "//*[contains(@id, 'vccSuppTb:socid3::content')]");
        elements.put("qbe_i_from", "//*[contains(@id, 'vccSuppTb:id1::content')]");
        elements.put("qbe_i_to", "//*[contains(@id, 'vccSuppTb:id2::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'vccSuppTb:soc3::content')]");
        elements.put("qbe_i_days", "//*[contains(@id, '_pcid1_afr_vccSuppTb_afr_c13::content')]");
        elements.put("qbe_i_expiration_days", "//*[contains(@id, '_pcid1_afr_vccSuppTb_afr_c9::content')]");
        elements.put("qbe_sl_cost", "//*[contains(@id, 'vccSuppTb:soc4::content')]");
        elements.put("qbe_sl_card", "//*[contains(@id, 'selectOneChoice1::content')]");
        elements.put("qbe_sl_advice", "//*[contains(@id, 'selectOneChoice2::content')]");
        elements.put("qbe_sl_cvc", "//*[contains(@id, 'selectOneChoice3::content')]");
        elements.put("qbe_i_days_previous_to_sending", "//*[contains(@id, '_pcid1_afr_vccSuppTb_afr_c12::content')]");
        elements.put("qbe_sl_address_book", "//*[contains(@id, 'vccSuppTb:selectOneChoice4::content')]");
    }
}
