package screen.AT2ACCSU0075;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACCSU0075Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0075Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
        elements.put("setup_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("setup_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("setup_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("setup_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("setup_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("setup_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("setup_e_records", "//*[contains(@id, 'pc1:outputText6')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_modelo", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_i_negocio", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_concepto", "//*[contains(@id, 'pcgt1:codConceptId::content')]");
        elements.put("add_lov_concepto", "//*[contains(@id, 'pcgt1:codConceptId::lovIconId')]");
        elements.put("add_i_grupo", "//*[contains(@id, 'pcgt1:codGroupId::content')]");
        elements.put("add_lov_grupo", "//*[contains(@id, 'pcgt1:codGroupId::lovIconId')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_modelo", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_negocio", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_concepto", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_concepto", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_grupo", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_grupo", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        //QBE
        elements.put("qbe_i_modelo", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_negocio", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_concepto", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_grupo", "//*[contains(@id, 'afr_c3::content')]");
    }
}
