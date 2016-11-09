package screen.AT2ACCSU0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 08/11/2016.
 */
public class AT2ACCSU0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0017Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


    /*HOTEL CATEGORIES*/

        //ADD

        elements.put("hotel_categories_add_b_add","//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("hotel_categories_add_i_catregori","//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("hotel_categories_add_i_number","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("hotel_categories_add_ch_active","//*[contains(@id, 'pc1:pcgt2:sbc3::content')]");
        elements.put("hotel_categories_add_ch_sws","//*[contains(@id, 'pc1:pcgt2:sbc4::content')]");
        elements.put("hotel_categories_add_lov_category_code","//*[contains(@id, 'pc1:pcgt2:codCategoriaId::lovIconId')]");
        elements.put("hotel_categories_add_i_category_code","//*[contains(@id, 'pc1:pcgt2:codCategoriaId::content')]");
        elements.put("hotel_categories_add_lov_establishment_tyoe","//*[contains(@id, 'pc1:pcgt2:codTipoEstabId::lovIconId')]");
        elements.put("hotel_categories_add_i_establishment_typ","//*[contains(@id, 'pc1:pcgt2:codTipoEstabId::content')]");
        elements.put("hotel_categories_add_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //SEARCH

        elements.put("hotel_categories_se_i_category","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("hotel_categories_se_i_number","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("hotel_categories_se_ch_active","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("hotel_categories_se_ch_sws","//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("hotel_categories_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("hotel_categories_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("hotel_categories_se_e_resutl","//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT
        elements.put("hotel_categories_ed_b_edit","//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("hotel_categories_ed_i_catregori","//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("hotel_categories_ed_i_number","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("hotel_categories_ed_ch_active","//*[contains(@id, 'pc1:pcgt2:sbc3::content')]");
        elements.put("hotel_categories_ed_ch_sws","//*[contains(@id, 'pc1:pcgt2:sbc4::content')]");
        elements.put("hotel_categories_ed_lov_category_code","//*[contains(@id, 'pc1:pcgt2:codCategoriaId::lovIconId')]");
        elements.put("hotel_categories_ed_i_category_code","//*[contains(@id, 'pc1:pcgt2:codCategoriaId::content')]");
        elements.put("hotel_categories_ed_lov_establishment_tyoe","//*[contains(@id, 'pc1:pcgt2:codTipoEstabId::lovIconId')]");
        elements.put("hotel_categories_ed_i_establishment_typ","//*[contains(@id, 'pc1:pcgt2:codTipoEstabId::content')]");
        elements.put("hotel_categories_ed_b_save","//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");


        //QBE

        elements.put("hotel_categories_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("hotel_categories_qbe_i_categori","//*[contains(@id, 'pc1_afr_resId1_afr_resId1c1::content')]");
        elements.put("hotel_categories_qbe_i_number","//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("hotel_categories_qbe_sl_active","//*[contains(@id, 'pc1:resId1:socz21::content')]");
        elements.put("hotel_categories_qbe_sl_sws","//*[contains(@id, 'pc1:resId1:soca21::content')]");
        elements.put("hotel_categories_qbe_i_category_code","//*[contains(@id, 'pc1_afr_resId1_afr_c6::content')]");
        elements.put("hotel_categories_qbe_i_establishment_type","//*[contains(@id, 'pc1_afr_resId1_afr_c5::content')]");


        //OTHER ACTIONS

        elements.put("hotel_categories_oa_b_actions","//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE
        elements.put("hotel_categories_del_b_delete","//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        elements.put("hotel_categories_del_e_record","//*[contains(@id, 'pc1:ot2')]");
        elements.put("hotel_categories_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt2:cbt1')]");



        /*MULTI LENGUAJE*/

        //ADD
        elements.put("multi_lenguaje_add_b_add","//*[contains(@id, 'pc2:pcgt3:boton_add')]");
        elements.put("multi_lenguaje_add_lov_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdiomaId::lovIconId')]");
        elements.put("multi_lenguaje_add_i_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdiomaId::content')]");
        elements.put("multi_lenguaje_add_e_lenguaje_code_description","//*[contains(@id, 'pc2:pcgt3:it4::content')]");
        elements.put("multi_lenguaje_add_i_descriptions","//*[contains(@id, 'pc2:pcgt3:it5::content')]");
        elements.put("multi_lenguaje_add_i_short_descriptions","//*[contains(@id, 'pc2:pcgt3:it3::content')]");
        elements.put("multi_lenguaje_add_b_save","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");


        //SEARCH
        elements.put("multi_lenguaje_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("multi_lenguaje_se_i_lenguaje_code","//*[contains(@id, 'pc2_afr_tt1_afr_c3::content')]");
        elements.put("multi_lenguaje_se_i_lenguaje_description","//*[contains(@id, 'pc2_afr_tt1_afr_c4::content')]");
        elements.put("multi_lenguaje_se_i_season_description","//*[contains(@id, 'pc2_afr_tt1_afr_c1::content')]");
        elements.put("multi_lenguaje_se_e_result","//*[contains(@id, 'pc2:tt1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_lenguaje_se_i_short_descriptions","//*[contains(@id, 'pc2_afr_tt1_afr_c2::content')]");

        //EDIT
        elements.put("multi_lenguaje_ed_b_edit","//*[contains(@id, 'pc2:pcgt3:boton_edit')]");
        elements.put("multi_lenguaje_ed_lov_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdiomaId::lovIconId')]");
        elements.put("multi_lenguaje_ed_i_lenguaje_code","//*[contains(@id, 'pc2:pcgt3:sidiCodIdiomaId::content')]");
        elements.put("multi_lenguaje_ed_e_lenguaje_code_description","//*[contains(@id, 'pc2:pcgt3:it4::content')]");
        elements.put("multi_lenguaje_ed_i_descriptions","//*[contains(@id, 'pc2:pcgt3:it5::content')]");
        elements.put("multi_lenguaje_ed_i_short_descriptions","//*[contains(@id, 'pc2:pcgt3:it3::content')]");
        elements.put("multi_lenguaje_ed_b_save","//*[contains(@id, 'pc2:pcgt3:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("multi_lenguaje_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("multi_lenguaje_del_b_delete","//*[contains(@id, 'pc2:pcgt3:boton_remove')]");
        elements.put("multi_lenguaje_del_e_record","//*[contains(@id, 'pc2:ot8')]");
        elements.put("multi_lenguaje_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt3:cbt1')]");


    }
}
