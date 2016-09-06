package screen.AT2ACCCO0052;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 15/07/2016
 * @see Map
 */
public class AT2ACCCO0052Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCCO0052Locators(String enviroment) {
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
        elements.put("search_e_result", "//*[contains(@id, 'pc1:tableSimpleInboxStop::db')]/table/tbody/tr[1]/td[1]");

        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        /* RECORDS */
        /* QBE */
        elements.put("record_interaction_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("record_interaction_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("alert_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("alert_b_x", "//*[contains(@id, 'doc0::msgDlg::close')]");
        elements.put("alert_box", "//*[contains(@id, 'doc0::msgDlg')]");
    }
}