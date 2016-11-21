package screen.AT2MDMUS0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2MDMUS0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0001Locators(String enviroment) {
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
        elements.put("users_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("users_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("users_e_result", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[1]");
        //RESULTS
        elements.put("table_t_user", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("table_t_name", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("table_t_surname", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("table_t_company", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("table_t_office", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("table_t_office_des", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("table_t_department", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("table_t_department_des", "//*[contains(@id, 'pc1:master3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_surname", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_office_des", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_department_des", "//*[contains(@id, 'qryId1:value70::content')]");
        //QBE
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_master3_afr_c8::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc1_afr_master3_afr_c6::content')]");
        elements.put("qbe_i_surname", "//*[contains(@id, 'pc1_afr_master3_afr_c2::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_master3_afr_c3::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc1_afr_master3_afr_c4::content')]");
        elements.put("qbe_i_office_des", "//*[contains(@id, 'pc1_afr_master3_afr_c1::content')]");
        elements.put("qbe_i_department", "//*[contains(@id, 'pc1_afr_master3_afr_c7::content')]");
        elements.put("qbe_i_department_des", "//*[contains(@id, 'pc1_afr_master3_afr_c5::content')]");
        /**
         * TABLE ASSOCIATED PRINTERS
         */
        //GENERALS
        elements.put("associated_b_add", "//*[contains(@id, 'pcgt38:boton_add')]");
        elements.put("associated_b_delete", "//*[contains(@id, 'pcgt38:boton_remove')]");
        elements.put("associated_b_edit", "//*[contains(@id, 'pcgt38:boton_edit')]");
        elements.put("associated_b_actions", "//*[contains(@id, 'PCGenericMenu1:dc_m1')]");
        elements.put("associated_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("associated_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("associated_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("associated_e_result", "//*[contains(@id, 'pc2:child30::db')]/table/tbody/tr[1]/td[1]");
        elements.put("associated_e_records", "//*[contains(@id, 'pc2:ot63')]");
        //SEARCH
        elements.put("search_i_find", "//*[contains(@id, 'r1:1:cb1')]");
        elements.put("search_i_spooler", "//*[contains(@id, 'giprSpoolerId::content')]");
        elements.put("search_lov_spooler", "//*[contains(@id, 'giprSpoolerId::lovIconId')]");
        elements.put("search_i_user2", "//*[contains(@id, 'gusuCodUsuId::content')]");
        elements.put("search_lov_user2", "//*[contains(@id, 'gusuCodUsuId::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pc2:pcgt38:btn_commitExit')]");
        elements.put("add_i_spooler", "//*[contains(@id, 'pcgt38:giprSpooler1Id::content')]");
        elements.put("add_lov_spooler", "//*[contains(@id, 'pcgt38:giprSpooler1Id::lovIconId')]");
        elements.put("add_i_paper", "//*[contains(@id, 'pcgt38:gtplCodTipoPapel1Id::content')]");
        elements.put("add_lov_paper", "//*[contains(@id, 'pcgt38:gtplCodTipoPapel1Id::lovIconId')]");
        elements.put("add_ck_defect", "//*[contains(@id, 'pcgt38:sbc1::content')]");
        elements.put("add_i_printer", "//*[contains(@id, 'pc2:pcgt38:it1::content')]");
        //QBE
        elements.put("qbe_i_spooler", "//*[contains(@id, '_pc2_afr_child30_afr_c11::content')]");
        elements.put("qbe_i_printer", "//*[contains(@id, '_pc2_afr_child30_afr_c13::content')]");
        elements.put("qbe_i_paper", "//*[contains(@id, '_pc2_afr_child30_afr_c12::content')]");
        elements.put("qbe_sl_defect", "//*[contains(@id, 'pc2:child30:soc2::content')]");
    }
}
