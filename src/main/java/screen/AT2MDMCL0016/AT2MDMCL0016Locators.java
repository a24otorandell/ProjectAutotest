package screen.AT2MDMCL0016;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 03/11/2016.
 */
public class AT2MDMCL0016Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0016Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE GROUPS
         */
        //GENERALS
        elements.put("group_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("group_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("group_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("group_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("group_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("group_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("group_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("group_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("group_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_group_code", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_group_name", "//*[contains(@id, 'value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_group_code", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("add_i_group_name", "//*[contains(@id, 'pcgt2:it8::content')]");
        elements.put("add_ck_hotelextras_group", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        //QBE
        elements.put("qbe_i_group_code", "//*[contains(@id, '_afr_c2::content')]");
        elements.put("qbe_i_group_name", "//*[contains(@id, '_afr_c1::content')]");
        elements.put("qbe_i_hotelextras_group", "//*[contains(@id, '_afr_c6::content')]");
        /**
         * TABLE TO
         */
        //GENERALS
        elements.put("to_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("to_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("to_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("to_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("to_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        //QBE
        elements.put("qbe_i_short_name", "//*[contains(@id, '_afr_c3::content')]");
        elements.put("qbe_i_to_name", "//*[contains(@id, '_afr_c5::content')]");

    }
}


