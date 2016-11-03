package screen.AT2MDMSP0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0010Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_add","//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_b_delete","//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_b_edit","//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_actions","//*[contains(@id, 'pcgm19:dc_m1')]");
        elements.put("MDM_b_actions_audit_data","//*[contains(@id, 'pcgm19:dc_cmi0')]/td[2]");
        elements.put("MDM_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach","//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result","//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records","//*[contains(@id, 'pc1:ot22')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_supplier_SAP_code", "//*[contains(@id, 'pcgt2:ssprCodProvId::content')]");
        elements.put("add_lov_supplier_SAP_code", "//*[contains(@id, 'pcgt2:ssprCodProvId::lovIconId')]");
        elements.put("add_e_fiscal_name", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_external_agency", "//*[contains(@id, 'pcgt2:refExternoId::content')]");
        elements.put("add_lov_external_agency", "//*[contains(@id, 'pcgt2:refExternoId::lovIconId')]");
        elements.put("add_e_external_agency_description", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_payable_company_name", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_long_payable_company_name", "//*[contains(@id, 'pcgt2:it4::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_supplier_SAP_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_supplier_SAP_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_external_agency", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_external_agency", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_payable_company_name", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_long_payable_company_name", "//*[contains(@id, 'qryId1:value50::content')]");
        //QBE
        elements.put("qbe_i_supplier_SAP_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_fiscal_name", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_external_agency", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_external_agency_description", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_payable_company_name", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_long_payable_company_name", "//*[contains(@id, 'afr_resId1c6::content')]");
    }
}
