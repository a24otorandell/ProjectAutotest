package screen.AT2MDMOR0029;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 27/09/2016.
 */
public class AT2MDMOR0029Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0029Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /* SEARCH */
        elements.put("search_b_search", "//*[contains(@id, 'cb1')]");
        elements.put("search_b_reset", "//*[contains(@id, 'cb2')]");
        elements.put("search_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("search_n_records", "//*[contains(@id, 'pc1:ot5')]");

        /* RECORDS */
        elements.put("record_interaction_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");

        elements.put("record_interaction_b_actions", "//*[contains(@id, '')]");
        elements.put("record_interaction_b_dataHistory", "//*[contains(@id, '')]");

        elements.put("record_interaction_b_qbe", "//*[contains(@id, '')]");
        elements.put("record_interaction_b_fullPage", "//*[contains(@id, '')]");
        elements.put("record_interaction_b_fullPage_b_close", "//*[contains(@id, '')]");
        /* QBE */
        elements.put("record_interaction_qbe_i_initialDate", "//*[contains(@id, '')]");
        /* DELETE */
        elements.put("record_interaction_b_remove_b_ok", "//*[contains(@id, '')]");
        /* LOVS */
        elements.put("search_lov_provider_i_provider", "//*[contains(@id, '')]");

        /*elements.put("","//*[contains(@id, '')]");*/

        /*DIALOG CANCEL*/
    }
}