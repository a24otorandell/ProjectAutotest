package screen.AT2MDMOR0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0013Locators(String enviroment) {
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
        elements.put("MDM_b_actions", "//*[contains(@id, 'id__ctru29pc7:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'id__ctru29pc7:dc_cmi0')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot35')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt1:codEmpFactId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt1:codEmpFactId::lovIconId')]");
        elements.put("add_i_department", "//*[contains(@id, 'pcgt1:codDeptId::content')]");
        elements.put("add_lov_department", "//*[contains(@id, 'pcgt1:codDeptId::lovIconId')]");
        elements.put("add_i_booking_department", "//*[contains(@id, 'pcgt1:codDeptReserId::content')]");
        elements.put("add_lov_booking_department", "//*[contains(@id, 'pcgt1:codDeptReserId::lovIconId')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_booking_department", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_booking_department", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_e_company_description_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[2]");
        elements.put("search_e_department_description_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[4]");
        elements.put("search_e_booking_department_description_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[6]");
        //QBE
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_company_description", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_department", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_department_description", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_booking_department", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_booking_department_description", "//*[contains(@id, 'afr_c3::content')]");
    }
}
