package screen.AT2ACCOP0024;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 29/06/2016.
 * @see Map
 */
public class AT2ACCOP0024Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0024Locators(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            setTestElements();
        } else {
            setSisElements();
        }
    }

    /**
     * Gets the elements that are a Map of two strings
     *
     * @return Map{String,String}
     */
    public Map<String, String> getElements() {
        return elements;
    }

    /**
     * Sets the elements with an element_reference as first string and a xpath for the second
     * This elements are the ones that will we used in the test
     */
    public void setTestElements() {
       /*elements.put("","//*[contains(@id, '')]");*/
        /* SEARCH */
        elements.put("search_i_report", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_l_financial_status", "//*[contains(@id, 'qryId2:value50::content')]");
        elements.put("search_i_modification_user", "//*[contains(@id, 'qryId2:value100::content')]");
        elements.put("search_i_file", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_i_merchant", "//*[contains(@id, 'qryId2:value60::content')]");
        elements.put("search_i_modification_date_from", "//*[contains(@id, 'qryId2:value110::content')]");
        elements.put("search_l_type", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("search_i_submerchant", "//*[contains(@id, 'qryId2:value70::content')]");
        elements.put("search_lov_submerchant", "//*[contains(@id, 'qryId2:value70::lovIconId')]");
        elements.put("search_lov_submerchant_i_submerchant", "//*[contains(@id, 'qryId2:value70::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_modification_date_to", "//*[contains(@id, 'qryId2:value120::content')]");
        elements.put("search_i_financial_date_from", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("search_i_settelment", "//*[contains(@id, 'qryId2:value80::content')]");
        elements.put("search_l_reprocess", "//*[contains(@id, 'qryId2:value130::content')]");
        elements.put("search_i_financial_date_to", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId2:value90::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId2:value90::lovIconId')]");
        elements.put("search_lov_currency_i_currency", "//*[contains(@id, 'qryId2:value90::_afrLovInternalQueryId:value00::content')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        elements.put("search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId2::reset')]");

        elements.put("record_interaction_e_financial_status_window", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]//a");
        elements.put("record_interaction_e_financial_status_window_e_records_num", "//*[contains(@id, 'pc2:outputText4')]");
        elements.put("record_interaction_e_financial_status_window_e_result", "//*[contains(@id, 'pc2:t3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("record_interaction_e_financial_status_window_b_close", "//*[contains(@id, 'd4::close')]");
        elements.put("record_interaction_e_financial_status_window_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("record_interaction_e_financial_status_window_b_qbe_i_error_code", "//*[contains(@id, 'pc2_afr_t3_afr_c20::content')]");
        elements.put("record_interaction_e_financial_status_window_b_qbe_i_error_description", "//*[contains(@id, 'pc2_afr_t3_afr_c19::content')]");
        elements.put("record_interaction_e_financial_status_window_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("record_interaction_e_financial_status_window_b_detach_b_close", "//*[contains(@id, 'pc2::_afrDetachDialogId::close')]");
        /* RECORDS */
        elements.put("record_interaction_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("record_interaction_b_actions", "//*[contains(@id, 'pc1:menuCustom')]/div/table/tbody/tr/td[3]/div");
        elements.put("record_interaction_b_export", "//*[contains(@id, '1:pc1:commandMenuItem1')]/td[2]");
        elements.put("record_interaction_b_modify", "//*[contains(@id, 'pc1:acM2Mod')]");
        elements.put("record_interaction_b_modify_b_file", "//*[contains(@id, 'inputFile1::content')]");
        elements.put("record_interaction_b_modify_b_save", "//*[contains(@id, 'cb3')]");
        elements.put("record_interaction_b_reprocess", "//*[contains(@id, 'pc1:acM3Rep')]");
        elements.put("record_interaction_b_reprocess_b_ok", "//*[contains(@id, 'd5::ok')]");
        elements.put("record_interaction_b_reprocess_b_cancel", "//*[contains(@id, 'd5::cancel')]");
        elements.put("record_interaction_b_new", "//*[contains(@id, 'pc1:acM4New')]");
        elements.put("record_interaction_b_new_i_type", "//*[contains(@id, 'soc1::content')]");
        elements.put("record_interaction_b_new_b_close", "//*[contains(@id, 'd3::close')]");
        elements.put("record_interaction_b_new_b_file", "//input[contains(@id, 'if1::content')]");
        elements.put("record_interaction_b_new_i_add", "//*[contains(@id, '1:cb1')]");
        /* QBE */
        elements.put("record_interaction_qbe_b_clear", "//*[contains(@id, 'pc1:resId1::ch::t')]/tbody/tr[2]/th/a");
        elements.put("record_interaction_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("record_interaction_b_qbe_i_report", "//*[contains(@id, 'resId1_afr_c9::content')]");
        elements.put("record_interaction_b_qbe_i_file", "//*[contains(@id, 'resId1_afr_c10::content')]");
        elements.put("record_interaction_b_qbe_i_type", "//*[contains(@id, 'resId1_afr_c11::content')]");
        elements.put("record_interaction_b_qbe_i_financial_date", "//*[contains(@id, 'pc1:resId1:id4::content')]");
        elements.put("record_interaction_b_qbe_financial_date", "//*[contains(@id, 'pc1:resId1:c7')]");
        elements.put("record_interaction_b_qbe_i_financial_status", "//*[contains(@id, 'resId1_afr_c6::content')]");
        elements.put("record_interaction_b_qbe_financial_status", "//*[contains(@id, 'pc1:resId1:c6')]");
        elements.put("record_interaction_b_qbe_i_merchant", "//*[contains(@id, 'resId1_afr_c4::content')]");
        elements.put("record_interaction_b_qbe_i_settelment", "//*[contains(@id, 'resId1_afr_c5::content')]");
        elements.put("record_interaction_b_qbe_settelment", "//*[contains(@id, 'pc1:resId1:c5')]");
        elements.put("record_interaction_b_qbe_i_currency", "//*[contains(@id, 'resId1_afr_c14::content')]");
        elements.put("record_interaction_b_qbe_i_modification_user", "//*[contains(@id, 'resId1_afr_c8::content')]");
        elements.put("record_interaction_b_qbe_i_modification_date", "//*[contains(@id, 'pc1:resId1:id3::content')]");
        elements.put("record_interaction_b_qbe_i_batchID", "//*[contains(@id, 'resId1_afr_c15::content')]");
        elements.put("record_interaction_b_qbe_total_amount", "//*[contains(@id, 'pc1:resId1:c13')]");
        elements.put("record_interaction_b_qbe_i_total_amount", "//*[contains(@id, 'resId1_afr_c13::content')]");
        elements.put("record_interaction_b_qbe_i_submerchant", "//*[contains(@id, 'resId1_afr_c12::content')]");

        elements.put("record_interaction_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("record_interaction_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("alert_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("alert_b_x", "//*[contains(@id, 'doc0::msgDlg::close')]");
        elements.put("alert_box", "//*[contains(@id, 'doc0::msgDlg')]");
        //EDIT
        elements.put("result_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("result_b_edit_i_batchid", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
        elements.put("result_b_edit_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

    }

    /**
     * Sets the elements with an element_reference as first string and a xpath for the second
     * This elements are the ones that will we used in the test of SYS
     */
    public void setSisElements() {
       /*elements.put("","//*[contains(@id, '')]");*/
        /* SEARCH */
        elements.put("search_i_report", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_l_financial_status", "//*[contains(@id, 'qryId2:value50::content')]");
        elements.put("search_i_modification_user", "//*[contains(@id, 'qryId2:value100::content')]");
        elements.put("search_i_file", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_i_merchant", "//*[contains(@id, 'qryId2:value60::content')]");
        elements.put("search_i_modification_date_from", "//*[contains(@id, 'qryId2:value110::content')]");
        elements.put("search_l_type", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("search_i_submerchant", "//*[contains(@id, 'qryId2:value70::content')]");
        elements.put("search_lov_submerchant", "//*[contains(@id, 'qryId2:value70::lovIconId')]");
        elements.put("search_lov_submerchant_i_submerchant", "//*[contains(@id, 'qryId2:value70::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_modification_date_to", "//*[contains(@id, 'qryId2:value120::content')]");
        elements.put("search_i_financial_date_from", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("search_i_settelment", "//*[contains(@id, 'qryId2:value80::content')]");
        elements.put("search_l_reprocess", "//*[contains(@id, 'qryId2:value130::content')]");
        elements.put("search_i_financial_date_to", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId2:value90::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId2:value90::lovIconId')]");
        elements.put("search_lov_currency_i_currency", "//*[contains(@id, 'qryId2:value90::_afrLovInternalQueryId:value00::content')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        elements.put("search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId2::reset')]");

        elements.put("record_interaction_e_financial_status_window", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]//a");
        elements.put("record_interaction_e_financial_status_window_e_records_num", "//*[contains(@id, 'pc2:outputText4')]");
        elements.put("record_interaction_e_financial_status_window_e_result", "//*[contains(@id, 'pc2:t3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("record_interaction_e_financial_status_window_b_close", "//*[contains(@id, 'd4::close')]");
        elements.put("record_interaction_e_financial_status_window_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("record_interaction_e_financial_status_window_b_qbe_i_error_code", "//*[contains(@id, 'pc2_afr_t3_afr_c20::content')]");
        elements.put("record_interaction_e_financial_status_window_b_qbe_i_error_description", "//*[contains(@id, 'pc2_afr_t3_afr_c19::content')]");
        elements.put("record_interaction_e_financial_status_window_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("record_interaction_e_financial_status_window_b_detach_b_close", "//*[contains(@id, 'pc2::_afrDetachDialogId::close')]");
        /* RECORDS */
        elements.put("record_interaction_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("record_interaction_b_actions", "//*[contains(@id, 'pc1:menuCustom')]/div/table/tbody/tr/td[3]/div");
        elements.put("record_interaction_b_export", "//*[contains(@id, '1:pc1:commandMenuItem1')]/td[2]");
        elements.put("record_interaction_b_modify", "//*[contains(@id, 'pc1:acM2Mod')]");
        elements.put("record_interaction_b_modify_b_file", "//*[contains(@id, 'inputFile1::content')]");
        elements.put("record_interaction_b_modify_b_save", "//*[contains(@id, 'cb3')]");
        elements.put("record_interaction_b_reprocess", "//*[contains(@id, 'pc1:acM3Rep')]");
        elements.put("record_interaction_b_reprocess_b_ok", "//*[contains(@id, 'd5::ok')]");
        elements.put("record_interaction_b_reprocess_b_cancel", "//*[contains(@id, 'd5::cancel')]");
        elements.put("record_interaction_b_new", "//*[contains(@id, 'pc1:acM4New')]");
        elements.put("record_interaction_b_new_i_type", "//*[contains(@id, 'soc1::content')]");
        elements.put("record_interaction_b_new_b_close", "//*[contains(@id, 'd3::close')]");
        elements.put("record_interaction_b_new_b_file", "//input[contains(@id, 'if1::content')]");
        elements.put("record_interaction_b_new_i_add", "//*[contains(@id, '1:cb1')]");
        /* QBE */
        elements.put("record_interaction_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("record_interaction_b_qbe_i_report", "//*[contains(@id, 'resId1_afr_c9::content')]");
        elements.put("record_interaction_b_qbe_i_file", "//*[contains(@id, 'resId1_afr_c10::content')]");
        elements.put("record_interaction_b_qbe_i_type", "//*[contains(@id, 'resId1_afr_c11::content')]");
        elements.put("record_interaction_b_qbe_i_financial_date", "//*[contains(@id, 'pc1:resId1:id4::content')]");
        elements.put("record_interaction_b_qbe_financial_date", "//*[contains(@id, 'pc1:resId1:c7')]");
        elements.put("record_interaction_b_qbe_i_financial_status", "//*[contains(@id, 'resId1_afr_c6::content')]");
        elements.put("record_interaction_b_qbe_financial_status", "//*[contains(@id, 'pc1:resId1:c6')]");
        elements.put("record_interaction_b_qbe_i_merchant", "//*[contains(@id, 'resId1_afr_c4::content')]");
        elements.put("record_interaction_b_qbe_i_settelment", "//*[contains(@id, 'resId1_afr_c5::content')]");
        elements.put("record_interaction_b_qbe_settelment", "//*[contains(@id, 'pc1:resId1:c5')]");
        elements.put("record_interaction_b_qbe_i_currency", "//*[contains(@id, 'resId1_afr_c14::content')]");
        elements.put("record_interaction_b_qbe_i_modification_user", "//*[contains(@id, 'resId1_afr_c8::content')]");
        elements.put("record_interaction_b_qbe_i_modification_date", "//*[contains(@id, 'pc1:resId1:id3::content')]");
        elements.put("record_interaction_b_qbe_i_batchID", "//*[contains(@id, 'resId1_afr_c15::content')]");
        elements.put("record_interaction_b_qbe_total_amount", "//*[contains(@id, 'pc1:resId1:c13')]");
        elements.put("record_interaction_b_qbe_i_total_amount", "//*[contains(@id, 'resId1_afr_c13::content')]");
        elements.put("record_interaction_b_qbe_i_submerchant", "//*[contains(@id, 'resId1_afr_c12::content')]");

        elements.put("record_interaction_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("record_interaction_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("alert_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("alert_b_x", "//*[contains(@id, 'doc0::msgDlg::close')]");
        elements.put("alert_box", "//*[contains(@id, 'doc0::msgDlg')]");
        //EDIT
        elements.put("result_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("result_b_edit_i_batchid", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
        elements.put("result_b_edit_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
    }
}