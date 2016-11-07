package screen.AT2MDMOR0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMOR0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0010Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("department_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("department_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("department_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("department_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
        elements.put("department_b_actions_b_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
        elements.put("department_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("department_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("department_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("department_e_records", "//*[contains(@id, 'pc1:ot111')]");
        elements.put("department_e_close_audit", "//*[contains(@id, 'pcgm2:d22::close')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_dept", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_dept", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt1:codEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt1:codEmpId::lovIconId')]");
        elements.put("add_i_company_des", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_i_dept", "//*[contains(@id, 'pcgt1:codDepartId::content')]");
        elements.put("add_lov_dept", "//*[contains(@id, 'pcgt1:codDepartId::lovIconId')]");
        elements.put("add_i_dept_desc", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_logo_01", "//*[contains(@id, 'pcgt1:if1::content')]");
        elements.put("add_logo_02", "//*[contains(@id, 'pcgt1:if2::content')]");
        elements.put("add_logo_03", "//*[contains(@id, 'pcgt1:if3::content')]");
        //QBE
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_company_des", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_dept", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_dept_desc", "//*[contains(@id, 'afr_c5::content')]");
    }
}
