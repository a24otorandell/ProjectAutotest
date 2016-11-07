package screen.AT2MDMSY0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0001Locators(String enviroment) {
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
            elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pc1:pdm2:dc_cmi0')]/td[2]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:etqint::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
            elements.put("add_i_name", "//*[contains(@id, 'pcgt1:codListadoId::content')]");
            elements.put("add_lov_name", "//*[contains(@id, 'pcgt1:codListadoId::lovIconId')]");
            elements.put("add_e_report_description", "//*[contains(@id, 'pcgt1:it4::content')]");
            elements.put("add_i_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::content')]");
            elements.put("add_lov_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::lovIconId')]");
            elements.put("add_i_language", "//*[contains(@id, 'pcgt1:codIdiomaId::content')]");
            elements.put("add_lov_language", "//*[contains(@id, 'pcgt1:codIdiomaId::lovIconId')]");
            elements.put("add_i_order", "//*[contains(@id, 'pcgt1:it1::content')]");
            elements.put("add_i_label", "//*[contains(@id, 'pcgt1:it2::content')]");
            elements.put("add_i_remarks", "//*[contains(@id, 'pcgt1:it3::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_name", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_name", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
            elements.put("search_i_language", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_lov_language", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
            elements.put("search_i_order", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_i_report_description", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_lov_report_description", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
            elements.put("search_i_label", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_i_remarks", "//*[contains(@id, 'qryId1:value60::content')]");
        //QBE
            elements.put("qbe_i_name", "//*[contains(@id, 'afr_etqint_afr_c6::content')]");
            elements.put("qbe_i_report_description", "//*[contains(@id, 'afr_etqint_afr_c3::content')]");
            elements.put("qbe_i_interface", "//*[contains(@id, 'afr_etqint_afr_c4::content')]");
            elements.put("qbe_i_language", "//*[contains(@id, 'etqint_afr_c5::content')]");
            elements.put("qbe_i_order", "//*[contains(@id, 'etqint:it9::content')]");
    }
}
