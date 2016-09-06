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

        elements.put("b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("ad_ss_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("ad_i_grouping", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("ad_i_description", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("b_ad_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //search

        elements.put("s_i_grouping", "//*[contains(@id, 'advanceSearchVehicleGroupSetup:value00::content')]");
        elements.put("s_i_description", "//*[contains(@id, 'advanceSearchVehicleGroupSetup:value10::content')]");
        elements.put("b_search", "//*[contains(@id, 'advanceSearchVehicleGroupSetup::search')]");
        elements.put("s_records", "//*[contains(@id, 'tablaVehicleGroups::db')]/table/tbody/tr/td[1]");

        //edit
        elements.put("b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("ed_ss_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("ed_i_grouping", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("ed_i_description", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("b_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //QBE
        elements.put("b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("qbe_s_active", "//*[contains(@id, 'pc1:tablaVehicleGroups:soc4::content')]");
        elements.put("qbe_i_grouping", "//*[contains(@id, 'afr_tablaVehicleGroups_afr_c3::content')]");
        elements.put("qbe_i_decription", "//*[contains(@id, 'afr_tablaVehicleGroups_afr_c1::content')]");

        //other actions
        elements.put("o_b_actios", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("o_actios_b_auditdata", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("o_b_close", "//*[contains(@id, 'd1::close')]");
        elements.put("o_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("i_records", "//*[contains(@id, 'pc1:ot4')]");
        elements.put("b_del_yes", "//*[contains(@id, 'pcgt2:cbt1')]");

    }
}
