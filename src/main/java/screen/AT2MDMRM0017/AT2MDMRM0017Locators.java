package screen.AT2MDMRM0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 13/12/2016.
 */

public class AT2MDMRM0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0017Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_dictionary","//*[contains(@id, 'r1:1:sdi1::disAcr')]");
                elements.put("MDM_b_help","//*[contains(@id, 'r1:1:sdi2::disAcr')]");
                elements.put("MDM_b_banner","//*[contains(@id, 'r1:1:sdi3::disAcr')]");
                elements.put("MDM_b_header","//*[contains(@id, 'r1:1:sdi4::disAcr')]");
            //HB LABELS MAINTENANCE
                elements.put("MDM_hblabels_b_add","//*[contains(@id, 'r1:1:pc1:pcgt3:boton_add')]");
                elements.put("MDM_hblabels_b_delete","//*[contains(@id, 'r1:1:pc1:pcgt3:boton_remove')]");
                elements.put("MDM_hblabels_b_delete_ok","//*[contains(@id, 'r1:1:pc1:pcgt3:cbt1')]");
                elements.put("MDM_hblabels_b_edit","//*[contains(@id, 'r1:1:pc1:pcgt3:boton_edit')]");
                elements.put("MDM_hblabels_b_actions","//*[contains(@id, 'r1:1:pc1:pcgm3:dc_m1')]");
                elements.put("MDM_hblabels_b_actions_audit_data","//*[contains(@id, 'r1:1:pc1:pcgm3:dc_cmi1')]/td[2]");
                elements.put("MDM_hblabels_b_qbe","//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
                elements.put("MDM_hblabels_b_detach","//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
                elements.put("MDM_hblabels_e_result","//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_hblabels_e_records","//*[contains(@id, 'r1:1:pc1:ot3')]");
            //DICTIONARY
                //DICTIONARY
                    elements.put("MDM_dct_b_add","//*[contains(@id, 'r1:1:pc2:pcgt1:boton_add')]");
                    elements.put("MDM_dct_b_delete","//*[contains(@id, 'r1:1:pc2:pcgt1:boton_remove')]");
                    elements.put("MDM_dct_b_delete_ok","//*[contains(@id, 'r1:1:pc2:pcgt1:cbt1')]");
                    elements.put("MDM_dct_b_edit","//*[contains(@id, 'r1:1:pc2:pcgt1:boton_edit')]");
                    elements.put("MDM_dct_b_actions","//*[contains(@id, 'r1:1:pc2:pcgm1:dc_m1')]");
                    elements.put("MDM_dct_b_actions_audit_data","//*[contains(@id, 'r1:1:pc2:pcgm1:dc_cmi1')]/td[2]");
                    elements.put("MDM_dct_b_qbe","//*[contains(@id, 'r1:1:pc2:_qbeTbr')]");
                    elements.put("MDM_dct_b_detach","//*[contains(@id, 'r1:1:pc2:_dchTbr')]");
                    elements.put("MDM_dct_e_result","//*[contains(@id, 'r1:1:pc2:t1::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_dct_e_records","//*[contains(@id, 'r1:1:pc2:ot26')]");
                //MULTI-LANGUAGE
                    elements.put("MDM_dmulti_b_add","//*[contains(@id, 'r1:1:pc3:pcgt2:boton_add')]");
                    elements.put("MDM_dmulti_b_delete","//*[contains(@id, 'r1:1:pc3:pcgt2:boton_remove')]");
                    elements.put("MDM_dmulti_b_delete_ok","//*[contains(@id, 'r1:1:pc3:pcgt2:cbt1')]");
                    elements.put("MDM_dmulti_b_edit","//*[contains(@id, 'r1:1:pc3:pcgt2:boton_edit')]");
                    elements.put("MDM_dmulti_b_actions","//*[contains(@id, 'r1:1:pc3:pcgm2:dc_m1')]");
                    elements.put("MDM_dmulti_b_actions_audit_data","//*[contains(@id, 'r1:1:pc3:pcgm2:dc_cmi1')]/td[2]");
                    elements.put("MDM_dmulti_b_qbe","//*[contains(@id, 'r1:1:pc3:_qbeTbr')]");
                    elements.put("MDM_dmulti_b_detach","//*[contains(@id, 'r1:1:pc3:_dchTbr')]");
                    elements.put("MDM_dmulti_e_result","//*[contains(@id, 'r1:1:pc3:t2::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_dmulti_e_records","//*[contains(@id, ':r1:1:pc3:ot30')]");
            //HELP
                //HELP
                    elements.put("MDM_hlp_b_add","//*[contains(@id, 'r1:1:pc4:pcgt4:boton_add')]");
                    elements.put("MDM_hlp_b_delete","//*[contains(@id, 'r1:1:pc4:pcgt4:boton_remove')]");
                    elements.put("MDM_hlp_b_delete_ok","//*[contains(@id, 'r1:1:pc4:pcgt4:cbt1')]");
                    elements.put("MDM_hlp_b_edit","//*[contains(@id, 'r1:1:pc4:pcgt4:boton_edit')]");
                    elements.put("MDM_hlp_b_actions","//*[contains(@id, 'r1:1:pc4:pcgm4:dc_m1')]");
                    elements.put("MDM_hlp_b_actions_audit_data","//*[contains(@id, 'r1:1:pc4:pcgm4:dc_cmi1')]/td[2]");
                    elements.put("MDM_hlp_b_qbe","//*[contains(@id, 'r1:1:pc4:_qbeTbr')]");
                    elements.put("MDM_hlp_b_detach","//*[contains(@id, 'r1:1:pc4:_dchTbr')]");
                    elements.put("MDM_hlp_e_result","//*[contains(@id, 'r1:1:pc4:md1::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hlp_e_records","//*[contains(@id, 'r1:1:pc4:ot34')]");
                //MULTI-LANGUAGE
                    elements.put("MDM_hmulti_b_add","//*[contains(@id, 'r1:1:pc5:pcgt5:boton_add')]");
                    elements.put("MDM_hmulti_b_delete","//*[contains(@id, 'r1:1:pc5:pcgt5:boton_remove')]");
                    elements.put("MDM_hmulti_b_delete_ok","//*[contains(@id, 'r1:1:pc5:pcgt5:cbt1')]");
                    elements.put("MDM_hmulti_b_edit","//*[contains(@id, 'r1:1:pc5:pcgt5:boton_edit')]");
                    elements.put("MDM_hmulti_b_actions","//*[contains(@id, 'r1:1:pc5:pcgm5:dc_m1')]");
                    elements.put("MDM_hmulti_b_actions_audit_data","//*[contains(@id, 'r1:1:pc5:pcgm5:dc_cmi1')]/td[2]");
                    elements.put("MDM_hmulti_b_qbe","//*[contains(@id, 'r1:1:pc5:_qbeTbr')]");
                    elements.put("MDM_hmulti_b_detach_show","//*[contains(@id, 'r1:1:pc4:_tbr::eoi')]");
                    elements.put("MDM_hmulti_b_detach","//*[contains(@id, 'r1:1:pc5:_dchTbr')]");
                    elements.put("MDM_hmulti_e_result","//*[contains(@id, 'r1:1:pc5:t3::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hmulti_e_records","//*[contains(@id, 'r1:1:pc5:ot38')]");
            //BANNER
                elements.put("MDM_bnnr_b_add","//*[contains(@id, 'r1:1:pc6:pcgt6:boton_add')]");
                elements.put("MDM_bnnr_b_delete","//*[contains(@id, 'r1:1:pc6:pcgt6:boton_remove')]");
                elements.put("MDM_bnnr_b_delete_ok","//*[contains(@id, 'r1:1:pc6:pcgt6:cbt1')]");
                elements.put("MDM_bnnr_b_edit","//*[contains(@id, 'r1:1:pc6:pcgt6:boton_edit')]");
                elements.put("MDM_bnnr_b_actions","//*[contains(@id, 'r1:1:pc6:pcgm6:dc_m1')]");
                elements.put("MDM_bnnr_b_actions_audit_data","//*[contains(@id, 'r1:1:pc6:pcgm6:dc_cmi1')]/td[2]");
                elements.put("MDM_bnnr_b_qbe","//*[contains(@id, 'r1:1:pc6:_qbeTbr')]");
                elements.put("MDM_bnnr_b_detach","//*[contains(@id, 'r1:1:pc6:_dchTbr')]");
                elements.put("MDM_bnnr_e_result","//*[contains(@id, 'r1:1:pc6:t24::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_bnnr_e_records","//*[contains(@id, 'r1:1:pc6:ot54')]");
            //HEADER
                //HEADER
                    elements.put("MDM_hdr_b_add","//*[contains(@id, 'r1:1:pc7:pcgt7:boton_add')]");
                    elements.put("MDM_hdr_b_delete","//*[contains(@id, 'r1:1:pc7:pcgt7:boton_remove')]");
                    elements.put("MDM_hdr_b_delete_ok","//*[contains(@id, 'r1:1:pc7:pcgt7:cbt1')]");
                    elements.put("MDM_hdr_b_edit","//*[contains(@id, 'r1:1:pc7:pcgt7:boton_edit')]");
                    elements.put("MDM_hdr_b_actions","//*[contains(@id, 'r1:1:pc7:pcgm7:dc_m1')]");
                    elements.put("MDM_hdr_b_actions_audit_data","//*[contains(@id, 'r1:1:pc7:pcgm7:dc_cmi1')]/td[2]");
                    elements.put("MDM_hdr_b_qbe","//*[contains(@id, 'r1:1:pc7:_qbeTbr')]");
                    elements.put("MDM_hdr_b_detach","//*[contains(@id, 'r1:1:pc7:_dchTbr')]");
                    elements.put("MDM_hdr_e_result","//*[contains(@id, 'r1:1:pc7:t29::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hdr_e_records","//*[contains(@id, 'r1:1:pc7:ot71')]");
                //MULTI-LANGUAGE
                    elements.put("MDM_hdmulti_b_add","//*[contains(@id, 'r1:1:pc8:pcgt8:boton_add')]");
                    elements.put("MDM_hdmulti_b_delete","//*[contains(@id, 'r1:1:pc8:pcgt8:boton_remove')]");
                    elements.put("MDM_hdmulti_b_delete_ok","//*[contains(@id, 'r1:1:pc8:pcgt8:cbt1')]");
                    elements.put("MDM_hdmulti_b_edit","//*[contains(@id, 'r1:1:pc8:pcgt8:boton_edit')]");
                    elements.put("MDM_hdmulti_b_actions","//*[contains(@id, 'r1:1:pc8:pcgm8:dc_m1')]");
                    elements.put("MDM_hdmulti_b_actions_audit_data","//*[contains(@id, 'r1:1:pc8:pcgm8:dc_cmi1')]/td[2]");
                    elements.put("MDM_hdmulti_b_qbe","//*[contains(@id, 'r1:1:pc8:_qbeTbr')]");
                    elements.put("MDM_hdmulti_b_detach","//*[contains(@id, 'r1:1:pc8:_dchTbr')]");
                    elements.put("MDM_hdmulti_e_result","//*[contains(@id, 'r1:1:pc8:t30::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hdmulti_e_records","//*[contains(@id, 'r1:1:pc8:ot74')]");
        //ADD|MODIFY
            //HB LABELS MAINTENANCE
                elements.put("add_hblabels_b_save", "//*[contains(@id, 'r1:1:pc1:pcgt3:btn_commitExit')]");
                elements.put("add_hblabels_i_page", "//*[contains(@id, 'r1:1:pc1:pcgt3:it19::content')]");
                elements.put("add_hblabels_i_description", "//*[contains(@id, 'r1:1:pc1:pcgt3:it16::content')]");
            //DICTIONARY
                //DICTIONARY
                    elements.put("add_dct_b_save", "//*[contains(@id, 'r1:1:pc2:pcgt1:btn_commitExit')]");
                    elements.put("add_dct_i_code", "//*[contains(@id, 'r1:1:pc2:pcgt1:it3::content')]");
                //MULTI-LANGUAGE
                    elements.put("add_dmulti_b_save", "//*[contains(@id, 'r1:1:pc3:pcgt2:btn_commitExit')]");
                    elements.put("add_dmulti_i_language", "//*[contains(@id, 'r1:1:pc3:pcgt2:sidiCodIdiomaId::content')]");
                    elements.put("add_dmulti_lov_language", "//*[contains(@id, 'r1:1:pc3:pcgt2:sidiCodIdiomaId::lovIconId')]");
                    elements.put("add_dmulti_i_description", "//*[contains(@id, 'r1:1:pc3:pcgt2:it12::content')]");
            //HELP
                //HELP
                    elements.put("add_hlp_b_save", "//*[contains(@id, 'r1:1:pc4:pcgt4:btn_commitExit')]");
                    elements.put("add_hlp_i_detail", "//*[contains(@id, 'r1:1:pc4:pcgt4:it20::content')]");
                    elements.put("add_hlp_sl_type", "//*[contains(@id, 'r1:1:pc4:pcgt4:soc1::content')]");
                //MULTI-LANGUAGE
                    elements.put("add_hmulti_b_save", "//*[contains(@id, 'r1:1:pc5:pcgt5:btn_commitExit')]");
                    elements.put("add_hmulti_i_language", "//*[contains(@id, 'r1:1:pc5:pcgt5:sidiCodIdioma1Id::content')]");
                    elements.put("add_hmulti_lov_language", "//*[contains(@id, 'r1:1:pc5:pcgt5:sidiCodIdioma1Id::lovIconId')]");
                    elements.put("add_hmulti_i_concept", "//*[contains(@id, 'r1:1:pc5:pcgt5:it25::content')]");
                    elements.put("add_hmulti_i_description", "//*[contains(@id, 'r1:1:pc5:pcgt5:it23::content')]");
            //BANNER
                elements.put("add_bnnr_b_save", "//*[contains(@id, 'r1:1:pc6:pcgt6:btn_commitExit')]");
                elements.put("add_bnnr_i_code", "//*[contains(@id, 'r1:1:pc6:pcgt6:it28::content')]");
                elements.put("add_bnnr_i_language", "//*[contains(@id, 'r1:1:pc6:pcgt6:sidiCodIdioma2Id::content')]");
                elements.put("add_bnnr_lov_language", "//*[contains(@id, 'r1:1:pc6:pcgt6:sidiCodIdioma2Id::lovIconId')]");
                elements.put("add_bnnr_i_description", "//*[contains(@id, 'r1:1:pc6:pcgt6:it29::content')]");
                elements.put("add_bnnr_cb_status", "//*[contains(@id, 'r1:1:pc6:pcgt6:sbc1::content')]");
            //HEADER
                //HEADER
                    elements.put("add_hdr_b_save", "//*[contains(@id, 'r1:1:pc7:pcgt7:btn_commitExit')]");
                    elements.put("add_hdr_i_number", "//*[contains(@id, 'r1:1:pc7:pcgt7:it34::content')]");
                //MULTI-LANGUAGE
                    elements.put("add_hdmulti_b_save", "//*[contains(@id, 'r1:1:pc8:pcgt8:btn_commitExit')]");
                    elements.put("add_hdmulti_i_language", "//*[contains(@id, 'r1:1:pc8:pcgt8:sidiCodIdioma3Id::content')]");
                    elements.put("add_hdmulti_lov_language", "//*[contains(@id, 'r1:1:pc8:pcgt8:sidiCodIdioma3Id::lovIconId')]");
                    elements.put("add_hdmulti_i_header_description", "//*[contains(@id, 'r1:1:pc8:pcgt8:it38::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'r1:1:qryId1::reset')]");
            elements.put("search_i_page", "//*[contains(@id, 'r1:1:qryId1:value00::content')]");
            elements.put("search_i_description", "//*[contains(@id, 'r1:1:qryId1:value10::content')]");
        //QBE
            //HB LABELS MAINTENANCE
                elements.put("qbe_hblabels_i_page", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_hblabels_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_resId1_afr_resId1c2::content')]");
            //DICTIONARY
                //DICTIONARY
                    elements.put("qbe_dct_i_code", "//*[contains(@id, 'r1:1:pc2:t1:it27::content')]");
                //MULTI-LANGUAGE
                    elements.put("qbe_dmulti_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_pc3_afr_t2_afr_c6::content')]");
                    elements.put("qbe_dmulti_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc3_afr_t2_afr_c5::content')]");
            //HELP
                //HELP
                    elements.put("qbe_hlp_i_detail", "//*[contains(@id, 'r1:1:pc4:md1:it46::content')]");
                    elements.put("qbe_hlp_sl_type", "//*[contains(@id, 'r1:1:pc4:md1:soc2::content')]");
                //MULTI-LANGUAGE
                    elements.put("qbe_hmulti_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_pc5_afr_t3_afr_c13::content')]");
                    elements.put("qbe_hmulti_i_concept", "//*[contains(@id, 'afr_r1_afr_1_afr_pc5_afr_t3_afr_c19::content')]");
                    elements.put("qbe_hmulti_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc5_afr_t3_afr_c21::content')]");
            //BANNER
                elements.put("qbe_bnnr_i_code", "//*[contains(@id, 'r1:1:pc6:t24:it45::content')]");
                elements.put("qbe_bnnr_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_pc6_afr_t24_afr_c30::content')]");
                elements.put("qbe_bnnr_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc6_afr_t24_afr_c25::content')]");
                elements.put("qbe_bnnr_sl_status", "//*[contains(@id, 'r1:1:pc6:t24:soc4::content')]");
            //HEADER
                //HEADER
                    elements.put("qbe_hdr_i_number", "//*[contains(@id, 'r1:1:pc7:t29:it44::content')]");
                //MULTI-LANGUAGE
                    elements.put("qbe_hdmulti_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_pc8_afr_t30_afr_c39::content')]");
                    elements.put("qbe_hdmulti_i_header_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc8_afr_t30_afr_c45::content')]");
    }
}