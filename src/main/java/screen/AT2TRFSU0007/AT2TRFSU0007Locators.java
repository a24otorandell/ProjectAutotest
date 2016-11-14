package screen.AT2TRFSU0007;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 12/09/2016.
 */
public class AT2TRFSU0007Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0007Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("vehicles_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("vehicles_ad_check_box_active", "//*[contains(@id, 'pcgt1:sbc4::content')]");
        elements.put("vehicles_ad_vehicle_type", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("vehicles_ad_vehicle_type_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("vehicles_ad_lov_group", "//*[contains(@id, 'grveCodGrupoVehicId::lovIconId')]");
        elements.put("vehicles_ad_i_group", "//*[contains(@id, 'grveCodGrupoVehicId::content')]");
        elements.put("vehicles_ad_i_group_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("vehicles_ad_check_box_preferred", "//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("vehicles_ad_i_capacity", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("vehicles_ad_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //SEARCH

        elements.put("vehicles_se_select_text_active", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value00::content')]");
        elements.put("vehicles_se_i_vehicle_type", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value10::content')]");
        elements.put("vehicles_se_i_vehicle_type_description", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value20::content')]");
        elements.put("vehicles_se_i_group", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value30::content')]");
        elements.put("vehicles_se_i_descgroupvehic", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value40::content')]");
        elements.put("vehicles_se_select_text_preferred", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value50::content')]");
        elements.put("vehicles_se_i_capacity", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup:value60::content')]");
        elements.put("vehicles_se_b_search", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup::search')]");
        elements.put("vehicles_se_result", "//*[contains(@id, 'tablaVehiclesTypesSetup::db')]/table/tbody/tr[1]/td[1]");
        elements.put("vehicles_se_b_reset", "//*[contains(@id, 'advanceSearchVehiclesTypesSetup::reset')]");

        //EDIT

        elements.put("vehicles_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("vehicles_ed_check_box_active", "//*[contains(@id, 'pcgt1:sbc4::content')]");
        elements.put("vehicles_ed_vehicle_type", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("vehicles_ed_vehicle_type_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("vehicles_ed_lov_group", "//*[contains(@id, 'grveCodGrupoVehicId::lovIconId')]");
        elements.put("vehicles_ed_i_group", "//*[contains(@id, 'pcgt1:grveCodGrupoVehicId::content')]");
        elements.put("vehicles_ed_i_group_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("vehicles_ed_check_box_preferred", "//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("vehicles_ed_i_capacity", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("vehicles_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //QBE
        elements.put("vehicles_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("vehicles_qbe_sl_active", "//*[contains(@id, 'pc1:tablaVehiclesTypesSetup:soc5::content')]");
        elements.put("vehicles_qbe_i_vehicle_type", "//*[contains(@id, 'afr_tablaVehiclesTypesSetup_afr_c1::content')]");
        elements.put("vehicles_qbe_i_vehicle_type_description", "//*[contains(@id, 'afr_tablaVehiclesTypesSetup_afr_c3::content')]");
        elements.put("vehicles_qbe_i_group", "//*[contains(@id, 'afr_tablaVehiclesTypesSetup_afr_c4::content')]");
        elements.put("vehicles_qbe_i_desgroupvehic", "//*[contains(@id, 'afr_tablaVehiclesTypesSetup_afr_c6::content')]");
        elements.put("vehicles_qbe_preferred", "//*[contains(@id, 'tablaVehiclesTypesSetup:soc6::content')]");
        elements.put("vehicles_qbe_i_capacity", "//*[contains(@id, 'afr_tablaVehiclesTypesSetup_afr_c5::content')]");

        //OTHER ACTIONS

        elements.put("vehicles_actions_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("vehicles_actions_b_auditdata", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("vehicles_actions_b_ok", "//*[contains(@id, 'd2::close')]");
        elements.put("vehicles_dtacj_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("vehicles_delete_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("vehicles_delete_b_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        elements.put("vehicles_delete_records", "//*[contains(@id, 'pc1:ot2')]");

        //Grouping vehicles

        //add

        elements.put("grouping_add_b_add","//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("grouping_add_check_box_active","//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("grouping_add_i_vehicles_code","//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("grouping_add_i_description","//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("grouping_add_b_save","//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("grouping_e_routes_by_default","//*[contains(@id, 'pt1:dyntdc:dynTabsPane:1:tabIndex::disclosureAnchor')]");
    }

}
