package screen.AT2MDMDE0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 13/10/2016.
 */
public class AT2MDMDE0011Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("destination_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("destination_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("destination_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("destination_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("destination_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("destination_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("destination_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("destination_e_result", "//*[contains(@id, 'pc1:reTGeDe::db')]/table/tbody/tr[1]/td[1]");
        elements.put("destination_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_destination", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_sl_type_zone", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_zone_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_zone_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        //QBE
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_destination_description", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'reTGeDe:it4::content')]");
        elements.put("qbe_i_office_description", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_type_zone", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_zone_code", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_zone_description", "//*[contains(@id, 'afr_c2::content')]");
        //ADD
        elements.put("add_i_destination", "//*[contains(@id, 'pcgt2:codDestinoId::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'pcgt2:codDestinoId::lovIconId')]");
        elements.put("add_i_destination_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt2:codOfiId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:codOfiId::lovIconId')]");
        elements.put("add_i_office_description", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_sl_type_of_zone", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_i_zone_code", "//*[contains(@id, 'pcgt2:codZonaId::content')]");
        elements.put("add_lov_zone_code", "//*[contains(@id, 'pcgt2:codZonaId::lovIconId')]");
        elements.put("add_i_zone_description", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //MODIFY
        elements.put("modify_i_destination", "//*[contains(@id, 'pcgt2:codDestinoId::content')]");
        elements.put("modify_lov_destination", "//*[contains(@id, 'pcgt2:codDestinoId::lovIconId')]");
        elements.put("modify_destination_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("modify_i_office", "//*[contains(@id, 'pcgt2:codOfiId::content')]");
        elements.put("modify_lov_office", "//*[contains(@id, 'pcgt2:codOfiId::lovIconId')]");
        elements.put("modify_i_office_description", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("modify_sl_type_of_zone", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("modify_i_zone_code", "//*[contains(@id, 'pcgt2:codZonaId::content')]");
        elements.put("modify_lov_zone_code", "//*[contains(@id, 'pcgt2:codZonaId::lovIconId')]");
        elements.put("modify_i_zone_description", "//*[contains(@id, 'pcgt2:it2::content')]");
    }
}
