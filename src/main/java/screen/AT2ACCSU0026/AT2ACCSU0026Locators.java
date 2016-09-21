package screen.AT2ACCSU0026;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 13/09/2016.
 */
public class AT2ACCSU0026Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0026Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //KAM

        //ADD

        elements.put("kam_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("kam_add_i_user", "//*[contains(@id, 'pcgt2:inputText1::content')]");
        elements.put("Kam_add_i_user_description", "//*[contains(@id, 'pcgt2:inputText2::content')]");
        elements.put("kam_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");


        //SEARCH
        elements.put("kam_se_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("Kam_se_i_user_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("kam_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("kam_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("kam_se_result", "//*[contains(@id, 'tt1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("kam_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("kam_ed_i_user", "//*[contains(@id, 'pcgt2:inputText1::content')]");
        elements.put("Kam_ed_i_user_description", "//*[contains(@id, 'pcgt2:inputText2::content')]");
        elements.put("kam_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //QBE

        elements.put("kam_qbe_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("kam_qbe_i_user", "//*[contains(@id, 'afr_tt1_afr_c1::content')]");
        elements.put("Kam_qbe_i_user_description", "//*[contains(@id, 'afr_tt1_afr_c2::content')]");


        //OTHER ACTIONS

        elements.put("Kam_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");


        //Delete

        elements.put("kam_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("kam_del_i_record", "//*[contains(@id, 'pc2:ot2')]");
        elements.put("Kam_del_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");


        //CONTROLER


        //ADD

        elements.put("controler_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("controler_add_i_user", "//*[contains(@id, 'pcgt3:inputText3::content')]");
        elements.put("controler_add_i_user_description", "//*[contains(@id, 'pcgt3:inputText4::content')]");
        elements.put("controler_add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");


        //SEARCH
        elements.put("controler_se_i_user", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("controler_se_i_user_description", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("controler_se_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("controler_se_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("controler_se_result", "//*[contains(@id, 'tt2::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("controler_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("controler_ed_i_user", "//*[contains(@id, 'pcgt3:inputText3::content')]");
        elements.put("controler_ed_i_user_description", "//*[contains(@id, 'pcgt3:inputText4::content')]");
        elements.put("controler_ed_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");

        //QBE

        elements.put("controler_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("controler_qbe_i_user", "//*[contains(@id, 'afr_tt2_afr_c4::content')]");
        elements.put("controler_qbe_i_user_description", "//*[contains(@id, 'afr_tt2_afr_c3::content')]");


        //OTHER ACTIONS

        elements.put("controler_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");


        //Delete

        elements.put("controler_del_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("controler_del_i_record", "//*[contains(@id, 'pc1:ot3')]");
        elements.put("controler_del_b_delete_ok", "//*[contains(@id, 'pc1:pcgt3:cbt1')]");


    }

}
