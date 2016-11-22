package screen.AT2MDMRM0035;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/11/2016.
 */
public class AT2MDMRM0035Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0035Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE CONFIGURATION
         */
        //GENERALS
        elements.put("configurations_b_add", "//*[contains(@id, 'pcgtid0:boton_add')]");
        elements.put("configurations_b_delete", "//*[contains(@id, 'pcgtid0:boton_remove')]");
        elements.put("configurations_b_edit", "//*[contains(@id, 'pcgtid0:boton_edit')]");
        elements.put("configurations_b_actions", "//*[contains(@id, 'pcgmid0:dc_mb1')]");
        elements.put("configurations_b_actions_b_audit_data", "//*[contains(@id, 'pcgmid0:dc_cmi0')]/td[2]");
        elements.put("configurations_b_qbe", "//*[contains(@id, 'pcid0:_qbeTbr')]");
        elements.put("configurations_b_detach", "//*[contains(@id, 'pcid0:_dchTbr')]");
        elements.put("configurations_e_result", "//*[contains(@id, 'pcid0:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configurations_e_records", "//*[contains(@id, 'pcid0:ot1id0')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_web", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_web_desc", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_web_desc", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_sl_status", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_ttoo", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_ttoo_desc", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_ttoo_desc", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgtid0:btn_commitExit')]");
        elements.put("add_i_web", "//*[contains(@id, 'pcid0:pcgtid0:it8::content')]");
        elements.put("add_i_web_desc", "//*[contains(@id, 'pcid0:pcgtid0:webId::content')]");
        elements.put("add_lov_web_desc", "//*[contains(@id, 'pcid0:pcgtid0:webId::lovIconId')]");
        elements.put("add_sl_status1", "//*[contains(@id, 'pcid0:pcgtid0:soc1::content')]");
        elements.put("add_i_ttoo", "//*[contains(@id, ':pcid0:pcgtid0:it4::content')]");
        elements.put("add_i_ttoo_desc", "//*[contains(@id, 'pcid0:pcgtid0:ttooId::content')]");
        elements.put("add_lov_ttoo_desc", "//*[contains(@id, 'pcid0:pcgtid0:ttooId::lovIconId')]");
        //QBE
        elements.put("qbe_i_web", "//*[contains(@id, 'pcid0:resId1:it9::content')]");
        elements.put("qbe_i_web_desc", "//*[contains(@id, 'pcid0_afr_resId1_afr_resId1c4::content')]");
        elements.put("qbe_sl_status1", "//*[contains(@id, 'pcid0:resId1:selectOneChoice2::content')]");
        elements.put("qbe_i_ttoo", "//*[contains(@id, 'pcid0_afr_resId1_afr_resId1c6::content')]");
        elements.put("qbe_i_ttoo_desc", "//*[contains(@id, 'pcid0_afr_resId1_afr_resId1c7::content')]");
        /**
         * TABLE TABS
         */
        //GENERALS
        elements.put("tabs_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("tabs_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("tabs_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("tabs_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("tabs_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("tabs_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("tabs_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("tabs_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("tabs_e_records", "//*[contains(@id, 'pc1:ot1id1')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_nombre", "//*[contains(@id, 'it12::content')]");
        elements.put("add_i_desc", "//*[contains(@id, 'it13::content')]");
        elements.put("add_i_orden", "//*[contains(@id, 'it11::content')]");
        elements.put("add_sl_status2", "//*[contains(@id, 'soc2::content')]");
        elements.put("add_i_img_on", "//*[contains(@id, 'it14::content')]");
        elements.put("add_i_img_off", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_img_detalle", "//*[contains(@id, 'it10::content')]");
        //QBE
        elements.put("qbe_i_nombre", "//*[contains(@id, '_t1_afr_c6::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, '_t1_afr_c3::content')]");
        elements.put("qbe_i_orden", "//*[contains(@id, 't1:it6::content')]");
        elements.put("qbe_sl_status2", "//*[contains(@id, 't1:soc7::content')]");
        /**
         * TABLE LABELS
         */
        //GENERALS
        elements.put("labels_b_add", "//*[contains(@id, 'PCGenericToolbar1:boton_add')]");
        elements.put("labels_b_delete", "//*[contains(@id, 'PCGenericToolbar1:boton_remove')]");
        elements.put("labels_b_edit", "//*[contains(@id, 'PCGenericToolbar1:boton_edit')]");
        elements.put("labels_b_actions", "//*[contains(@id, 'PCGenericMenu1:dc_m1')]");
        elements.put("labels_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("labels_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("labels_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("labels_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("labels_e_records", "//*[contains(@id, 'pc2:outputText3')]");
        //ADD
        elements.put("add_b_save3", "//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");
        elements.put("add_i_lang", "//*[contains(@id, 'etiIdiId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'etiIdiId::lovIconId')]");
        elements.put("add_i_desc_lang", "//*[contains(@id, 'it15::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, '_t2_afr_c8::content')]");
        elements.put("qbe_i_desc_lang", "//*[contains(@id, '_t2_afr_c9::content')]");
        /**
         * TABLE TABS CONTENT
         */
        //GENERALS
        elements.put("tabs_c_b_add", "//*[contains(@id, 'PCGenericToolbar2:boton_add')]");
        elements.put("tabs_c_b_delete", "//*[contains(@id, 'PCGenericToolbar2:boton_remove')]");
        elements.put("tabs_c_b_edit", "//*[contains(@id, 'PCGenericToolbar2:boton_edit')]");
        elements.put("tabs_c_b_actions", "//*[contains(@id, 'PCGenericMenu2:dc_m1')]");
        elements.put("tabs_c_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu2:dc_cmi0')]/td[2]");
        elements.put("tabs_c_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("tabs_c_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("tabs_c_e_result", "//*[contains(@id, 'pc3:tcontent3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("tabs_c_e_records", "//*[contains(@id, 'pc3:outputText5')]");
        //ADD
        elements.put("add_b_save4", "//*[contains(@id, 'PCGenericToolbar2:btn_commitExit')]");
        elements.put("add_i_zones", "//*[contains(@id, 'cpeAgrzonaId::content')]");
        elements.put("add_lov_zones", "//*[contains(@id, 'cpeAgrzonaId::lovIconId')]");
        elements.put("add_i_zones_desc", "//*[contains(@id, 'pc3:PCGenericToolbar2:it7::content')]");
        elements.put("add_i_dest_gr", "//*[contains(@id, 'cpeAgrdestId::content')]");
        elements.put("add_lov_dest_gr", "//*[contains(@id, 'cpeAgrdestId::lovIconId')]");
        elements.put("add_i_dest_gr_desc", "//*[contains(@id, 'pc3:PCGenericToolbar2:it19::content')]");
        elements.put("add_i_destination", "//*[contains(@id, 'cpeDestinoId::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'cpeDestinoId::lovIconId')]");
        elements.put("add_i_destination_desc", "//*[contains(@id, 'PCGenericToolbar2:it16::content')]");
        elements.put("add_i_order", "//*[contains(@id, 'it18::content')]");
        elements.put("add_sl_status3", "//*[contains(@id, 'soc3::content')]");
        //QBE
        elements.put("qbe_i_zones_gr", "//*[contains(@id, '_tcontent3_afr_c10::content')]");
        elements.put("qbe_i_zones_desc", "//*[contains(@id, '_tcontent3_afr_c16::content')]");
        elements.put("qbe_i_dest_gr", "//*[contains(@id, '_tcontent3_afr_c12::content')]");
        elements.put("qbe_i_dest_desc", "//*[contains(@id, '_tcontent3_afr_c17::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, '_tcontent3_afr_c13::content')]");
        elements.put("qbe_i_destination_desc", "//*[contains(@id, '_tcontent3_afr_c14::content')]");
        elements.put("qbe_i_order", "//*[contains(@id, 'tcontent3:it20::content')]");
        elements.put("qbe_sl_status3", "//*[contains(@id, 'selectOneChoice1::content')]");
    }
}
