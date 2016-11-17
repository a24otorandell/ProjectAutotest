package screen.AT2ACCSU1003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 16/11/2016.
 */
public class AT2ACCSU1003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU1003Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

        //ESTABLISHMENT HOTEL DATA

        //ADD
        elements.put("establishment_hotel_data_add_b_add","//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("establishment_hotel_data_add_i_establishment_code","//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("establishment_hotel_data_add_i_establishment_description","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("establishment_hotel_data_add_ch_enabled","//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        elements.put("establishment_hotel_data_add_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //SEARCH
        elements.put("establishment_hotel_data_se_lov_establishment_code","//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("establishment_hotel_data_se_lov_establishment_code_i_code","//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("establishment_hotel_data_se_i_establishment_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("establishment_hotel_data_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("establishment_hotel_data_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("establishment_hotel_data_se_e_result","//*[contains(@id, 'pc1:estabvo::db')]/table[1]/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("establishment_hotel_data_ed_b_edit","//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("establishment_hotel_data_ed_e_establishment_code","//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("establishment_hotel_data_ed_i_establishment_description","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("establishment_hotel_data_ed_ch_enabled","//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        elements.put("establishment_hotel_data_ed_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");

        //QBE
        elements.put("establishment_hotel_data_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("establishment_hotel_data_qbe_i_establishment_code","//*[contains(@id, 'pc1_afr_estabvo_afr_c2::content')]");
        elements.put("establishment_hotel_data_qbe_i_establishment_description","//*[contains(@id, 'pc1_afr_estabvo_afr_c1::content')]");
        elements.put("establishment_hotel_data_qbe_ch_enabled","//*[contains(@id, 'pc1:estabvo:soc2::content')]");


        //OTHER ACTIONS
        elements.put("establishment_hotel_data_oa_b_actions","//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("establishment_hotel_data_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pdm2:dc_cmi1')]/td[2]");
        elements.put("establishment_hotel_data_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d3::ok')]");
        elements.put("establishment_hotel_data_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("establishment_hotel_data_del_b_delete","//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        elements.put("establishment_hotel_data_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("establishment_hotel_data_del_b_delete_ok","//*[contains(@id, 'pc1:pcgt2:cbt1')]");


        //ESTABLISHMENT HOTEL LENGUAGE DATA

        //ADD
        elements.put("establishment_lenguage_data_add_b_add","//*[contains(@id, 'pc2:pcgt38:boton_add')]");
        elements.put("establishment_lenguage_data_add_e_hotel","//*[contains(@id, 'pc2:pcgt38:it2::content')]");
        elements.put("establishment_lenguage_data_add_i_establishment_description","//*[contains(@id, 'pc2:pcgt38:it3::content')]");
        elements.put("establishment_lenguage_data_add_lov_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::lovIconId')]");
        elements.put("establishment_lenguage_data_add_i_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::content')]");
        elements.put("establishment_lenguage_data_add_b_save","//*[contains(@id, 'pc2:pcgt38:btn_commitExit')]");


        //SEARCH
        elements.put("establishment_lenguage_data_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("establishment_lenguage_data_se_i_establishment_code","//*[contains(@id, 'pc2_afr_estabid_afr_c4::content')]");
        elements.put("establishment_lenguage_data_se_i_establishment_description","//*[contains(@id, 'pc2_afr_estabid_afr_c5::content')]");
        elements.put("establishment_lenguage_data_se_i_lenguage","//*[contains(@id, 'pc2_afr_estabid_afr_c6::content')]");
        elements.put("establishment_lenguage_data_se_e_result","//*[contains(@id, 'pc2:estabid::db')]/table/tbody/tr[1]/td[1]");

        //ADD
        elements.put("establishment_lenguage_data_ed_b_add","//*[contains(@id, 'pc2:pcgt38:boton_add')]");
        elements.put("establishment_lenguage_data_ed_e_hotel","//*[contains(@id, 'pc2:pcgt38:it2::content')]");
        elements.put("establishment_lenguage_data_ed_i_establishment_description","//*[contains(@id, 'pc2:pcgt38:it3::content')]");
        elements.put("establishment_lenguage_data_ed_lov_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::lovIconId')]");
        elements.put("establishment_lenguage_data_ed_i_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::content')]");
        elements.put("establishment_lenguage_data_ed_b_save","//*[contains(@id, 'pc2:pcgt38:btn_commitExit')]");

        //OTHER ACTIONS
        elements.put("establishment_lenguage_data_oa_b_actions","//*[contains(@id, 'pc2:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("establishment_lenguage_data_oa_b_actions_audit_data","//*[contains(@id, 'pc2:pcgm1:dc_cmi1')]/td[2]");
        elements.put("establishment_lenguage_data_oa_b_actions_audit_data_b_ok","//*[contains(@id, 'pc2:d2::ok')]");
        elements.put("establishment_lenguage_data_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("establishment_lenguage_data_del_b_delete","//*[contains(@id, 'pc2:pcgt38:boton_remove')]");
        elements.put("establishment_lenguage_data_del_e_record","//*[contains(@id, 'pc2:ot77')]");
        elements.put("establishment_lenguage_data_del_b_delete_ok","//*[contains(@id, 'pc2:pcgt38:cbt1')]");
    }
}