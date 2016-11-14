package screen.AT2ACCSU0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 21/10/2016.
 */
public class AT2ACCSU0006Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0006Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*RATES MAINTENANCE*/

        //ADD

        elements.put("rates_maintenance_add_b_add","//*[contains(@id, 'pc1:pcgt5:boton_add')]");
        elements.put("rates_maintenance_add_i_code","//*[contains(@id, 'pc1:pcgt5:it3::content')]");
        elements.put("rates_maintenance_add_i_rate_description","//*[contains(@id, 'pc1:pcgt5:it2::content')]");
        elements.put("rates_maintenance_add_ch_active","//*[contains(@id, 'pc1:pcgt5:sbc2::content')]");
        elements.put("rates_maintenance_add_ch_visible_wizard","//*[contains(@id, 'pc1:pcgt5:sbc1::content')]");
        elements.put("rates_maintenance_add_lov_b_line","//*[contains(@id, 'pc1:pcgt5:businessLineId::lovIconId')]");
        elements.put("rates_maintenance_add_i_b_line","//*[contains(@id, 'pc1:pcgt5:businessLineId::content')]");
        elements.put("rates_maintenance_add_b_save","//*[contains(@id, 'pc1:pcgt5:btn_commitExit')]");


        //SEARCH

        elements.put("rates_maintenance_se_i_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("rates_maintenance_se_i_rate_description","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("rates_maintenance_se_sl_active","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("rates_maintenance_se_sl_visible_wizard","//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("rates_maintenance_se_lov_b_line","//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("rates_maintenance_se_lov_i_grouping_code","//*[contains(@id, 'qryId1:value40::_afrLovInternalQueryId:value00::content')]");
        elements.put("rates_maintenance_se_i_b_line","//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("rates_maintenance_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("rates_maintenance_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("rates_maintenance_se_e_result","//*[contains(@id, 'pc1:cnbcaw::db')]/table[1]/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("rates_maintenance_ed_b_edit","//*[contains(@id, 'pc1:pcgt5:boton_edit')]");
        elements.put("rates_maintenance_ed_i_code","//*[contains(@id, 'pc1:pcgt5:it3::content')]");
        elements.put("rates_maintenance_ed_i_rate_description","//*[contains(@id, 'pc1:pcgt5:it2::content')]");
        elements.put("rates_maintenance_ed_ch_active","//*[contains(@id, 'pc1:pcgt5:sbc2::content')]");
        elements.put("rates_maintenance_ed_ch_visible_wizard","//*[contains(@id, 'pc1:pcgt5:sbc1::content')]");
        elements.put("rates_maintenance_ed_lov_b_line","//*[contains(@id, 'pc1:pcgt5:businessLineId::lovIconId')]");
        elements.put("rates_maintenance_ed_i_b_line","//*[contains(@id, 'pc1:pcgt5:businessLineId::content')]");
        elements.put("rates_maintenance_ed_b_save","//*[contains(@id, 'pc1:pcgt5:btn_commitExit')]");

        //QBE

        elements.put("rates_maintenance_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("rates_maintenance_qbe_i_code","//*[contains(@id, 'pc1:cnbcaw:it10::content')]");
        elements.put("rates_maintenance_qbe_i_rate_description","//*[contains(@id, 'pc1_afr_cnbcaw_afr_c10::content')]");
        elements.put("rates_maintenance_qbe_sl_active","//*[contains(@id, 'pc1:cnbcaw:soc8::content')]");
        elements.put("rates_maintenance_qbe_sl_visible_wizard","//*[contains(@id, 'pc1:cnbcaw:soc1::content')]");
        elements.put("rates_maintenance_qbe_i_b_line","//*[contains(@id, 'pc1_afr_cnbcaw_afr_c16::content')]");


        //OTHER ACTIONS

        elements.put("rates_maintenance_oa_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("rates_maintenance_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("rates_maintenance_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc2:d15::ok')]");
        elements.put("rates_maintenance_oa_b_ok","//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE

        elements.put("rates_maintenance_del_b_delete","//*[contains(@id, 'pc1:pcgt5:boton_remove')]");
        elements.put("rates_maintenance_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("rates_maintenance_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt5:cbt1')]");



        /*INCOMING OFFICES*/


        //ADD

        elements.put("incoming_fiels_add_b_add","//*[contains(@id, 'pc2:pcgt1:boton_add')]");
        elements.put("incoming_fiels_add_lov_office","//*[contains(@id, 'pc2:pcgt1:sofiCodOfi1Id::lovIconId')]");
        elements.put("incoming_fiels_add_i_office","//*[contains(@id, 'pc2:pcgt1:sofiCodOfi1Id::content')]");
        elements.put("incoming_fiels_add_e_company","//*[contains(@id, 'pc2:pcgt1:it4::content')]");
        elements.put("incoming_fiels_add_e_incoming_office","//*[contains(@id, 'pc2:pcgt1:it8::content')]");
        elements.put("incoming_fiels_add_b_save","//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("incoming_fiels_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("incoming_fiels_se_i_office","//*[contains(@id, 'pc2_afr_yhgjf_afr_c1::content')]");
        elements.put("incoming_fiels_se_i_company","//*[contains(@id, 'pc2:yhgjf:it11::content')]");
        elements.put("incoming_fiels_se_i_incoming_office","//*[contains(@id, 'pc2_afr_yhgjf_afr_c7::content')]");
        elements.put("incoming_fiels_se_e_result","//*[contains(@id, 'pc2:yhgjf::db')]/table/tbody/tr[1]/td[1]");


        //EDIT
        elements.put("incoming_fiels_ed_b_edit","//*[contains(@id, 'pc2:pcgt1:boton_edit')]");
        elements.put("incoming_fiels_ed_lov_office","//*[contains(@id, 'pc2:pcgt1:sofiCodOfi1Id::lovIconId')]");
        elements.put("incoming_fiels_ed_i_office","//*[contains(@id, 'pc2:pcgt1:sofiCodOfi1Id::content')]");
        elements.put("incoming_fiels_ed_e_company","//*[contains(@id, 'pc2:pcgt1:it4::content')]");
        elements.put("incoming_fiels_ed_e_incoming_office","//*[contains(@id, 'pc2:pcgt1:it8::content')]");
        elements.put("incoming_fiels_ed_b_save","//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");


        //OTHER ACTIONS

        elements.put("incoming_fiels_oa_b_actions","//*[contains(@id, 'pc2:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("incoming_fiels_oa_b_actios_b_adit_data","//*[contains(@id, 'pc2:pcgm2:dc_cmi1')]/td[2]");
        elements.put("incoming_fiels_oa_b_actios_b_adit_data_b_ok","//*[contains(@id, 'pc1:d5::ok')]");
        elements.put("incoming_fiels_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //DELETE

        elements.put("incoming_fiels_del_b_delete","//*[contains(@id, 'pc2:pcgt1:boton_remove')]");
        elements.put("incoming_fiels_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt1:cbt1')]");
        elements.put("incoming_fiels_del_e_record","//*[contains(@id, 'pc2:ot16')]");


        /*MULTI LENGUAJE*/


        //ADD

        elements.put("multi_lenguaje_add_b_add","//*[contains(@id, 'pc3:pcgt6:boton_add')]");
        elements.put("multi_lenguaje_add_e_code","//*[contains(@id, 'pc3:pcgt6:it5::content')]");
        elements.put("multi_lenguaje_add_lov_lenguaje","//*[contains(@id, 'pc3:pcgt6:codIdiomaId::lovIconId')]");
        elements.put("multi_lenguaje_add_i_lenguaje","//*[contains(@id, 'pc3:pcgt6:codIdiomaId::content')]");
        elements.put("multi_lenguaje_add_i_descriptions","//*[contains(@id, 'pc3:pcgt6:it9::content')]");
        elements.put("multi_lenguaje_add_b_save","//*[contains(@id, 'pc3:pcgt6:btn_commitExit')]");


        //SEARCH
        elements.put("multi_lenguaje_se_b_qbe","//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("multi_lenguaje_se_i_code","//*[contains(@id, 'pc3_afr_wfgkl_afr_c5::content')]");
        elements.put("multi_lenguaje_se_i_lenguage","//*[contains(@id, 'pc3_afr_wfgkl_afr_c8::content')]");
        elements.put("multi_lenguaje_se_e_lenguage","//*[contains(@id, 'pc3:wfgkl::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("multi_lenguaje_se_i_description","//*[contains(@id, 'pc3_afr_wfgkl_afr_c4::content')]");
        elements.put("multi_lenguaje_se_e_result","//*[contains(@id, 'pc3:wfgkl::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("multi_lenguaje_ed_b_edit","//*[contains(@id, 'pc3:pcgt6:boton_edit')]");
        elements.put("multi_lenguaje_ed_e_code","//*[contains(@id, 'pc3:pcgt6:it5::content')]");
        elements.put("multi_lenguaje_ed_lov_lenguaje","//*[contains(@id, 'pc3:pcgt6:codIdiomaId::lovIconId')]");
        elements.put("multi_lenguaje_ed_i_lenguaje","//*[contains(@id, 'pc3:pcgt6:codIdiomaId::content')]");
        elements.put("multi_lenguaje_ed_i_descriptions","//*[contains(@id, 'pc3:pcgt6:it9::content')]");
        elements.put("multi_lenguaje_ed_b_save","//*[contains(@id, 'pc3:pcgt6:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("multi_lenguaje_oa_b_detach","//*[contains(@id, 'pc3:_dchTbr')]/a");

        //DELETE
        elements.put("multi_lenguaje_del_b_delete","//*[contains(@id, 'pc3:pcgt6:boton_remove')]");
        elements.put("multi_lenguaje_del_e_record","//*[contains(@id, 'pc3:ot19')]");
        elements.put("multi_lenguaje_del_b_delete_b_ok","//*[contains(@id, 'pc3:pcgt6:cbt1')]");


    }

}
