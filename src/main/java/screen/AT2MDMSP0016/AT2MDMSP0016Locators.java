package screen.AT2MDMSP0016;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0016Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0016Locators(String enviroment) {
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
        elements.put("MDM_results_b_delete_ok", "//*[contains(@id, 'pcgt1:cbt1')]");
        elements.put("MDM_results_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_results_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("MDM_results_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("MDM_results_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_results_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_results_e_result", "//*[contains(@id, 'pc1:md1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_results_e_records", "//*[contains(@id, 'pc1:ot3')]");
        //DETAILS
        elements.put("MDM_details_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_details_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_details_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
        elements.put("MDM_details_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_details_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("MDM_details_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("MDM_details_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("MDM_details_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("MDM_details_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_details_e_records", "//*[contains(@id, 'pc2:ot5')]");
        //ADD|MODIFY
        //RESULTS
        elements.put("add_results_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_results_i_company", "//*[contains(@id, 'pcgt1:sempCodEmpId::content')]");
        elements.put("add_results_lov_company", "//*[contains(@id, 'pcgt1:sempCodEmpId::lovIconId')]");
        elements.put("add_results_i_office", "//*[contains(@id, 'pcgt1:sofiCodOfiId::content')]");
        elements.put("add_results_lov_office", "//*[contains(@id, 'pcgt1:sofiCodOfiId::lovIconId')]");
        elements.put("add_results_i_short_name", "//*[contains(@id, 'pcgt1:nomCortoId::content')]");
        elements.put("add_results_lov_short_name", "//*[contains(@id, 'pcgt1:nomCortoId::lovIconId')]");
        elements.put("add_results_e_supplier_code", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_results_e_commercial_name", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_results_e_fiscal_name", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_results_e_VCC_from", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_results_i_payment_method", "//*[contains(@id, 'pcgt1:viaPagoId::content')]");
        elements.put("add_results_lov_payment_method", "//*[contains(@id, 'pcgt1:viaPagoId::lovIconId')]");
        elements.put("add_results_e_payment_method_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        //DETAILS
        elements.put("add_details_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_details_i_days_in_advance", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("add_details_i_%_prepayment", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_details_i_application_date", "//*[contains(@id, 'pcgt2:id2::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId2:value10::lovIconId')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("search_lov_short_name", "//*[contains(@id, 'qryId2:value20::lovIconId')]");
        elements.put("search_i_supplier_code", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("search_i_payment_method", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("search_lov_payment_method", "//*[contains(@id, 'qryId2:value40::lovIconId')]");
        //QBE
        //RESULTS
        elements.put("qbe_results_i_company", "//*[contains(@id, 'afr_md1_afr_c37::content')]");
        elements.put("qbe_results_i_office", "//*[contains(@id, 'afr_md1_afr_c19::content')]");
        elements.put("qbe_results_i_short_name", "//*[contains(@id, 'afr_md1_afr_c22::content')]");
        elements.put("qbe_results_i_supplier_code", "//*[contains(@id, 'afr_md1_afr_c35::content')]");
        elements.put("qbe_results_i_commercial_name", "//*[contains(@id, 'afr_md1_afr_c20::content')]");
        elements.put("qbe_results_i_fiscal_name", "//*[contains(@id, 'afr_md1_afr_c18::content')]");
        elements.put("qbe_results_i_VCC_from", "//*[contains(@id, 'pc1:md1:id3::content')]");
        elements.put("qbe_results_i_payment_method", "//*[contains(@id, 'afr_md1_afr_c26::content')]");
        elements.put("qbe_results_i_payment_method_description", "//*[contains(@id, 'afr_md1_afr_c32::content')]");
        //DETAILS
        elements.put("qbe_details_i_days_in_advance", "//*[contains(@id, 'afr_t2_afr_c25::content')]");
        elements.put("qbe_details_i_%_prepayment", "//*[contains(@id, 'afr_t2_afr_c30::content')]");
        elements.put("qbe_details_i_application_date", "//*[contains(@id, 'pc2:t2:id1::content')]");
    }
}