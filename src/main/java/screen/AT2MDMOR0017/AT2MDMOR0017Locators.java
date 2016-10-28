package screen.AT2MDMOR0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 27/10/2016.
 */
public class AT2MDMOR0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0017Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'PCGenericMenu5:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'PCGenericMenu5:dc_cmi0')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot22')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_report", "//*[contains(@id, 'pcgt2:codListadoId::content')]");
        elements.put("add_lov_report", "//*[contains(@id, 'pcgt2:codListadoId::lovIconId')]");
        elements.put("add_i_language", "//*[contains(@id, 'pcgt2:codIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:codIdiomaId::lovIconId')]");
        elements.put("add_i_order", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_business", "//*[contains(@id, 'pcgt2:agrDivisionId::content')]");
        elements.put("add_lov_business", "//*[contains(@id, 'pcgt2:agrDivisionId::lovIconId')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt2:codEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt2:codEmpId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt2:codOfiId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:codOfiId::lovIconId')]");
        elements.put("add_i_department", "//*[contains(@id, 'pcgt2:codDepartId::content')]");
        elements.put("add_lov_department", "//*[contains(@id, 'pcgt2:codDepartId::lovIconId')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_id_web", "//*[contains(@id, 'pcgt2:idWebId::content')]");
        elements.put("add_lov_id_web", "//*[contains(@id, 'pcgt2:idWebId::lovIconId')]");
        elements.put("add_i_notes", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_label", "//*[contains(@id, 'pcgt2:it2::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_report", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_report", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_language", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_language", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_order", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_business", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_business", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_e_description_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("search_i_department", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_department", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("search_i_id_web", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_lov_id_web", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("search_i_notes", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_label", "//*[contains(@id, 'qryId1:value110::content')]");
        //QBE
        elements.put("qbe_i_report", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_order", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_business", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_resId1c7::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_department", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_i_id_web", "//*[contains(@id, 'afr_resId1c11::content')]");
        elements.put("qbe_i_notes", "//*[contains(@id, 'afr_resId1c12::content')]");
    }
}