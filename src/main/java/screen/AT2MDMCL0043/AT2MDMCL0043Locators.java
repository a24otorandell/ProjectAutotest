package screen.AT2MDMCL0043;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 04/11/2016.
 */
public class AT2MDMCL0043Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0043Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE INCLUSIONS
         */
        //GENERALS
        elements.put("inclusions_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("inclusions_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("inclusions_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("inclusions_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("inclusions_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("inclusions_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("inclusions_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("inclusions_e_result", "//*[contains(@id, 'pc1:inslGP::db')]/table/tbody/tr[1]/td[1]");
        elements.put("inclusions_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("i_search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("i_search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("i_search_sl_service", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("i_search_i_applic", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("i_search_i_desactivate", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("i_search_i_advance", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("i_search_i_grace", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("i_search_i_to", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("i_search_lov_to", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("i_search_i_tdesc", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("i_search_i_agency", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("i_search_lov_agency", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("i_search_i_adesc", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("i_search_i_idweb", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("i_search_lov_idweb", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("i_search_i_webdesc", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("i_search_i_interface", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("i_search_lov_interface", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("i_search_i_interfacedesc", "//*[contains(@id, 'qryId1:value120::content')]");
        //ADD
        elements.put("i_add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("i_add_sl_service", "//*[contains(@id, 'pcgt3:soc3::content')]");
        elements.put("i_add_i_aplicc", "//*[contains(@id, 'pcgt3:id6::content')]");
        elements.put("i_add_i_desactivate", "//*[contains(@id, 'pcgt3:id5::content')]");
        elements.put("i_add_i_advanced", "//*[contains(@id, 'pcgt3:it24::content')]");
        elements.put("i_add_i_grace", "//*[contains(@id, 'pcgt3:it28::content')]");
        elements.put("i_add_i_to", "//*[contains(@id, 'pcgt3:ttooId::content')]");
        elements.put("i_add_lov_to", "//*[contains(@id, 'pcgt3:ttooId::lovIconId')]");
        elements.put("i_add_i_todesc", "//*[contains(@id, 'pcgt3:it27::content')]");
        elements.put("i_add_i_agency", "//*[contains(@id, 'pcgt3:codAgeb2bId::content')]");
        elements.put("i_add_lov_agency", "//*[contains(@id, 'codAgeb2bId::lovIconId')]");
        elements.put("i_add_i_adesc", "//*[contains(@id, 'pcgt3:it25::content')]");
        elements.put("i_add_i_idweb", "//*[contains(@id, 'pcgt3:idWebId::content')]");
        elements.put("i_add_lov_idweb", "//*[contains(@id, ':pc1:pcgt3:idWebId::lovIconId')]");
        elements.put("i_add_i_webdesc", "//*[contains(@id, 'pcgt3:it26::content')]");
        elements.put("i_add_i_interface", "//*[contains(@id, 'pcgt3:codInterfaceId::content')]");
        elements.put("i_add_lov_interface", "//*[contains(@id, 'pcgt3:codInterfaceId::lovIconId')]");
        elements.put("i_add_i_idesc", "//*[contains(@id, 'pcgt3:it23::content')]");
        //QBE
        elements.put("i_qbe_sl_service", "//*[contains(@id, 'inslGP:soc2::content')]");
        elements.put("i_qbe_i_aplicc", "//*[contains(@id, 'inslGP:id9::content')]");
        elements.put("i_qbe_i_desactivate", "//*[contains(@id, 'inslGP:id10::content')]");
        elements.put("i_qbe_i_advanced", "//*[contains(@id, 'inslGP_afr_c4::content')]");
        elements.put("i_qbe_i_grace", "//*[contains(@id, 'inslGP_afr_c1::content')]");
        elements.put("i_qbe_i_to", "//*[contains(@id, 'inslGP_afr_c7::content')]");
        elements.put("i_qbe_i_agency", "//*[contains(@id, 'inslGP_afr_c2::content')]");
        elements.put("i_qbe_i_idweb", "//*[contains(@id, 'inslGP_afr_c6::content')]");
        elements.put("i_qbe_i_interface", "//*[contains(@id, 'inslGP_afr_c8::content')]");
        /**
         * TABLE EXCLUSIONS
         */
        //GENERALS
        elements.put("exclusions_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("exclusions_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("exclusions_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("exclusions_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("exclusions_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("exclusions_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("exclusions_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("exclusions_e_result", "//*[contains(@id, 'pc2:exclGP::db')]/table/tbody/tr[1]/td[1]");
        elements.put("exclusions_e_records", "//*[contains(@id, 'pc2:ot4')]");
        //SEARCH
        elements.put("e_search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("e_search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("e_search_sl_service", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("e_search_i_applic", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("e_search_i_desactivate", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("e_search_i_to", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("e_search_lov_to", "//*[contains(@id, 'qryId2:value30::lovIconId')]");
        elements.put("e_search_i_tdesc", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("e_search_i_agency", "//*[contains(@id, 'qryId2:value50::content')]");
        elements.put("e_search_lov_agency", "//*[contains(@id, 'qryId2:value50::lovIconId')]");
        elements.put("e_search_i_adesc", "//*[contains(@id, 'qryId2:value60::content')]");
        elements.put("e_search_i_idweb", "//*[contains(@id, 'qryId2:value70::content')]");
        elements.put("e_search_lov_idweb", "//*[contains(@id, 'qryId2:value70::lovIconId')]");
        elements.put("e_search_i_webdesc", "//*[contains(@id, 'qryId2:value80::content')]");
        elements.put("e_search_i_interface", "//*[contains(@id, 'qryId2:value90::content')]");
        elements.put("e_search_lov_interface", "//*[contains(@id, 'qryId2:value90::lovIconId')]");
        elements.put("e_search_i_interfacedesc", "//*[contains(@id, 'qryId2:value100::content')]");
        //ADD
        elements.put("e_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("e_add_sl_service", "//*[contains(@id, 'pcgt1:soc4::content')]");
        elements.put("e_add_i_aplicc", "//*[contains(@id, 'pc2:pcgt1:id7::content')]");
        elements.put("e_add_i_desactivate", "//*[contains(@id, 'pc2:pcgt1:id8::content')]");
        elements.put("e_add_i_to", "//*[contains(@id, 'pc2:pcgt1:ttoo1Id::content')]");
        elements.put("e_add_lov_to", "//*[contains(@id, 'pc2:pcgt1:ttoo1Id::lovIconId')]");
        elements.put("e_add_i_todesc", "//*[contains(@id, 'pcgt1:it32::content')]");
        elements.put("e_add_i_agency", "//*[contains(@id, 'pcgt1:codAgeb2b1Id::content')]");
        elements.put("e_add_lov_agency", "//*[contains(@id, 'pcgt1:codAgeb2b1Id::lovIconId')]");
        elements.put("e_add_i_adesc", "//*[contains(@id, 'pcgt1:it31::content')]");
        elements.put("e_add_i_idweb", "//*[contains(@id, 'pc2:pcgt1:idWeb1Id::content')]");
        elements.put("e_add_lov_idweb", "//*[contains(@id, 'pcgt1:idWeb1Id::lovIconId')]");
        elements.put("e_add_i_webdesc", "//*[contains(@id, 'pcgt1:it30::content')]");
        elements.put("e_add_i_interface", "//*[contains(@id, 'pcgt1:codInterface1Id::content')]");
        elements.put("e_add_lov_interface", "//*[contains(@id, 'pcgt1:codInterface1Id::lovIconId')]");
        elements.put("e_add_i_ides", "//*[contains(@id, 'pcgt1:it29::content')]");
        //QBE
        elements.put("e_qbe_sl_service", "//*[contains(@id, 'exclGP:soc6::content')]");
        elements.put("e_qbe_i_aplicc", "//*[contains(@id, 'exclGP:id3::content')]");
        elements.put("e_qbe_i_desactivate", "//*[contains(@id, 'exclGP:id4::content')]");
        elements.put("e_qbe_i_to", "//*[contains(@id, 'exclGP_afr_c13::content')]");
        elements.put("e_qbe_i_agency", "//*[contains(@id, 'exclGP_afr_c16::content')]");
        elements.put("e_qbe_i_idweb", "//*[contains(@id, 'exclGP_afr_c14::content')]");
        elements.put("e_qbe_i_interface", "//*[contains(@id, 'exclGP_afr_c12::content')]");
    }
}
