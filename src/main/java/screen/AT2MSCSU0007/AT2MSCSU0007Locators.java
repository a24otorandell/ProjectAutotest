package screen.AT2MSCSU0007;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 30/06/2016.
 */
public class AT2MSCSU0007Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MSCSU0007Locators() {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /* TABS */
        elements.put("tab_url_country", "//*[contains(@id, 'sdi1::disAcr')]");
        elements.put("tab_available_web", "//*[contains(@id, 'sdi2::disAcr')]");

        /* SEARCH URL_COUNTRY */
        elements.put("url_country_search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("url_country_search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("url_country_search_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table[1]/tbody/tr/td[1]");
        elements.put("url_country_search_n_records", "//*[contains(@id, 'pc1:ot13')]");
        //
        elements.put("url_country_search_i_country_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("url_country_search_lov_country_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("url_country_search_lov_country_code_i_country_code", "//*[contains(@id, 'qryId1:value00::_afrLovInternalQueryId:value00::content')]");
        elements.put("url_country_search_i_url", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("url_country_search_i_type", "//*[contains(@id, 'qryId1:value20::content')]");

        /* QBE URL_COUNTRY */
        elements.put("url_country_pais_url_qbe_i_country_code", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c1::content')]");
        elements.put("url_country_pais_url_qbe_i_country_description", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("url_country_pais_url_qbe_i_url", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c3::content')]");
        elements.put("url_country_pais_url_qbe_i_type", "//*[contains(@id, 'pc1:resId1:selectOneChoice2::content')]");

        /* RECORDS URL_COUNTRY */
        elements.put("url_country_pais_url_b_add", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_add')]");
        //
        elements.put("url_country_pais_url_b_add_i_country_code", "//*[contains(@id, 'pc1:PCGenericToolbar1:codPaisId::content')]");
        elements.put("url_country_pais_url_b_add_lov_country_code", "//*[contains(@id, 'pc1:PCGenericToolbar1:codPaisId::lovIconId')]");
        elements.put("url_country_pais_url_b_add_lov_country_code_i_country_code", "//*[contains(@id, 'pc1:PCGenericToolbar1:codPaisId::_afrLovInternalQueryId:value00::content')]");
        elements.put("url_country_pais_url_b_add_i_url", "//*[contains(@id, 'pc1:PCGenericToolbar1:it2::content')]");
        elements.put("url_country_pais_url_b_add_type", "//*[contains(@id, 'pc1:PCGenericToolbar1:soc1::content')]");
        elements.put("url_country_pais_url_b_add_b_save", "//*[contains(@id, 'pc1:PCGenericToolbar1:btn_commitExit')]");
        //
        elements.put("url_country_pais_url_b_remove", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_remove')]");
        elements.put("url_country_pais_url_b_remove_b_ok", "//*[contains(@id, 'pc1:PCGenericToolbar1:cbt1')]");
        //
        elements.put("url_country_pais_url_b_edit", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_edit')]");
        elements.put("url_country_pais_url_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("url_country_pais_url_b_data_history", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("url_country_pais_url_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("url_country_pais_url_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("url_country_record_interaction_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");

        ////**////

        /* SEARCH AVAILABLE_WEB */
        elements.put("available_web_search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("available_web_search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        //
        elements.put("available_web_search_i_country_code", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("available_web_search_i_url", "//*[contains(@id, 'qryId2:value10::content')]");

        /* QBE AVAILABLE_WEB */
        elements.put("available_web_qbe_i_country_code", "//*[contains(@id, 'pc2_afr_resId2_afr_resId2c1::content')]");
        elements.put("available_web_qbe_i_url", "//*[contains(@id, 'pc2_afr_resId2_afr_resId2c2::content')]");
        //
        elements.put("available_web_details_qbe_i_language_code", "//*[contains(@id, 'pc3_afr_resId3_afr_c1::content')]");
        elements.put("available_web_details_qbe_i_web_country_description", "//*[contains(@id, 'pc3_afr_resId3_afr_c2::content')]");

        /* AVAILABLE_WEB WEB_DISPONIBLE */
        elements.put("available_web_b_add", "//*[contains(@id, 'pc2:PCGenericToolbar2:boton_add')]");
        //
        elements.put("available_web_b_add_i_country_code", "//*[contains(@id, 'pc2:PCGenericToolbar2:it3::content')]");
        elements.put("available_web_b_add_i_url", "//*[contains(@id, 'pc2:PCGenericToolbar2:it4::content')]");
        elements.put("available_web_b_add_b_save", "//*[contains(@id, 'pc2:PCGenericToolbar2:btn_commitExit')]");
        //
        elements.put("available_web_b_remove", "//*[contains(@id, 'pc2:PCGenericToolbar2:boton_remove')]");
        elements.put("available_web_b_remove_b_ok", "//*[contains(@id, 'pc2:PCGenericToolbar2:cbt1')]");
        elements.put("available_web_b_remove_b_ok_b_ok", "//*[contains(@id, 'd2::yes')]");
        //
        elements.put("available_web_b_edit", "//*[contains(@id, 'pc2:PCGenericToolbar2:boton_edit')]");
        elements.put("available_web_b_actions", "//*[contains(@id, 'pc2:PCGenericMenu1:dc_m1)']/div/table/tbody/tr/td[2]/a");
        elements.put("available_web_b_data_history", "//*[contains(@id, 'pc2:PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("available_web_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("available_web_b_detach_table", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("available_web_b_detach_table_b_close", "//*[contains(@id, 'pc2::_afrDetachDialogId::close')]");
        //
        elements.put("available_web_e_result", "//*[contains(@id, 'pc2:resId2::db')]/table/tbody/tr[1]/td[1]");

        /* AVAILABLE_WEB DETAILS */
        elements.put("available_web_details_b_add", "//*[contains(@id, 'pc3:PCGenericToolbar3:boton_add')]");
        //
        elements.put("available_web_details_b_add_i_language_code", "//*[contains(@id, 'pc3:PCGenericToolbar3:codIdiomaId::content')]");
        elements.put("available_web_details_b_add_lov_language_code", "//*[contains(@id, 'pc3:PCGenericToolbar3:codIdiomaId::lovIconId')]");
        elements.put("available_web_details_b_add_lov_language_code_i_language", "//*[contains(@id, 'pc3:PCGenericToolbar3:codIdiomaId::_afrLovInternalQueryId:value00::content')]");
        elements.put("available_web_details_b_add_i_web_country_description", "//*[contains(@id, ':pc3:PCGenericToolbar3:it6::content')]");
        elements.put("available_web_details_b_add_b_save", "//*[contains(@id, 'pc3:PCGenericToolbar3:btn_commitExit')]");
        //
        elements.put("available_web_details_b_remove", "//*[contains(@id, 'pc3:PCGenericToolbar3:boton_remove')]");
        elements.put("available_web_details_b_remove_b_ok", "//*[contains(@id, 'pc3:PCGenericToolbar3:cbt1')]");
        elements.put("available_web_details_b_edit", "//*[contains(@id, 'pc3:PCGenericToolbar3:boton_edit')]");
        elements.put("available_web_details_b_actions", "//*[contains(@id, 'pc3:PCGenericMenu2:dc_m1)']/div/table/tbody/tr/td[2]/a");
        elements.put("available_web_details_b_data_history", "//*[contains(@id, 'pc3:PCGenericMenu2:dc_cmi0')]/td[2]");
        elements.put("available_web_details_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("available_web_details_b_detach_table", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("available_web_details_b_detach_table_b_close", "//*[contains(@id, 'pc3::_afrDetachDialogId::close')]");
        //
        elements.put("available_web_details_e_result", "//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[1]/td[1]");
        /*elements.put("","//*[contains(@id, '')]");*/

    }
}