package screen.AT2ACCSU0025;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 13/09/2016.
 */
public class AT2ACCSU0025Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0025Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("Offer_types_ad__b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("Offer_types_ad_i_discount", "//*[contains(@id, 'pcgt3:inputText1::content')]");
        elements.put("Offer_types_ad_i_discount_description", "//*[contains(@id, 'pcgt3:inputText2::content')]");
        elements.put("Offer_types_ad_check_box_notes", "//*[contains(@id, 'pcgt3:selectBooleanCheckbox1::content')]");
        elements.put("Offer_types_ad_check_box_percentage", "//*[contains(@id, 'pcgt3:selectBooleanCheckbox2::content')]");
        elements.put("Offer_types_ad_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");


        //SEARCH

        elements.put("Offer_types_se_i_discount", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("Offer_types_se_i_discount_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("Offer_types_se_check_box_notes", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("Offer_types_se_check_box_percentage", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("Offer_types_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("Offer_types_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("Offer_types_se_i_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("Offer_types_ed_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("Offer_types_ed_i_discount", "//*[contains(@id, 'pcgt3:inputText1::content')]");
        elements.put("Offer_types_ed_i_discount_description", "//*[contains(@id, 'pcgt3:inputText2::content')]");
        elements.put("Offer_types_ed_check_box_notes", "//*[contains(@id, 'pcgt3:selectBooleanCheckbox1::content')]");
        elements.put("Offer_types_ed_check_box_percentage", "//*[contains(@id, 'pcgt3:selectBooleanCheckbox2::content')]");
        elements.put("Offer_types_ed_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");


        //QBE
        elements.put("Offer_types_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("Offer_types_qbe_i_discount", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("Offer_types_qbe_i_discount_description", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("Offer_types_qbe_select_text_notes", "//*[contains(@id, 'resId1:soc9::content')]");
        elements.put("Offer_types_qbe_select_text_percentage", "//*[contains(@id, 'resId1:soc1::content')]");


        //OTHER ACTIONS

        elements.put("Offer_types_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("Offer_types_del_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("Offer_types_del_b_delete_ok", "//*[contains(@id, 'pcgt3:cbt1')]");
        elements.put("Offer_types_del_records", "//*[contains(@id, 'pc1:ot2')]");


    }


}
