package screen.AT2ACCSU1002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 09/11/2016.
 */
public class AT2ACCSU1002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU1002Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

        //HOTEL CATEGORY SEARCH AREA

        //ADD
        elements.put("hotel_category_search_area_add_b_add","//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("hotel_category_search_area_add_i_category_code","//*[contains(@id, 'pc1:pcgt1:it4::content')]");
        elements.put("hotel_category_search_area_add_i_category_description","//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("hotel_category_search_area_add_ch_enabled","//*[contains(@id, 'pc1:pcgt1:sbc2::content')]");
        elements.put("hotel_category_search_area_add_b_save","//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");


        //SEARCH
        elements.put("hotel_category_search_area_se_lov_category_code","//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("hotel_category_search_area_se_lov_category_code_i_category_code","//input[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_category_search_area_se_i_category_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("hotel_category_search_area_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("hotel_category_search_area_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("hotel_category_search_area_se_e_result","//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");


        //EDIT
        elements.put("hotel_category_search_area_ed_b_edit","//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("hotel_category_search_area_ed_i_category_code","//*[contains(@id, 'pc1:pcgt1:it4::content')]");
        elements.put("hotel_category_search_area_ed_i_category_description","//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("hotel_category_search_area_ed_ch_enabled","//*[contains(@id, 'pc1:pcgt1:sbc2::content')]");
        elements.put("hotel_category_search_area_ed_b_save","//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

        //QBE
        elements.put("hotel_category_search_area_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("hotel_category_search_area_qbe_i_category_code","//*[contains(@id, 'pc1:master:it8::content')]");
        elements.put("hotel_category_search_area_qbe_i_category_description","//*[contains(@id, 'pc1_afr_master_afr_c3::content')]");
        elements.put("hotel_category_search_area_qbe_enabled","//*[contains(@id, 'pc1:master:soc2::content')]");

        //OTHER ACTIONS
        elements.put("hotel_category_search_area_oa_b_actions","//*[contains(@id, 'pc1:pdm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_category_search_area_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pdm2:dc_cmi1')]/td[2]");
        elements.put("hotel_category_search_area_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d3::ok')]");
        elements.put("hotel_category_search_area_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("hotel_category_search_area_del_b_delete","//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("hotel_category_search_area_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("hotel_category_search_area_del_b_delete_ok","//*[contains(@id, 'pc1:pcgt1:cbt1')]");

        //HOTEL CATEGORY LENGUAGE DATA

        //ADD
        elements.put("hotel_category_lenguage_data_add_b_add","//*[contains(@id, 'pc2:pcgt38:boton_add')]");
        elements.put("hotel_category_lenguage_data_add_e_category_code","//*[contains(@id, 'pc2:pcgt38:it13::content')]");
        elements.put("hotel_category_lenguage_data_add_i_category_description","//*[contains(@id, 'pc2:pcgt38:it12::content')]");
        elements.put("hotel_category_lenguage_data_add_lov_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::lovIconId')]");
        elements.put("hotel_category_lenguage_data_add_lov_lenguage_i_cod_idioma","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_category_lenguage_data_add_i_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::content')]");
        elements.put("hotel_category_lenguage_data_add_b_save","//*[contains(@id, 'pc2:pcgt38:btn_commitExit')]");


        //SEARCH
        elements.put("hotel_category_lenguage_data_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("hotel_category_lenguage_data_se_i_category_code","//*[contains(@id, 'pc2:child:inputText1::content')]");
        elements.put("hotel_category_lenguage_data_se_i_category_descriptions","//*[contains(@id, 'pc2_afr_child_afr_c4::content')]");
        elements.put("hotel_category_lenguage_data_se_lenguage","//*[contains(@id, 'pc2_afr_child_afr_c6::content')]");
        elements.put("hotel_category_lenguage_data_se_e_result","//*[contains(@id, 'pc2:child::db')]/table/tbody/tr[1]/td[1]");


        //EDIT
        elements.put("hotel_category_lenguage_data_ed_b_edit","//*[contains(@id, 'pc2:pcgt38:boton_edit')]");
        elements.put("hotel_category_lenguage_data_ed_e_category_code","//*[contains(@id, 'pc2:pcgt38:it13::content')]");
        elements.put("hotel_category_lenguage_data_ed_i_category_description","//*[contains(@id, 'pc2:pcgt38:it12::content')]");
        elements.put("hotel_category_lenguage_data_ed_lov_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::lovIconId')]");
        elements.put("hotel_category_lenguage_data_ed_i_lenguage","//*[contains(@id, 'pc2:pcgt38:codIdiomaId::content')]");
        elements.put("hotel_category_lenguage_data_ed_b_save","//*[contains(@id, 'pc2:pcgt38:btn_commitExit')]");

        //OTHER ACTIONS
        elements.put("hotel_category_lenguage_data_oa_b_actions","//*[contains(@id, 'pc2:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_category_lenguage_data_oa_b_actions_b_audit_data","//*[contains(@id, 'pc2:pcgm1:dc_cmi1')]/td[2]");
        elements.put("hotel_category_lenguage_data_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc2:d2::ok')]");
        elements.put("hotel_category_lenguage_data_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //DELETE
        elements.put("hotel_category_lenguage_data_del_b_delete","//*[contains(@id, 'pc2:pcgt38:boton_remove')]");
        elements.put("hotel_category_lenguage_data_del_e_record","//*[contains(@id, 'pc2:ot77')]");
        elements.put("hotel_category_lenguage_data_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt38:cbt1')]");



    }
}
