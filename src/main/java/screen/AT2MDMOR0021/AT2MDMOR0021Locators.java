package screen.AT2MDMOR0021;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMOR0021Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0021Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        //RESULTS
        elements.put("MDM_results_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_results_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_results_b_delete_yes", "//*[contains(@id, 'pcgt1:cbt1')]");
        elements.put("MDM_results_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_results_b_actions", "//*[contains(@id, 'pcgmc1:dc_m1')]");
        elements.put("MDM_results_b_actions_audit_data", "//*[contains(@id, 'pcgmc1:dc_cmi1')]/td[2]");
        elements.put("MDM_results_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_results_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_results_e_result", "//*[contains(@id, 'mpt1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_results_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //ERRORS
        elements.put("MDM_errors_b_add", "//*[contains(@id, 'pcgtc2:boton_add')]");
        elements.put("MDM_errors_b_delete", "//*[contains(@id, 'pcgtc2:boton_remove')]");
        elements.put("MDM_errors_b_delete_yes", "//*[contains(@id, 'pcgtc2:cbt1')]");
        elements.put("MDM_errors_b_edit", "//*[contains(@id, 'pcgtc2:boton_edit')]");
        elements.put("MDM_errors_b_actions", "//*[contains(@id, 'pcgmcc1:dc_m1')]");
        elements.put("MDM_errors_b_actions_audit_data", "//*[contains(@id, 'pcgmcc1:dc_cmi1')]/td[2]");
        elements.put("MDM_errors_b_qbe", "//*[contains(@id, 'pcc1:_qbeTbr')]");
        elements.put("MDM_errors_b_detach", "//*[contains(@id, 'pcc1:_dchTbr')]");
        elements.put("MDM_errors_e_result", "//*[contains(@id, 'pcc1:mtt1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_errors_e_records", "//*[contains(@id, 'pcc1:otc2')]");
        //ADD|MODIFY
        //RESULTS
        elements.put("add_results_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_results_i_code", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("add_results_ls_severity", "//*[contains(@id, 'pcgt1:soc2::content')]");
        elements.put("add_results_i_description", "//*[contains(@id, 'pcgt1:it6::content')]");
        elements.put("add_results_i_constraint_name", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_results_i_domain_name", "//*[contains(@id, 'pcgt1:it7::content')]");
        //ERRORS
        elements.put("add_errors_b_save", "//*[contains(@id, 'pcgtc2:btn_commitExit')]");
        elements.put("add_errors_i_language", "//*[contains(@id, 'pcgtc2:languageId::content')]");
        elements.put("add_errors_lov_language", "//*[contains(@id, 'pcgtc2:languageId::lovIconId')]");
        elements.put("add_errors_i_text", "//*[contains(@id, 'pcgtc2:it4::content')]");
        elements.put("add_errors_i_help_text", "//*[contains(@id, 'pcgtc2:it3::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_category", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_category", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_ls_severity", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_constraint_name", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_domain_name", "//*[contains(@id, 'qryId1:value50::content')]");
        //QBE
        //RESULTS
        elements.put("qbe_results_i_code", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_results_ls_severity", "//*[contains(@id, 'socsev3::content')]");
        elements.put("qbe_results_i_description", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_results_i_constraint_name", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_results_i_domain_name", "//*[contains(@id, 'afr_c5::content')]");
        //ERRORS
        elements.put("qbe_errors_i_language", "//*[contains(@id, 'pcc1_afr_mtt1_afr_c6::content')]");
        elements.put("qbe_errors_i_text", "//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_errors_i_help_text", "//*[contains(@id, 'afr_c7::content')]");
    }
}
