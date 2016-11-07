package screen.AT2MDMUS0014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMUS0014Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0014Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
            elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
            elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
            elements.put("add_i_user", "//*[contains(@id, 'pcgt2:gusuCodUsuId::content')]");
            elements.put("add_lov_user", "//*[contains(@id, 'pcgt2:gusuCodUsuId::lovIconId')]");
            elements.put("add_e_user_name", "//*[contains(@id, 'pcgt2:it2::content')]");
            elements.put("add_i_department", "//*[contains(@id, 'pcgt2:gdepCodDepartId::content')]");
            elements.put("add_lov_department", "//*[contains(@id, 'pcgt2:gdepCodDepartId::lovIconId')]");
            elements.put("add_e_department_description", "//*[contains(@id, 'pcgt2:it1::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_user", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_user_name", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_i_department", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
            elements.put("search_i_department_description", "//*[contains(@id, 'qryId1:value30::content')]");
        //QBE
            elements.put("qbe_i_user", "//*[contains(@id, 'afr_resId1c3::content')]");
            elements.put("qbe_i_user_name", "//*[contains(@id, 'afr_resId1c4::content')]");
            elements.put("qbe_i_department", "//*[contains(@id, 'afr_resId1c1::content')]");
            elements.put("qbe_i_department_description", "//*[contains(@id, 'afr_resId1c2::content')]");
    }
}