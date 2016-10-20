package screen.AT2ACCSU0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 20/10/2016.
 */
public class AT2ACCSU0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0005Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*SEASONS MAINTENANCE*/

        //ADD
        elements.put("seasons_maintenance_add_b_add","//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("seasons_maintenance_add_i_season_code","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("seasons_maintenance_add_i_date_beginnin_season","//*[contains(@id, 'pc1:pcgt2:id2::content')]");
        elements.put("seasons_maintenance_add_i_date_to","//*[contains(@id, 'pc1:pcgt2:id1::content')]");
        elements.put("seasons_maintenance_add_ch_active","//*[contains(@id, 'pc1:pcgt2:sbc1::content')]");
        elements.put("seasons_maintenance_add_ch_xml","//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        elements.put("seasons_maintenance_add_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //SEARCH
        elements.put("seasons_maintenance_se_i_season_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("seasons_maintenance_se_i_date_from","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("seasons_maintenance_se_i_date_to","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("seasons_maintenance_se_sl_active","//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("seasons_maintenance_se_sl_xml","//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("seasons_maintenance_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("seasons_maintenance_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("seasons_maintenance_se_e_result","//*[contains(@id, 'pc1:md1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("seasons_maintenance_ed_b_edit","//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("seasons_maintenance_ed_i_season_code","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("seasons_maintenance_ed_i_date_beginnin_season","//*[contains(@id, 'pc1:pcgt2:id2::content')]");
        elements.put("seasons_maintenance_ed_i_date_to","//*[contains(@id, 'pc1:pcgt2:id1::content')]");
        elements.put("seasons_maintenance_ed_ch_active","//*[contains(@id, 'pc1:pcgt2:sbc1::content')]");
        elements.put("seasons_maintenance_ed_ch_xml","//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        elements.put("seasons_maintenance_ed_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //QBE
        elements.put("seasons_maintenance_qbe_b_qbe","//*[contains(@id,'pc1:_qbeTbr')]/a");
        elements.put("seasons_maintenance_qbe_i_season_code","//*[contains(@id, 'pc1_afr_md1_afr_c15::content')]");
        elements.put("seasons_maintenance_qbe_i_date_beginnin_season","//*[contains(@id, 'pc1:md1:id6::content')]");
        elements.put("seasons_maintenance_qbe_i_date_to","//*[contains(@id, 'pc1:md1:id3::content')]");
        elements.put("seasons_maintenance_qbe_sl_active","//*[contains(@id, 'pc1:md1:soc1::content')]");
        elements.put("seasons_maintenance_qbe_sl_xml","//*[contains(@id, 'pc1:md1:soc2::content')]");

        //OTHER ACTIONS
        elements.put("seasons_maintenance_oa_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("seasons_maintenance_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("seasons_maintenance_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d6::ok')]");
        elements.put("seasons_maintenance_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE
        elements.put("seasons_maintenance_del_b_delete","//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        elements.put("seasons_maintenance_del_e_records","//*[contains(@id, 'pc1:ot2')]");
        elements.put("seasons_maintenance_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt2:cbt1')]");



        /*MULTI LENGUAJE*/

        //ADD
        elements.put("multi_lenguaje_add_b_add","//*[contains(@id, 'pc2:pcgt3:boton_add')]");
        elements.put("multi_lenguaje_add_lov_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdioma1Id::lovIconId')]");
        elements.put("multi_lenguaje_add_i_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdioma1Id::content')]");
        elements.put("multi_lenguaje_add_e_lenguaje_code_description","//*[contains(@id, 'pc2:pcgt3:it7::content')]");
        elements.put("multi_lenguaje_add_i_descriptions","//*[contains(@id, 'pc2:pcgt3:it4::content')]");
        elements.put("multi_lenguaje_add_b_save","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");


        //SEARCH
        elements.put("multi_lenguaje_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("multi_lenguaje_se_i_lenguaje_code","//*[contains(@id, 'pc2_afr_md2_afr_c17::content')]");
        elements.put("multi_lenguaje_se_i_season_description","//*[contains(@id, 'pc2_afr_md2_afr_c16::content')]");
        elements.put("multi_lenguaje_se_e_result","//*[contains(@id, 'pc2:md2::db')]/table/tbody/tr/td[1]");

        //EDIT
        elements.put("multi_lenguaje_ed_b_edit","//*[contains(@id, 'pc2:pcgt3:boton_edit')]");
        elements.put("multi_lenguaje_ed_lov_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdioma1Id::lovIconId')]");
        elements.put("multi_lenguaje_ed_i_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdioma1Id::content')]");
        elements.put("multi_lenguaje_ed_e_lenguaje_code_description","//*[contains(@id, 'pc2:pcgt3:it7::content')]");
        elements.put("multi_lenguaje_ed_i_descriptions","//*[contains(@id, 'pc2:pcgt3:it4::content')]");
        elements.put("multi_lenguaje_ed_b_save","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("multi_lenguaje_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("multi_lenguaje_del_b_delete","//*[contains(@id, 'pc2:pcgt3:boton_remove')]");
        elements.put("multi_lenguaje_del_e_record","//*[contains(@id, 'pc2:ot10')]");
        elements.put("multi_lenguaje_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt3:cbt1')]");


    }
}
