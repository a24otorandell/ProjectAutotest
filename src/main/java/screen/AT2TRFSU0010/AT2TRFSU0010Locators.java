package screen.AT2TRFSU0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 09/09/2016.
 */
public class AT2TRFSU0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0010Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //Service Type

        //ADD

        elements.put("service_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("service_add_i_service", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("service_add_lov", "//*[contains(@id, 'tgenericbar0:codTipvehId::lovIconId')]");
        elements.put("service_add_i_vehicle", "//*[contains(@id, 'tgenericbar0:codTipvehId::content')]");
        elements.put("service_add_i_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("service_add_check_box_mandatory", "//*[contains(@id, 'tgenericbar0:sbc2::content')]");
        elements.put("service_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //SEARCH

        elements.put("service_se_i_service", "//*[contains(@id, 'queryTipotras:value00::content')]");
        elements.put("service_se_lov", "//*[contains(@id, 'queryTipotras:value10::lovIconId')]");
        elements.put("service_se_lov_destipo", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("service_se_i_vehicle", "//*[contains(@id, 'queryTipotras:value10::content')]");
        elements.put("service_se_check_box_mandatory", "//*[contains(@id, 'queryTipotras:value20::content')]");
        elements.put("service_se_i_description", "//*[contains(@id, 'queryTipotras:value30::content')]");
        elements.put("service_b_search", "//*[contains(@id, 'queryTipotras::search')]");
        elements.put("service_result", "//*[contains(@id, 'pc1:tablaTransferService::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_b_reset", "//*[contains(@id, 'queryTipotras::reset')]");


        //EDIT

        elements.put("service_b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("service_ed_i_service", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("service_ed_lov", "//*[contains(@id, 'tgenericbar0:codTipvehId::lovIconId')]");
        elements.put("service_ed_i_vehicle", "//*[contains(@id, 'tgenericbar0:codTipvehId::content')]");
        elements.put("service_ed_i_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("service_ed_check_box_mandatory", "//*[contains(@id, 'tgenericbar0:sbc2::content')]");
        elements.put("service_ed_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //QBE

        elements.put("service_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("service_qbe_i_service", "//*[contains(@id, 'afr_tablaTransferService_afr_c4::content')]");
        elements.put("service_qbe_vehicle", "//*[contains(@id, 'afr_tablaTransferService_afr_c3::content')]");
        elements.put("service_qbe_description", "//*[contains(@id, 'afr_tablaTransferService_afr_c2::content')]");
        elements.put("service_qbe_mandatory", "//*[contains(@id, 'tablaTransferService:soc4::content')]");


        //Other Actions

        elements.put("service_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("service_a_auditdata", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("service_a_b_ok", "//*[contains(@id, 'dyntdc:r1:1:d2::close')]");
        elements.put("service_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("service_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("service_a_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("service_delete_b_ok", "//*[contains(@id, 'tgenericbar0:cbt1')]");


        //Service type description


        //ADD

        elements.put("description_b_add", "//*[contains(@id, 'tgenericbar1:boton_add')]");
        elements.put("description_add_lov", "//*[contains(@id, 'tgenericbar1:codIdiomaId::lovIconId')]");
        elements.put("description_add_i_lenguaje", "//*[contains(@id, 'tgenericbar1:codIdiomaId::content')]");
        elements.put("description_add_i_lenguaje_description", "//*[contains(@id, 'tgenericbar1:it8::content')]");
        elements.put("description_add_i_description", "//*[contains(@id, 'tgenericbar1:it7::content')]");
        elements.put("description_add_i_long_description", "//*[contains(@id, 'tgenericbar1:it9::content')]");
        elements.put("description_add_b_save", "//*[contains(@id, 'tgenericbar1:btn_commitExit')]");


        //Edit

        elements.put("description_b_edit", "//*[contains(@id, 'tgenericbar1:boton_edit')]");
        elements.put("description_ed_lov", "//*[contains(@id, 'tgenericbar0:codTipvehId::lovIconId')]");
        elements.put("description_ed_i_lenguaje", "//*[contains(@id, 'tgenericbar1:codIdiomaId::lovIconId')]");
        elements.put("description_ed_i_lenguaje_description", "//*[contains(@id, 'tgenericbar1:it8::content')]");
        elements.put("description_ed_i_description", "//*[contains(@id, 'tgenericbar1:it7::content')]");
        elements.put("description_ed_i_long_description", "//*[contains(@id, 'tgenericbar1:it9::content')]");
        elements.put("description_ed_b_save", "//*[contains(@id, 'tgenericbar1:btn_commitExit')]");


        //QBE
        elements.put("description_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("description_qbe_i_code_lenguaje", "//*[contains(@id, 'afr_tablaCodTipotrasId_afr_c5::content')]");
        elements.put("description_qbe_i_lenguaje", "//*[contains(@id, 'afr_tablaCodTipotrasId_afr_c6::content')]");
        elements.put("description_qbe_i_lenguaje_description", "//*[contains(@id, 'afr_tablaCodTipotrasId_afr_c8::content')]");
        elements.put("description_qbe_i_long_description", "//*[contains(@id, 'afr_tablaCodTipotrasId_afr_c7::content')]");
        elements.put("description_qbe_result", "//*[contains(@id, 'tablaCodTipotrasId::db')]/table/tbody/tr/td[1]");


        //Other Actions

        elements.put("description_b_actions", "//*[contains(@id, 'tgenericMenu1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("description_ac_auditdata", "//*[contains(@id, 'tgenericMenu1:dc_cmi1')]/td[2]");
        elements.put("description_ac_b_exit", "//*[contains(@id, 'dialog1::close')]");
        elements.put("description_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("description_b_delete", "//*[contains(@id, 'tgenericbar1:boton_remove')]");
        elements.put("description_a_b_ok", "//*[contains(@id, 'tgenericbar1:cbt1')]");
        elements.put("description_a_records", "//*[contains(@id, 'pc2:ot20')]");
    }
}
