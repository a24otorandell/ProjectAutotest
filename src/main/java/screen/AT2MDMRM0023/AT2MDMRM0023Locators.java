package screen.AT2MDMRM0023;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 12/12/2016.
 */
public class AT2MDMRM0023Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0023Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_product_site","//*[contains(@id, 'r1:1:sdi1::disAcr')]");
                elements.put("MDM_b_group_of_countries","//*[contains(@id, 'r1:1:sdi2::disAcr')]");
                elements.put("MDM_b_countries","//*[contains(@id, 'r1:1:sdi3::disAcr')]");
                elements.put("MDM_b_group_of_destinations","//*[contains(@id, 'r1:1:sdi4::disAcr')]");
                elements.put("MDM_b_destinations","//*[contains(@id, 'r1:1:sdi5::disAcr')]");
            //PRODUCT SITE
                elements.put("MDM_prds_b_add","//*[contains(@id, 'r1:0:pc1:pcgt2:boton_add')]");
                elements.put("MDM_prds_b_delete","//*[contains(@id, 'r1:0:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_prds_b_delete_ok","//*[contains(@id, 'r1:0:pc1:pcgt2:cbt1')]");
                elements.put("MDM_prds_b_edit","//*[contains(@id, 'r1:0:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_prds_b_actions","//*[contains(@id, 'r1:0:pc1:pcgm1:dc_m1')]");
                elements.put("MDM_prds_b_actions_audit_data","//*[contains(@id, 'r1:0:pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_prds_b_qbe","//*[contains(@id, 'r1:0:pc1:_qbeTbr')]");
                elements.put("MDM_prds_b_detach","//*[contains(@id, 'r1:0:pc1:_dchTbr')]");
                elements.put("MDM_prds_e_result","//*[contains(@id, 'r1:0:pc1:prdInfo::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_prds_e_records","//*[contains(@id, 'r1:0:pc1:ot2')]");
            //GROUP OF COUNTRIES
                elements.put("MDM_grc_b_add","//*[contains(@id, 'r2:0:pc1:pcgt2:boton_add')]");
                elements.put("MDM_grc_b_delete","//*[contains(@id, 'r2:0:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_grc_b_delete_ok","//*[contains(@id, 'r2:0:pc1:pcgt2:cbt1')]");
                elements.put("MDM_grc_b_edit","//*[contains(@id, 'r2:0:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_grc_b_actions","//*[contains(@id, 'r2:0:pc1:pcgm1:dc_m1')]");
                elements.put("MDM_grc_b_actions_audit_data","//*[contains(@id, 'r2:0:pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_grc_b_qbe","//*[contains(@id, 'r2:0:pc1:_qbeTbr')]");
                elements.put("MDM_grc_b_detach","//*[contains(@id, 'r2:0:pc1:_dchTbr')]");
                elements.put("MDM_grc_e_result","//*[contains(@id, 'r2:0:pc1:grpPais::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_grc_e_records","//*[contains(@id, 'r2:0:pc1:ot2')]");
            //COUNTRIES
                elements.put("MDM_cntrs_b_add","//*[contains(@id, ':r3:0:pc1:pcgt2:boton_add')]");
                elements.put("MDM_cntrs_b_delete","//*[contains(@id, 'r3:0:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_cntrs_b_delete_ok","//*[contains(@id, 'r3:0:pc1:pcgt2:cbt1')]");
                elements.put("MDM_cntrs_b_edit","//*[contains(@id, 'r3:0:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_cntrs_b_actions","//*[contains(@id, 'r3:0:pc1:pcgm1:dc_m1')]");
                elements.put("MDM_cntrs_b_actions_audit_data","//*[contains(@id, 'r3:0:pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_cntrs_b_qbe","//*[contains(@id, 'r3:0:pc1:_qbeTbr')]");
                elements.put("MDM_cntrs_b_detach","//*[contains(@id, 'r3:0:pc1:_dchTbr')]");
                elements.put("MDM_cntrs_e_result","//*[contains(@id, 'r3:0:pc1:prdPais::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_cntrs_e_records","//*[contains(@id, 'r3:0:pc1:ot2')]");
            //GROUP OF DESTINATIONS
                elements.put("MDM_grd_b_add","//*[contains(@id, 'r4:0:pc1:pcgt2:boton_add')]");
                elements.put("MDM_grd_b_delete","//*[contains(@id, 'r4:0:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_grd_b_delete_ok","//*[contains(@id, 'r4:0:pc1:pcgt2:cbt1')]");
                elements.put("MDM_grd_b_edit","//*[contains(@id, 'r4:0:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_grd_b_actions","//*[contains(@id, 'r4:0:pc1:pcgm1:dc_m1')]");
                elements.put("MDM_grd_b_actions_audit_data","//*[contains(@id, 'r4:0:pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_grd_b_qbe","//*[contains(@id, 'r4:0:pc1:_qbeTbr')]");
                elements.put("MDM_grd_b_detach","//*[contains(@id, 'r4:0:pc1:_dchTbr')]");
                elements.put("MDM_grd_e_result","//*[contains(@id, 'r4:0:pc1:grpDest::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_grd_e_records","//*[contains(@id, 'r4:0:pc1:ot2')]");
            //DESTINATIONS
                elements.put("MDM_dstnts_b_add","//*[contains(@id, ':r5:0:pc1:pcgt2:boton_add')]");
                elements.put("MDM_dstnts_b_delete","//*[contains(@id, 'r5:0:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_dstnts_b_delete_ok","//*[contains(@id, 'r5:0:pc1:pcgt2:cbt1')]");
                elements.put("MDM_dstnts_b_edit","//*[contains(@id, 'r5:0:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_dstnts_b_actions","//*[contains(@id, 'r5:0:pc1:pcgm1:dc_m1')]");
                elements.put("MDM_dstnts_b_actions_audit_data","//*[contains(@id, 'r5:0:pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_dstnts_b_qbe","//*[contains(@id, 'r5:0:pc1:_qbeTbr')]");
                elements.put("MDM_dstnts_b_detach","//*[contains(@id, 'r5:0:pc1:_dchTbr')]");
                elements.put("MDM_dstnts_e_result","//*[contains(@id, 'r5:0:pc1:prdDest::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_dstnts_e_records","//*[contains(@id, 'r5:0:pc1:ot2')]");
        //ADD|MODIFY
            //PRODUCT SITE
                elements.put("add_prds_b_save", "//*[contains(@id, 'r1:0:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_prds_i_group_of_countries", "//*[contains(@id, 'r1:0:pc1:pcgt2:codAgrupPaisId::content')]");
                elements.put("add_prds_lov_group_of_countries", "//*[contains(@id, 'r1:0:pc1:pcgt2:codAgrupPaisId::lovIconId')]");
                elements.put("add_prds_i_country", "//*[contains(@id, 'r1:0:pc1:pcgt2:codPaisId::content')]");
                elements.put("add_prds_lov_country", "//*[contains(@id, 'r1:0:pc1:pcgt2:codPaisId::lovIconId')]");
                elements.put("add_prds_i_group_of_destinations", "//*[contains(@id, 'r1:0:pc1:pcgt2:codAgrupDestinoId::content')]");
                elements.put("add_prds_lov_group_of_destinations", "//*[contains(@id, 'r1:0:pc1:pcgt2:codAgrupDestinoId::lovIconId')]");
                elements.put("add_prds_i_destinations", "//*[contains(@id, 'r1:0:pc1:pcgt2:codDestinoId::content')]");
                elements.put("add_prds_lov_destinations", "//*[contains(@id, 'r1:0:pc1:pcgt2:codDestinoId::lovIconId')]");
                elements.put("add_prds_i_img", "//*[contains(@id, 'r1:0:pc1:pcgt2:it6::content')]");
                elements.put("add_prds_i_contents1", "//*[contains(@id, 'r1:0:pc1:pcgt2:it4::content')]");
                elements.put("add_prds_i_contents2", "//*[contains(@id, 'r1:0:pc1:pcgt2:it1::content')]");
                elements.put("add_prds_i_pdf", "//*[contains(@id, 'r1:0:pc1:pcgt2:it2::content')]");
                elements.put("add_prds_i_pdf2", "//*[contains(@id, 'r1:0:pc1:pcgt2:it3::content')]");
                elements.put("add_prds_cb_online_accommodation", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc22::content')]");
                elements.put("add_prds_cb_online_excursions", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc23::content')]");
                elements.put("add_prds_cb_online_groups", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc25::content')]");
                elements.put("add_prds_cb_online_tickets", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc24::content')]");
                elements.put("add_prds_cb_online_tours", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc19::content')]");
                elements.put("add_prds_cb_online_transfers", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc27::content')]");
                elements.put("add_prds_cb_online_car_rental", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc28::content')]");
                elements.put("add_prds_cb_offline_accommodation", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc15::content')]");
                elements.put("add_prds_cb_offline_excursions", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc16::content')]");
                elements.put("add_prds_cb_offline_groups", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc17::content')]");
                elements.put("add_prds_cb_offline_tickets", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc18::content')]");
                elements.put("add_prds_cb_offline_tours", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc26::content')]");
                elements.put("add_prds_cb_offline_transfers", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc20::content')]");
                elements.put("add_prds_cb_offline_car_rental", "//*[contains(@id, 'r1:0:pc1:pcgt2:sbc21::content')]");
            //GROUPS OF COUNTRIES
                elements.put("add_grc_b_save", "//*[contains(@id, 'r2:0:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_grc_i_group_of_countries_code", "//*[contains(@id, 'r2:0:pc1:pcgt2:it2::content')]");
                elements.put("add_grc_i_description", "//*[contains(@id, 'r2:0:pc1:pcgt2:it1::content')]");
            //COUNTRIES
                elements.put("add_cntrs_b_save", "//*[contains(@id, 'r3:0:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_cntrs_i_country_code", "//*[contains(@id, 'r3:0:pc1:pcgt2:it3::content')]");
                elements.put("add_cntrs_i_description", "//*[contains(@id, 'r3:0:pc1:pcgt2:it4::content')]");
            //GROUP OF DESTINATIONS
                elements.put("add_grd_b_save", "//*[contains(@id, 'r4:0:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_grd_i_group_of_destinations_code", "//*[contains(@id, 'r4:0:pc1:pcgt2:it1::content')]");
                elements.put("add_grd_i_description", "//*[contains(@id, 'r4:0:pc1:pcgt2:it2::content')]");
            //DESTINATIONS
                elements.put("add_dstnts_b_save", "//*[contains(@id, 'r5:0:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_dstnts_i_destination_code", "//*[contains(@id, 'r5:0:pc1:pcgt2:it1::content')]");
                elements.put("add_dstnts_i_description", "//*[contains(@id, 'r5:0:pc1:pcgt2:it2::content')]");
        //SEARCH
            //PRODUCT SITE
                elements.put("search_prds_b_search", "//*[contains(@id, 'r1:0:qryId1::search')]");
                elements.put("search_prds_b_reset", "//*[contains(@id, 'r1:0:qryId1::reset')]");
                elements.put("search_prds_i_group_of_countries", "//*[contains(@id, 'r1:0:qryId1:value00::content')]");
                elements.put("search_prds_lov_group_of_countries", "//*[contains(@id, 'r1:0:qryId1:value00::lovIconId')]");
                elements.put("search_prds_i_country", "//*[contains(@id, 'r1:0:qryId1:value10::content')]");
                elements.put("search_prds_lov_country", "//*[contains(@id, 'r1:0:qryId1:value10::lovIconId')]");
                elements.put("search_prds_i_group_of_destinations", "//*[contains(@id, 'r1:0:qryId1:value20::content')]");
                elements.put("search_prds_lov_group_of_destinations", "//*[contains(@id, 'r1:0:qryId1:value20::lovIconId')]");
                elements.put("search_prds_i_destinations", "//*[contains(@id, 'r1:0:qryId1:value30::content')]");
                elements.put("search_prds_lov_destinations", "//*[contains(@id, 'r1:0:qryId1:value30::lovIconId')]");
            //GROUP OF COUNTRIES
                elements.put("search_grc_b_search", "//*[contains(@id, 'r2:0:qryId1::search')]");
                elements.put("search_grc_b_reset", "//*[contains(@id, 'r2:0:qryId1::reset')]");
                elements.put("search_grc_i_group_of_countries_code", "//*[contains(@id, 'r2:0:qryId1:value00::content')]");
                elements.put("search_grc_i_description", "//*[contains(@id, 'r2:0:qryId1:value10::content')]");
            //COUNTRIES
                elements.put("search_cntrs_b_search", "//*[contains(@id, 'r3:0:qryId1::search')]");
                elements.put("search_cntrs_b_reset", "//*[contains(@id, 'r3:0:qryId1::reset')]");
                elements.put("search_cntrs_i_country_code", "//*[contains(@id, 'r3:0:qryId1:value00::content')]");
                elements.put("search_cntrs_i_description", "//*[contains(@id, 'r3:0:qryId1:value10::content')]");
            //GROUP OF DESTINATIONS
                elements.put("search_grd_b_search", "//*[contains(@id, 'r4:0:qryId1::search')]");
                elements.put("search_grd_b_reset", "//*[contains(@id, 'r4:0:qryId1::reset')]");
                elements.put("search_grd_i_group_of_destinations_code", "//*[contains(@id, 'r4:0:qryId1:value00::content')]");
                elements.put("search_grd_i_description", "//*[contains(@id, 'r4:0:qryId1:value10::content')]");
            //DESTINATIONS
                elements.put("search_dstnts_b_search", "//*[contains(@id, 'r5:0:qryId1::search')]");
                elements.put("search_dstnts_b_reset", "//*[contains(@id, 'r5:0:qryId1::reset')]");
                elements.put("search_dstnts_i_destination_code", "//*[contains(@id, 'r5:0:qryId1:value00::content')]");
                elements.put("search_dstnts_i_description", "//*[contains(@id, 'r5:0:qryId1:value10::content')]");
        //QBE
            //PRODUCT SITE
                elements.put("qbe_prds_i_group_of_countries", "//*[contains(@id, 'afr_r1_afr_0_afr_pc1_afr_prdInfo_afr_resId1c1::content')]");
                elements.put("qbe_prds_i_country", "//*[contains(@id, 'afr_r1_afr_0_afr_pc1_afr_prdInfo_afr_resId1c2::content')]");
                elements.put("qbe_prds_i_group_of_destinations", "//*[contains(@id, 'afr_r1_afr_0_afr_pc1_afr_prdInfo_afr_resId1c3::content')]");
                elements.put("qbe_prds_i_destinations", "//*[contains(@id, 'afr_r1_afr_0_afr_pc1_afr_prdInfo_afr_resId1c4::content')]");
            //GROUP OF COUNTRIES
                elements.put("qbe_grc_i_group_of_countries_code", "//*[contains(@id, 'afr_r2_afr_0_afr_pc1_afr_grpPais_afr_resId1c1::content')]");
                elements.put("qbe_grc_i_description", "//*[contains(@id, 'afr_r2_afr_0_afr_pc1_afr_grpPais_afr_resId1c2::content')]");
            //COUNTRIES
                elements.put("qbe_cntrs_i_country_code", "//*[contains(@id, 'afr_r3_afr_0_afr_pc1_afr_prdPais_afr_resId1c1::content')]");
                elements.put("qbe_cntrs_i_description", "//*[contains(@id, 'afr_r3_afr_0_afr_pc1_afr_prdPais_afr_resId1c2::content')]");
            //GROUP OF DESTINATIONS
                elements.put("qbe_grd_i_group_of_destinations_code", "//*[contains(@id, 'afr_r4_afr_0_afr_pc1_afr_grpDest_afr_resId1c1::content')]");
                elements.put("qbe_grd_i_description", "//*[contains(@id, 'afr_r4_afr_0_afr_pc1_afr_grpDest_afr_resId1c2::content')]");
            //DESTINATIONS
                elements.put("qbe_dstnts_i_destination_code", "//*[contains(@id, 'afr_r5_afr_0_afr_pc1_afr_prdDest_afr_resId1c1::content')]");
                elements.put("qbe_dstnts_i_description", "//*[contains(@id, 'afr_r5_afr_0_afr_pc1_afr_prdDest_afr_resId1c2::content')]");
    }
}