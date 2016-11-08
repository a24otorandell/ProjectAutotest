package screen.AT2MDMSY0039;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY0039Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0039Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("reports_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("reports_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("reports_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("reports_b_actions", "//*[contains(@id, 'PCGenericMenu5:dc_m1')]");
        elements.put("reports_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu5:dc_cmi0')]/td[2]");
        elements.put("reports_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("reports_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("reports_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("reports_e_records", "//*[contains(@id, 'pc1:ot22')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_report", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_proc_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_desc", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_lines", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_l_letter", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_fax_lines", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_orientation", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_size", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_ck_graphic", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_ck_visible_screen", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_ck_modify_labels", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_ck_business_labels", "//*[contains(@id, 'qryId1:value110::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_report", "//*[contains(@id, 'it3::content')]");
        elements.put("add_i_proc_name", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_desc", "//*[contains(@id, 'it9::content')]");
        elements.put("add_i_lines", "//*[contains(@id, 'it10::content')]");
        elements.put("add_i_l_letter", "//*[contains(@id, 'it7::content')]");
        elements.put("add_i_fax_lines", "//*[contains(@id, 'it4::content')]");
        elements.put("add_i_orientation", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_size", "//*[contains(@id, 'it8::content')]");
        elements.put("add_ck_graphic", "//*[contains(@id, 'sbc1::content')]");
        elements.put("add_ck_visible_screen", "//*[contains(@id, 'sbc2::content')]");
        elements.put("add_ck_modify_labels", "//*[contains(@id, 'sbc3::content')]");
        elements.put("add_ck_business_labels", "//*[contains(@id, 'sbc7::content')]");
        //QBE
        elements.put("qbe_i_report", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c1::content')]");
        elements.put("qbe_i_proc_name", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'pc1_afr_resId1_afr_c5::content')]");
        elements.put("qbe_i_lines", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c4::content')]");
        elements.put("qbe_i_l_lines", "//*[contains(@id, 'pc1_afr_resId1_afr_c6::content')]");
        elements.put("qbe_i_fax_lines", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c6::content')]");
        elements.put("qbe_i_orientation", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c7::content')]");
        elements.put("qbe_i_size", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c8::content')]");
        elements.put("qbe_sl_graphic", "//*[contains(@id, 'pc1:resId1:wxq4::content')]");
        elements.put("qbe_sl_visible_screen", "//*[contains(@id, 'pc1:resId1:soc1::content')]");
        elements.put("qbe_sl_modify_labels", "//*[contains(@id, 'pc1:resId1:soc2::content')]");
        elements.put("qbe_sl_business_labels", "//*[contains(@id, 'pc1:resId1:soc3::content')]");
    }
}
