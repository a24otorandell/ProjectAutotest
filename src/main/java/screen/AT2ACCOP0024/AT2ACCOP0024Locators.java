package screen.AT2ACCOP0024;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 29/06/2016.
 * @see Map
 */
public class AT2ACCOP0024Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0024Locators() {
        setElements();
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
    public void setElements() {
       /*elements.put("","//*[contains(@id, '')]");*/
        /* SEARCH */
        elements.put("search_i_report", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_financial_status", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_modification_date_from", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_file", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_merchant", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_modification_date_to", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_type", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_settelment", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_financial_date_from", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("search_lov_currency_i_currency", "//*[contains(@id, 'qryId1:value80::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_financial_date_to", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_modification_user", "//*[contains(@id, 'qryId1:value90::content')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        /* RECORDS */
        elements.put("record_interaction_b_actions", "//*[contains(@id, 'pc1:menuCustom')]/div/table/tbody/tr/td[3]/div");
        elements.put("record_interaction_b_export", "//*[contains(@id, 'pc1:commandMenuItem1')]");
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
        elements.put("record_interaction_b_new_i_add", "//*[contains(@id, 'cb1')]");
        /* QBE */
        elements.put("record_interaction_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("record_interaction_b_qbe_i_report", "//*[contains(@id, 'resId1_afr_resId1c1::content')]");
        elements.put("record_interaction_b_qbe_i_file", "//*[contains(@id, 'resId1_afr_resId1c2::content')]");
        elements.put("record_interaction_b_qbe_i_type", "//*[contains(@id, 'resId1_afr_resId1c3::content')]");
        elements.put("record_interaction_b_qbe_i_financial_date", "//*[contains(@id, 'pc1:resId1:id2::content')]");
        elements.put("record_interaction_b_qbe_financial_date", "//*[contains(@id, 'pc1:resId1:resId1c4')]");
        elements.put("record_interaction_b_qbe_i_financial_status", "//*[contains(@id, 'resId1_afr_resId1c5::content')]");
        elements.put("record_interaction_b_qbe_financial_status", "//*[contains(@id, 'pc1:resId1:resId1c5')]");
        elements.put("record_interaction_b_qbe_i_merchant", "//*[contains(@id, 'resId1_afr_resId1c6::content')]");
        elements.put("record_interaction_b_qbe_i_settelment", "//*[contains(@id, 'resId1_afr_resId1c7::content')]");
        elements.put("record_interaction_b_qbe_settelment", "//*[contains(@id, 'resId1:resId1c7')]");
        elements.put("record_interaction_b_qbe_i_currency", "//*[contains(@id, 'resId1_afr_resId1c8::content')]");
        elements.put("record_interaction_b_qbe_i_modification_user", "//*[contains(@id, 'resId1_afr_resId1c9::content')]");
        elements.put("record_interaction_b_qbe_i_modification_date", "//*[contains(@id, 'pc1:resId1:id1::content')]");

        elements.put("record_interaction_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("record_interaction_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("alert_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("alert_b_x", "//*[contains(@id, 'doc0::msgDlg::close')]");
        elements.put("alert_box", "//*[contains(@id, 'doc0::msgDlg')]");
    }
}