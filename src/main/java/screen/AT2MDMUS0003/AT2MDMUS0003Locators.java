package screen.AT2MDMUS0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2MDMUS0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE USERS
         */
        //TAB
        elements.put("users_tab", "//*[contains(@id, '1:tabIndex::disclosureAnchor')]");
        //GENERALS
        elements.put("users_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("users_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("users_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("users_b_edit2", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("users_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("users_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi0')]/td[2]");
        elements.put("users_b_actions_b_delete", "//*[contains(@id, 'pdm2:dc_cmi3')]/td[2]");
        elements.put("users_b_actions_b_print", "//*[contains(@id, 'pdm2:dc_cmi2')]/td[2]");
        elements.put("users_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("users_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("users_e_result", "//*[contains(@id, 'pc1:usur_T::db')]/table/tbody/tr[1]/td[1]");
        elements.put("users_e_records", "//*[contains(@id, 'pc1:usrSrchCnt')]");
        elements.put("users_b_yes", "//*[contains(@id, 'dialog4::yes')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_business", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_business", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_surname_01", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_surname_02", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_sl_active", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_deactivation", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_name1", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_i_surname1", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_i_surname2", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_sl_assign", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("search_i_email", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("search_i_intranet_user", "//*[contains(@id, 'qryId1:value180::content')]");
        elements.put("search_i_lang", "//*[contains(@id, 'qryId1:value190::content')]");
        elements.put("search_lov_lang", "//*[contains(@id, 'qryId1:value190::lovIconId')]");
        elements.put("search_sl_blocking", "//*[contains(@id, 'qryId1:value200::content')]");
        elements.put("search_i_unblocking", "//*[contains(@id, 'qryId1:value210::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:boton_commit')]");
        elements.put("add_i_user", "//*[contains(@id, '1:it12::content')]");
        elements.put("add_i_department", "//*[contains(@id, 'gdofGdepCodDepartId::content')]");
        elements.put("add_lov_department", "//*[contains(@id, 'gdofGdepCodDepartId::lovIconId')]");
        elements.put("add_i_department_des", "//*[contains(@id, '1:it19::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'it11::content')]");
        elements.put("add_i_name1", "//*[contains(@id, 'it2::content')]");
        elements.put("add_i_email", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_org_role", "//*[contains(@id, 'idRefUserTransId::content')]");
        elements.put("add_lov_org_role", "//*[contains(@id, 'idRefUserTransId::lovIconId')]");
        elements.put("add_i_org_desc", "//*[contains(@id, 'it16::content')]");
        elements.put("add_i_company", "//*[contains(@id, 'gofiGempCodEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'gofiGempCodEmpId::lovIconId')]");
        elements.put("add_i_short_name", "//*[contains(@id, '1:it3::content')]");
        elements.put("add_i_business", "//*[contains(@id, 'negocioId::content')]");
        elements.put("add_lov_business", "//*[contains(@id, 'negocioId::lovIconId')]");
        elements.put("add_i_surname_01", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_surname1", "//*[contains(@id, 'it1::content')]");
        elements.put("add_i_intranet_user", "//*[contains(@id, 'it10::content')]");
        elements.put("add_sl_blocking", "//*[contains(@id, 'soc1::content')]");
        elements.put("add_i_reference_user", "//*[contains(@id, 'idRefUserTransId::content')]");
        elements.put("add_lov_reference_user", "//*[contains(@id, 'idRefUserTransId::lovIconId')]");
        elements.put("add_i_reference_desc", "//*[contains(@id, 'it18::content')]");
        elements.put("add_i_office", "//*[contains(@id, 'gofiCodOfiId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'gofiCodOfiId::lovIconId')]");
        elements.put("add_i_office_des", "//*[contains(@id, 'it7::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'sbc2::content')]");
        elements.put("add_i_surname_02", "//*[contains(@id, 'it4::content')]");
        elements.put("add_i_surname2", "//*[contains(@id, 'it9::content')]");
        elements.put("add_i_lang", "//*[contains(@id, 'gflIdiomaId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'gflIdiomaId::lovIconId')]");
        elements.put("add_ck_assign", "//*[contains(@id, 'sbc1::content')]");
        elements.put("add_i_unblocking", "//*[contains(@id, 'it8::content')]");
        //QBE
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_usur_T_afr_c4::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_usur_T_afr_c16::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'pc1_afr_usur_T_afr_c22::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc1_afr_usur_T_afr_c18::content')]");
        elements.put("qbe_i_office_des", "//*[contains(@id, 'pc1_afr_usur_T_afr_c21::content')]");
        elements.put("qbe_i_department", "//*[contains(@id, 'pc1_afr_usur_T_afr_c12::content')]");
        elements.put("qbe_i_department_des", "//*[contains(@id, 'pc1_afr_usur_T_afr_c7::content')]");
        elements.put("qbe_i_business", "//*[contains(@id, 'pc1_afr_usur_T_afr_c8::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc1_afr_usur_T_afr_c2::content')]");
        elements.put("qbe_i_surname_01", "//*[contains(@id, 'pc1_afr_usur_T_afr_c14::content')]");
        elements.put("qbe_i_surname_02", "//*[contains(@id, 'pc1_afr_usur_T_afr_c20::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:usur_T:soc7::content')]");
        elements.put("qbe_i_dest_date", "//*[contains(@id, 'usur_T:id1::content')]");
        elements.put("qbe_i_name1", "//*[contains(@id, 'pc1_afr_usur_T_afr_c13::content')]");
        elements.put("qbe_i_surname1", "//*[contains(@id, 'pc1_afr_usur_T_afr_c17::content')]");
        elements.put("qbe_i_surname2", "//*[contains(@id, 'pc1_afr_usur_T_afr_c15::content')]");
        elements.put("qbe_sl_assing", "//*[contains(@id, 'selectOneChoice1::content')]");
        elements.put("qbe_i_email", "//*[contains(@id, 'pc1_afr_usur_T_afr_c11::content')]");
        elements.put("qbe_i_intranet_user", "//*[contains(@id, 'pc1_afr_usur_T_afr_c6::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'pc1_afr_usur_T_afr_c9::content')]");
        elements.put("qbe_sl_blocking", "//*[contains(@id, 'pc1:usur_T:selectOneChoice2::content')]");
        elements.put("qbe_i_unblocking", "//*[contains(@id, 'pc1_afr_usur_T_afr_c19::content')]");
        //PRINT
        elements.put("print_b_print", "//*[contains(@id, 'd2::ok')]");
        elements.put("print_i_company", "//*[contains(@id, 'empresaId::content')]");
        elements.put("print_lov_company", "//*[contains(@id, 'empresaId::lovIconId')]");
        elements.put("print_i_office", "//*[contains(@id, 'oficinaId::content')]");
        elements.put("print_lov_office", "//*[contains(@id, 'oficinaId::lovIconId')]");
        elements.put("print_sl_status", "//*[contains(@id, 'soc2::content')]");

        /**
         * TAB OFFICE  TABLE OFFICE
         */
        //TAB
        elements.put("offices_subtab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERAL
        elements.put("office_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("office_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("office_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("office_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("office_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("office_e_result", "//*[contains(@id, 'pc2:oficTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("office_e_records", "//*[contains(@id, 'pc2:ofcRcCount')]");
        elements.put("office_b_yes", "//*[contains(@id, 'pc1:delconfpopup::yes')]");
        //ADD
        elements.put("add_b_save_o", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("office_add_i_company", "//*[contains(@id, 'empresaTransId::content')]");
        elements.put("office_add_lov_company", "//*[contains(@id, 'empresaTransId::lovIconId')]");
        elements.put("office_add_i_office", "//*[contains(@id, 'oficinaTransId::content')]");
        elements.put("office_add_lov_office", "//*[contains(@id, 'oficinaTransId::lovIconId')]");
        elements.put("office_add_e_office_des", "//*[contains(@id, 'pc2:pcgt3:it17::content')]");
        elements.put("office_add_i_mail_address", "//*[contains(@id, 'it15::content')]");
        elements.put("office_add_i_language", "//*[contains(@id, 'userLanguageId::content')]");
        elements.put("office_add_lov_language", "//*[contains(@id, 'userLanguageId::lovIconId')]");
        //QBE
        elements.put("office_qbe_i_company", "//*[contains(@id, '_oficTb_afr_c7::content')]");
        elements.put("office_qbe_i_office", "//*[contains(@id, '_oficTb_afr_c10::content')]");
        elements.put("office_qbe_i_office_des", "//*[contains(@id, 'pc2_afr_oficTb_afr_c9::content')]");
        elements.put("office_qbe_i_mail_address", "//*[contains(@id, '_oficTb_afr_c11::content')]");
        elements.put("office_qbe_i_language", "//*[contains(@id, '_oficTb_afr_c8::content')]");
        /**
         * TAB APPLICATIONS BY USER / BUSINESS GROUPING - TABLE APPLICATIONS BY USER
         */
        //TAB
        elements.put("apps_subtab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERAL
        elements.put("app_b_add", "//*[contains(@id, 'pcgtid0:boton_add')]");
        elements.put("app_b_delete", "//*[contains(@id, 'pcgtid0:boton_remove')]");
        elements.put("app_b_edit", "//*[contains(@id, 'pcgtid0:boton_edit')]");
        elements.put("app_b_qbe", "//*[contains(@id, 'pcid0:_qbeTbr')]");
        elements.put("app_b_detach", "//*[contains(@id, 'pcid0:_dchTbr')]/a");
        elements.put("app_e_result", "//*[contains(@id, 'pcid0:appUsr::db')]/table/tbody/tr[1]/td[1]");
        elements.put("app_e_records", "//*[contains(@id, 'pcid0:ot1id0')]");
        elements.put("app_b_yes", "//*[contains(@id, 'pc1:delconfpopup::yes')]");
        //ADD
        elements.put("add_b_save_aa", "//*[contains(@id, 'pcgtid0:btn_commitExit')]");
        elements.put("app_add_i_application_code", "//*[contains(@id, 'gaplCodAplicacionId::content')]");
        elements.put("app_add_lov_application_code", "//*[contains(@id, 'gaplCodAplicacionId::lovIconId')]");
        elements.put("app_add_e_user_position", "//*[contains(@id, 'pcid0:pcgtid0:it14::content')]");
        elements.put("app_add_ck_pertain", "//*[contains(@id, 'pcid0:pcgtid0:sbc4::content')]");
        //QBE
        elements.put("app_qbe_i_application_code", "//*[contains(@id, 'pcid0_afr_appUsr_afr_c2::content')]");
        elements.put("app_qbe_i_user_position", "//*[contains(@id, '_appUsr_afr_c3::content')]");
        elements.put("app_qbe_sl_pertain", "//*[contains(@id, 'appUsr:socid0::content')]");
        /**
         * TAB APPLICATIONS BY USER / BUSINESS GROUPING - TABLE BUSSINESS GROUP
         */
        elements.put("bussiness_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("bussiness_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("bussiness_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("bussiness_b_actions", "//*[contains(@id, 'pcgmid0:dc_m1')]");
        elements.put("bussiness_b_actions_b_audit_data", "//*[contains(@id, 'pcgmid0:dc_cmi0')]/td[2]");
        elements.put("bussiness_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("bussiness_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("bussiness_e_result", "//*[contains(@id, 'pc1:busGrp::db')]/table/tbody/tr[1]/td[1]");
        elements.put("bussiness_e_records", "//*[contains(@id, 'pc1:ot4')]");
        elements.put("bussiness_b_yes", "//*[contains(@id, 'pc1:delconfpopup::yes')]");
        //ADD
        elements.put("add_b_save_bb", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("business_add_i_grouping_code", "//*[contains(@id, 'codAgrdivId::content')]");
        elements.put("business_add_grouping_code_b_lov", "//*[contains(@id, 'codAgrdivId::lovIconId')]");
        elements.put("business_add_ck_default", "//*[contains(@id, 'pc1:pcgt1:sbc6::content')]");
        //QBE
        elements.put("business_qbe_i_grouping_code", "//*[contains(@id, '_busGrp_afr_c5::content')]");
        elements.put("business_qbe_sl_default", "//*[contains(@id, 'busGrp:soc3::content')]");
    }
}
