package screen.AT2TRFSU0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lchacartegui on 02/09/2016.
 */
public class AT2TRFSU0004Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0004Locators(String environment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    private void setElements() {


        // SEARCH //
        elements.put("search_b_search", "//*[contains(@id, 'queryDriver::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'queryDriver::reset')]");
        elements.put("search_e_result", "//*[contains(@id, 'pc1:tablaDrivers::db')]/table/tbody/tr");
        elements.put("search_e_no_result", "//*[contains(@id, 'pc1:tablaDrivers::db')]");
        elements.put("search_n_records", "//*[contains(@id, 'pc1:ot20')]");

        elements.put("serach_sel_active", "//*[contains(@id, 'queryDriver:value00::content')]");

        elements.put("search_i_supplier", "//*[contains(@id, 'value10::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'value10::lovIconId')]");
        elements.put("search_lov_supplier_i_supplier", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_language", "//*[contains(@id, 'value30::content')]");
        elements.put("search_lov_language", "//*[contains(@id, 'value30::lovIconId')]");
        elements.put("search_lov_language_i_codIdioma", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_incoming_driver_code", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_first_name", "//*[contains(@id, 'value70::content')]");
        elements.put("search_i_last_name", "//*[contains(@id, 'value80::content')]");
        elements.put("search_i_birthday_date", "//*[contains(@id, 'value90::content')]");
        elements.put("search_i_driver_license_date", "//*[contains(@id, 'value100::content')]");
        elements.put("search_i_driver_id", "//*[contains(@id, 'value110::content')]");
        elements.put("search_i_passport", "//*[contains(@id, 'value120::content')]");

        elements.put("search_i_country", "//*[contains(@id, 'value130::content')]");
        elements.put("search_lov_country", "//*[contains(@id, 'value130::lovIconId')]");
        elements.put("search_lov_country_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_cancellation_date", "//*[contains(@id, 'value140::content')]");
        elements.put("search_i_remarks", "//*[contains(@id, 'value150::content')]");
        elements.put("search_i_coun_des", "//*[contains(@id, 'value160::content')]");

        // ADD/EDIT //
        elements.put("add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("add_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        elements.put("add_cb_active", "//*[contains(@id, 'sbc1::content')]");

        elements.put("add_i_supplier", "//*[contains(@id, 'nomCortoId::content')]");
        elements.put("add_lov_supplier", "//*[contains(@id, 'pc1:pcgt1:nomCortoId::lovIconId')]");
        elements.put("add_lov_supplier_i_supplier", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("add_e_supplier_des", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");

        elements.put("add_i_language", "//*[contains(@id, 'pc1:pcgt1:codIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pc1:pcgt1:codIdiomaId::lovIconId')]");
        elements.put("add_lov_language_i_codIdioma", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("add_e_language_des", "//*[contains(@id, 'pc1:pcgt1:it10::content')]");

        elements.put("add_i_incoming_driver_code", "//*[contains(@id, 'it7::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'it11::content')]");
        elements.put("add_i_first_name", "//*[contains(@id, 'it8::content')]");
        elements.put("add_i_last_name", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_birthday_date", "//*[contains(@id, 'id3::content')]");
        elements.put("add_i_driver_license_date", "//*[contains(@id, 'id2::content')]");
        elements.put("add_i_driver_id", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_passport", "//*[contains(@id, 'it9::content')]");

        elements.put("add_i_country", "//*[contains(@id, 'pc1:pcgt1:codPaisId::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'pc1:pcgt1:codPaisId::lovIconId')]");
        elements.put("add_lov_country_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("add_e_country_des", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");

        elements.put("add_i_cancellation_date", "//*[contains(@id, 'id1::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'it4::content')]");

        //QBE //
        elements.put("qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("qbe_sel_active", "//*[contains(@id, 'pc1:tablaDrivers:soc1::content')]");
        elements.put("qbe_i_supplier", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c30::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_ReTGeChoferesVONomComercialCol::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c29::content')]");
        elements.put("qbe_i_language_des", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c31::content')]");
        elements.put("qbe_i_incoming_driver_code", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c32::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c8::content')]");
        elements.put("qbe_i_first_name", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c34::content')]");
        elements.put("qbe_i_last_name", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c33::content')]");
        elements.put("qbe_i_birthday_date", "//*[contains(@id, 'pc1:tablaDrivers:id4::content')]");
        elements.put("qbe_i_driver_license_date", "//*[contains(@id, 'pc1:tablaDrivers:id6::content')]");
        elements.put("qbe_i_driver_id", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c38::content')]");
        elements.put("qbe_i_passport", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c41::content')]");
        elements.put("qbe_i_country", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c35::content')]");
        elements.put("qbe_i_cancellation_date", "//*[contains(@id, 'pc1:tablaDrivers:id5::content')]");
        elements.put("qbe_i_remarks", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c28::content')]");
        elements.put("qbe_i_coun_des", "//*[contains(@id, 'pc1_afr_tablaDrivers_afr_c40::content')]");
        //Para hacer zoom en qbe si es necesario
        elements.put("qbe_e_coun_des", "//*[contains(@id, 'pc1:tablaDrivers::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[17]");

        // DELETE //
        elements.put("delete_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("delete_b_delete_b_yes", "//*[contains(@id, 'pcgt1:cbt1')]");

        // DETACH //
        elements.put("detach_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");

        // ACTIONS //
        elements.put("actions_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]");
        elements.put("actions_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("actions_b_audit_b_close", "//*[contains(@id, 'd2::close')]");

    }
}
