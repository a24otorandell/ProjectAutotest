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


        //Search

    }
}
