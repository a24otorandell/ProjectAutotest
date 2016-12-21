package screen.AT2ACCSU0051;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/12/2016.
 */
public class AT2ACCSU0051Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0051Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){
        /**
         * TABLE BOARD
         */
        //GENERALS
        elements.put("board_b_add", "//*[contains(@id, 'pcgt21:boton_add')]");
        elements.put("board_b_delete", "//*[contains(@id, 'pcgt21:boton_remove')]");
        elements.put("board_b_edit", "//*[contains(@id, 'pcgt21:boton_edit')]");
        elements.put("board_b_actions", "//*[contains(@id, 'pc1:pcgmp1:dc_m1')]");
        elements.put("board_b_actions_b_audit_data", "//*[contains(@id, 'pc1:pcgmp1:dc_cmi0')]/td[2]");
        elements.put("board_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("board_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("board_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("board_e_records", "//*[contains(@id, 'pc1:ot245')]");
        elements.put("board_b_yes", "//*[contains(@id, 'pcgt21:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_board","//*[contains(@id, 'value00::content')]");
        elements.put("search_i_board_order","//*[contains(@id, 'value10::content')]");
        elements.put("search_ck_active","//*[contains(@id, 'value20::content')]");
        elements.put("search_ck_sa","//*[contains(@id, 'value30::content')]");
        //ADD
        elements.put("add_i_board","//*[contains(@id, 'pc1:pcgt21:it13::content')]");
        elements.put("add_ck_active","//*[contains(@id, 'pc1:pcgt21:sbc3::content')]");
        elements.put("add_ck_sa","//*[contains(@id, 'pc1:pcgt21:sbc4::content')]");
        elements.put("add_i_board_order","//*[contains(@id, 'pc1:pcgt21:it1::content')]");
        elements.put("add_ck_suplier","//*[contains(@id, 'pc1:pcgt21:sbc5::content')]");
        elements.put("add_b_save","//*[contains(@id, 'pc1:pcgt21:btn_commitExit')]");
        //QBE
        elements.put("qbe_i_board","//*[contains(@id, 'pc1_afr_resId1_afr_c7::content')]");
        elements.put("qbe_sl_active","//*[contains(@id, 'soc224::content')]");
        elements.put("qbe_sl_sa","//*[contains(@id, 'soc225::content')]");
        elements.put("qbe_i_board_order","//*[contains(@id, 'pc1_afr_resId1_afr_c10::content')]");
        elements.put("qbe_sl_suplier","//*[contains(@id, 'soc2215::content')]");

        /**
         * TABLE LANGUAGE
         */
        elements.put("lang_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("lang_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("lang_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("lang_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("lang_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("lang_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("lang_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("lang_e_result", "//*[contains(@id, 'pc2:t6::db')]/table/tbody/tr[1]/td[1]");
        elements.put("lang_e_records", "//*[contains(@id, 'pc2:ot2456')]");
        //ADD
        elements.put("add_b_save2","//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_language_code", "//*[contains(@id,'codIdioma1Id::content')]");
        elements.put("add_lov_language_code", "//*[contains(@id,'codIdioma1Id::lovIconId')]");     
        elements.put("add_i_des_lang", "//*[contains(@id,'it2::content')]");
        elements.put("add_i_cod", "//*[contains(@id,'it10::content')]");
        elements.put("add_i_description", "//*[contains(@id,'it9::content')]");
        //QBE
        elements.put("qbe_i_language_code", "//*[contains(@id,'pc2_afr_t6_afr_c11::content')]");
        elements.put("qbe_i_des_lang", "//*[contains(@id,'pc2_afr_t6_afr_c2::content')]");
        elements.put("qbe_i_cod", "//*[contains(@id,'pc2_afr_t6_afr_c17::content')]");
        elements.put("qbe_i_description", "//*[contains(@id,'pc2_afr_t6_afr_c13::content')]");
    }
}
