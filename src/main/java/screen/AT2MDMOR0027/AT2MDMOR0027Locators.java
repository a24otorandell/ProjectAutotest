package screen.AT2MDMOR0027;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 14/11/2016.
 */
public class AT2MDMOR0027Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0027Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //MARKETS
                elements.put("MDM_mrkts_b_add", "//*[contains(@id, 'r1:1:pc1:pcgt3:boton_add')]");
                elements.put("MDM_mrkts_b_delete", "//*[contains(@id, 'r1:1:pc1:pcgt3:boton_remove')]");
                elements.put("MDM_mrkts_b_delete_ok", "//*[contains(@id, 'r1:1:pc1:pcgt3:cbt1')]");
                elements.put("MDM_mrkts_b_edit", "//*[contains(@id, 'r1:1:pc1:pcgt3:boton_edit')]");
                elements.put("MDM_mrkts_b_actions", "//*[contains(@id, 'r1:1:pc1:pcgm2:dc_m1')]");
                elements.put("MDM_mrkts_b_actions_audit_data", "//*[contains(@id, 'r1:1:pc1:pcgm2:dc_cmi0')]/td[2]");
                elements.put("MDM_mrkts_b_qbe", "//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
                elements.put("MDM_mrkts_b_detach", "//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
                elements.put("MDM_mrkts_e_result", "//*[contains(@id, 'r1:1:pc1:marMt::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_mrkts_e_records", "//*[contains(@id, 'r1:1:pc1:ot2')]");
            //LANGUAGES
                elements.put("MDM_lngs_b_add", "//*[contains(@id, 'r1:1:pc3:pcgt2:boton_add')]");
                elements.put("MDM_lngs_b_delete", "//*[contains(@id, 'r1:1:pc3:pcgt2:boton_remove')]");
                elements.put("MDM_lngs_b_delete_ok", "//*[contains(@id, 'r1:1:pc3:pcgt2:cbt1')]");
                elements.put("MDM_lngs_b_edit", "//*[contains(@id, 'r1:1:pc3:pcgt2:boton_edit')]");
                elements.put("MDM_lngs_b_actions", "//*[contains(@id, 'r1:1:pc3:pcgm3:dc_m1')]");
                elements.put("MDM_lngs_b_actions_audit_data", "//*[contains(@id, 'r1:1:pc3:pcgm3:dc_cmi0')]/td[2]");
                elements.put("MDM_lngs_b_qbe", "//*[contains(@id, 'r1:1:pc3:_qbeTbr')]");
                elements.put("MDM_lngs_b_qbe_clear", "//*[contains(@id, 'r1:1:pc3:marMtLg::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_lngs_b_detach", "//*[contains(@id, 'r1:1:pc3:_dchTbr')]");
                elements.put("MDM_lngs_e_result", "//*[contains(@id, 'r1:1:pc3:marMtLg::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_lngs_e_result_sis", "//*[contains(@id, 'r1:1:pc3:marMtLg::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_lngs_e_records", "//*[contains(@id, 'r1:1:pc3:ot7')]");
            //COUNTRIES BY MARKETS
                elements.put("MDM_cbm_b_add", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_add')]");
                elements.put("MDM_cbm_b_delete", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_remove')]");
                elements.put("MDM_cbm_b_delete_ok", "//*[contains(@id, 'r1:1:pc2:pcgt1:cbt1')]");
                elements.put("MDM_cbm_b_edit", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_edit')]");
                elements.put("MDM_cbm_b_actions", "//*[contains(@id, 'r1:1:pc2:pcgm1:dc_m1')]");
                elements.put("MDM_cbm_b_actions_audit_data", "//*[contains(@id, 'r1:1:pc2:pcgm1:dc_cmi0')]/td[2]");
                elements.put("MDM_cbm_b_qbe", "//*[contains(@id, 'r1:1:pc2:_qbeTbr')]");
                elements.put("MDM_cbm_b_qbe_clear", "//*[contains(@id, 'r1:1:pc2:MarMtCo::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_cbm_b_detach", "//*[contains(@id, 'r1:1:pc2:_dchTbr')]");
                elements.put("MDM_cbm_e_result", "//*[contains(@id, 'r1:1:pc2:MarMtCo::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_cbm_e_records", "//*[contains(@id, 'r1:1:pc2:ot4')]");
                elements.put("MDM_cbm_b_load_continents", "//*[contains(@id, 'r1:1:cb1')]");
                elements.put("MDM_cbm_i_load_continents_continent", "//*[contains(@id, 'r1:1:continents1Id::content')]");
                elements.put("MDM_cbm_lov_load_continents_continent", "//*[contains(@id, 'r1:1:continents1Id::lovIconId')]");
        //ADD|MODIFY
            //MARKETS
                elements.put("add_mrkts_b_save", "//*[contains(@id, 'r1:1:pc1:pcgt3:btn_commitExit')]");
                elements.put("add_mrkts_i_market", "//*[contains(@id, 'r1:1:pc1:pcgt3:it3::content')]");
                elements.put("add_mrkts_i_description", "//*[contains(@id, 'r1:1:pc1:pcgt3:it5::content')]");
                elements.put("add_mrkts_cb_active", "//*[contains(@id, 'r1:1:pc1:pcgt3:sbc2::content')]");
                elements.put("add_mrkts_i_language", "//*[contains(@id, 'r1:1:pc1:pcgt3:inputListOfValues1::content')]");
                elements.put("add_mrkts_lov_language", "//*[contains(@id, 'r1:1:pc1:pcgt3:inputListOfValues1::lovIconId')]");
                elements.put("add_mrkts_i_language_description", "//*[contains(@id, 'r1:1:pc1:pcgt3:it14::content')]");
            //LANGUAGES
                elements.put("add_lngs_b_save", "//*[contains(@id, 'r1:1:pc3:pcgt2:btn_commitExit')]");
                elements.put("add_lngs_i_language", "//*[contains(@id, 'r1:1:pc3:pcgt2:codIdiomaId::content')]");
                elements.put("add_lngs_lov_language", "//*[contains(@id, 'r1:1:pc3:pcgt2:codIdiomaId::lovIconId')]");
                elements.put("add_lngs_i_language_description", "//*[contains(@id, 'r1:1:pc3:pcgt2:it13::content')]");
            //COUNTRIES BY MARKETS
                elements.put("add_cbm_b_save", "//*[contains(@id, 'r1:1:pc2:pcgt1:btn_commitExit')]");
                elements.put("add_cbm_i_country", "//*[contains(@id, 'r1:1:pc2:pcgt1:codPais1Id::content')]");
                elements.put("add_cbm_lov_country", "//*[contains(@id, 'r1:1:pc2:pcgt1:codPais1Id::lovIconId')]");
                elements.put("add_cbm_e_description", "//*[contains(@id, 'r1:1:pc2:pcgt1:it9::content')]");
                elements.put("add_cbm_e_continent", "//*[contains(@id, 'r1:1:pc2:pcgt1:it8::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'r1:1:qryId1::reset')]");
            elements.put("search_i_market", "//*[contains(@id, 'r1:1:qryId1:value00::content')]");
            elements.put("search_i_description", "//*[contains(@id, 'r1:1:qryId1:value10::content')]");
            elements.put("search_cb_active", "//*[contains(@id, 'r1:1:qryId1:value20::content')]");
        //QBE
            //MARKETS
                elements.put("qbe_mrkts_i_market", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_marMt_afr_c3::content')]");
                elements.put("qbe_mrkts_i_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_marMt_afr_c2::content')]");
                elements.put("qbe_mrkts_sl_active", "//*[contains(@id, 'r1:1:pc1:marMt:soc2::content')]");
            //LANGUAGES
                elements.put("qbe_lngs_i_language", "//*[contains(@id, 'r1_afr_1_afr_pc3_afr_marMtLg_afr_c9::content')]");
                elements.put("qbe_lngs_i_description", "//*[contains(@id, 'r1_afr_1_afr_pc3_afr_marMtLg_afr_c8::content')]");
            //COUNTRIES BY MARKETS
                elements.put("qbe_cbm_i_country", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_MarMtCo_afr_c7::content')]");
                elements.put("qbe_cbm_i_description", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_MarMtCo_afr_c4::content')]");
                elements.put("qbe_cbm_i_continent", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_MarMtCo_afr_c6::content')]");
    }
}
