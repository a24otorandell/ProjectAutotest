package screen.AT2ACCSU0027;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 21/09/2016.
 */
public class AT2ACCSU0027Locators {


    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0027Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //EDIT

        elements.put("SWS_ed_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("SWS_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("SWS_ed_i_code", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("SWS_ed_i_desreceptivo", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("SWS_ed_i_Email", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("SWS_ed_check_box_contracts", "//*[contains(@id, 'pcgt1:sbc6::content')]");
        elements.put("SWS_ed_check_box_send_report", "//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("SWS_ed_check_box_stop_sales", "//*[contains(@id, 'pc1:pcgt1:sbc4::content')]");
        elements.put("SWS_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("SWS_se_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("SWS_se_i_desreceptivo", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("SWS_se_i_Email", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("SWS_se_check_box_contracts", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("SWS_se_check_box_send_report", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("SWS_se_check_box_stop_sales", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("SWS_se_b_save", "//*[contains(@id, 'qryId1::search')]");
        elements.put("SWS_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");


        //QBE


        elements.put("SWS_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("SWS_qbe_i_code", "//*[contains(@id, 'afr_table1_afr_c3::content')]");
        elements.put("SWS_qbe_i_desreceptivo", "//*[contains(@id, 'afr_table1_afr_c1::content')]");
        elements.put("SWS_qbe_i_Email", "//*[contains(@id, 'afr_table1_afr_c6::content')]");
        elements.put("SWS_qbe_select_text_contracts", "//*[contains(@id, 'table1:soc1::content')]");
        elements.put("SWS_qbe_select_text_send_report", "//*[contains(@id, 'table1:soc2::content')]");
        elements.put("SWS_qbe_select_text_stop_sales", "//*[contains(@id, 'table1:soc3::content')]");


        //OTHER ACTIONS

        elements.put("SWS_ac_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("SWS_ac_b_audit_data", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("SWS_ac_b_ok", "//*[contains(@id, '4:1:d3::ok')]");
        elements.put("SWS_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");


    }

}

