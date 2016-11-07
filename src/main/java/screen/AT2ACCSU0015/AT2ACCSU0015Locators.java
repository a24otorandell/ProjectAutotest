package screen.AT2ACCSU0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 07/11/2016.
 */
public class AT2ACCSU0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0015Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*HOTEL CHAIN DESCRIPTION*/

        //ADD
        elements.put("hotel_chain_description_add_b_add","//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("hotel_chain_description_add_i_chain","//*[contains(@id, 'pc1:pcgt2:it3::content)']");
        elements.put("hotel_chain_description_add_i_description","//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("hotel_chain_description_add_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");

        //SEARCH
        elements.put("hotel_chain_description_se_i_chain","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("hotel_chain_description_se_i_description","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("hotel_chain_description_se_b_save","//*[contains(@id, 'qryId1::search')]");
        elements.put("hotel_chain_description_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("hotel_chain_description_se_e_result","//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT
        elements.put("hotel_chain_description_ed_b_edit","//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("hotel_chain_description_ed_i_chain","//*[contains(@id, 'pc1:pcgt2:it3::content)']");
        elements.put("hotel_chain_description_ed_i_description","//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("hotel_chain_description_ed_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //QBE
        elements.put("hotel_chain_description_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("hotel_chain_description_qbe_i_chain","//*[contains(@id, 'pc1_afr_resId1_afr_c2::content')]");
        elements.put("hotel_chain_description_qbe_i_description","//*[contains(@id, 'pc1_afr_resId1_afr_c1::content')]");

        //OTHER ACTIONS
        elements.put("hotel_chain_description_oa_b_action","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_chain_description_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("hotel_chain_description_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d5::ok')]");
        elements.put("hotel_chain_description_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE
        elements.put("hotel_chain_description_del_b_delete","//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        elements.put("hotel_chain_description_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("hotel_chain_description_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt2:cbt1')]");


        /*CADENA HOTEL DESCRIPTION*/


        //ADD
        elements.put("cadena_hotel_description_add_b_add","//*[contains(@id, 'pc3:pcgt4:boton_add')]");
        elements.put("cadena_hotel_description_add_e_code","//*[contains(@id, 'pc3:pcgt4:it14::content']");
        elements.put("cadena_hotel_description_add_lov_lenguage","//*[contains(@id, 'pc3:pcgt4:codIdiomaId::lovIconId')]");
        elements.put("cadena_hotel_description_add_i_lenguage","//*[contains(@id, 'pc3:pcgt4:codIdiomaId::content')]");
        elements.put("cadena_hotel_description_add_i_description","//*[contains(@id, 'pc3:pcgt4:it15::content')]");
        elements.put("cadena_hotel_description_add_b_save","//*[contains(@id, 'pc3:pcgt4:btn_commitExit')]");


        //SEARCH
        elements.put("cadena_hotel_description_se_i_chain","//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("cadena_hotel_description_se_i_description","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("cadena_hotel_description_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("cadena_hotel_description_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("cadena_hotel_description_se_e_result","//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("cadena_hotel_description_ed_b_edit","//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("cadena_hotel_description_ed_e_code","//*[contains(@id, 'pc3:pcgt4:it14::content']");
        elements.put("cadena_hotel_description_ed_lov_lenguage","//*[contains(@id, 'pc3:pcgt4:codIdiomaId::lovIconId')]");
        elements.put("cadena_hotel_description_ed_i_lenguage","//*[contains(@id, 'pc3:pcgt4:codIdiomaId::content')]");
        elements.put("cadena_hotel_description_ed_i_description","//*[contains(@id, 'pc3:pcgt4:it15::content')]");
        elements.put("cadena_hotel_description_ed_b_save","//*[contains(@id, 'pc3:pcgt4:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("cadena_hotel_description_oa_b_actions","//*[contains(@id, 'pc3:pcgm11:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("cadena_hotel_description_oa_b_actions_audit_data","//*[contains(@id, 'pc3:pcgm11:dc_cmi1')]/td[2]");
        elements.put("cadena_hotel_description_oa_b_actions_audit_data_b_ok","//*[contains(@id, 'pc3:dialog1::ok')]");
        elements.put("cadena_hotel_description_oa_b_detach","//*[contains(@id, 'pc3:_dchTbr')]/a");

        //DELETE
        elements.put("cadena_hotel_description_del_b_delete","//*[contains(@id, 'pc3:pcgt4:boton_remove')]");
        elements.put("cadena_hotel_description_del_e_record","//*[contains(@id, 'pc3:ot2111')]");
        elements.put("cadena_hotel_description_del_b_delete_b_ok","//*[contains(@id, 'pc3:pcgt4:cbt1')]");

        /*HOTEL BRAND*/

        //ADD
        elements.put("hotel_brand_add_b_add","//*[contains(@id, 'pc2:pcgt3:boton_add')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:it1::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:it2::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");


        //SEARCH
        elements.put("hotel_brand_","//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'qryId2::search')]");
        elements.put("hotel_brand_","//*[contains(@id, 'qryId2::reset')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:resId2::db')]/table/tbody/tr/td[1]");

        //EDIT
        elements.put("hotel_brand_","//*[contains(@id, '");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:it1::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:it2::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");

        //QBE
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2_afr_resId2_afr_c4::content')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2_afr_resId2_afr_c3::content')]");

        //OTHER ACTIONS
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgm2:dc_cmi1')]/td[2]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:d6::ok')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:boton_remove')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:ot7')]");
        elements.put("hotel_brand_","//*[contains(@id, 'pc2:pcgt3:boton_remove')]");


    }
}
