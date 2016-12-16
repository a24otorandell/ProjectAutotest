package screen.AT2MDMOR0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 15/12/2016.
 */
public class AT2MDMOR0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0001Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_message_generation", "//*[contains(@id, 'r1:1:cb1')]");
            elements.put("MDM_b_message_generation_yes", "//*[contains(@id, 'r1:1:d3::yes')]");
            //RECEIVERS
                //COMPANIES
                    elements.put("MDM_cmpns_b_qbe", "//*[contains(@id, 'r1:1:pc3:_qbeTbr')]");
                    elements.put("MDM_cmpns_b_detach", "//*[contains(@id, 'r1:1:pc3:_dchTbr')]");
                    elements.put("MDM_cmpns_e_result", "//*[contains(@id, 'r1:1:pc3:empTab::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_cmpns_cb_yn", "//*[contains(@id, 'r1:1:pc3:empTab:0:sbc1::content')]");
                    elements.put("MDM_cmpns_e_company_code_result", "//*[contains(@id, 'r1:1:pc3:empTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("MDM_cmpns_e_company_name_result", "//*[contains(@id, 'r1:1:pc3:empTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
                    elements.put("MDM_cmpns_e_records", "//*[contains(@id, 'r1:1:pc3:ot2')]");
                //OFFICES
                    elements.put("MDM_offs_b_qbe", "//*[contains(@id, 'r1:1:pc4:_qbeTbr')]");
                    elements.put("MDM_offs_b_detach", "//*[contains(@id, 'r1:1:pc4:_dchTbr')]");
                    elements.put("MDM_offs_b_detach_show", "//*[contains(@id, 'r1:1:pc4:_tbr::eoi')]");
                    elements.put("MDM_offs_e_result", "//*[contains(@id, 'r1:1:pc4:ofiTab::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_offs_cb_yn", "//*[contains(@id, 'r1:1:pc4:ofiTab:0:sbc2::content')]");
                    elements.put("MDM_offs_e_company_code_result", "//*[contains(@id, 'r1:1:pc4:ofiTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("MDM_offs_e_office_code_result", "//*[contains(@id, 'r1:1:pc4:ofiTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
                    elements.put("MDM_offs_e_office_name_result", "//*[contains(@id, 'r1:1:pc4:ofiTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
                    elements.put("MDM_offs_e_records", "//*[contains(@id, 'r1:1:pc4:ot15')]");
                //POSITIONS
                    elements.put("MDM_pstns_b_qbe", "//*[contains(@id, 'r1:1:pc2:_qbeTbr')]");
                    elements.put("MDM_pstns_b_detach", "//*[contains(@id, 'r1:1:pc2:_dchTbr')]");
                    elements.put("MDM_pstns_e_result", "//*[contains(@id, 'r1:1:pc2:snpTab::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_pstns_cb_yn", "//*[contains(@id, 'r1:1:pc2:snpTab:0:sbc3::content')]");
                    elements.put("MDM_pstns_e_position_code_result", "//*[contains(@id, 'r1:1:pc2:snpTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("MDM_pstns_e_position_description_result", "//*[contains(@id, 'r1:1:pc2:snpTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
                    elements.put("MDM_pstns_e_records", "//*[contains(@id, 'r1:1:pc2:otp2')]");
                //DEPARTMENTS
                    elements.put("MDM_dprtms_b_actions", "//*[contains(@id, 'r1:1:pc1:pcgm4:dc_m1')]");
                    elements.put("MDM_dprtms_b_actions_audit_data", "//*[contains(@id, 'r1:1:pc1:pcgm4:dc_cmi0')]/td[2]");
                    elements.put("MDM_dprtms_b_qbe", "//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
                    elements.put("MDM_dprtms_b_detach", "//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
                    elements.put("MDM_dprtms_e_result", "//*[contains(@id, 'r1:1:pc1:depTab::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_dprtms_cb_yn", "//*[contains(@id, 'r1:1:pc1:depTab:0:sbc4::content')]");
                    elements.put("MDM_dprtms_e_department_code_result", "//*[contains(@id, 'r1:1:pc1:depTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("MDM_dprtms_e_department_description_result", "//*[contains(@id, 'r1:1:pc1:depTab::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
                    elements.put("MDM_dprtms_e_records", "//*[contains(@id, 'r1:1:pc1:ot20')]");
            //INPUTS
                elements.put("add_i_text", "//*[contains(@id, 'r1:1:it3::content')]");
                elements.put("add_i_url", "//*[contains(@id, 'r1:1:it1::content')]");
                elements.put("add_sl_sender", "//*[contains(@id, 'r1:1:soc1::content')]");
                elements.put("add_e_creation_date", "//*[contains(@id, 'r1:1:it2::content')]");
        //QBE
            //RECEIVERS
                //COMPANIES
                    elements.put("qbe_cmpns_company_code", "//*[contains(@id, 'r1_afr_1_afr_pc3_afr_empTab_afr_c8::content')]");
                    elements.put("qbe_cmpns_company_name", "//*[contains(@id, 'r1_afr_1_afr_pc3_afr_empTab_afr_c7::content')]");
                //OFFICES
                    elements.put("qbe_offs_company_code", "//*[contains(@id, 'r1_afr_1_afr_pc4_afr_ofiTab_afr_c10::content')]");
                    elements.put("qbe_offs_office_code", "//*[contains(@id, 'r1_afr_1_afr_pc4_afr_ofiTab_afr_c9::content')]");
                    elements.put("qbe_offs_office_name", "//*[contains(@id, 'r1_afr_1_afr_pc4_afr_ofiTab_afr_c11::content')]");
                //POSITIONS
                    elements.put("qbe_pstns_position_code", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_snpTab_afr_c4::content')]");
                    elements.put("qbe_pstns_position_description", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_snpTab_afr_c5::content')]");
                //DEPARTMENTS
                    elements.put("qbe_dprtms_department_code", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_depTab_afr_c2::content')]");
                    elements.put("qbe_dprtms_department_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_depTab_afr_c1::content')]");
    }
}