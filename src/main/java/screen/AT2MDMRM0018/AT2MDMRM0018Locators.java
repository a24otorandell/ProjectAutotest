package screen.AT2MDMRM0018;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMRM0018Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0018Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_tabs", "//*[contains(@id, '1:sdi1::disAcr')]");
            elements.put("MDM_b_configuration", "//*[contains(@id, '1:sdi2::disAcr')]");
            //TABS
                //TABS
                    elements.put("MDM_tabs_b_add", "//*[contains(@id, 'pc3:PCGenericToolbar5:boton_add')]");
                    elements.put("MDM_tabs_b_delete", "//*[contains(@id, 'pc3:PCGenericToolbar5:boton_remove')]");
                    elements.put("MDM_tabs_b_delete_ok", "//*[contains(@id, 'pc3:PCGenericToolbar5:cbt1')]");
                    elements.put("MDM_tabs_b_edit", "//*[contains(@id, 'pc3:PCGenericToolbar5:boton_edit')]");
                    elements.put("MDM_tabs_b_actions", "//*[contains(@id, 'pc3:PCGenericMenu5:dc_m1')]");
                    elements.put("MDM_tabs_b_actions_audit_data", "//*[contains(@id, 'pc3:PCGenericMenu5:dc_cmi0')]/td[2]");
                    elements.put("MDM_tabs_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                    elements.put("MDM_tabs_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                    elements.put("MDM_tabs_e_result", "//*[contains(@id, 'pc3:TMaster::db')]/table[1]/tbody/tr[1]/td[1]");
                    elements.put("MDM_tabs_e_records", "//*[contains(@id, 'pc3:ot9')]");
                //LANGUAGES
                    elements.put("MDM_lang_b_add", "//*[contains(@id, 'pc5:PCGenericToolbar4:boton_add')]");
                    elements.put("MDM_lang_b_delete", "//*[contains(@id, 'pc5:PCGenericToolbar4:boton_remove')]");
                    elements.put("MDM_lang_b_delete_ok", "//*[contains(@id, 'pc5:PCGenericToolbar4:cbt1')]");
                    elements.put("MDM_lang_b_edit", "//*[contains(@id, 'pc5:PCGenericToolbar4:boton_edit')]");
                    elements.put("MDM_lang_b_actions", "//*[contains(@id, 'pc5:PCGenericMenu4:dc_m1')]");
                    elements.put("MDM_lang_b_actions_audit_data", "//*[contains(@id, 'pc5:PCGenericMenu4:dc_cmi0')]/td[2]");
                    elements.put("MDM_lang_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]");
                    elements.put("MDM_lang_b_detach", "//*[contains(@id, 'pc5:_dchTbr')]");
                    elements.put("MDM_lang_e_result", "//*[contains(@id, 'pc5:TChild1::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_lang_e_records", "//*[contains(@id, 'pc5:ot30')]");
                //COUNTRIES
                    elements.put("MDM_cntrs_b_add", "//*[contains(@id, 'pc6:PCGenericToolbar3:boton_add')]");
                    elements.put("MDM_cntrs_b_delete", "//*[contains(@id, 'pc6:PCGenericToolbar3:boton_remove')]");
                    elements.put("MDM_cntrs_b_delete_ok", "//*[contains(@id, 'pc6:PCGenericToolbar3:cbt1')]");
                    elements.put("MDM_cntrs_b_edit", "//*[contains(@id, 'pc6:PCGenericToolbar3:boton_edit')]");
                    elements.put("MDM_cntrs_b_actions", "//*[contains(@id, 'pc6:PCGenericMenu3:dc_m1')]");
                    elements.put("MDM_cntrs_b_actions_audit_data", "//*[contains(@id, 'pc6:PCGenericMenu3:dc_cmi0')]/td[2]");
                    elements.put("MDM_cntrs_b_qbe", "//*[contains(@id, 'pc6:_qbeTbr')]");
                    elements.put("MDM_cntrs_b_detach", "//*[contains(@id, 'pc6:_dchTbr')]");
                    elements.put("MDM_cntrs_e_result", "//*[contains(@id, 'pc6:TChild2::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_cntrs_e_records", "//*[contains(@id, 'pc6:ot32')]");
                //DESTINATION
                    elements.put("MDM_dstn_b_add", "//*[contains(@id, 'pc7:PCGenericToolbar2:boton_add')]");
                    elements.put("MDM_dstn_b_delete", "//*[contains(@id, 'pc7:PCGenericToolbar2:boton_remove')]");
                    elements.put("MDM_dstn_b_delete_ok", "//*[contains(@id, 'pc7:PCGenericToolbar2:cbt1')]");
                    elements.put("MDM_dstn_b_edit", "//*[contains(@id, 'pc7:PCGenericToolbar2:boton_edit')]");
                    elements.put("MDM_dstn_b_actions", "//*[contains(@id, 'pc7:PCGenericMenu2:dc_m1')]");
                    elements.put("MDM_dstn_b_actions_audit_data", "//*[contains(@id, 'pc7:PCGenericMenu2:dc_cmi0')]/td[2]");
                    elements.put("MDM_dstn_b_qbe", "//*[contains(@id, 'pc7:_qbeTbr')]");
                    elements.put("MDM_dstn_b_detach", "//*[contains(@id, 'pc7:_dchTbr')]");
                    elements.put("MDM_dstn_e_result", "//*[contains(@id, 'pc7:TChild3::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_dstn_e_records", "//*[contains(@id, 'pc7:ot34')]");
            //CONFIGURATION
                //CONFIGURATIONS
                    elements.put("MDM_config_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                    elements.put("MDM_config_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                    elements.put("MDM_config_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
                    elements.put("MDM_config_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                    elements.put("MDM_config_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
                    elements.put("MDM_config_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
                    elements.put("MDM_config_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                    elements.put("MDM_config_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                    elements.put("MDM_config_e_result", "//*[contains(@id, 'pc1:CMaster::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_config_e_records", "//*[contains(@id, 'pc1:outputText7')]");
                //TABS PER CONFIGURATION
                    elements.put("MDM_tabconfig_b_add", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_add')]");
                    elements.put("MDM_tabconfig_b_delete", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_remove')]");
                    elements.put("MDM_tabconfig_b_delete_ok", "//*[contains(@id, 'pc2:PCGenericToolbar1:cbt1')]");
                    elements.put("MDM_tabconfig_b_edit", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_edit')]");
                    elements.put("MDM_tabconfig_b_actions", "//*[contains(@id, 'pc2:PCGenericMenu1:dc_m1')]");
                    elements.put("MDM_tabconfig_b_actions_audit_data", "//*[contains(@id, 'pc2:PCGenericMenu1:dc_cmi0')]/td[2]");
                    elements.put("MDM_tabconfig_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                    elements.put("MDM_tabconfig_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                    elements.put("MDM_tabconfig_e_result", "//*[contains(@id, 'pc2:CChild::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_tabconfig_e_records", "//*[contains(@id, 'pc2:ot36')]");
        //ADD|MODIFY
            //TABS
                //TABS
                    elements.put("add_tabs_b_save", "//*[contains(@id, 'pc3:PCGenericToolbar5:btn_commitExit')]");
                    elements.put("add_tabs_e_code", "//*[contains(@id, 'pc3:PCGenericToolbar5:it9::content')]");
                    elements.put("add_tabs_i_name", "//*[contains(@id, 'pc3:PCGenericToolbar5:it10::content')]");
                    elements.put("add_tabs_i_description", "//*[contains(@id, 'pc3:PCGenericToolbar5:it6::content')]");
                    elements.put("add_tabs_i_image_detail", "//*[contains(@id, 'pc3:PCGenericToolbar5:it11::content')]");
                    elements.put("add_tabs_i_image_on", "//*[contains(@id, 'pc3:PCGenericToolbar5:it7::content')]");
                    elements.put("add_tabs_i_image_off", "//*[contains(@id, 'pc3:PCGenericToolbar5:it8::content')]");
                //LANGUAGES
                    elements.put("add_lang_b_save", "//*[contains(@id, 'pc5:PCGenericToolbar4:btn_commitExit')]");
                    elements.put("add_lang_i_language", "//*[contains(@id, 'pc5:PCGenericToolbar4:idiomaId::content')]");
                    elements.put("add_lang_lov_language", "//*[contains(@id, 'pc5:PCGenericToolbar4:idiomaId::lovIconId')]");
                    elements.put("add_lang_i_language_description", "//*[contains(@id, 'pc5:PCGenericToolbar4:it19::content')]");
                //COUNTRIES
                    elements.put("add_cntrs_b_save", "//*[contains(@id, 'pc6:PCGenericToolbar3:btn_commitExit')]");
                    elements.put("add_cntrs_i_country", "//*[contains(@id, 'pc6:PCGenericToolbar3:codPaisId::content')]");
                    elements.put("add_cntrs_lov_country", "//*[contains(@id, 'pc6:PCGenericToolbar3:codPaisId::lovIconId')]");
                    elements.put("add_cntrs_e_country_description", "//*[contains(@id, 'pc6:PCGenericToolbar3:it12::content')]");
                //DESTINATION
                    elements.put("add_dstn_b_save", "//*[contains(@id, 'pc7:PCGenericToolbar2:btn_commitExit')]");
                    elements.put("add_dstn_i_destination", "//*[contains(@id, 'pc7:PCGenericToolbar2:codDestinoId::content')]");
                    elements.put("add_dstn_lov_destination", "//*[contains(@id, 'pc7:PCGenericToolbar2:codDestinoId::lovIconId')]");
                    elements.put("add_dstn_e_destination_description", "//*[contains(@id, 'pc7:PCGenericToolbar2:it13::content')]");
            //CONFIGURATION
                //CONFIGURATIONS
                    elements.put("add_config_b_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
                    elements.put("add_config_e_code", "//*[contains(@id, 'pc1:pcgt2:it18::content')]");
                    elements.put("add_config_i_configurations_description", "//*[contains(@id, 'pc1:pcgt2:it17::content')]");
                    elements.put("add_config_sl_status", "//*[contains(@id, 'pc1:pcgt2:soc1::content')]");
                //TABS PER CONFIGURATION
                    elements.put("add_tabconfig_b_save", "//*[contains(@id, 'pc2:PCGenericToolbar1:btn_commitExit')]");
                    elements.put("add_tabconfig_i_tab", "//*[contains(@id, 'pc2:PCGenericToolbar1:pesSeq1Id::content')]");
                    elements.put("add_tabconfig_lov_tab", "//*[contains(@id, 'pc2:PCGenericToolbar1:pesSeq1Id::lovIconId')]");
                    elements.put("add_tabconfig_e_tabconfiguration_description", "//*[contains(@id, 'pc2:PCGenericToolbar1:it20::content')]");
                    elements.put("add_tabconfig_i_order", "//*[contains(@id, 'pc2:PCGenericToolbar1:it14::content')]");
        //SEARCH
            //TABS
        elements.put("search_tabs_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_tabs_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("search_tabs_i_code", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_tabs_i_name", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_tabs_i_tab_description", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("search_tabs_i_image_detail", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("search_tabs_i_image_on", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("search_tabs_i_image_off", "//*[contains(@id, 'qryId2:value50::content')]");
            //CONFIGURATION
        elements.put("search_configuration_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_configuration_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_config_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_config_i_configuration_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_config_i_status", "//*[contains(@id, 'qryId1:value20::content')]");
        //QBE
            //TABS
                //TABS
                    elements.put("qbe_tabs_i_code", "//*[contains(@id, 'afr_TMaster_afr_c14::content')]");
                    elements.put("qbe_tabs_i_name", "//*[contains(@id, 'afr_TMaster_afr_c9::content')]");
                    elements.put("qbe_tabs_i_description", "//*[contains(@id, 'afr_TMaster_afr_c3::content')]");
                //LANGUAGES
                    elements.put("qbe_lang_i_language", "//*[contains(@id, 'afr_TChild1_afr_c16::content')]");
                    elements.put("qbe_lang_i_language_description", "//*[contains(@id, 'afr_TChild1_afr_c17::content')]");
                //COUNTRIES
                    elements.put("qbe_cntrs_i_country", "//*[contains(@id, 'afr_TChild2_afr_c20::content')]");
                    elements.put("qbe_cntrs_i_country_description", "//*[contains(@id, 'afr_TChild2_afr_c19::content')]");
                //DESTINATION
                    elements.put("qbe_dstn_i_destination", "//*[contains(@id, 'afr_TChild3_afr_c21::content')]");
                    elements.put("qbe_dstn_i_destination_description", "//*[contains(@id, 'afr_TChild3_afr_c22::content')]");
            //CONFIGURATION
                //CONFIGURATIONS
                    elements.put("qbe_config_i_code", "//*[contains(@id, 'afr_CMaster_afr_c2::content')]");
                    elements.put("qbe_config_i_configurations_description", "//*[contains(@id, 'afr_CMaster_afr_c1::content')]");
                    elements.put("qbe_config_sl_status", "//*[contains(@id, 'pc1:CMaster:selectOneChoice1::content')]");
                //TABS PER CONFIGURATION
                    elements.put("qbe_tabconfig_i_tab", "//*[contains(@id, 'afr_CChild_afr_c5::content')]");
                    elements.put("qbe_tabconfig_i_tabconfiguration_description", "//*[contains(@id, 'afr_CChild_afr_c6::content')]");
                    elements.put("qbe_tabconfig_i_order", "//*[contains(@id, 'afr_CChild_afr_c4::content')]");
    }
}