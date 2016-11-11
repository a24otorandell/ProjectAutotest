package screen.AT2MDMUS0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 10/11/2016.
 */
public class AT2MDMUS0004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0004Locators(String enviroment) {
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
        elements.put("users_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("users_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("users_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("users_b_actions", "//*[contains(@id, 'PCGenericMenu5:dc_m1')]");
        elements.put("users_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu5:dc_cmi0')]/td[2]");
        elements.put("users_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("users_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("users_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("users_e_records", "//*[contains(@id, 'pc1:ot3')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_password", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_surname1", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_surname2", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_sl_status", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_language", "//*[contains(@id, 'qryId1:value60::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_user", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        elements.put("add_i_password", "//*[contains(@id, 'pc1:pcgt1:it5::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("add_i_surname1", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("add_i_surname2", "//*[contains(@id, 'pc1:pcgt1:itable2::content')]");
        elements.put("add_sl_status", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("add_i_language", "//*[contains(@id, 'pc1:pcgt1:it6::content')]");
        //QBE
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_table1_afr_table1c1::content')]");
        elements.put("qbe_i_password", "//*[contains(@id, 'pc1_afr_table1_afr_table1c2::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc1_afr_table1_afr_table1c3::content')]");
        elements.put("qbe_i_surname1", "//*[contains(@id, 'pc1_afr_table1_afr_table1c4::content')]");
        elements.put("qbe_i_surname2", "//*[contains(@id, 'pc1_afr_table1_afr_table1c5::content')]");
        elements.put("qbe_sl_status", "//*[contains(@id, 'pc1:table1:soc7::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'pc1_afr_table1_afr_table1c7::content')]");
        /**
         * TABLE APPLICATIONS
         */
        //GENERALS
        elements.put("application_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("application_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("application_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("application_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("application_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("application_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("application_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("application_e_result", "//*[contains(@id, 'pc2:table2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("application_e_records", "//*[contains(@id, 'pc2:ot11')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_application", "//*[contains(@id, 'pc2:pcgt2:codAplicacion1Id::content')]");
        elements.put("add_lov_application", "//*[contains(@id, 'pc2:pcgt2:codAplicacion1Id::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'pc2:pcgt2:it7::content')]");
        elements.put("t2_add_sl_status", "//*[contains(@id, 'pc2:pcgt2:soc5::content')]");
        //QBE
        elements.put("qbe_i_application", "//*[contains(@id, 'pc2_afr_table2_afr_c4::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'pc2_afr_table2_afr_c3::content')]");
        elements.put("t2_qbe_sl_status", "//*[contains(@id, 'pc2:table2:soc4::content')]");
    }
}
