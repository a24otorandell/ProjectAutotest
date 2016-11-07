package screen.AT2ACCSU0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 04/11/2016.
 */
public class AT2ACCSU0011Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0011Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

        /*ROOM CHARACTERISTICS*/

        //ADD
        elements.put("room_description_general_add_b_add","//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("room_description_general_add_i_code","//*[contains(@id, 'pc1:pcgt1:inputText1::content')]");
        elements.put("room_description_general_add_ch_active","//*[contains(@id, 'pc1:pcgt1:selectBooleanCheckbox1::content')]");
        elements.put("room_description_general_add_ch_xml_act","//*[contains(@id, 'pc1:pcgt1:selectBooleanCheckbox2::content')]");
        elements.put("room_description_general_add_b_save","//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");


        //SEARCH
        elements.put("room_description_general_se_i_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("room_description_general_se_ch_active","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("room_description_general_se_ch_xml_act","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("room_description_general_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("room_description_general_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("room_description_general_se_e_result","//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("room_description_general_ed_b_edit","//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("room_description_general_ed_i_code","//*[contains(@id, 'pc1:pcgt1:inputText1::content')]");
        elements.put("room_description_general_ed_ch_active","//*[contains(@id, 'pc1:pcgt1:selectBooleanCheckbox1::content')]");
        elements.put("room_description_general_ed_ch_xml_act","//*[contains(@id, 'pc1:pcgt1:selectBooleanCheckbox2::content')]");
        elements.put("room_description_general_ed_b_save","//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

        //QBE
        elements.put("room_description_general_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("room_description_general_qbe_i_code","//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("room_description_general_qbe_sl_active","//*[contains(@id, 'pc1:resId1:soc21::content')]");
        elements.put("room_description_general_qbe_sl_xml_act","//*[contains(@id, 'pc1:resId1:soc31::content')]");

        //OTHER ACTIONS
        elements.put("room_description_general_oa_b_action","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("room_description_general_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("room_description_general_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d5::ok')]");
        elements.put("room_description_general_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("room_description_general_del_b_delete","//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("room_description_general_del_e_record","//*[contains(@id, 'pc1:outputText2')]");
        elements.put("room_description_general_del_b_delete_yes","//*[contains(@id, 'pc1:pcgt1:cbt1')]");




        /*Lenguage description*/

        //ADD
        elements.put("lenguage_description_add_b_add","//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("lenguage_description_add_lov_lenguage","//*[contains(@id, 'pc2:pcgt2:sidiCodIdiomaId::lovIconId')]");
        elements.put("lenguage_description_add_i_lenguage","//*[contains(@id, 'pc2:pcgt2:sidiCodIdiomaId::content')]");
        elements.put("lenguage_description_add_e_description","//*[contains(@id, 'pc2:pcgt2:it9::content')]");
        elements.put("lenguage_description_add_i_description","//*[contains(@id, 'pc2:pcgt2:it10::content')]");
        elements.put("lenguage_description_add_b_save","//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");

        //SEARCH
        elements.put("lenguage_description_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("lenguage_description_se_i_lenguage","//*[contains(@id, 'pc2_afr_t1_afr_c3::content')]");
        elements.put("lenguage_description_se_i_description","//*[contains(@id, 'pc2_afr_t1_afr_c2::content')]");
        elements.put("lenguage_description_se_e_description","//*[contains(@id, 'pc2_afr_t1_afr_c1::content')]");
        elements.put("lenguage_description_se_e_result","//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("lenguage_description_se_b_reset","//*[contains(@id, 'pc2:table2::ch::t')]/tbody/tr[2]/th/a");

        //EDIT
        elements.put("lenguage_description_ed_b_edit","//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
        elements.put("lenguage_description_ed_lov_lenguage","//*[contains(@id, 'pc2:pcgt2:sidiCodIdiomaId::lovIconId')]");
        elements.put("lenguage_description_ed_i_lenguage","//*[contains(@id, 'pc2:pcgt2:sidiCodIdiomaId::content')]");
        elements.put("lenguage_description_ed_e_description","//*[contains(@id, 'pc2:pcgt2:it9::content')]");
        elements.put("lenguage_description_ed_i_description","//*[contains(@id, 'pc2:pcgt2:it10::content')]");
        elements.put("lenguage_description_ed_b_save","//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");

        //OTHER ACTIONS

        elements.put("lenguage_description_oa_b_actions","//*[contains(@id, 'pc2:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("lenguage_description_oa_b_actions_b_audit_data","//*[contains(@id, 'pc2:pcgm2:dc_cmi0')]/td[2]");
        elements.put("lenguage_description_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc2:pcgm2:d22::ok')]");
        elements.put("lenguage_description_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //DELETE
        elements.put("lenguage_description_del_b_delete","//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
        elements.put("lenguage_description_del_e_record","//*[contains(@id, 'pc2:ot3')]");
        elements.put("lenguage_description_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt2:cbt1')]");
    }
}
