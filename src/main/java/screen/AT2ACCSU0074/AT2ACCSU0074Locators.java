package screen.AT2ACCSU0074;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 31/10/2016.
 */
public class AT2ACCSU0074Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0074Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        //ADD

        //Template
        elements.put("template_descriptions_add_b_add","//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("template_descriptions_add_template_i_code","//*[contains(@id, '1:it8::content')]");
        elements.put("template_descriptions_add_template_i_description","//*[contains(@id, '1:it9::content')]");
        elements.put("template_descriptions_add_template_lov_condition","//*[contains(@id, '1:alias1Id::lovIconId')]");
        elements.put("template_descriptions_add_template_i_condition","//*[contains(@id, '1:alias1Id::content')]");
        elements.put("template_descriptions_add_template_sl_condition","//*[contains(@id, '1:soc2::content')]");
        elements.put("template_descriptions_add_template_i_condition_second","//*[contains(@id, '1:it12::content')]");
        elements.put("template_descriptions_add_template_b_and","//*[contains(@id, '1:bAnd')]");
        elements.put("template_descriptions_add_template_b_or","//*[contains(@id, '1:bOr')]");
        elements.put("template_descriptions_add_i_result","//*[contains(@id, 'it11::content')]");
        elements.put("template_descriptions_add_template_sl_active","//*[contains(@id, '1:sbc8::content')]");
        elements.put("template_descriptions_add_template_sl_main","//*[contains(@id, '1:sbc6::content')]");
        elements.put("template_descriptions_add_template_sl_legend","//*[contains(@id, '1:sbc7::content')]");
        //Lenguaje Text
        elements.put("template_descriptions_add_lenguaje_text_b_add","//*[contains(@id, '1:pc2:bAddIdi')]");
        elements.put("template_descriptions_add_lenguaje_text_e_lenguajeresult","//*[contains(@id, 'pc2:t8::db')]/table/tbody/tr/td[1]");
        elements.put("template_descriptions_add_lenguaje_text_sl_lenguaje","//*[contains(@id, 'pc2:t8:1:soc1::content')]");
        elements.put("template_descriptions_add_lenguaje_text_del_lenguaje","//*[contains(@id, '1:pc2:t8:4:soc1::content')]");
        elements.put("template_descriptions_add_lenguaje_text_b_delete","//*[contains(@id, '1:pc2:bReIdi')]");
        elements.put("template_descriptions_add_lenguaje_text_e_record","//*[contains(@id, 'pc2:outputText4')]");
        elements.put("template_descriptions_add_lenguaje_text_b_delete_b_ok","//*[contains(@id, 'pc2:dialog1::yes')]");
        elements.put("template_descriptions_add_lenguaje_text_b_detach","//*[contains(@id, '1:pc2:_dchTbr')]/a");
        //Text
        elements.put("template_descriptions_add_text_sl_secuencial","//*[contains(@id, '1:soc6::content')]");
        elements.put("template_descriptions_add_text_sl_button","//*[contains(@id, '1:smc1::drop')]");
        elements.put("template_descriptions_add_text_sl_check_box","//*[contains(@id, '1:smc1::drop')]");
        elements.put("template_descriptions_add_text_b_add","//*[contains(@id, '1:bAddText')]");
        elements.put("template_descriptions_add_text_i_description_text","//*[contains(@id, '1:it10::content')]");
        // Final Text
        elements.put("template_descriptions_add_sl_active_final_text","//*[contains(@id, '1:sbc9::content')]");
        elements.put("template_descriptions_add_final_text_lov_template","//*[contains(@id, '1:legendId::lovIconId')]");
        elements.put("template_descriptions_add_final_text_i_template","//*[contains(@id, '1:legendId::content')]");
        elements.put("template_descriptions_add_final_text_b_add_tempplate","//*[contains(@id, '1:bAddLegend')]");
        elements.put("template_descriptions_add_final_text_sl_condition","//*[contains(@id, '1:bAddLegend')]");
        elements.put("template_descriptions_add_final_text_b_add_condition","//*[contains(@id, '1:bAddAlias')]");
        elements.put("template_descriptions_add_final_text_b_add","//*[contains(@id, 'pc3:bAddFinal')]");
        elements.put("template_descriptions_add_final_text_b_delete","//*[contains(@id, 'pc3:bReFinal')]");
        elements.put("template_descriptions_add_final_text_b_detach","//*[contains(@id, 'pc3:_dchTbr')]/a");
        //Template preview
        elements.put("template_descriptions_add_template_preview_lov_hotel_code","//*[contains(@id, '1:hotelCodeId::lovIconId')]");
        elements.put("template_descriptions_add_template_preview_i_hotel_code","//*[contains(@id, '1:hotelCodeId::content')]");
        elements.put("template_descriptions_add_template_preview_b_preview","//*[contains(@id, '1:bPreview')]");
        elements.put("template_descriptions_add_template_preview_b_preview_b_ok","//*[contains(@id, '1:d4::ok')]");
        elements.put("template_descriptions_add_b_save","//*[contains(@id, '1:btn_commitExit')]");


        //SEARCH
        elements.put("template_descriptions_se_i_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("template_descriptions_se_i_description","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("template_descriptions_se_i_creation_date_from","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("template_descriptions_se_i_creation_date_to","//*[contains(@id, 'qryId1:value21::content')]");
        elements.put("template_descriptions_se_i_modification_date_from","//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("template_descriptions_se_i_modification_date_to","//*[contains(@id, 'qryId1:value31::content']");
        elements.put("template_descriptions_se_i_condition","//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("template_descriptions_se_lov_alias","//*[contains(@id, 'qryId1:value21::content')]");
        elements.put("template_descriptions_se_i_alias","//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("template_descriptions_se_i_text","//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("template_descriptions_se_ch_active","//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("template_descriptions_se_ch_main","//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("template_descriptions_se_ch_legend","//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("template_descriptions_se_lov_creation_user","//*[contains(@id, 'qryId1:value100::lovIconId')]");
        elements.put("template_descriptions_se_i_creation_user","//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("template_descriptions_se_lov_modification_user","//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("template_descriptions_se_i_modification_user","//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("template_descriptions_se_ch_lenguaje","//*[contains(@id, 'qryId1:value120::drop')]");
        elements.put("template_descriptions_se_i_lenguaje","//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("template_descriptions_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("template_descriptions_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("template_descriptions_se_e_result","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT
        //Template
        elements.put("template_descriptions_ed_b_edit","//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("template_descriptions_ed_template_i_code","//*[contains(@id, '1:it8::content')]");
        elements.put("template_descriptions_ed_template_i_description","//*[contains(@id, '1:it9::content')]");
        elements.put("template_descriptions_ed_template_lov_condition","//*[contains(@id, '1:alias1Id::lovIconId')]");
        elements.put("template_descriptions_ed_template_i_condition","//*[contains(@id, '1:alias1Id::content')]");
        elements.put("template_descriptions_ed_template_sl_condition","//*[contains(@id, '1:soc2::content')]");
        elements.put("template_descriptions_ed_template_i_condition_second","//*[contains(@id, '1:it12::content')]");
        elements.put("template_descriptions_ed_template_b_and","//*[contains(@id, '1:bAnd')]");
        elements.put("template_descriptions_ed_template_b_or","//*[contains(@id, '1:bOr')]");
        elements.put("template_descriptions_ed_i_result","//*[contains(@id, 'it11::content')]");
        elements.put("template_descriptions_ed_template_sl_active","//*[contains(@id, '1:sbc8::content')]");
        elements.put("template_descriptions_ed_template_sl_main","//*[contains(@id, '1:sbc6::content')]");
        elements.put("template_descriptions_ed_template_sl_legend","//*[contains(@id, '1:sbc7::content')]");
        //Lenguaje Text
        elements.put("template_descriptions_ed_lenguaje_text_b_add","//*[contains(@id, '1:pc2:bAddIdi')]");
        elements.put("template_descriptions_ed_lenguaje_text_e_lenguajeresult","//*[contains(@id, 'pc2:t8::db')]/table/tbody/tr/td[1]");
        elements.put("template_descriptions_ed_lenguaje_text_sl_lenguaje","//*[contains(@id, 'pc2:t8:1:soc1::content')]");
        elements.put("template_descriptions_ed_lenguaje_text_del_lenguaje","//*[contains(@id, '1:pc2:t8:4:soc1::content')]");
        elements.put("template_descriptions_ed_lenguaje_text_b_delete","//*[contains(@id, '1:pc2:bReIdi')]");
        elements.put("template_descriptions_ed_lenguaje_text_e_record","//*[contains(@id, 'pc2:outputText4')]");
        elements.put("template_descriptions_ed_lenguaje_text_b_delete_b_ok","//*[contains(@id, 'pc2:dialog1::yes')]");
        elements.put("template_descriptions_ed_lenguaje_text_b_detach","//*[contains(@id, '1:pc2:_dchTbr')]/a");
        //Text
        elements.put("template_descriptions_ed_text_sl_secuencial","//*[contains(@id, '1:soc6::content')]");
        elements.put("template_descriptions_ed_text_sl_button","//*[contains(@id, '1:smc1::drop')]");
        elements.put("template_descriptions_ed_text_sl_check_box","//*[contains(@id, '1:smc1::drop')]");
        elements.put("template_descriptions_ed_text_b_add","//*[contains(@id, '1:bAddText')]");
        elements.put("template_descriptions_ed_text_i_description_text","//*[contains(@id, '1:it10::content')]");
        // Final Text
        elements.put("template_descriptions_ed_sl_active_final_text","//*[contains(@id, '1:sbc9::content')]");
        elements.put("template_descriptions_ed_final_text_lov_template","//*[contains(@id, '1:legendId::lovIconId')]");
        elements.put("template_descriptions_ed_final_text_i_template","//*[contains(@id, '1:legendId::content')]");
        elements.put("template_descriptions_ed_final_text_b_add_tempplate","//*[contains(@id, '1:bAddLegend')]");
        elements.put("template_descriptions_ed_final_text_sl_condition","//*[contains(@id, '1:bAddLegend')]");
        elements.put("template_descriptions_ed_final_text_b_add_condition","//*[contains(@id, '1:bAddAlias')]");
        elements.put("template_descriptions_ed_e_result_final_text","//*[contains(@id, 'pc3:t7::db')]/table[1]/tbody/tr/td[1]");
        elements.put("template_descriptions_ed_final_text_b_add","//*[contains(@id, 'pc3:bAddFinal')]");
        elements.put("template_descriptions_ed_final_text_b_delete","//*[contains(@id, 'pc3:bReFinal')]");
        elements.put("template_descriptions_ed_final_text_b_detach","//*[contains(@id, 'pc3:_dchTbr')]/a");
        elements.put("template_descriptions_ed_final_text_i_final_description","//*[contains(@id, 'pc3:t7:3:it15::content')]");
        //Template preview
        elements.put("template_descriptions_ed_template_preview_lov_hotel_code","//*[contains(@id, '1:hotelCodeId::lovIconId')]");
        elements.put("template_descriptions_ed_template_preview_i_hotel_code","//*[contains(@id, '1:hotelCodeId::content')]");
        elements.put("template_descriptions_ed_template_preview_b_preview","//*[contains(@id, '1:bPreview')]");
        elements.put("template_descriptions_ed_template_preview_b_preview_b_ok","//*[contains(@id, '1:d4::ok')]");
        elements.put("template_descriptions_ed_b_save","//*[contains(@id, '1:btn_commitExit')]");


        //QBE
        elements.put("template_descriptions_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("template_descriptions_qbe_sl_main","//*[contains(@id, 'pc1:t1:soc4::content')]");
        elements.put("template_descriptions_qbe_i_code","//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");
        elements.put("template_descriptions_qbe_i_lenguage","//*[contains(@id, 'pc1_afr_t1_afr_c3::content')]");
        elements.put("template_descriptions_qbe_sl_active","//*[contains(@id, 'pc1:t1:soc7::content')]");
        elements.put("template_descriptions_qbe_i_condition","//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("template_descriptions_qbe_i_description","//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");


        //OTHER ACTIONS

        elements.put("template_descriptions_oa_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("template_descriptions_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("template_descriptions_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:pcgm1:d22::ok')]");
        elements.put("template_descriptions_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("template_descriptions_del_b_delete","//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("template_descriptions_del_e_record","//*[contains(@id, 'pc1:ot18')]");
        elements.put("template_descriptions_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt1:boton_remove')]");





    }
}
