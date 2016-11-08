package screen.AT2MDMSY0019;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY0019Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0019Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("scheduler_b_add", "//*[contains(@id, 'PCGenericToolbar5:boton_add')]");
        elements.put("scheduler_b_delete", "//*[contains(@id, 'PCGenericToolbar5:boton_remove')]");
        elements.put("scheduler_b_edit", "//*[contains(@id, 'PCGenericToolbar5:boton_edit')]");
        elements.put("scheduler_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("scheduler_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("scheduler_e_result", "//*[contains(@id, 'pc1:scheId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("scheduler_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_id", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_seq", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_last", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_proc", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_origin", "//*[contains(@id, 'qryId1:value40::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'PCGenericToolbar5:btn_commitExit')]");
        elements.put("add_i_id", "//*[contains(@id, 'PCGenericToolbar5:it3::content')]");
        elements.put("add_i_seq", "//*[contains(@id, 'PCGenericToolbar5:it2::content')]");
        elements.put("add_i_last", "//*[contains(@id, 'PCGenericToolbar5:id4::content')]");
        elements.put("add_i_proc", "//*[contains(@id, 'PCGenericToolbar5:id3::content')]");
        elements.put("add_i_origin", "//*[contains(@id, 'PCGenericToolbar5:it1::content')]");
        //QBE
        elements.put("qbe_i_id", "//*[contains(@id, 'pc1_afr_scheId1_afr_resId1c1::content')]");
        elements.put("qbe_i_seq", "//*[contains(@id, 'pc1_afr_scheId1_afr_resId1c2::content')]");
        elements.put("qbe_i_last", "//*[contains(@id, 'pc1:scheId1:id1::content')]");
        elements.put("qbe_i_proc", "//*[contains(@id, 'pc1:scheId1:id2::content')]");
        elements.put("qbe_i_origin", "//*[contains(@id, 'pc1_afr_scheId1_afr_resId1c5::content')]");
    }
}
