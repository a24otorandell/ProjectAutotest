package screen.AT2MDMSP0014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2MDMSP0014Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0014Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TAB CREDENTIALS - TABLE CREDENTIALS
         */
        //TAB
        elements.put("credentials_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERALS
        elements.put("table1_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("table1_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("table1_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("table1_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("table1_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("table1_e_result", "//*[contains(@id, 'pc1:hsi1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table1_e_records", "//*[contains(@id, 'pc1:othsi111')]");
        elements.put("table1_data", "//*[contains(@id, 'hsi1:1:it17::content')]");//getValue()
        //SEARCH
        elements.put("table1_search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("table1_search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("table1_search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("table1_search_i_password", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("table1_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("table1_add_i_user_code", "//*[contains(@id, 'it14::content')]");
        //QBE
        elements.put("table1_qbe_i_user", "//*[contains(@id, '_pc1_afr_hsi1_afr_c2::content')]");
        elements.put("table1_qbe_i_password", "//*[contains(@id, '_pc1_afr_hsi1_afr_c3::content')]");
        /**
         * TAB CREDENTIALS - TABLE ENVIRONMENTS
         */
        //GENERALS
        elements.put("table2_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("table2_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("table2_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("table2_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("table2_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("table2_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("table2_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("table2_e_result", "//*[contains(@id, 'pc2:hsi2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table2_e_records", "//*[contains(@id, 'pc2:othsi112')]");
        //ADD
        elements.put("table2_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("table2_add_i_id_env", "//*[contains(@id, 'envId1Id::content')]");
        elements.put("table2_add_lov_id_env", "//*[contains(@id, 'envId1Id::lovIconId')]");
        elements.put("table2_add_sl_status", "//*[contains(@id, 'soc2::content')]");
        elements.put("table2_add_i_comments", "//*[contains(@id, 'it15::content')]");
        //QBE
        elements.put("table2_qbe_i_id_env", "//*[contains(@id, '_hsi2_afr_c6::content')]");
        elements.put("table2_qbe_sl_status", "//*[contains(@id, 'soc7::content')]");
        elements.put("table2_qbe_i_comments", "//*[contains(@id, '_hsi2_afr_c4::content')]");
        /**
         * TAB CREDENTIALS - TABLE CLIENTS
         */
        //GENERALS
        elements.put("table3_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("table3_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("table3_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("table3_b_actions", "//*[contains(@id, 'pcgm3:dc_m1')]");
        elements.put("table3_b_actions_b_audit_data", "//*[contains(@id, 'pcgm3:dc_cmi0')]/td[2]");
        elements.put("table3_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("table3_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("table3_e_result", "//*[contains(@id, 'pc3:hsi3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table3_e_records", "//*[contains(@id, 'pc3:othsi113')]");
        //ADD
        elements.put("table3_add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("table3_add_i_clients", "//*[contains(@id, 'nomCli1Id::content')]");
        elements.put("table3_add_lov_clients", "//*[contains(@id, 'nomCli1Id::lovIconId')]");
        //QBE
        elements.put("table3_qbe_i_clients", "//*[contains(@id, '_hsi3_afr_c7::content')]");
        /**
         * TAB ENVIROMENTS - TABLE ENVIRONMENTS
         */
        //TAB
        elements.put("environments_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERAL
        elements.put("table4_b_add", "//*[contains(@id, 'pcgt4:boton_add')]");
        elements.put("table4_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
        elements.put("table4_b_edit", "//*[contains(@id, 'pcgt4:boton_edit')]");
        elements.put("table4_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]");
        elements.put("table4_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]");
        elements.put("table4_e_result", "//*[contains(@id, 'pc4:hsi4::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table4_e_records", "//*[contains(@id, 'pc4:ot2')]");
        //SEARCH
        elements.put("table4_search_b_search", "//*[contains(@id, 'qryId4::search')]");
        elements.put("table4_search_b_reset", "//*[contains(@id, 'qryId4::reset')]");
        elements.put("table4_search_i_id_env", "//*[contains(@id, 'value00::content')]");
        elements.put("table4_search_i_description", "//*[contains(@id, 'value10::content')]");
        elements.put("table4_search_i_reg_exp", "//*[contains(@id, 'value20::content')]");
        //ADD
        elements.put("table4_add_b_save", "//*[contains(@id, 'pcgt4:btn_commitExit')]");
        elements.put("table4_add_i_id_env", "//*[contains(@id, 'it1::content')]");
        elements.put("table4_add_i_description", "//*[contains(@id, 'it3::content')]");
        elements.put("table4_add_i_reg_exp", "//*[contains(@id, 'it2::content')]");
        //QBE
        elements.put("table4_qbe_i_id_env", "//*[contains(@id, '_pc4_afr_hsi4_afr_c14::content')]");
        elements.put("table4_qbe_i_description", "//*[contains(@id, '_pc4_afr_hsi4_afr_c13::content')]");
        elements.put("table4_qbe_i_reg_exp", "//*[contains(@id, '_pc4_afr_hsi4_afr_c12::content')]");
        /**
         * TAB CLIENTS - TABLE CLIENTS
         */
        //TAB
        elements.put("clients_tab", "//*[contains(@id, 'sdi3::disAcr')]");
        //GENERAL
        elements.put("table5_b_add", "//*[contains(@id, 'pcgt5:boton_add')]");
        elements.put("table5_b_edit", "//*[contains(@id, 'pcgt5:boton_edit')]");
        elements.put("table5_b_actions", "//*[contains(@id, 'pcgm5:dc_m1')]");
        elements.put("table5_b_actions_b_audit_data", "//*[contains(@id, 'pcgm5:dc_cmi0')]/td[2]");
        elements.put("table5_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]");
        elements.put("table5_b_detach", "//*[contains(@id, 'pc5:_dchTbr')]");
        elements.put("table5_e_result", "//*[contains(@id, 'pc5:hsi5::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table5_e_records", "//*[contains(@id, 'pc5:ot11')]");
        elements.put("table5_e_registro_seq", "//*[contains(@id, 'pc5:hsi5::db')]/table[1]/tbody/tr/td[2]/div/table/tbody/tr/td[1]");
        //SEARCH
        elements.put("table5_search_b_search", "//*[contains(@id, 'qryId5::search')]");
        elements.put("table5_search_b_reset", "//*[contains(@id, 'qryId5::reset')]");
        elements.put("table5_search_i_sequence", "//*[contains(@id, 'value00::content')]");
        elements.put("table5_search_i_name", "//*[contains(@id, 'value10::content')]");
        elements.put("table5_search_sl_status", "//*[contains(@id, 'value20::content')]");
        elements.put("table5_search_i_start_date", "//*[contains(@id, 'value30::content')]");
        elements.put("table5_search_i_go_live_date", "//*[contains(@id, 'value40::content')]");
        elements.put("table5_search_i_contact", "//*[contains(@id, 'value50::content')]");
        elements.put("table5_search_i_type_of_client", "//*[contains(@id, 'value60::content')]");
        elements.put("table5_search_lov_type_of_client", "//*[contains(@id, 'value60::lovIconId')]");
        elements.put("table5_search_i_comments", "//*[contains(@id, 'value70::content')]");
        elements.put("table5_search_i_operations", "//*[contains(@id, 'value80::content')]");
        //ADD
        elements.put("table5_add_b_save", "//*[contains(@id, 'pcgt5:btn_commitExit')]");
        elements.put("table5_add_i_sequence", "//*[contains(@id, 'it32::content')]");
        elements.put("table5_add_i_name", "//*[contains(@id, 'it35::content')]");
        elements.put("table5_add_sl_status", "//*[contains(@id, 'soc4::content')]");
        elements.put("table5_add_i_start_date", "//*[contains(@id, 'id8::content')]");
        elements.put("table5_add_i_go_live_date", "//*[contains(@id, 'id7::content')]");
        elements.put("table5_add_i_contact", "//*[contains(@id, 'it33::content')]");
        elements.put("table5_add_i_type_of_client", "//*[contains(@id, 'inputListOfValues2::content')]");
        elements.put("table5_add_lov_type_of_client", "//*[contains(@id, 'inputListOfValues2::lovIconId')]");
        elements.put("table5_add_i_comments", "//*[contains(@id, 'it34::content')]");
        elements.put("table5_add_i_operations", "//*[contains(@id, 'it36::content')]");
        //QBE
        elements.put("table5_qbe_i_sequence", "//*[contains(@id, '_pc5_afr_hsi5_afr_c24::content')]");
        elements.put("table5_qbe_i_name", "//*[contains(@id, '_pc5_afr_hsi5_afr_c23::content')]");
        elements.put("table5_qbe_sl_status", "//*[contains(@id, 'hsi5:soc8::content')]");
        elements.put("table5_qbe_i_start_date", "//*[contains(@id, 'hsi5:id6::content')]");
        elements.put("table5_qbe_i_go_live_date", "//*[contains(@id, 'hsi5:id5::content')]");
        elements.put("table5_qbe_i_contact", "//*[contains(@id, '_pc5_afr_hsi5_afr_c20::content')]");
        elements.put("table5_qbe_i_type_of_client", "//*[contains(@id, '_pc5_afr_hsi5_afr_c25::content')]");
        /**
         * TAB CLIENTS - TABLE IP
         */
        //GENERAL
        elements.put("table6_b_add", "//*[contains(@id, 'pcgt6:boton_add')]");
        elements.put("table6_b_delete", "//*[contains(@id, 'pcgt6:boton_remove')]");
        elements.put("table6_b_edit", "//*[contains(@id, 'pcgt6:boton_edit')]");
        elements.put("table6_b_qbe", "//*[contains(@id, 'pc6:_qbeTbr')]");
        elements.put("table6_b_detach", "//*[contains(@id, 'pc6:_dchTbr')]");
        elements.put("table6_e_result", "//*[contains(@id, 'pc6:hsi6::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table6_e_records", "//*[contains(@id, 'pc6:t12::oc')]/table/tbody/tr/td[3]/span");
        elements.put("table6_b_yes", "//*[contains(@id, 'pc6:dConfirmDelete::yes')]");

        //ADD
        elements.put("table6_add_b_save", "//*[contains(@id, 'pc6:btn_commitExit')]");
        elements.put("table6_add_i_ip", "//*[contains(@id, 'idIp1Id::content')]");
        elements.put("table6_add_lov_ip", "//*[contains(@id, 'idIp1Id::lovIconId')]");
        //QBE
        elements.put("table6_qbe_i_ip", "//*[contains(@id, '_hsi6_afr_c31::content')]");
        /**
         * TAB CLIENTS - TABLE ENVIRONMENT
         */
        //GENERAL
        elements.put("table7_b_add", "//*[contains(@id, 'pcgt7:boton_add')]");
        elements.put("table7_b_delete", "//*[contains(@id, 'pcgt7:boton_remove')]");
        elements.put("table7_b_edit", "//*[contains(@id, 'pcgt7:boton_edit')]");
        elements.put("table7_b_actions", "//*[contains(@id, 'PCGenericMenu1:dc_m1')]");
        elements.put("table7_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("table7_b_qbe", "//*[contains(@id, 'pc7:_qbeTbr')]");
        elements.put("table7_b_detach", "//*[contains(@id, 'pc7:_dchTbr')]");
        elements.put("table7_e_result", "//*[contains(@id, 'pc7:hsi7::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table7_e_records", "//*[contains(@id, 'pc7:ot20')]");
        //ADD
        elements.put("table7_add_b_save", "//*[contains(@id, 'pcgt7:btn_commitExit')]");
        elements.put("table7_add_i_id_env", "//*[contains(@id, 'envId1Id1::content')]");
        elements.put("table7_add_lov_id_env", "//*[contains(@id, 'envId1Id1::lovIconId')]");
        //QBE
        elements.put("table7_qbe_i_id_env", "//*[contains(@id, '_hsi7_afr_c29::content')]");
        /**
         * TAB IP'S TABLE IP'S
         */
        //TAB
        elements.put("ip_tab", "//*[contains(@id, 'sdi4::disAcr')]");
        //GENERAL
        elements.put("table8_b_add", "//*[contains(@id, 'pcgt8:boton_add')]");
        elements.put("table8_b_edit", "//*[contains(@id, 'pcgt8:boton_edit')]");
        elements.put("table8_b_actions", "//*[contains(@id, 'pc8:pcgm4:dc_m1')]");
        elements.put("table8_b_actions_b_audit_data", "//*[contains(@id, 'pc8:pcgm4:dc_cmi0')]/td[2]");
        elements.put("table8_b_qbe", "//*[contains(@id, 'pc8:_qbeTbr')]");
        elements.put("table8_b_detach", "//*[contains(@id, 'pc8:_dchTbr')]");
        elements.put("table8_e_result", "//*[contains(@id, 'pc8:hsi8::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table8_e_records", "//*[contains(@id, 'pc8:ot13')]");
        //SEARCH
        elements.put("table8_search_b_search", "//*[contains(@id, 'qryId8::search')]");
        elements.put("table8_search_b_reset", "//*[contains(@id, 'qryId8::reset')]");
        elements.put("table8_search_i_type", "//*[contains(@id, 'value00::content')]");
        elements.put("table8_search_sl_status", "//*[contains(@id, 'value10::content')]");
        elements.put("table8_search_i_ip_from_1", "//*[contains(@id, 'value20::content')]");
        elements.put("table8_search_i_ip_from_2", "//*[contains(@id, 'value30::content')]");
        elements.put("table8_search_i_ip_from_3", "//*[contains(@id, 'value40::content')]");
        elements.put("table8_search_i_ip_from_4", "//*[contains(@id, 'value50::content')]");
        elements.put("table8_search_i_ip_from_5", "//*[contains(@id, 'value60::content')]");
        elements.put("table8_search_i_comments", "//*[contains(@id, 'value70::content')]");
        //ADD
        elements.put("table8_add_b_save", "//*[contains(@id, 'pcgt8:btn_commitExit')]");
        elements.put("table8_add_ip", "//*[contains(@id, 'it8::content')]");
        elements.put("table8_add_i_type", "//*[contains(@id, 'it12::content')]");
        elements.put("table8_add_sl_status", "//*[contains(@id, 'soc1::content')]");
        elements.put("table8_add_i_ip_from_1", "//*[contains(@id, 'it7::content')]");
        elements.put("table8_add_i_ip_from_2", "//*[contains(@id, 'it10::content')]");
        elements.put("table8_add_i_ip_from_3", "//*[contains(@id, 'it9::content')]");
        elements.put("table8_add_i_ip_from_4", "//*[contains(@id, 'it6::content')]");
        elements.put("table8_add_i_ip_from_5", "//*[contains(@id, 'it11::content')]");
        elements.put("table8_add_i_comments", "//*[contains(@id, 'it5::content')]");
        //QBE
        elements.put("table8_qbe_i_ip", "//*[contains(@id, '_pc8_afr_hsi8_afr_c8::content')]");
        elements.put("table8_qbe_i_type", "//*[contains(@id, '_pc8_afr_hsi8_afr_c32::content')]");
        elements.put("table8_qbe_sl_status", "//*[contains(@id, 'hsi8:soc9::content')]");
        elements.put("table8_qbe_i_ip_from_1", "//*[contains(@id, '_pc8_afr_hsi8_afr_c11::content')]");
        elements.put("table8_qbe_i_ip_from_2", "//*[contains(@id, '_pc8_afr_hsi8_afr_c33::content')]");
        elements.put("table8_qbe_i_ip_from_3", "//*[contains(@id, '_pc8_afr_hsi8_afr_c34::content')]");
        elements.put("table8_qbe_i_ip_from_4", "//*[contains(@id, '_pc8_afr_hsi8_afr_c35::content')]");
        elements.put("table8_qbe_i_ip_from_5", "//*[contains(@id, '_pc8_afr_hsi8_afr_c36::content')]");
        /**
         * TAB TYPE OF CLIENTS - TABLE TYPE OF CLIENTS
         */
        //TAB
        elements.put("type_of_clients_tab", "//*[contains(@id, 'r1:1:sdi5::disAcr')]");
        //GENERAL
        elements.put("table9_b_add", "//*[contains(@id, 'pcgt9:boton_add')]");
        elements.put("table9_b_delete", "//*[contains(@id, 'pcgt9:boton_remove')]");
        elements.put("table9_b_edit", "//*[contains(@id, 'pcgt9:boton_edit')]");
        elements.put("table9_b_actions", "//*[contains(@id, 'pcgm9:dc_m1')]");
        elements.put("table9_b_actions_b_audit_data", "//*[contains(@id, 'pcgm9:dc_cmi0')]/td[2]");
        elements.put("table9_b_qbe", "//*[contains(@id, 'pc9:_qbeTbr')]");
        elements.put("table9_b_detach", "//*[contains(@id, 'pc9:_dchTbr')]");
        elements.put("table9_e_result", "//*[contains(@id, 'pc9:hsi9::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table9_e_records", "//*[contains(@id, 'pc9:ot6')]");
        //SEARCH
        elements.put("table9_search_b_search", "//*[contains(@id, 'qryId9::search')]");
        elements.put("table9_search_b_reset", "//*[contains(@id, 'qryId9::reset')]");
        elements.put("table9_search_i_supplier_sequence", "//*[contains(@id, 'value00::content')]");
        elements.put("table9_search_i_name", "//*[contains(@id, 'value10::content')]");
        //ADD
        elements.put("table9_add_b_save", "//*[contains(@id, 'pcgt9:btn_commitExit')]");
        elements.put("table9_add_i_supplier_sequence", "//*[contains(@id, 'it26::content')]");
        elements.put("table9_add_i_name", "//*[contains(@id, 'it27::content')]");
        //QBE
        elements.put("table9_qbe_i_supplier_sequence", "//*[contains(@id, '_pc9_afr_hsi9_afr_c15::content')]");
        elements.put("table9_qbe_i_name", "//*[contains(@id, '_pc9_afr_hsi9_afr_c37::content')]");
        /**
         * TAB TYPE OF CLIENTS - TABLE SUPPLIER
         */
        //GENERAL
        elements.put("table10_b_add", "//*[contains(@id, 'pcgt10:boton_add')]");
        elements.put("table10_b_delete", "//*[contains(@id, 'pcgt10:boton_remove')]");
        elements.put("table10_b_edit", "//*[contains(@id, 'pcgt10:boton_edit')]");
        elements.put("table10_b_actions", "//*[contains(@id, 'pcgm10:dc_m1')]");
        elements.put("table10_b_actions_b_audit_data", "//*[contains(@id, 'pcgm10:dc_cmi0')]/td[2]");
        elements.put("table10_b_qbe", "//*[contains(@id, 'pc10:_qbeTbr')]");
        elements.put("table10_b_detach", "//*[contains(@id, 'pc10:_dchTbr')]");
        elements.put("table10_e_result", "//*[contains(@id, 'pc10:hsi10::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table10_e_records", "//*[contains(@id, 'pc10:ot8')]");
        //ADD
        elements.put("table10_add_b_save", "//*[contains(@id, 'pcgt10:btn_commitExit')]");
        elements.put("table10_add_i_language", "//*[contains(@id, 'inputListOfValues1::content')]");
        elements.put("table10_add_lov_language", "//*[contains(@id, 'inputListOfValues1::lovIconId')]");
        elements.put("table10_add_i_description", "//*[contains(@id, 'it28::content')]");
        //QBE
        elements.put("table10_qbe_i_language", "//*[contains(@id, '_hsi10_afr_c17::content')]");
        elements.put("table10_qbe_i_description", "//*[contains(@id, '_hsi10_afr_c16::content')]");
    }
}
