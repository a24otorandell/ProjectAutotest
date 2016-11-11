package screen.AT2MDMUS0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 10/11/2016.
 */
public class AT2MDMUS0006Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0006Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE USERS
         */
        //GENERALS
        elements.put("users_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("users_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("users_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("users_e_result", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[1]");
        elements.put("users_e_records", "//*[contains(@id, 'pc1:outputText3')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_module", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ck_ok", "//*[contains(@id, 'qryId1:value30::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_ck_ok", "//*[contains(@id, 'pcgt2:sbc2::content')]");
        //QBE
        elements.put("qbe_i_receptive", "//*[contains(@id, 'pc1_afr_ConUsu_afr_resId1c1::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc1_afr_ConUsu_afr_resId1c5::content')]");
        elements.put("qbe_i_office_des", "//*[contains(@id, 'pc1_afr_ConUsu_afr_resId1c6::content')]");
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_ConUsu_afr_resId1c2::content')]");
        elements.put("qbe_i_module", "//*[contains(@id, 'pc1_afr_ConUsu_afr_resId1c3::content')]");
        elements.put("qbe_sl_ok", "//*[contains(@id, 'pc1:ConUsu:soc5::content')]");
        //RESULT TABLE
        elements.put("table_e_receptive", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("table_e_office", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("table_e_office_des", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("table_e_user", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("table_e_module", "//*[contains(@id, 'pc1:ConUsu::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("table_ck_ok", "//*[contains(@id, 'pc1:ConUsu:0:sbc1::content')]/span/img");
    }
}
