package screen.AT2MDMOR0022;

import java.util.HashMap;
import java.util.Map;

/**
 * addd by aibanez on 18/11/2016.
 */
public class AT2MDMOR0022Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0022Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //OPCIONES ADdRESS
        elements.put("address_rb_to", "//*[contains(@id, 'sor2:_0')]");
        elements.put("address_rb_supplier", "//*[contains(@id, 'sor2:_1')]");
        elements.put("address_rb_operational", "//*[contains(@id, 'sor2:_2')]");
        //OPCIONES GENERAL
        elements.put("general_rb_to", "//*[contains(@id, 'sor1:_0')]");
        elements.put("general_rb_supplier", "//*[contains(@id, 'sor1:_1')]");
        /**
         * TAB ADDRESS BOOK - TABLE TO/SUPPLIER
         */
        //GENERALS
        elements.put("address_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("address_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("address_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("address_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("address_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("address_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("address_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("address_e_result", "//*[contains(@id, 'pc2:ofiaddr::db')]/table/tbody/tr[1]/td[1]");
        elements.put("address_e_records", "//*[contains(@id, 'pc2:ot2')]");
        //SEARCH
        elements.put("search_b_search1", "//*[contains(@id, 'qryId4::search')]");
        elements.put("search_b_reset1", "//*[contains(@id, 'qryId4::reset')]");
        elements.put("tab1_search_sl_module", "//*[contains(@id, 'qryId4:value00::content')]");
        elements.put("tab1_search_i_supplier", "//*[contains(@id, 'qryId4:value10::content')]");
        elements.put("tab1_search_lov_supplier", "//*[contains(@id, 'qryId4:value10::lovIconId')]");
        elements.put("tab1_search_i_hotel", "//*[contains(@id, 'qryId4:value20::content')]");
        elements.put("tab1_search_lov_hotel", "//*[contains(@id, 'qryId4:value20::lovIconId')]");
        elements.put("tab1_search_i_fax", "//*[contains(@id, 'qryId4:value30::content')]");
        elements.put("tab1_search_i_email", "//*[contains(@id, 'qryId4:value40::content')]");
        elements.put("tab1_search_ck_automatic", "//*[contains(@id, 'qryId4:value50::content')]");
        elements.put("tab1_search_i_company", "//*[contains(@id, 'qryId4:value60::content')]");
        elements.put("tab1_search_lov_company", "//*[contains(@id, 'qryId4:value60::lovIconId')]");
        elements.put("tab1_search_i_office", "//*[contains(@id, 'qryId4:value70::content')]");
        elements.put("tab1_search_lov_office", "//*[contains(@id, 'qryId4:value70::lovIconId')]");
        elements.put("tab1_search_i_incoming", "//*[contains(@id, 'qryId4:value80::content')]");
        elements.put("tab1_search_lov_incoming", "//*[contains(@id, 'qryId4:value80::lovIconId')]");
        elements.put("tab1_search_i_contracting", "//*[contains(@id, 'qryId4:value90::content')]");
        elements.put("tab1_search_lov_contrating", "//*[contains(@id, 'qryId4:value90::lovIconId')]");
        //SEARCH OPTION TO
        elements.put("search_b_searcho", "//*[contains(@id, 'qryId3::search')]");
        elements.put("search_b_resetto", "//*[contains(@id, 'qryId3::reset')]");
        elements.put("tabto_search_sl_module", "//*[contains(@id, 'qryId3:value00::content')]");
        elements.put("tabto_search_i_to", "//*[contains(@id, 'qryId3:value10::content')]");
        elements.put("tabto_search_lov_to", "//*[contains(@id, 'qryId3:value10::lovIconId')]");
        elements.put("tabto_search_i_hotel", "//*[contains(@id, 'qryId3:value20::content')]");
        elements.put("tabto_search_lov_hotel", "//*[contains(@id, 'qryId3:value20::lovIconId')]");
        elements.put("tabto_search_i_fax", "//*[contains(@id, 'qryId3:value30::content')]");
        elements.put("tabto_search_i_email", "//*[contains(@id, 'qryId3:value40::content')]");
        //SEARCH OPTION OPERATIONAL
        elements.put("search_b_searcopera", "//*[contains(@id, 'qryId5::search')]");
        elements.put("search_b_resetopera", "//*[contains(@id, 'qryId5::reset')]");
        elements.put("tabop_search_sl_module", "//*[contains(@id, 'qryId5:value00::content')]");
        elements.put("tabop_search_i_desc", "//*[contains(@id, 'qryId5:value10::content')]");
        elements.put("tabop_search_i_fax", "//*[contains(@id, 'qryId5:value20::content')]");
        elements.put("tabop_search_i_email", "//*[contains(@id, 'qryId5:value30::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("tab1_add_sl_module", "//*[contains(@id, 'pc2:pcgt1:soc5::content')]");
        elements.put("tab1_add_i_supplier", "//*[contains(@id, 'pc2:pcgt1:proveedorId::content')]");
        elements.put("tab1_add_lov_supplier", "//*[contains(@id, 'pc2:pcgt1:proveedorId::lovIconId')]");
        elements.put("tab1_add_i_supplier_code2", "//*[contains(@id, 'pc2:pcgt1:proveedorId_afrLovInternalTableId::db')]/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("tab1_add_i_supplier_code", "//*[contains(@id, 'pc2:pcgt1:proveedorId_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("tab1_add_i_hotel", "//*[contains(@id, 'pc2:pcgt1:hotelId::content')]");
        elements.put("tab1_add_lov_hotel", "//*[contains(@id, 'pc2:pcgt1:hotelId::lovIconId')]");
        elements.put("tab1_add_i_fax", "//*[contains(@id, 'pc2:pcgt1:it9::content')]");
        elements.put("tab1_add_i_email", "//*[contains(@id, 'pc2:pcgt1:it11::content')]");
        elements.put("tab1_add_ck_automatic", "//*[contains(@id, 'pc2:pcgt1:sbc1::content')]");
        elements.put("tab1_add_e_company", "//*[contains(@id, 'pc2:pcgt1:it14::content')]");
        elements.put("tab1_add_e_office", "//*[contains(@id, 'pc2:pcgt1:it17::content')]");
        elements.put("tab1_add_i_to", "//*[contains(@id, 'pc2:pcgt1:tourOperador1Id::content')]");
        elements.put("tab1_add_lov_to", "//*[contains(@id, 'pc2:pcgt1:tourOperador1Id::lovIconId')]");
        elements.put("tab1_add_i_desc", "//*[contains(@id, 'pc2:pcgt1:it10::content')]");
        //QBE
        elements.put("tab1_qbe_i_company", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c16::content')]");
        elements.put("tab1_qbe_i_office", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c17::content')]");
        elements.put("tab1_qbe_i_incoming", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c18::content')]");
        elements.put("tab1_qbe_i_contracting", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c19::content')]");
        elements.put("tab1_qbe_sl_module", "//*[contains(@id, 'pc2:ofiaddr:selectOneChoice1::content')]");
        elements.put("tab1_qbe_i_supplier", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c9::content')]");
        elements.put("tab1_qbe_i_hotel", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c8::content')]");
        elements.put("tab1_qbe_i_email", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c10::content')]");
        elements.put("tab1_qbe_i_fax", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c12::content')]");
        elements.put("tab1_qbe_i_to", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c7::content')]");
        elements.put("tab1_qbe_sl_automatic", "//*[contains(@id, 'pc2:ofiaddr:socid0::content')]");
        elements.put("tab1_qbe_i_desc", "//*[contains(@id, 'pc2_afr_ofiaddr_afr_c13::content')]");
        /**
         * TAB GENERAL ADDRESS - TABLE TO/SUPPLIER
         */
        //TAB
        elements.put("tab_general", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERAL
        elements.put("general_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("general_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("general_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("general_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("general_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("general_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("general_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("general_e_result", "//*[contains(@id, 'pc1:genaddr::db')]/table/tbody/tr[1]/td[1]");
        elements.put("general_e_records", "//*[contains(@id, 'pc1:ot15')]");
        elements.put("general_b_reset", "//*[contains(@id, 'genaddr::ch::t')]/tbody/tr[2]/th/a");
        //SEARCH
        elements.put("search_b_search2", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset2", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("tab2_search_sl_module", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("tab2_search_i_to", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("tab2_search_lov_to", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("tab2_search_i_fax", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("tab2_search_i_email", "//*[contains(@id, 'qryId1:value30::content')]");
        //SEARCH SUPPLIER
        elements.put("search_b_searchsu", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_resetsu", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("tabsu_search_sl_module", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("tabsu_search_i_supplier", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("tabsu_search_lov_supplier", "//*[contains(@id, 'qryId2:value10::lovIconId')]");
        elements.put("tabsu_search_i_fax", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("tabsu_search_i_email", "//*[contains(@id, 'qryId2:value30::content')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("tab2_add_sl_module", "//*[contains(@id, 'pc1:pcgt2:soc2::content')]");
        elements.put("tab2_add_i_to", "//*[contains(@id, 'pc1:pcgt2:tourOperadorId1::content')]");
        elements.put("tab2_add_lov_to", "//*[contains(@id, 'pc1:pcgt2:tourOperadorId1::lovIconId')]");
        elements.put("tab2_add_i_supplier", "//*[contains(@id, 'pc1:pcgt2:codProveId::content')]");
        elements.put("tab2_add_lov_supplier", "//*[contains(@id, 'pc1:pcgt2:codProveId::lovIconId')]");
        elements.put("tab2_add_i_sup_desc", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("tab2_add_i_fax", "//*[contains(@id, 'pc1:pcgt2:it8::content')]");
        elements.put("tab2_add_i_email", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        //QBE
        elements.put("tab2_qbe_sl_module", "//*[contains(@id, 'pc1:genaddr:soc3::content')]");
        elements.put("tab2_qbe_i_to_short_name", "//*[contains(@id, 'pc1_afr_genaddr_afr_c4::content')]");
        elements.put("tab2_qbe_i_supplier", "//*[contains(@id, 'pc1_afr_genaddr_afr_c2::content')]");
        elements.put("tab2_qbe_i_supplier_des", "//*[contains(@id, 'pc1_afr_genaddr_afr_c1::content')]");
        elements.put("tab2_qbe_i_fax", "//*[contains(@id, 'pc1_afr_genaddr_afr_c3::content')]");
        elements.put("tab2_qbe_i_email", "//*[contains(@id, 'pc1_afr_genaddr_afr_c6::content')]");
    }
}
