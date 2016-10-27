package screen.AT2MDMDE0029;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMDE0029Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0029Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("web_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("web_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("web_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("web_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("web_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("web_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("web_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("web_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("web_e_records", "//*[contains(@id, 'pc1:ot8')]");
        elements.put("lov_i_altgenericinput2", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'dyntdc:r1:1:cb1')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_web", "//*[contains(@id, 'it7::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'it8::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_web", "//*[contains(@id, 'pcgt1:it6::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_days", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_i_last", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_i_previst_sec", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_previst_firs", "//*[contains(@id, 'pcgt1:it3::content')]");
        //QBE
        elements.put("qbe_i_web", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_days", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_last", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_previst_sec", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_previst_firs", "//*[contains(@id, 'afr_c5::content')]");
        }
    }
