package screen.AT2MDMSY0018;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMSY0018Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0018Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TAB COMPONENTS - TABLE COMPONENT
         */
        //TAB
        elements.put("components_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERALS
        elements.put("component_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("component_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("component_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("component_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("component_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("component_e_result", "//*[contains(@id, 'pc1:comTyp::db')]/table/tbody/tr[1]/td[1]");
        elements.put("component_e_records", "//*[contains(@id, 'pc1:otp2')]");
        elements.put("delete_b_yes", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("t1_search_i_type_name", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("t1_search_i_remarks", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("t1_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("t1_add_i_type_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("t1_add_i_remarks", "//*[contains(@id, 'pcgt1:it2::content')]");
        //QBE
        elements.put("t1_qbe_i_type_name", "//*[contains(@id, 'pc1_afr_comTyp_afr_c2::content')]");
        elements.put("t1_qbe_i_remarks", "//*[contains(@id, 'pc1_afr_comTyp_afr_c1::content')]");
        /**
         * TAB COMPONENTS - TABLE HANDLER
         */
        elements.put("handler_c_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("handler_c_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("handler_c_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("handler_c_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("handler_c_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("handler_c_e_result", "//*[contains(@id, 'pc2:hanCom::db')]/table/tbody/tr[1]/td[1]");
        elements.put("handler_c_e_records", "//*[contains(@id, 'pc2:otp3')]");
        //ADD
        elements.put("t2_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("t2_add_i_name", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("t2_add_i_remarks", "//*[contains(@id, 'pcgt2:it4::content')]");
        //QBE
        elements.put("t2_qbe_i_name", "//*[contains(@id, 'pc2_afr_hanCom_afr_c4::content')]");
        elements.put("t2_qbe_i_remarks", "//*[contains(@id, 'pc2_afr_hanCom_afr_c3::content')]");
        /**
         * TAB TO CONFIGURATION - TABLE HANDLER
         */
        //TAB
        elements.put("config_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERALS
        elements.put("t3_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("t3_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("t3_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("t3_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("t3_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("t3_e_result", "//*[contains(@id, 'pc3:conHan::db')]/table/tbody/tr[1]/td[1]");
        elements.put("t3_e_records", "//*[contains(@id, 'pc3:otp5')]");
        //SEARCH
        elements.put("t3_search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("t3_search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("t3_search_i_type_name", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("t3_search_lov_type_name", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
        elements.put("t3_search_i_name", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("t3_search_lov_name", "//*[contains(@id, 'qryId2:value10::lovIconId')]");
        elements.put("t3_search_i_to_seq", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("t3_search_i_to_name", "//*[contains(@id, 'qryId2:value30::content')]");
        //ADD
        elements.put("t3_add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("t3_add_i_type_name", "//*[contains(@id, 'pcgt3:typeName1Id::content')]");
        elements.put("t3_add_lov_type_name", "//*[contains(@id, 'pcgt3:typeName1Id::lovIconId')]");
        elements.put("t3_add_i_name", "//*[contains(@id, 'pcgt3:name1Id::content')]");
        elements.put("t3_add_lov_name", "//*[contains(@id, 'pcgt3:name1Id::lovIconId')]");
        elements.put("t3_add_i_to_seq", "//*[contains(@id, 'pcgt3:it7::content')]");
        elements.put("t3_add_i_to_name", "//*[contains(@id, 'pcgt3:it8::content')]");
        //QBE
        elements.put("t3_i_qbe_type_name", "//*[contains(@id, 'pc3_afr_conHan_afr_c7::content')]");
        elements.put("t3_i_qbe_name", "//*[contains(@id, 'pc3_afr_conHan_afr_c8::content')]");
        elements.put("t3_i_qbe_to_seq", "//*[contains(@id, 'pc3_afr_conHan_afr_c6::content')]");
        elements.put("t3_i_qbe_to_name", "//*[contains(@id, 'pc3_afr_conHan_afr_c5::content')]");
    }
}
