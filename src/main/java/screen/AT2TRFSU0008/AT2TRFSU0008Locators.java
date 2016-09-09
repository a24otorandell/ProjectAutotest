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


        //Add
        elements.put("b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("add_lov", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::lovIconId')]");
        elements.put("add_i_togr", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::content')]");
        elements.put("add_i_descri", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("add_ss_arride", "//*[contains(@id, 'tgenericbar0:ReTTrRutaTuiDefVODetailIndTipoTras::content')]");
        elements.put("add_lov2", "//*[contains(@id, 'tgenericbar0:codRutaId::lovIconId')]");
        elements.put("add_i_route", "//*[contains(@id, 'tgenericbar0:codRutaId::content')]");
        elements.put("add_i_des2", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");

        //Search
        elements.put("se_lov", "//*[contains(@id, 'queryRoutesDef:value00::lovIconId')]");
        elements.put("se_i_lov_des", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("se_i_togr", "//*[contains(@id, 'queryRoutesDef:value00::content')]");
        elements.put("se_i_des", "//*[contains(@id, 'queryRoutesDef:value10::content')]");
        elements.put("se_lov2", "//*[contains(@id, 'queryRoutesDef:value20::lovIconId')]");
        elements.put("se_lov2_route", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("se_i_route", "//*[contains(@id, 'queryRoutesDef:value20::content')]");
        elements.put("se_i_terminal", "//*[contains(@id, 'queryRoutesDef:value30::content')]");
        elements.put("b_search", "//*[contains(@id, 'queryRoutesDef::search')]");
        elements.put("result", "//*[contains(@id, 'pc1:tablaRoutes::db')]/table/tbody/tr/td[1]");

        //Edit
        elements.put("b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("ed_lov", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::lovIconId')]");
        elements.put("ed_i_togr", "//*[contains(@id, 'tgenericbar0:codTtooGroupId::content')]");
        elements.put("ed_i_descri", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("ed_ss_arride", "//*[contains(@id, 'tgenericbar0:ReTTrRutaTuiDefVODetailIndTipoTras::content')]");
        elements.put("ed_lov2", "//*[contains(@id, 'tgenericbar0:codRutaId::lovIconId')]");
        elements.put("ed_i_route", "//*[contains(@id, 'tgenericbar0:codRutaId::content')]");
        elements.put("ed_i_des2", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("ed_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");

        //Qbe
        elements.put("b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("qbe_togro", "//*[contains(@id, 'afr_tablaRoutes_afr_c11::content')]");
        elements.put("qbe_description", "//*[contains(@id, 'afr_tablaRoutes_afr_c9::content')]");
        elements.put("qbe_arridepar", "//*[contains(@id, 'tablaRoutes:soc2::content')]");
        elements.put("qbe_route", "//*[contains(@id, 'afr_tablaRoutes_afr_c13::content')]");
        elements.put("qbe_terminal", "//*[contains(@id, 'afr_tablaRoutes_afr_c15::content')]");


        //Other actions
        elements.put("b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("a_auditdata", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("a_b_ok", "//*[contains(@id, 'd2::close')]");
        elements.put("b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //Delete

        elements.put("b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("b_del_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");


    }
}
