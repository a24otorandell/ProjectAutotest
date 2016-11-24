package screen.AT2MDMRM0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 24/11/2016.
 */
public class AT2MDMRM0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0001Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE CLASSIFICATION
         */
        //GENERALS
        //elements.put("company_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("classif_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("classif_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("classif_b_actions", "//*[contains(@id, 'pcgm4:dc_m1')]");
        elements.put("classif_b_actions_b_audit_data", "//*[contains(@id, 'pcgm4:dc_cmi0')]/td[2]");
        elements.put("classif_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("classif_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("classif_e_result", "//*[contains(@id, 'pc1:coCls::db')]/table/tbody/tr[1]/td[1]");
        elements.put("classif_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'value00::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'value10::content')]");
        elements.put("search_sl_distribution", "//*[contains(@id, 'value20::content')]");
        elements.put("search_ck_offer", "//*[contains(@id, 'value30::content')]");
        elements.put("search_ck_enters", "//*[contains(@id, 'value40::content')]");
        elements.put("search_ck_active", "//*[contains(@id, 'value50::content')]");
        elements.put("search_ck_restrictive", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_priority", "//*[contains(@id, 'value70::content')]");
        elements.put("search_sl_application_type", "//*[contains(@id, 'value80::content')]");
        elements.put("search_ck_opaque", "//*[contains(@id, 'value90::content')]");
        elements.put("search_ck_pep", "//*[contains(@id, 'value100::content')]");
        elements.put("search_ck_liberate", "//*[contains(@id, 'value110::content')]");
        elements.put("search_sl_classification", "//*[contains(@id, 'value120::content')]");
        elements.put("search_ck_nrf", "//*[contains(@id, 'value130::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt2:soc2::content')]");
        elements.put("add_sl_distribution", "//*[contains(@id, 'pcgt2:soc17::content')]");
        elements.put("add_ck_offer", "//*[contains(@id, 'pcgt2:sbc8::content')]");
        elements.put("add_ck_enters", "//*[contains(@id, 'sbc9::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pcgt2:sbc10::content')]");
        elements.put("add_ck_restrictive", "//*[contains(@id, 'pcgt2:sbc12::content')]");
        elements.put("add_i_priority", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_sl_application_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_ck_opaque", "//*[contains(@id, 'pcgt2:sbc14::content')]");
        elements.put("add_ck_pep", "//*[contains(@id, 'pcgt2:sbc13::content')]");
        elements.put("add_ck_liberate", "//*[contains(@id, 'pcgt2:sbc11::content')]");
        elements.put("add_ck_nrf", "//*[contains(@id, 'pcgt2:sbc16::content')]");
        elements.put("add_sl_classification", "//*[contains(@id, 'pcgt2:soc18::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_coCls_afr_c10::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'coCls:selectOneChoice1::content')]");
        elements.put("qbe_sl_distribution", "//*[contains(@id, 'coCls:selectOneChoice2::content')]");
        elements.put("qbe_sl_offer", "//*[contains(@id, 'coCls:soc11::content')]");
        elements.put("qbe_sl_enters", "//*[contains(@id, 'coCls:soc10::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'coCls:soc5::content')]");
        elements.put("qbe_sl_classification", "//*[contains(@id, 'coCls:selecOneChoise10::content')]");
        elements.put("qbe_sl_restrictive", "//*[contains(@id, 'coCls:soc6::content')]");
        elements.put("qbe_i_priority", "//*[contains(@id, 'afr_coCls_afr_c8::content')]");
        elements.put("qbe_sl_application_type", "//*[contains(@id, 'coCls:soc7::content')]");
        elements.put("qbe_sl_opaque", "//*[contains(@id, 'coCls:soc15::content')]");
        elements.put("qbe_sl_pep", "//*[contains(@id, 'coCls:soc8::content')]");
        elements.put("qbe_sl_liberate", "//*[contains(@id, 'coCls:soc9::content)]");
        elements.put("qbe_sl_nrf", "//*[contains(@id, 'coCls:selectOneChoice3::content')]");
        /**
         * TABLE INCOMPATIBILITY
         */
        //GENERALS
        elements.put("incompa_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("incompa_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("incompa_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("incompa_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("incompa_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("incompa_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("incompa_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("incompa_e_result", "//*[contains(@id, 'pc2:ClsInc::db')]/table/tbody/tr[1]/td[1]");
        elements.put("incompa_e_records", "//*[contains(@id, 'pc2:ot4')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_code2", "//*[contains(@id, 'pcgt1:codClasifIncomId::content')]");
        elements.put("add_lov_code", "//*[contains(@id, 'pcgt1:codClasifIncomId::lovIconId')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt1:soc3::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, '_afr_ClsInc_afr_c13::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'ClsInc:soc12::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_afr_ClsInc_afr_c14::content')]");
        /**
         * TABLE MULTI-LANGUAGE
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("multi_b_actions", "//*[contains(@id, 'pcgm3:dc_m1')]");
        elements.put("multi_b_actions_b_audit_data", "//*[contains(@id, 'pcgm3:dc_cmi0')]/td[2]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc3:ClsId::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc3:t6::eoi')]");
        //ADD
        elements.put("add_b_save3", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_language_code", "//*[contains(@id, 'pcgt3:codIdiId::content')]");
        elements.put("add_lov_language_code", "//*[contains(@id, 'pcgt3:codIdiId::lovIconId')]");
        elements.put("add_i_language_desc", "//*[contains(@id, 'pcgt3:it6::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'pcgt3:it5::content')]");
        //QBE
        elements.put("qbe_i_language_code", "//*[contains(@id, '_pc3_afr_ClsId_afr_c16::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, '_pc3_afr_ClsId_afr_c15::content')]");
        elements.put("qbe_i_remarks", "//*[contains(@id, '_pc3_afr_ClsId_afr_c17::content')]");
        /**
         * TABLE INTERFACE
         */
        elements.put("interface_b_add", "//*[contains(@id, 'pcgt4:boton_add')]");
        elements.put("interface_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
        elements.put("interface_b_edit", "//*[contains(@id, 'pcgt4:boton_edit')]");
        elements.put("interface_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("interface_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("interface_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]");
        elements.put("interface_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]");
        elements.put("interface_e_result", "//*[contains(@id, 'pc4:CoIntr::db')]/table/tbody/tr[1]/td[1]");
        elements.put("interface_e_records", "//*[contains(@id, 'pc4:ot11')]");
        //ADD
        elements.put("add_b_save4", "//*[contains(@id, 'pcgt4:btn_commitExit')]");
        elements.put("add_i_interface", "//*[contains(@id, 'codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'codInterfaceId::lovIconId')]");
        elements.put("add_i_interface_desc", "//*[contains(@id, 'pcgt4:it7::content')]");
        elements.put("add_i_order", "//*[contains(@id, 'pcgt4:it8::content')]");
        elements.put("add_i_booking", "//*[contains(@id, 'pcgt4:codTipoResId::content')]");
        elements.put("add_lov_booking", "//*[contains(@id, 'pcgt4:codTipoResId::lovIconId')]");
        elements.put("add_i_booking_desc", "//*[contains(@id, 'pcgt4:it9::content')]");
        //QBE
        elements.put("qbe_i_interface", "//*[contains(@id, '_pc4_afr_CoIntr_afr_c25::content')]");
        elements.put("qbe_i_interface_desc", "//*[contains(@id, '_pc4_afr_CoIntr_afr_c20::content')]");
        elements.put("qbe_i_order", "//*[contains(@id, '_pc4_afr_CoIntr_afr_c19::content')]");
        elements.put("qbe_i_booking", "//*[contains(@id, '_pc4_afr_CoIntr_afr_c18::content')]");
        elements.put("qbe_i_booking_desc", "//*[contains(@id, '_pc4_afr_CoIntr_afr_c24::content')]");
    }
}
