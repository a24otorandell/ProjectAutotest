package screen.AT2MDMCL0007;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0007Locators {
    Map<String, String> elements = new HashMap<>();
    public AT2MDMCL0007Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("user_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        //elements.put("user_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("user_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("user_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("user_b_actions_b_audit", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("user_b_actions_b_historic", "//*[contains(@id, 'pcgm1:dc_cmi6')]/td[2]");
        elements.put("user_b_hist_close", "//*[contains(@id, 'd1::close')]");
        elements.put("user_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("user_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("user_e_result", "//*[contains(@id, 'pc1:webuser::db')]/table/tbody/tr[1]/td[1]");
        elements.put("user_e_records", "//*[contains(@id, 'pc1:ot4')]");
        elements.put("user_b_ok_delete", "//*[contains(@id, 'dialogConfirmDelete::yes')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_surname", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_usu_login", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_password", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_psw", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_mail", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_to_agency", "//*[contains(@id, 'qryId1:value70::content')]");  //0INVI
        elements.put("search_lov_to_agency", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_i_branch", "//*[contains(@id, 'qryId1:value80::content')]");  //0INVI
        elements.put("search_lov_branch", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("search_i_lang", "//*[contains(@id, 'qryId1:value90::content')]");  //0INVI
        elements.put("search_lov_lang", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value100::content')]");  //0INVI
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value100::lovIconId')]");
        elements.put("search_sl_status","//*[contains(@id,'qryId1:value110::content')]");
        elements.put("search_sl_profile","//*[contains(@id,'qryId1:value120::content')]");
        elements.put("search_i_web", "//*[contains(@id, 'qryId1:value130::content')]");  //0INVI
        elements.put("search_lov_web", "//*[contains(@id, 'qryId1:value130::lovIconId')]");
        elements.put("search_i_default", "//*[contains(@id, 'qryId1:value140::content')]");  //0INVI
        elements.put("search_lov_default", "//*[contains(@id, 'qryId1:value140::lovIconId')]");
        elements.put("search_ck_super","//*[contains(@id,'qryId1:value150::content')]");
        elements.put("search_ck_xml","//*[contains(@id,'qryId1:value170::content')]");
        elements.put("search_ck_html","//*[contains(@id,'qryId1:value180::content')]");
        elements.put("search_i_type","//*[contains(@id,'qryId1:value190::content')]");
        elements.put("search_sl_subcategory","//*[contains(@id,'qryId1:value200::content')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'qryId1:value210::content')]");  //0INVI
        elements.put("search_lov_hotel", "//*[contains(@id, 'qryId1:value210::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_e_user_id", "//*[contains(@id, 'it8::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'it2::content')]");
        elements.put("add_i_surname", "//*[contains(@id, 'it9::content')]");
        elements.put("add_i_usu_login", "//*[contains(@id, 'it4::content')]");
        elements.put("add_i_pass", "//*[contains(@id, 'it7::content')]");
        elements.put("add_i_psw", "//*[contains(@id, 'pcgt2:id2::content')]");
        elements.put("add_i_email", "//*[contains(@id, 'it14::content')]");
        elements.put("add_i_to_agency", "//*[contains(@id, 'nomTtooId::content')]");  //0INVI
        elements.put("add_lov_to_agency", "//*[contains(@id, 'nomTtooId::lovIconId')]");
        elements.put("add_i_branch", "//*[contains(@id, 'usuSucAtlasId::content')]");
        elements.put("add_lov_branch", "//*[contains(@id, 'usuSucAtlasId::lovIconId')]");
        elements.put("add_i_lang", "//*[contains(@id, 'usuIdiAtlasId::content')]");  //NOR
        elements.put("add_lov_lang", "//*[contains(@id, 'usuIdiAtlasId::lovIconId')]");
        elements.put("add_i_interface", "//*[contains(@id, 'superUserTmpId::content')]");  //A
        elements.put("add_lov_interface", "//*[contains(@id, 'superUserTmpId::lovIconId')]");
        elements.put("add_sl_status", "//*[contains(@id, 'pcgt2:soc7::content')]");
        elements.put("add_sl_profile", "//*[contains(@id, 'pcgt2:soc8::content')]");
        elements.put("add_ck_super", "//*[contains(@id, 'sbc5::content')]");
        elements.put("add_i_web", "//*[contains(@id, 'pcgt2:idWebId::content')]");
        elements.put("add_lov_web", "//*[contains(@id, 'pcgt2:idWebId::lovIconId')]");
        elements.put("add_i_default", "//*[contains(@id, 'pcgt2:codPerfilOfeId::content')]");
        elements.put("add_lov_default", "//*[contains(@id, 'pcgt2:codPerfilOfeId::lovIconId')]");
        elements.put("add_ck_client_xml", "//*[contains(@id, 'sbc6::content')]");
        elements.put("add_ck_client_html", "//*[contains(@id, 'sbc7::content')]");
        elements.put("add_i_type", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_internal_user", "//*[contains(@id, 'it10::content')]");
        elements.put("add_sl_subcategory", "//*[contains(@id, 'pcgt2:soc17::content')]");
        elements.put("add_i_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("add_lov_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("add_i_hotel_desc", "//*[contains(@id, 'pcgt2:it23::content')]");
        //QBE
        elements.put("qbe_i_user_id", "//*[contains(@id, 'pc1_afr_webuser_afr_c8::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc1_afr_webuser_afr_c9::content')]");
        elements.put("qbe_i_surname", "//*[contains(@id, 'pc1_afr_webuser_afr_c12::content')]");
        elements.put("qbe_i_usu_login", "//*[contains(@id, 'pc1_afr_webuser_afr_c13::content')]");
        elements.put("qbe_i_pass", "//*[contains(@id, 'pc1_afr_webuser_afr_c35::content')]");
        elements.put("qbe_i_psw", "//*[contains(@id, 'webuser:id3::content')]");
        elements.put("qbe_i_email", "//*[contains(@id, 'pc1_afr_webuser_afr_c15::content')]");
        elements.put("qbe_i_to_agency", "//*[contains(@id, 'pc1_afr_webuser_afr_c16::content')]");
        elements.put("qbe_i_branch", "//*[contains(@id, 'webuser:it21::content')]");
        elements.put("qbe_i_branch_name", "//*[contains(@id, 'pc1_afr_webuser_afr_c44::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'pc1_afr_webuser_afr_c46::content')]");
        elements.put("qbe_i_lang", "//*[contains(@id, 'pc1_afr_webuser_afr_c21::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'pc1_afr_webuser_afr_c26::content')]");
        elements.put("qbe_sl_status", "//*[contains(@id, 'webuser:soc10::content')]");
        elements.put("qbe_sl_profile", "//*[contains(@id, 'webuser:soc12::content')]");
        elements.put("qbe_sl_super", "//*[contains(@id, 'webuser:selectOneChoice2::content')]");
        elements.put("qbe_i_web", "//*[contains(@id, 'webuser:it22::content')]");
        elements.put("qbe_sl_client_xml", "//*[contains(@id, 'webuser:soc13::content')]");
        elements.put("qbe_sl_client_html", "//*[contains(@id, 'webuser:soc15::content')]");
        elements.put("qbe_i_type", "//*[contains(@id, 'pc1_afr_webuser_afr_c41::content')]");
        elements.put("qbe_i_internal_user", "//*[contains(@id, 'pc1_afr_webuser_afr_c42::content')]");
        elements.put("qbe_sl_subcategory", "//*[contains(@id, 'webuser:soc38::content')]");
    }
}

