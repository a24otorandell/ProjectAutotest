package screen.AT2ACCOP0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lchacartegui on 31/08/2016.
 */
public class AT2ACCOP0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0005Locators(String environment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //GENERAL
        elements.put("general_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]"); //search result
        elements.put("general_n_records", "//*[contains(@id, 'pc1:ot2')]"); //number of records retrieved
        elements.put("general_b_reset", "//*[contains(@id, 'qryId1::reset')]"); //reset button
        elements.put("general_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a"); //detach button

        elements.put("general_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]"); // actions button
        elements.put("general_b_actions_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]"); // audit data
        elements.put("general_b_actions_b_audit_b_ok", "//*[contains(@id, 'pc1:d3::ok')]"); // audit data ok

        //DELETE
        elements.put("general_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");

        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]"); // search button
        elements.put("search_i_merchant", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_country_code", "//*[contains(@id, 'value10::content')]");
        elements.put("search_lov_countrycode", "//*[contains(@id, 'value10::lovIconId')]");
        elements.put("search_lov_countrycode_i_code", "//*[contains(@id, 'QueryId:value00::content')]");
        elements.put("search_lov_countrycode_b_search", "//*[contains(@id, '_afrLovInternalQueryId::search')]");
        elements.put("search_lov_countrycode_e_result", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]");
        elements.put("search_lov_country_code_b_ok", "//*[contains(@id, ':value10::lovDialogId::ok')]");

        //ADD
        elements.put("add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]"); //add button
        elements.put("add_i_merchant", "//*[contains(@id, 'it3::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        elements.put("add_i_countrycode", "//*[contains(@id, 'pc1:pcgt2:codPais1Id::content')]");
        elements.put("add_lov_countrycode", "//*[contains(@id, 'codPais1Id::lovIconId')]");
        elements.put("add_lov_countrycode_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("add_lov_countrycode_e_result", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");

        //EDIT
        elements.put("add_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]"); //edit button

        //QBE
        elements.put("qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a"); //qbe button
        elements.put("qbe_i_bibitmerchant", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_i_domiciledcountry", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c3::content')]");

        //HISTORY
        elements.put("actions_b_history", "//*[contains(@id, 'pc1:pcgm1:dc_cmi2')]/td[2]");
        elements.put("history_b_ok", "//*[contains(@id, 'pc1:d1::ok')]");
        elements.put("history_e_result", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[1]");

        //HISTORY RESULTS
        elements.put("history_e_fec_iniv", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("history_e_fec_finv", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("history_e_office_time_from", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("history_e_office_time_to", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("history_e_usu_finv", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("history_e_bibit_merchant", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("history_e_cod_pais", "//*[contains(@id, 'pc1:pc2:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");

        //HISTORY QBE
        elements.put("history_b_qbe", "//*[contains(@id, 'pc1:pc2:_qbeTbr')]");
        elements.put("history_qbe_i_fec_iniv", "//*[contains(@id, 'pc1:pc2:t1:id1::content')]");
        elements.put("history_qbe_i_fec_finv", "//*[contains(@id, 'pc1:pc2:t1:id2::content')]");
        elements.put("history_qbe_i_office_time_from", "//*[contains(@id, 'pc1:pc2:t1:id4::content')]");
        elements.put("history_qbe_i_office_time_to", "//*[contains(@id, 'pc1:pc2:t1:id3::content')]");
        elements.put("history_qbe_i_usu_finv", "//*[contains(@id, 'pc1_afr_pc2_afr_t1_afr_c5::content')]");
        elements.put("history_qbe_i_bibit_merchant", "//*[contains(@id, 'pc1_afr_pc2_afr_t1_afr_c2::content')]");
        elements.put("history_qbe_i_cod_pais", "//*[contains(@id, 'pc1_afr_pc2_afr_t1_afr_c7::content')]");


    }
}
