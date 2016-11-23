package screen.AT2MDMSY1005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 23/11/2016.
 */
public class AT2MDMSY1005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY1005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TAB TRANSACTIONS MAPPER FILE - TABLE TRANSACTION
         */
        //GENERALS
/*        elements.put("transaction_b_add", "/*//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("transaction_b_delete", "/*//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("transaction_b_edit", "/*//*[contains(@id, 'pcgt2:boton_edit')]");*/
        elements.put("transaction_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("transaction_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi0')]/td[2]");
        elements.put("transaction_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("transaction_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("transaction_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("transaction_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search1", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset1", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_from_date", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_to_date", "//*[contains(@id, 'qryId1:value01::content')]");
        elements.put("search_i_reference", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_sl_origin", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_supplier", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_ref_tmp", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_sl_staus", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_sl_client", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId1:value120::lovIconId')]");
        elements.put("search_i_id", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_i_load", "//*[contains(@id, 'qryId1:value160::content')]");
        //QBE
        elements.put("qbe_i_transaction", "//*[contains(@id, 'pc1_afr_t1_afr_c21::content')]");
        elements.put("qbe_i_reference", "//*[contains(@id, 'pc1_afr_t1_afr_c9::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'pc1:t1:soc2::content')]");
        elements.put("qbe_i_type_desc", "//*[contains(@id, 'pc1_afr_t1_afr_c42::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'pc1_afr_t1_afr_c28::content')]");
        elements.put("qbe_i_supplier", "//*[contains(@id, 'pc1_afr_t1_afr_c20::content')]");
        elements.put("qbe_i_cost", "//*[contains(@id, 'pc1_afr_t1_afr_c12::content')]");
        elements.put("qbe_i_buffer", "//*[contains(@id, 'pc1_afr_t1_afr_c30::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, 'pc1_afr_t1_afr_c25::content')]");
        elements.put("qbe_i_payment", "//*[contains(@id, 'pc1_afr_t1_afr_c11::content')]");
        elements.put("qbe_i_act", "//*[contains(@id, 'pc1:t1:id7::content')]");
        elements.put("qbe_i_exp", "//*[contains(@id, 'pc1:t1:id5::content')]");
        elements.put("qbe_sl_client", "//*[contains(@id, 'pc1:t1:soc3::content')]");
        elements.put("qbe_i_req", "//*[contains(@id, 'pc1_afr_t1_afr_c10::content')]");
        elements.put("qbe_i_ref_tmp", "//*[contains(@id, 'pc1_afr_t1_afr_c23::content')]");
        elements.put("qbe_i_id", "//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("qbe_sl_status", "//*[contains(@id, 'pc1:t1:soc4::content')]");
        elements.put("qbe_i_code", "//*[contains(@id, 'pc1_afr_t1_afr_c35::content')]");
        elements.put("qbe_sl_origin", "//*[contains(@id, 'pc1:t1:soc5::content')]");
        elements.put("qbe_i_file", "//*[contains(@id, 'afr_t1_afr_c34::content')]");
        elements.put("qbe_i_load", "//*[contains(@id, 'afr_t1_afr_c16::content')]");
        elements.put("qbe_i_date", "//*[contains(@id, 'pc1:t1:id8::content')]");
        elements.put("qbe_i_error", "//*[contains(@id, 'pc1_afr_t1_afr_c17::content')]");
        elements.put("qbe_i_desc_error", "//*[contains(@id, 'pc1_afr_t1_afr_c19::content')]");
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_i_c_date", "//*[contains(@id, 'pc1:t1:id4::content')]");
        /**
         * TAB LOAD MAPPER FILE - TABLE LOAD
         */
        //TAB
        elements.put("load_tab", "//*[contains(@id, '1:sdi2::disAcr')]");
        //GENERALS
/*        elements.put("transaction_b_add", "/*//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("transaction_b_delete", "/*//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("transaction_b_edit", "/*//*[contains(@id, 'pcgt2:boton_edit')]");*/
        elements.put("load_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("load_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi0')]/td[2]");
        elements.put("load_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("load_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("load_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("load_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search2", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset2", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_from_date1", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_to_date1", "//*[contains(@id, 'qryId1:value01::content')]");
        elements.put("search_sl_operator2", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_file2", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_load2", "//*[contains(@id, 'qryId1:value30::content')]");
        //QBE
        elements.put("qbe_i_load2", "//*[contains(@id, 'afr_t1_afr_c11::content')]");
        elements.put("qbe_i_conf2", "//*[contains(@id, 'afr_t1_afr_c6::content')]");
        elements.put("qbe_sl_operator2", "//*[contains(@id, 'pc1:t1:soc1::content')]");
        elements.put("qbe_i_start", "//*[contains(@id, 'pc1:t1:id1::content')]");
        elements.put("qbe_i_end", "//*[contains(@id, 'pc1:t1:id2::content')]");
        elements.put("qbe_i_file2", "//*[contains(@id, 'afr_t1_afr_c2::content')]");
        elements.put("qbe_i_total", "//*[contains(@id, 'afr_t1_afr_c9::content')]");
        elements.put("qbe_i_correct", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("qbe_i_incorrect", "//*[contains(@id, 'afr_t1_afr_c4::content')]");
        elements.put("qbe_i_error2", "//*[contains(@id, 'afr_t1_afr_c5::content')]");
        elements.put("qbe_i_desc_error2", "//*[contains(@id, 'pc1_afr_t1_afr_c7::content')]");
    }
}
