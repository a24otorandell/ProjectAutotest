package screen.AT2TRFSU0008;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0008Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0008Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //CREATE ROUTE


        elements.put("create_route_lov_search_first", "//*[contains(@id, 'pt1:searchminimenu::icon')]");
        elements.put("create_route_i_search", "//*[contains(@id, 'j_id__ctru158::content')]");
        elements.put("create_route_lov_search", "//*[contains(@id, 'pt_i2::icon')]");
        elements.put("create_route_e_route_maintenance", "//*[contains(@id, 'j_id__ctru154')]//a[contains(@id, 'cl3')]");
        elements.put("create_route_e_route_maintence_b_add", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:boton_add')]");
        elements.put("create_route_e_route_maintence_i_area_code", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:ReTTrRutaTuiVODetailCodRuta::content')]");
        elements.put("create_route_e_route_maintence_lov_terminal_area", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:ReTTrRutaTuiVODetailZonaOri::lovIconId')]");
        elements.put("create_route_e_route_maintence_i_terminal_area", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:ReTTrRutaTuiVODetailZonaOri::content')]");
        elements.put("create_route_e_route_maintence_ch_default_route", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:ReTTrRutaTuiVODetailIndDefault::content')]");
        elements.put("create_route_e_route_maintence_i_remarks", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:ReTTrRutaTuiVODetailObservaciones::content')]");
        elements.put("create_route_e_route_maintence_b_save", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:btn_commitExit')]");
        elements.put("create_route_e_routes_by_default", "//*[contains(@id, 'dynTabsPane:1:tabIndex::disclosureAnchor')]");
        elements.put("create_route_e_route_maintence_b_delete", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:boton_remove')]");
        elements.put("create_route_e_route_maintence_e_recods", "//*[contains(@id, 'ReTTrRutaTuiVOPC:ot20')]");
        elements.put("create_route_e_route_maintence_b_delete_b_ok", "//*[contains(@id, 'ReTTrRutaTuiVOPC:tgenericbar0:cbt1')]");
        elements.put("Go_to_route_maintenance", "//*[contains(@id, 'dyntdc:dynTabsPane:2:tabIndex::disclosureAnchor')]");



        //Add
        elements.put("route_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("route_add_lov_to_group", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::lovIconId')]");
        elements.put("route_add_i_to_group", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::content')]");
        elements.put("route_add_i_to_group_description", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("route_add_select_text_arrival_departure", "//*[contains(@id, 'tgenericbar0:ReTTrRutaTuiDefVODetailIndTipoTras::content')]");
        elements.put("route_add_lov2_route", "//*[contains(@id, 'tgenericbar0:codRutaId::lovIconId')]");
        elements.put("route_add_i_route", "//*[contains(@id, 'tgenericbar0:codRutaId::content')]");
        elements.put("route_add_i_route_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("route_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");

        //Search
        elements.put("route_se_lov_to_group", "//*[contains(@id, 'queryRoutesDef:value00::lovIconId')]");
        elements.put("route_se_i_lov_to_group_i_name", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("route_se_i_to_group", "//*[contains(@id, 'queryRoutesDef:value00::content')]");
        elements.put("route_se_i_description", "//*[contains(@id, 'queryRoutesDef:value10::content')]");
        elements.put("route_se_lov2_route", "//*[contains(@id, 'queryRoutesDef:value20::lovIconId')]");
        elements.put("route_se_lov2_i_route", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("route_se_i_route", "//*[contains(@id, 'queryRoutesDef:value20::content')]");
        elements.put("route_se_i_terminal_area", "//*[contains(@id, 'queryRoutesDef:value30::content')]");
        elements.put("route_b_search", "//*[contains(@id, 'queryRoutesDef::search')]");
        elements.put("route_b_reset", "//*[contains(@id, 'queryRoutesDef::reset')]");
        elements.put("route_result", "//*[contains(@id, 'pc1:tablaRoutes::db')]/table/tbody/tr/td[1]");

        //Edit
        elements.put("route_b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("route_ed_lov_to_group", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::lovIconId')]");
        elements.put("route_ed_i_to_group", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::content')]");
        elements.put("route_ed_i_to_group_description", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("route_ed_select_text_arrival_departure", "//*[contains(@id, 'tgenericbar0:ReTTrRutaTuiDefVODetailIndTipoTras::content')]");
        elements.put("route_ed_lov2_route", "//*[contains(@id, 'tgenericbar0:codRutaId::lovIconId')]");
        elements.put("route_ed_i_route", "//*[contains(@id, 'tgenericbar0:codRutaId::content')]");
        elements.put("route_ed_i_route_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("route_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");

        //Qbe
        elements.put("route_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("route_qbe_to_group", "//*[contains(@id, 'afr_tablaRoutes_afr_c11::content')]");
        elements.put("route_qbe_description", "//*[contains(@id, 'afr_tablaRoutes_afr_c9::content')]");
        elements.put("route_qbe_arrival_departure", "//*[contains(@id, 'tablaRoutes:soc2::content')]");
        elements.put("route_qbe_route", "//*[contains(@id, 'afr_tablaRoutes_afr_c13::content')]");
        elements.put("route_qbe_terminal_are", "//*[contains(@id, 'afr_tablaRoutes_afr_c15::content')]");


        //Other actions
        elements.put("route_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("route_a_auditdata", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("route_a_b_ok", "//*[contains(@id, 'd2::close')]");
        elements.put("route_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //Delete

        elements.put("route_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("route_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("route_b_del_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");


    }
}
