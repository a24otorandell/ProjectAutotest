package screen.AT2MDMCL0042;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMCL0042Locators {Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0042Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("comercial_b_add", "//*[contains(@id, 'pcgtid0:boton_add')]");
        elements.put("comercial_b_delete", "//*[contains(@id, 'pcgtid0:boton_remove')]");
        elements.put("comercial_b_edit", "//*[contains(@id, 'pcgtid0:boton_edit')]");
        elements.put("comercial_b_actions", "//*[contains(@id, 'pcgmid0:dc_m1')]");
        elements.put("comercial_b_actions_b_audit_data", "//*[contains(@id, 'pcgmid0:dc_cmi0')]/td[2]");
        elements.put("comercial_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("comercial_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("comercial_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("comercial_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_ck_current", "//*[contains(@id, 'value00::content')]");
        elements.put("search_ck_actives", "//*[contains(@id, 'value10::content')]");
        elements.put("search_i_booking_from", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_booking_to", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_application_from", "//*[contains(@id, 'value40::content')]");
        elements.put("search_i_application_to", "//*[contains(@id, 'value50::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgtid0:btn_commitExit')]");
        elements.put("add_lov_prod", "//*[contains(@id, 'pcgtid0:codTipoProdId::lovIconId')]");
        elements.put("add_i_prod", "//*[contains(@id, 'pcgtid0:codTipoProdId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgtid0:codInterfaceId::lovIconId')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgtid0:codInterfaceId::content')]");
        elements.put("add_i_application_from", "//*[contains(@id, 'pcgtid0:id7::content')]");
        elements.put("add_i_application_to", "//*[contains(@id, 'pcgtid0:id6::content')]");
        elements.put("add_i_booking_from", "//*[contains(@id, 'pcgtid0:id8::content')]");
        elements.put("add_i_booking_to", "//*[contains(@id, 'pcgtid0:id5::content')]");
        elements.put("add_lov_invoicing", "//*[contains(@id, 'pcgtid0:codEmpfac1Id::lovIconId')]");
        elements.put("add_i_invoicing", "//*[contains(@id, 'pcgtid0:codEmpfac1Id::content')]");
        elements.put("add_lov_client", "//*[contains(@id, 'pcgtid0:nomTtoo1Id::lovIconId')]");
        elements.put("add_i_client", "//*[contains(@id, 'pcgtid0:nomTtoo1Id::content')]");
        elements.put("add_lov_group", "//*[contains(@id, 'pcgtid0:codGrupoId::lovIconId')]");
        elements.put("add_i_group", "//*[contains(@id, 'pcgtid0:codGrupoId::content')]");
        elements.put("add_lov_chain", "//*[contains(@id, 'pcgtid0:codCadenaId::lovIconId')]");
        elements.put("add_i_chain", "//*[contains(@id, 'pcgtid0:codCadenaId::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'pcgtid0:codDestinoId::lovIconId')]");
        elements.put("add_i_destination", "//*[contains(@id, 'pcgtid0:codDestinoId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgtid0:codEmp1Id::lovIconId')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgtid0:codEmp1Id::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgtid0:codOfi1Id::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgtid0:codOfi1Id::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pc1:pcgtid0:soc1::content')]");
        elements.put("add_lov_service", "//*[contains(@id, 'pcgtid0:codSerotrId::lovIconId')]");
        elements.put("add_i_service", "//*[contains(@id, 'pcgtid0:codSerotrId::content')]");
        elements.put("add_lov_modality", "//*[contains(@id, 'pcgtid0:codModotrId::lovIconId')]");
        elements.put("add_i_modality", "//*[contains(@id, 'pcgtid0:codModotrId::content')]");
        elements.put("add_i_commission", "//*[contains(@id, 'pcgtid0:it8::content')]");
        elements.put("add_i_rappel", "//*[contains(@id, 'pcgtid0:it2::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'pcgtid0:it7::content')]");
        //QBE
        elements.put("qbe_i_prod", "//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_c16::content')]");
        elements.put("qbe_i_application_from", "//*[contains(@id, 'id4::content')]");
        elements.put("qbe_i_application_to", "//*[contains(@id, 'id1::content')]");
        elements.put("qbe_i_booking_from", "//*[contains(@id, 'id2::content')]");
        elements.put("qbe_i_booking_to", "//*[contains(@id, 'id3::content')]");
        elements.put("qbe_i_invoicing", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_client", "//*[contains(@id, 'afr_c15::content')]");
        elements.put("qbe_i_group", "//*[contains(@id, 'afr_c18::content')]");
        elements.put("qbe_i_chain", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'selectOneChoice2::content')]");
        elements.put("qbe_i_service", "//*[contains(@id, 'afr_c11::content')]");
        elements.put("qbe_i_modality", "//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_commission", "//*[contains(@id, 'afr_c19::content')]");
        elements.put("qbe_i_rappel", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'afr_c12::content')]");
    }

}
