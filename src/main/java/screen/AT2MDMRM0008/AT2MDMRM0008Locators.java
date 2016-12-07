package screen.AT2MDMRM0008;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/11/2016.
 */
public class AT2MDMRM0008Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0008Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //INTERFACE
                elements.put("MDM_inter_b_delete", "//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
                elements.put("MDM_inter_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_inter_b_edit", "//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
                elements.put("MDM_inter_b_actions", "//*[contains(@id, 'r1:1:pc2:j_id__ctru25pc7:dc_m1')]/div/table/tbody/tr/td[3]");
                elements.put("MDM_inter_b_actions_audit_data", "//*[contains(@id, 'pt1:dyntdc:r1:1:pc2:j_id__ctru25pc7:dc_cmi1')]/td[2]");
                elements.put("MDM_inter_b_actions_allotm_selected", "//*[contains(@id, 'pt1:dyntdc:r1:1:pc2:j_id__ctru25pc7:dc_cmi2')]/td[2]");
                elements.put("MDM_inter_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_inter_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_inter_e_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_inter_e_records", "//*[contains(@id, 'pc2:outputText3')]");
            //ALLOTMENT
                elements.put("MDM_all_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
                elements.put("MDM_all_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
                elements.put("MDM_all_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_all_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
                elements.put("MDM_all_b_actions", "//*[contains(@id, 'r1:1:pc1:j_id__ctru81pc7:dc_m1')]/div/table/tbody/tr/td[3]");
                elements.put("MDM_all_b_actions_audit_data", "//*[contains(@id, 'pc1:j_id__ctru81pc7:dc_cmi1')]/td[2]");
                elements.put("MDM_all_b_actions_exclude_selected", "//*[contains(@id, 'pc1:j_id__ctru81pc7:dc_cmi2')]/td[2]");
                elements.put("MDM_all_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_all_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_all_e_result", "//*[contains(@id, 'pc1:child::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_all_e_records", "//*[contains(@id, 'pc1:outputText1')]");
        //ADD|MODIFY
            //INTERFACE
                elements.put("add_inter_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
                elements.put("add_inter_e_code", "//*[contains(@id, 'pc2:pcgt2:it3::content')]");
                elements.put("add_inter_e_description", "//*[contains(@id, 'pc2:pcgt2:it5::content')]");
                elements.put("add_inter_e_interface_code", "//*[contains(@id, 'pc2:pcgt2:it6::content')]");
                elements.put("add_inter_cb_allotment", "//*[contains(@id, 'pcgt2:sbc1::content')]");
                elements.put("add_inter_i_no_max", "//*[contains(@id, 'pcgt2:it4::content')]");
            //ALLOTMENT
                elements.put("add_all_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
                elements.put("add_all_i_TO", "//*[contains(@id, 'pcgt1:ttooId::content')]");
                elements.put("add_all_lov_TO", "//*[contains(@id, 'pcgt1:ttooId::lovIconId')]");
                elements.put("add_all_i_braofi", "//*[contains(@id, 'pcgt1:sucOfiId::content')]");
                elements.put("add_all_lov_braofi", "//*[contains(@id, 'pcgt1:sucOfiId::lovIconId')]");
                elements.put("add_all_cb_exclude", "//*[contains(@id, 'pcgt1:sbc4::content')]");
                elements.put("add_all_no_allotm", "//*[contains(@id, 'pcgt1:it2::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId2::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
            elements.put("search_i_code", "//*[contains(@id, 'qryId2:value00::content')]");
            elements.put("search_i_description", "//*[contains(@id, 'qryId2:value10::content')]");
            elements.put("search_i_interface_code", "//*[contains(@id, 'qryId2:value20::content')]");
            elements.put("search_cb_allotment", "//*[contains(@id, 'qryId2:value30::content')]");
            elements.put("search_i_no_max", "//*[contains(@id, 'qryId2:value40::content')]");
            elements.put("search_e_code_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]");
            elements.put("search_e_description_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_e_interface_code_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_e_allotment_result", "//*[contains(@id, 'pc2:master:2:sbc2::content')]/span/img");
            elements.put("search_e_no_max_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[5]");
        //QBE
            //INTERFACE
                elements.put("qbe_inter_i_code", "//*[contains(@id, 'afr_pc2_afr_master_afr_c6::content')]");
                elements.put("qbe_inter_i_description", "//*[contains(@id, 'afr_pc2_afr_master_afr_c10::content')]");
                elements.put("qbe_inter_i_interface_code", "//*[contains(@id, 'afr_pc2_afr_master_afr_c11::content')]");
                elements.put("qbe_inter_sl_allotment", "//*[contains(@id, 'pc2:master:soc5::content')]");
                elements.put("qbe_inter_i_no_max", "//*[contains(@id, 'pc2:master:it1::content')]");
            //ALLOTMENT
                elements.put("qbe_all_i_TO", "//*[contains(@id, 'afr_pc1_afr_child_afr_c2::content')]");
                elements.put("qbe_all_i_braofi", "//*[contains(@id, 'pc1:child:i2::content')]");
                elements.put("qbe_all_sl_exclude", "//*[contains(@id, 'pc1:child:soc6::content')]");
                elements.put("qbe_all_i_no_allotm", "//*[contains(@id, 'pc1:child:i3::content')]");
    }
}
