package screen.AT2MDMOR0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/10/2016.
 */
public class AT2MDMOR0012Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0012Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){


        /*DEPARTMENTS*/

        //ADD

        elements.put("deparments_add_b_add","//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("departments_add_i_department_code","//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        elements.put("departments_add_b_save","//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

        //SEARCH

        elements.put("departments_se_i_department_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("departments_se_b_search","//*[contains(@id, 'qryId1::search')]");
        elements.put("departments_se_b_reset","//*[contains(@id, 'qryId1::reset')]");
        elements.put("departments_se_e_result","//*[contains(@id, 'pc1:mastr::db')]/table/tbody/tr/td[1]");

        //QBE

        elements.put("departments_qbe_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("departments_qbe_i_department_code","//*[contains(@id, 'afr_mastr_afr_c4::content')]");

        //OTHER ACTIONS

        elements.put("department_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("department_del_b_delete","//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("department_del_e_record","//*[contains(@id, 'pc1:ot351')]");
        elements.put("department_del_b_delete_b_ok","//*[contains(@id, 'pc1:pcgt1:cbt1')]");


        /*MULTI LENGUAJE*/

        //ADD
        elements.put("multi_lenguaje_add_b_add","//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("multi_lenguaje_add_lov_lenguaje","//*[contains(@id, 'pcgt2:gidiCodIdioma1Id::lovIconId')]");
        elements.put("multi_lenguaje_add_i_lenguaje","//*[contains(@id, 'pcgt2:gidiCodIdioma1Id::content')]");
        elements.put("multi_lenguaje_add_i_description","//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("multi_lenguaje_add_i_short_description","//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("multi_lenguaje_add_b_save","//*[contains(@id, 'pcgt2:btn_commitExit')]");


        //SEARCH

        elements.put("multi_lenguaje_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("multi_lenguaje_se_i_lenguaje","//*[contains(@id, 'afr_child_afr_c5::content')]");
        elements.put("multi_lenguaje_se_i_description","//*[contains(@id, 'afr_child_afr_c2::content')]");
        elements.put("multi_lenguaje_se_i_short_description","//*[contains(@id, 'afr_child_afr_a1::content')]");
        elements.put("multi_lenguaje_se_e_result","//*[contains(@id, 'child::db')]/table/tbody/tr/td[1]");


        //EDIT
        elements.put("multi_lenguaje_ed_b_edit","//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
        elements.put("multi_lenguaje_ed_lov_lenguaje","//*[contains(@id, 'pcgt2:gidiCodIdioma1Id::lovIconId')]");
        elements.put("multi_lenguaje_ed_i_lenguaje","//*[contains(@id, 'pcgt2:gidiCodIdioma1Id::content')]");
        elements.put("multi_lenguaje_ed_i_description","//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("multi_lenguaje_ed_i_short_description","//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("multi_lenguaje_ed_b_save","//*[contains(@id, 'pcgt2:btn_commitExit')]");


        //OTHER ACTIONS

        elements.put("multi_lenguaje_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //DELETE
        elements.put("multi_lenguaje_del_b_delete","//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
        elements.put("multi_lenguaje_del_e_record","//*[contains(@id, 'pc2:ot352')]");
        elements.put("multi_lenguaje_del_b_delete_b_ok","//*[contains(@id, 'pc2:pcgt2:cbt1')]");


    }

}
