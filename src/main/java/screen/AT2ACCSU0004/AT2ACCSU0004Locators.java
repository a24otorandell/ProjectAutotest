package screen.AT2ACCSU0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 20/10/2016.
 */
public class AT2ACCSU0004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0004Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*FREE TYPE*/

        //ADD

        elements.put("free_type_add_b_add","//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("free_type_add_i_free_type_code","//*[contains(@id, 'pc2:pcgt2:it1::content')]");
        elements.put("free_type_add_b_save","//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");

        //SEARCH

        elements.put("free_type_se_i_free_type_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("free_type_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("free_type_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("free_type_se_e_result","//*[contains(@id, 'pc2:resId1::db')]/table/tbody/tr/td[1]");

        //EDIT
        elements.put("free_type_ed_b_edit","//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
        elements.put("free_type_ed_i_free_type_code","//*[contains(@id, 'pc2:pcgt2:it1::content')]");
        elements.put("free_type_ed_b_save","//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");


        //QBE
        elements.put("free_type_qbe_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("free_type_qbe_i_free_type_code","//*[contains(@id, 'pc2_afr_resId1_afr_resId1c2::content')]");

        //OTHER ACTIONS
        elements.put("free_type_oa_b_actions","//*[contains(@id, 'pc2:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("free_type_oa_b_actions_b_audit_data","//*[contains(@id, 'pc2:pcgm1:dc_cmi1')]/td[2]");
        elements.put("free_type_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc2:d6::ok')]");
        elements.put("free_type_oa_b_audit_data","//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE
        elements.put("free_type_del_b_delete","//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
        elements.put("free_type_del_b_delete_ok","//*[contains(@id, 'pc2:pcgt2:cbt1')]");
        elements.put("free_type_del_e_record","//*[contains(@id, 'pc2:ot2')]");
        elements.put("free_type_del_e_open_record","//*[contains(@id, 'pc2:t3::eoi')]");


        /*LENGUAJE DESCRIPTION*/

        //ADD

        elements.put("lenguaje_description_add_b_add","//*[contains(@id, 'pc1:pcgt3:boton_add')]");
        elements.put("lenguaje_description_add_lov_lenguaje_code","//*[contains(@id, 'pc1:pcgt3:codIdioma1Id::lovIconId')]");
        elements.put("lenguaje_description_add_i_lenguaje_code","//*[contains(@id, 'pc1:pcgt3:codIdioma1Id::content')]");
        elements.put("lenguaje_description_add_i_description","//*[contains(@id, 'pc1:pcgt3:it4::content')]");
        elements.put("lenguaje_description_add_b_save","//*[contains(@id, 'pc1:pcgt3:btn_commitExit')]");

        //SEARCH

        elements.put("lenguaje_description_se_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("lenguaje_description_se_i_lenguaje_code","//*[contains(@id, 'pc1_afr_table1_afr_c1::content')]");
        elements.put("lenguaje_description_se_i_description","//*[contains(@id, 'pc1_afr_table1_afr_c2::content')]");
        elements.put("lenguaje_description_se_e_result","//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("lenguaje_description_ed_b_edit","//*[contains(@id, 'pc1:pcgt3:boton_edit')]");
        elements.put("lenguaje_description_ed_lov_lenguaje_code","//*[contains(@id, 'pc1:pcgt3:codIdioma1Id::lovIconId')]");
        elements.put("lenguaje_description_ed_i_lenguaje_code","//*[contains(@id, 'pc1:pcgt3:codIdioma1Id::content')]");
        elements.put("lenguaje_description_ed_i_description","//*[contains(@id, 'pc1:pcgt3:it4::content')]");
        elements.put("lenguaje_description_ed_b_save","//*[contains(@id, 'pc1:pcgt3:btn_commitExit')]");

        //OTHER ACTIONS

        elements.put("lenguaje_description_oa_b_actions","//*[contains(@id, 'pc1:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("lenguaje_description_oa_b_actions_b_audit_data","//*[contains(@id, 'pc1:pcgm2:dc_cmi1')]/td[2]");
        elements.put("lenguaje_description_oa_b_actions_b_audit_data_b_ok","//*[contains(@id, 'pc1:d7::ok')]");
        elements.put("lenguaje_description_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("lenguaje_description_del_b_delete","//*[contains(@id, 'pc1:pcgt3:boton_remove')]");
        elements.put("lenguaje_description_del_b_delete_ok","//*[contains(@id, 'pc1:pcgt3:cbt1')]");
        elements.put("lenguaje_description_del_e_record","//*[contains(@id, 'pc1:ot6')]");
    }
}
