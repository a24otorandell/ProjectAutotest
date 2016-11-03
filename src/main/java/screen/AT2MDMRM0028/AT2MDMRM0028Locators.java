package screen.AT2MDMRM0028;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0028Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0028Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE CATEGORIES
         */
        //GENERALS
        elements.put("categories_b_add", "//*[contains(@id, 'PCGenericToolbar5:boton_add')]");
        elements.put("categories_b_delete", "//*[contains(@id, 'PCGenericToolbar5:boton_remove')]");
        elements.put("categories_b_edit", "//*[contains(@id, 'PCGenericToolbar5:boton_edit')]");
        elements.put("categories_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("categories_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("categories_e_result", "//*[contains(@id, 'pc1:TMaster::db')]/table/tbody/tr[1]/td[1]");
        elements.put("categories_e_records", "//*[contains(@id, 'pc1:ot9')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_category", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'PCGenericToolbar5:btn_commitExit')]");
        elements.put("add_i_category", "//*[contains(@id, 'it3::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'soc1::content')]");
        //QBE
        elements.put("qbe_i_category", "//*[contains(@id, 'afr_TMaster_afr_resId1c1::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'TMaster:selectOneChoice1::content')]");
        /**
         * TABLE MULTI
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'PCGenericToolbar1:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'PCGenericToolbar1:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'PCGenericToolbar1:boton_edit')]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc2:TDetail::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc2:outputText3')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");
        elements.put("add_i_lang", "//*[contains(@id, 'codIdiomaId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'codIdiomaId::lovIconId')]");
        elements.put("add_i_desc", "//*[contains(@id, 'it1::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, 'afr_TDetail_afr_c1::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'afr_TDetail_afr_c3::content')]");
    }
    
}
