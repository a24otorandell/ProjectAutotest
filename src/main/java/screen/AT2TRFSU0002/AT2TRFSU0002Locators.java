package screen.AT2TRFSU0002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0002Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //Add

        elements.put("operational_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("operational_add_check_box_active", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("operational_add_lov_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::lovIconId')]");
        elements.put("operational_add_i_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::content')]");
        elements.put("operational_add_i_description_suplier", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("operational_add_lov2_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::lovIconId')]");
        elements.put("operational_add_i_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::content')]");
        elements.put("operational_add_i_description_vehicle", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("operational_add_i_vehicle_cod", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("operational_add_i_vehicle_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("operational_add_i_capa", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("operational_add_remarcks", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("operational_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //search

        elements.put("operational_se_select_text_active", "//*[contains(@id, 'advanceSearchVehiclesSetup:value00::content')]");
        elements.put("operational_se_lov_suplier_test", "//*[contains(@id, 'advanceSearchVehiclesSetup:value10::lovIconId')]");
        elements.put("operational_se_i_suplier_test", "//*[contains(@id, 'advanceSearchVehiclesSetup:value10::content')]");
        elements.put("operational_se_i_lov_suplier", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("operational_se_i_suplic", "//*[contains(@id, 'advanceSearchVehiclesSetup:value20::content')]");
        elements.put("operational_se_lov2_vehicle_type", "//*[contains(@id, 'advanceSearchVehiclesSetup:value30::lovIconId')]");
        elements.put("operational_se_i_lov2_cod", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("operational_se_i_lov2_description", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("operational_se_i_vehicle_type", "//*[contains(@id, 'advanceSearchVehiclesSetup:value30::content')]");
        elements.put("operational_se_i_vehicle_cod", "//*[contains(@id, 'advanceSearchVehiclesSetup:value40::content')]");
        elements.put("operational_se_i_vehicle_decription", "//*[contains(@id, 'advanceSearchVehiclesSetup:value50::content')]");
        elements.put("operational_se_i_remarks", "//*[contains(@id, 'advanceSearchVehiclesSetup:value60::content')]");
        elements.put("operational_se_b_search", "//*[contains(@id, 'advanceSearchVehiclesSetup::search')]");
        elements.put("operational_se_b_reset", "//*[contains(@id, 'advanceSearchVehiclesSetup::reset')]");
        elements.put("operational_se_result", "//*[contains(@id, 'tablaVehiclesSetup::db')]/table/tbody/tr/td[1]");

        //edit

        elements.put("operational_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("operational_ed_check_box_active","//*[contains(@id, 'pc1:pcgt1:sbc1::content')]");
        elements.put("operational_ed_lov_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::lovIconId')]");
        elements.put("operational_ed_i_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::content')]");
        elements.put("operational_ed_i_suplier_test_description", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("operational_ed_lov2_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::lovIconId')]");
        elements.put("operational_ed_i_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::content')]");
        elements.put("operational_ed_i_vehicle_type_description", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("operational_ed_i_vehicle_code", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("operational_ed_i_vehicle_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("operational_ed_i_capacity", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("operational_ed_i_remarcks", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("operational_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //Qbe
        elements.put("operational_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("operational_qbe_select_text_active", "//*[contains(@id, 'tablaVehiclesSetup:soc1::content')]");
        elements.put("operational_qbe_i_suplier_test_tineo", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c4::content')]");
        elements.put("operational_qbe_i_suplier_comercial_name", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c2::content')]");
        elements.put("operational_qbe_i_vehicle_type", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c1::content')]");
        elements.put("operational_qbe_vehicle_cod", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c3::content')]");
        elements.put("operational_qbe_i_vehicle_des", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c7::content')]");
        elements.put("operational_qbe_i_capacity", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c6::content')]");

        //other actios
        elements.put("operational_b_actions", "//*[contains(@id, 'dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("operational_a_auditdata", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("operational_b_a_exit", "//*[contains(@id, 'd2::close')]");
        elements.put("operational_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("operational_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("operational_record", "//*[contains(@id, 'estimatedRowCountVehiclesSetup')]");
        elements.put("operational_b_del_ok", "//*[contains(@id, 'pcgt1:cbt1')]");


    }
}
