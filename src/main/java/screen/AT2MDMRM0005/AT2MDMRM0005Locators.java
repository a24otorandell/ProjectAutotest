package screen.AT2MDMRM0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE PRODUCT
         */
        //GENERALS
        elements.put("product_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("product_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("product_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("product_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("product_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("product_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("product_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("product_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("product_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_sl_system", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_product", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_product", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_ck_account", "//*[contains(@id, 'qryId1:value30::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_sl_system", "//*[contains(@id, 'pc1:pcgt2:soc1::content')]");
        elements.put("add_i_product", "//*[contains(@id, 'codProdPool1Id::content')]");
        elements.put("add_lov_product", "//*[contains(@id, 'codProdPool1Id::lovIconId')]");
        elements.put("add_ck_account", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_sl_system", "//*[contains(@id, 'pc1:t1:wxq51::content')]");
        elements.put("qbe_i_product", "//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        elements.put("qbe_sl_account", "//*[contains(@id, 'pc1:t1:wxq5::content')]");
        /**
         * TABLE MULTI
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("multi_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("multi_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc2:t5::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc2:ot42')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_lang", "//*[contains(@id, 'sidiCodIdioma1Id::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'sidiCodIdioma1Id::lovIconId')]");
        elements.put("add_i_desc", "//*[contains(@id, 'it3::content')]");
        elements.put("add_i_prod", "//*[contains(@id, 'it4::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, 'pc2_afr_t5_afr_c6::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'pc2_afr_t5_afr_c51::content')]");
        elements.put("qbe_i_prod", "//*[contains(@id, 'pc2_afr_t5_afr_c7::content')]");
    }
}
