package screen.AT2ACCSU0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 04/11/2016.
 */
public class AT2ACCSU0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0010Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*ROOM CHARACTERISTICS*/

        //ADD
        elements.put("room_characteristics_add_b_add","//*[contains(@id, 'pc1:pcgt3:boton_add')]");
        elements.put("room_characteristics_add_i_code","//*[contains(@id, 'pc1:pcgt3:it1::content')]");
        elements.put("room_characteristics_add_ch_active","//*[contains(@id, 'pc1:pcgt3:sbc4::content')]");
        elements.put("room_characteristics_add_b_save","//*[contains(@id, 'pc1:pcgt3:btn_commitExit')]");

        //SEARCH
        elements.put("room_characteristics_se_i_code","//*[contains(@id, '1:qryId1:value00::content')]");
        elements.put("room_characteristics_se_sl_active","//*[contains(@id, '1:qryId1:value10::content')]");
        elements.put("room_characteristics_se_b_search","//*[contains(@id, '1:qryId1::search')]");
        elements.put("room_characteristics_se_b_reset","//*[contains(@id, '1:qryId1::reset')]");
        elements.put("room_characteristics_se_e_result","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("room_characteristics_ed_b_edit","//*[contains(@id, 'pc1:pcgt3:boton_edit')]");
        elements.put("room_characteristics_ed_i_code","//*[contains(@id, 'pc1:pcgt3:it1::content')]");
        elements.put("room_characteristics_ed_ch_active","//*[contains(@id, 'pc1:pcgt3:sbc4::content')]");
        elements.put("room_characteristics_ed_b_save","//*[contains(@id, 'pc1:pcgt3:btn_commitExit')]");

        //QBE
        elements.put("room_characteristics_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("room_characteristics_qbe_i_code","//*[contains(@id, 'pc1_afr_t1_afr_c8::content')]");
        elements.put("room_characteristics_qbe_sl_active","//*[contains(@id, 'pc1:t1:soc6::content')]");

        //Other actions
        elements.put("room_characteristics_oa_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("room_characteristics_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("room_characteristics_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:pcgm1:d22::ok')]");
        elements.put("room_characteristics_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //Delete
        elements.put("room_characteristics_del_b_delete","//*[contains(@id, 'pc1:pcgt3:boton_remove')]");
        elements.put("room_characteristics_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("room_characteristics_del_b_delete_b_yes","//*[contains(@id, 'pc1:pcgt3:cbt1')]");


        /*LENGUAJE DESCRIPTION*/

        //ADD
        elements.put("lenguage_description_add_b_add","//*[contains(@id, 'pc2:pcgt22:boton_add')]");
        elements.put("lenguage_description_add_lov_lenguage","//*[contains(@id, 'pc2:pcgt22:sidiCodIdiomaId::lovIconId')]");
        elements.put("lenguage_description_add_i_lenguage","//*[contains(@id, 'pc2:pcgt22:sidiCodIdiomaId::content')]");
        elements.put("lenguage_description_add_e_description","//*[contains(@id, 'pc2:pcgt22:it3::content')]");
        elements.put("lenguage_description_add_i_description","//*[contains(@id, 'pc2:pcgt22:it2::content')]");
        elements.put("lenguage_description_add_b_save","//*[contains(@id, 'pc2:pcgt22:btn_commitExit')]");

        //SEARCH
        elements.put("lenguage_description_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("lenguage_description_se_i_lenguage","//*[contains(@id, 'pc2_afr_table2_afr_c2::content')]");
        elements.put("lenguage_description_se_i_description","//*[contains(@id, 'pc2_afr_table2_afr_c4::content')]");
        elements.put("lenguage_description_se_e_description","//*[contains(@id, 'pc2_afr_table2_afr_c3::content')]");
        elements.put("lenguage_description_se_e_result","//*[contains(@id, 'pc2:table2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("lenguage_description_se_b_reset","//*[contains(@id, 'pc2:table2::ch::t')]/tbody/tr[2]/th/a");

        //EDIT
        elements.put("lenguage_description_ed_b_edit","//*[contains(@id, 'pc2:pcgt22:boton_edit')]");
        elements.put("lenguage_description_ed_lov_lenguage","//*[contains(@id, 'pc2:pcgt22:sidiCodIdiomaId::lovIconId')]");
        elements.put("lenguage_description_ed_i_lenguage","//*[contains(@id, 'pc2:pcgt22:sidiCodIdiomaId::content')]");
        elements.put("lenguage_description_ed_e_description","//*[contains(@id, 'pc2:pcgt22:it3::content')]");
        elements.put("lenguage_description_ed_i_description","//*[contains(@id, 'pc2:pcgt22:it2::content')]");
        elements.put("lenguage_description_ed_b_save","//*[contains(@id, 'pc2:pcgt22:btn_commitExit')]");

        //OTHER ACTIONS

        elements.put("lenguage_description_oa_b_actions","//*[contains(@id, 'pc2:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("lenguage_description_oa_b_actions_b_audit_data","//*[contains(@id, 'pc2:pcgm2:dc_cmi0')]/td[2]");
        elements.put("lenguage_description_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc2:pcgm2:d22::ok')]");
        elements.put("lenguage_description_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //DELETE
        elements.put("lenguage_description_del_b_delete","//*[contains(@id, 'pc2:pcgt22:boton_remove')]");
        elements.put("lenguage_description_del_e_record","//*[contains(@id, 'pc2:ot258')]");
        elements.put("lenguage_description_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt22:cbt1')]");


    }
}
