package screen.AT2TRFSU0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 06/09/2016.
 */
public class AT2TRFSU0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0013Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //Grouping vehicles

        //add

        elements.put("grouping_add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("grouping_add_check_box_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("grouping_add_i_vehicles_code", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("grouping_add_i_description", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("grouping_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //search

        elements.put("grouping_se_i_vehicles_code", "//*[contains(@id, 'advanceSearchVehicleGroupSetup:value00::content')]");
        elements.put("grouping_se_i_description", "//*[contains(@id, 'advanceSearchVehicleGroupSetup:value10::content')]");
        elements.put("grouping_se_b_search", "//*[contains(@id, 'advanceSearchVehicleGroupSetup::search')]");
        elements.put("grouping_se_b_reset", "//*[contains(@id, 'advanceSearchVehicleGroupSetup::reset')]");
        elements.put("grouping_se_result", "//*[contains(@id, 'tablaVehicleGroups::db')]/table/tbody/tr/td[1]");

        //edit
        elements.put("grouping_ed_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("grouping_ed_check_box_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("grouping_ed_i_vehicles_code", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("grouping_ed_i_description", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("grouping_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //QBE
        elements.put("grouping_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("grouping_qbe_select_text_active", "//*[contains(@id, 'pc1:tablaVehicleGroups:soc4::content')]");
        elements.put("grouping_qbe_i_vehicles_code", "//*[contains(@id, 'afr_tablaVehicleGroups_afr_c3::content')]");
        elements.put("grouping_qbe_i_description", "//*[contains(@id, 'afr_tablaVehicleGroups_afr_c1::content')]");

        //other actions
        elements.put("grouping_oc_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("grouping_oc_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("grouping_oc_exit_ok", "//*[contains(@id, 'd1::close')]");
        elements.put("grouping_oc_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("grouping_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("grouping_del_records", "//*[contains(@id, 'pc1:ot4')]");
        elements.put("grouping_del_b_ok", "//*[contains(@id, 'pcgt2:cbt1')]");

    }
}
