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
        elements.put("operational_add_active", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("operational_add_lov_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::lovIconId')]");
        elements.put("operational_add_i_suplier_test", "//*[contains(@id, 'pcgt1:nomCortoId::content')]");
        elements.put("operational_add_i_description_suplier", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("operational_add_lov2_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::lovIconId')]");
        elements.put("operational_add_i_vehicle_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::content')]");
        elements.put("operational_add_i_description_vehicle", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("operational_add_i_vehicle_cod", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("operational_add_i_", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("ad_i_capa", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("ad_i_remarcks", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //search

        elements.put("s_ss_active", "//*[contains(@id, 'advanceSearchVehiclesSetup:value00::content')]");
        elements.put("s_lov", "//*[contains(@id, 'advanceSearchVehiclesSetup:value10::lovIconId')]");
        elements.put("s_i_test", "//*[contains(@id, 'advanceSearchVehiclesSetup:value10::content')]");
        elements.put("s_i_lov_des", "//*[contains(@id, 'afrLovInternalQueryId:value20::content')]");
        elements.put("s_i_suplic", "//*[contains(@id, 'advanceSearchVehiclesSetup:value20::content')]");
        elements.put("s_lov2", "//*[contains(@id, 'advanceSearchVehiclesSetup:value30::lovIconId')]");
        elements.put("s_i_lov2_cod", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("s_i_lov2_des", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("s_i_type", "//*[contains(@id, 'advanceSearchVehiclesSetup:value30::content')]");
        elements.put("s_i_cod", "//*[contains(@id, 'advanceSearchVehiclesSetup:value40::content')]");
        elements.put("s_i_des", "//*[contains(@id, 'advanceSearchVehiclesSetup:value50::content')]");
        elements.put("s_i_remarks", "//*[contains(@id, 'advanceSearchVehiclesSetup:value60::content')]");
        elements.put("b_search", "//*[contains(@id, 'advanceSearchVehiclesSetup::search')]");
        elements.put("result", "//*[contains(@id, 'tablaVehiclesSetup::db')]/table/tbody/tr/td[1]");

        //edit

        elements.put("b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("ed_active", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("ed_lov", "//*[contains(@id, 'pcgt1:nomCortoId::lovIconId')]");
        elements.put("ed_i_supli", "//*[contains(@id, 'pcgt1:nomCortoId::content')]");
        elements.put("ed_i_des", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("ed_lov2", "//*[contains(@id, 'pcgt1:codTipoVehicId::lovIconId')]");
        elements.put("ed_i_type", "//*[contains(@id, 'pcgt1:codTipoVehicId::content')]");
        elements.put("ed_i_des2", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("ed_i_cod", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("ed_i_vdes", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("ed_i_capa", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("ed_i_remarcks", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //Qbe
        elements.put("b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("qbe_active", "//*[contains(@id, 'tablaVehiclesSetup:soc1::content')]");
        elements.put("qbe_tes", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c4::content')]");
        elements.put("qbe_i_supli", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c2::content')]");
        elements.put("qbe_i_type", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c1::content')]");
        elements.put("qbe_cod", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c3::content')]");
        elements.put("qbe_i_des", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c7::content')]");
        elements.put("qbe_i_capa", "//*[contains(@id, 'afr_tablaVehiclesSetup_afr_c6::content')]");

        //other actios
        elements.put("b_actions", "//*[contains(@id, 'dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("a_auditdata", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("b_a_exit", "//*[contains(@id, 'd2::close')]");
        elements.put("b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("record", "//*[contains(@id, 'estimatedRowCountVehiclesSetup')]");
        elements.put("b_del_ok", "//*[contains(@id, 'pcgt1:cbt1')]");


    }
}
