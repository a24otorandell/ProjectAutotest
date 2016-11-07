package screen.AT2MDMDE0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 04/11/2016.
 */
public class AT2MDMDE0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE COUNTRY
         */
        //GENERALS
        elements.put("country_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("country_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("country_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("country_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("country_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("country_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("country_e_records", "//*[contains(@id, 'pc1:ot111')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_country_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_continent", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_sl_crc", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ck_active", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_cod_iso", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value50::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_country_code", "//*[contains(@id, 'pc1:pcgt1:it9::content')]");
        elements.put("add_i_continent", "//*[contains(@id, 'pc1:pcgt1:it10::content')]");// en sis
        elements.put("add_sl_continent", "//*[contains(@id, 'pc1:pcgt1:soc2::content')]");// en test
        elements.put("add_i_cod_iso", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
        elements.put("add_sl_crc", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pc1:pcgt1:sbc2::content')]");
        elements.put("add_i_prefix", "//*[contains(@id, 'pc1:pcgt1:it6::content')]");
        //QBE
        elements.put("qbe_i_country_code", "//*[contains(@id, 'pc1_afr_master_afr_c2::content')]");
        elements.put("qbe_i_continent", "//*[contains(@id, 'pc1_afr_master_afr_c4::content')]");
        elements.put("qbe_sl_crc_desc", "//*[contains(@id, 'pc1:master:soc4::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:master:soc5::content')]");
        elements.put("qbe_i_cod_iso", "//*[contains(@id, 'pc1_afr_master_afr_c9::content')]");
        elements.put("qbe_i_prefix", "//*[contains(@id, 'master:it8::content')]");

        /**
         * TABLE MULTI
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc2:detail::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc2:ot222')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_language", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("multi_add_i_country", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("multi_add_i_country_code", "//*[contains(@id, 'pcgt2:it3::content')]");
        //QBE
        elements.put("multi_qbe_i_language", "//*[contains(@id, 'pc2_afr_detail_afr_c7::content')]");
        elements.put("multi_qbe_i_country", "//*[contains(@id, 'pc2_afr_detail_afr_c5::content')]");
        elements.put("multi_qbe_i_country_code", "//*[contains(@id, 'pc2_afr_detail_afr_c6::content')]");
    }
}
