package screen.AT2TRFSU0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 29/08/2016.
 */
public class AT2TFRSU0011Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TFRSU0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //qbe
        elements.put("qbe_b", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("qbe_select_active", "//*[contains(@id, 'pc1:table1:soc4::content')]");
        elements.put("qbe_to_group_i", "//*[contains(@id, 'pc1_afr_table1_afr_c2::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'pc1_afr_table1_afr_c1::content')]");
        //detach
        elements.put("detach_b", "//*[contains(@id, 'pc1:_dchTbr')]");

        //Actions
        elements.put("b_actions", "//*[contains(@id, 'pc1:tgenericMenu0:dc_mb1')]/div[1]");
        elements.put("b_actions_b_audit", "//*[contains(@id, 'pc1:tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("b_actions_b_close", "//*[contains(@id, 'dialog1::close')]");

        //search
        elements.put("n_records", "//*[contains(@id, 'pc1:ot2')]"); //number of records retrieved
        elements.put("b_search", "//*[contains(@id, 'queryQualityNormas::search')]");
        elements.put("search_sel_active", "//*[contains(@id, 'queryQualityNormas:value00::content')]");
        elements.put("search_i_to_group", "//*[contains(@id, 'queryQualityNormas:value10::content')]");
        elements.put("search_i_desc", "//*[contains(@id, 'queryQualityNormas:value20::content')]");
        elements.put("search_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr");

        //add
        elements.put("b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("ss_add_cb_active", "//*[contains(@id, 'sbc2::content')]");
        elements.put("ss_add_i_to_group", "//*[contains(@id, 'tTOOGroupId::content')]");
        elements.put("ss_add_i_to_group_description", "//*[contains(@id, 'pc1:tgenericbar0:it1::content')]");
        elements.put("ss_add_lov_to_group", "//*[contains(@id, 'tTOOGroupId::lovIconId')]");
        elements.put("ss_add_lov_to_group_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("ss_add_ss_to_group_b_search", "//*[contains(@id, 'tTOOGroupId::_afrLovInternalQueryId::search')]");
        elements.put("ss_add_ss_to_group_e_result", "//*[contains(@id, 'tTOOGroupId_afrLovInternalTableId::db')]/table/tbody/tr");
        elements.put("ss_add_ss_to_group_b_ok", "//*[contains(@id, 'tTOOGroupId::lovDialogId::ok')]");
        elements.put("ss_add_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");//save and close

        //edit
        elements.put("b_edit", "//*[contains(@id, 'pc1:tgenericbar0:boton_edit')]");
        elements.put("ss_edit_cb_active", "//*[contains(@id, 'sbc2::content')]");
        elements.put("ss_edit_i_to_group", "//*[contains(@id, 'tTOOGroupId::content')]");
        elements.put("ss_edit_i_to_group_description", "//*[contains(@id, 'pc1:tgenericbar0:it1::content')]");
        elements.put("ss_edit_lov_to_group", "//*[contains(@id, 'tTOOGroupId::lovIconId')]");
        elements.put("ss_edit_ss_to_group_b_search", "//*[contains(@id, 'tTOOGroupId::_afrLovInternalQueryId::search')]");
        elements.put("ss_edit_ss_to_group_e_result", "//*[contains(@id, 'tTOOGroupId_afrLovInternalTableId::db')]/table/tbody/tr");
        elements.put("ss_edit_ss_to_group_b_ok", "//*[contains(@id, 'tTOOGroupId::lovDialogId::ok')]");
        elements.put("ss_edit_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");//save and close

        //delete
        elements.put("b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("ss_delete_b_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("n_records", "//*[contains(@id, 'pc1:ot2')]");
    }
}

