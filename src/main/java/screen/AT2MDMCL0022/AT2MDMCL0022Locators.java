package screen.AT2MDMCL0022;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 25/11/2016.
 */
public class AT2MDMCL0022Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0022Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
            elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
            elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
            elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
            elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pc1:pdm2:dc_cmi1')]/td[2]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:outputText1')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
            elements.put("add_i_interface", "//*[contains(@id, 'pcgt1:ipInterf1Id::content')]");
            elements.put("add_lov_interface", "//*[contains(@id, 'pcgt1:ipInterf1Id::lovIconId')]");
            elements.put("add_e_interface", "//*[contains(@id, 'pc1:pcgt1:it26::content')]");
            elements.put("add_i_primsecdetbranch", "//*[contains(@id, 'pcgt1:cadena1Id::content')]");
            elements.put("add_lov_primsecdetbranch", "//*[contains(@id, 'pcgt1:cadena1Id::lovIconId')]");
            elements.put("add_i_major", "//*[contains(@id, 'pcgt1:mayor1Id::content')]");
            elements.put("add_lov_major", "//*[contains(@id, 'pcgt1:mayor1Id::lovIconId')]");
            elements.put("add_i_secondary", "//*[contains(@id, 'pcgt1:it23::content')]");
            elements.put("add_i_detail", "//*[contains(@id, 'pcgt1:it18::content')]");
            elements.put("add_i_branch", "//*[contains(@id, 'pcgt1:it22::content')]");
            elements.put("add_i_atlas_code", "//*[contains(@id, 'pcgt1:codeAtlas1Id::content')]");
            elements.put("add_lov_atlas_code", "//*[contains(@id, 'codeAtlas1Id::lovIconId')]");
            elements.put("add_e_agency_name", "//*[contains(@id, 'pcgt1:it20::content')]");
            elements.put("add_e_agency_code", "//*[contains(@id, 'pcgt1:it25::content')]");
            elements.put("add_i_ip", "//*[contains(@id, 'pcgt1:it21::content')]");
            elements.put("add_i_valid_ip", "//*[contains(@id, 'pcgt1:it17::content')]");
            elements.put("add_sl_ip_valida", "//*[contains(@id, 'pcgt1:soc1::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_primary", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_lov_primary", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
            elements.put("search_i_secondary", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_i_detail", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_i_branch", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_i_atlas_code", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_lov_atlas_code", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
            elements.put("search_i_agency_code", "//*[contains(@id, 'qryId1:value60::content')]");
            elements.put("search_i_ip", "//*[contains(@id, 'qryId1:value70::content')]");
            elements.put("search_i_valid_ip", "//*[contains(@id, 'qryId1:value80::content')]");
            elements.put("search_sl_ip_valida", "//*[contains(@id, 'qryId1:value90::content')]");
            elements.put("search_i_primsecdetbranch_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_i_major_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_i_secondary_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
            elements.put("search_i_detail_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
            elements.put("search_i_branch_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
            elements.put("search_i_agency_name_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
            elements.put("search_i_agency_code_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        //QBE
            elements.put("qbe_i_interface", "//*[contains(@id, 'afr_resId1_afr_c15::content')]");
            elements.put("qbe_i_primsecdetbranch", "//*[contains(@id, 'afr_resId1_afr_c21::content')]");
            elements.put("qbe_i_major", "//*[contains(@id, 'afr_resId1_afr_c10::content')]");
            elements.put("qbe_i_secondary", "//*[contains(@id, 'afr_resId1_afr_c12::content')]");
            elements.put("qbe_i_detail", "//*[contains(@id, 'afr_resId1_afr_c9::content')]");
            elements.put("qbe_i_branch", "//*[contains(@id, 'afr_resId1_afr_c11::content')]");
            elements.put("qbe_i_atlas_code", "//*[contains(@id, 'afr_resId1_afr_c14::content')]");
            elements.put("qbe_i_agency_name", "//*[contains(@id, 'afr_resId1_afr_c13::content')]");
            elements.put("qbe_i_agency_code", "//*[contains(@id, 'afr_resId1_afr_c23::content')]");
            elements.put("qbe_i_ip", "//*[contains(@id, 'afr_resId1_afr_c22::content')]");
            elements.put("qbe_i_valid_ip", "//*[contains(@id, 'afr_resId1_afr_c20::content')]");
            elements.put("qbe_sl_ip_valida", "//*[contains(@id, 'resId1:soc3::content')]");
    }
}
