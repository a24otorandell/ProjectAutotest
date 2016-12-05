package screen.AT2MDMRM0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TAB CHARACTERISTICS
         */
        //TAB
        elements.put("characteristics_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERALS
        elements.put("characteristics_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("characteristics_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("characteristics_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("characteristics_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("characteristics_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("characteristics_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("characteristics_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("characteristics_e_result", "//*[contains(@id, 'pc1:resId2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("characteristics_e_records", "//*[contains(@id, 'pc1:ot111')]");
        //SEARCH
        elements.put("search_char_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_char_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("search_i_char_sequence", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_i_char_name", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_i_char_description", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("search_sl_web_type", "//*[contains(@id, 'qryId2:value30::content')]");
        //ADD
        elements.put("add_char_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_char_sequence", "//*[contains(@id, 'pcgt1:it14::content')]");
        elements.put("add_i_char_name", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_char_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_sl_web_type", "//*[contains(@id, 'pcgt1:soc3::content')]");
        //QBE
        elements.put("qbe_i_char_sequence", "//*[contains(@id, 'resId2:inputText1::content')]");
        elements.put("qbe_i_char_name", "//*[contains(@id, 'afr_resId2c2::content')]");
        elements.put("qbe_i_char_description", "//*[contains(@id, 'afr_resId2c3::content')]");
        elements.put("qbe_sl_web_type", "//*[contains(@id, 'resId2:soc3777::content')]");
        /**
         * TAB CONFIGURATION
         */
        //TAB
        elements.put("configuration_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERALS
        elements.put("configuration_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("configuration_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("configuration_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("configuration_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("configuration_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("configuration_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("configuration_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("configuration_e_result", "//*[contains(@id, 'pc2:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_e_records", "//*[contains(@id, 'pc2:ot38')]");
        //SEARCH
        elements.put("search_conf_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_conf_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_sequence", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_atlas_agency_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_atlas_agency_code", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_web_code", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_web_code", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        //ADD
        elements.put("add_configuration_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_sequence", "//*[contains(@id, 'pcgt2:it18::content')]");
        elements.put("add_i_atlas_agency_code", "//*[contains(@id, 'pcgt2:cfgAgecodatlasId::content')]");
        elements.put("add_lov_atlas_agency_code", "//*[contains(@id, 'pcgt2:cfgAgecodatlasId::lovIconId')]");
        elements.put("add_i_agency", "//*[contains(@id, 'pc2:pcgt2:it9::content')]");
        elements.put("add_i_web_code", "//*[contains(@id, 'pcgt2:idWebId::content')]");
        elements.put("add_lov_web_code", "//*[contains(@id, 'pcgt2:idWebId::lovIconId')]");
        elements.put("add_i_web_description", "//*[contains(@id, 'pc2:pcgt2:it17::content')]");
        //QBE
        elements.put("qbe_i_sequence", "//*[contains(@id, 'resId1:inputText2::content')]");
        elements.put("qbe_i_atlas_agency_code", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_web_code", "//*[contains(@id, 'resId1:inputText3::content')]");
        elements.put("qbe_i_web_description", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'afr_c7::content')]");
        /**
         * TAB STATUS
         */
        //TAB
        elements.put("status_tab", "//*[contains(@id, 'sdi3::disAcr')]");
        //GENERALS
        elements.put("status_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("status_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("status_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("status_b_actions", "//*[contains(@id, 'pcgm3:dc_m1')]");
        elements.put("status_b_actions_b_audit_data", "//*[contains(@id, 'pcgm3:dc_cmi1')]/td[2]");
        elements.put("status_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("status_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("status_e_result", "//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("status_e_records", "//*[contains(@id, 'pc3:ot3')]");
        //SEARCH
        elements.put("search_status_b_search", "//*[contains(@id, 'qryId3::search')]");
        elements.put("search_status_b_reset", "//*[contains(@id, 'qryId3::reset')]");
        elements.put("search_i_characteristic_sequence", "//*[contains(@id, 'qryId3:value00::content')]");
        elements.put("search_lov_characteristic_sequence", "//*[contains(@id, 'qryId3:value00::lovIconId')]");
        elements.put("search_i_configuration_sequence", "//*[contains(@id, 'qryId3:value10::content')]");
        elements.put("search_lov_configuration_sequence", "//*[contains(@id, 'qryId3:value10::lovIconId')]");
        elements.put("search_sl_status", "//*[contains(@id, 'qryId3:value20::content')]");
        elements.put("search_i_est_value", "//*[contains(@id, 'qryId3:value30::content')]");
        //ADD
        elements.put("add_status_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_characteristic_sequence", "//*[contains(@id, 'pcgt3:carSeqId::content')]");
        elements.put("add_lov_characteristic_sequence", "//*[contains(@id, 'pcgt3:carSeqId::lovIconId')]");
        elements.put("add_i_configuration_sequence", "//*[contains(@id, 'pcgt3:cfgSeq1Id::content')]");
        elements.put("add_lov_configuration_sequence", "//*[contains(@id, 'pcgt3:cfgSeq1Id::lovIconId')]");
        elements.put("add_sl_status", "//*[contains(@id, 'pcgt3:soc1::content')]");
        elements.put("add_i_est_value", "//*[contains(@id, 'pcgt3:it19::content')]");
        elements.put("add_i_char_name", "//*[contains(@id, 'pcgt3:it16::content')]");
        elements.put("add_i_char_desc", "//*[contains(@id, 'pcgt3:it15::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'pcgt3:it4::content')]");
        elements.put("add_i_idweb", "//*[contains(@id, 'pcgt3:it3::content')]");
        elements.put("add_sl_evolution", "//*[contains(@id, 'pcgt3:soc5::content')]");
        //QBE
        elements.put("qbe_i_characteristic_sequence", "//*[contains(@id, 'resId3:inputText4::content')]");
        elements.put("qbe_i_configuration_sequence", "//*[contains(@id, 'resId3:inputText5::content')]");
        elements.put("qbe_sl_status", "//*[contains(@id, 'resId3:soc2::content')]");
        elements.put("qbe_i_est_value", "//*[contains(@id, 'afr_resId3c4::content')]");
        elements.put("qbe_i_char_name", "//*[contains(@id, 'afr_resId3c11::content')]");
        elements.put("qbe_i_char_desc", "//*[contains(@id, 'afr_resId3c9::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'afr_resId3c15::content')]");
        elements.put("qbe_i_idweb", "//*[contains(@id, 'afr_resId3c16::content')]");
        elements.put("qbe_sl_evolution", "//*[contains(@id, 'resId3:soc3778::content')]");
    }
}
