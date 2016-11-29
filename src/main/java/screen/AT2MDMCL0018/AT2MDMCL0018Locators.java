package screen.AT2MDMCL0018;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2MDMCL0018Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0018Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE CLIENT
         */
        //GENERALS
        elements.put("client_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("client_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("client_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("client_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("client_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("client_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("client_e_result", "//*[contains(@id, 'pc2:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("client_e_records", "//*[contains(@id, 'pc2:otp2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_agency_id", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_to_branch", "//*[contains(@id, 'value10::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_major", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_submajor", "//*[contains(@id, 'value40::content')]");
        elements.put("search_i_detail", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_branch_number", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_cache", "//*[contains(@id, 'value70::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_agency_id", "//*[contains(@id, 'it8::content')]");
        elements.put("add_i_to_branch", "//*[contains(@id, 'it9::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_major", "//*[contains(@id, 'it10::content')]");
        elements.put("add_i_submajor", "//*[contains(@id, 'it11::content')]");
        elements.put("add_i_detail", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_branch_number", "//*[contains(@id, 'it12::content')]");
        elements.put("add_i_cache", "//*[contains(@id, 'it13::content')]");
        //QBE
        elements.put("qbe_i_agency","//*[contains(@id,'pc2:master:it765::content')]");
        elements.put("qbe_i_branch_to","//*[contains(@id,'pc2:master:it25::content')]");
        elements.put("qbe_i_interface","//*[contains(@id,'pc2_afr_master_afr_c10::content')]");
        elements.put("qbe_i_major","//*[contains(@id,'pc2:master:it26::content')]");
        elements.put("qbe_i_subMajor","//*[contains(@id,'pc2:master:it27::content')]");
        elements.put("qbe_i_detail","//*[contains(@id,'pc2:master:it28::content')]");
        elements.put("qbe_i_cache","//*[contains(@id,'pc2:master:inputText1::content')]");
        elements.put("qbe_i_branch_number","//*[contains(@id,'pc2:master:it29::content')]");
        /**
         * TABLE AGENCIES
         */
        //GENERALS
        elements.put("agencies_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("agencies_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("agencies_b_actions", "//*[contains(@id, 'pdm4:dc_m1')]");
        elements.put("agencies_b_actions_audit_data", "//*[contains(@id, 'pdm4:dc_cmi1')]/td[2]");
        elements.put("agencies_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("agencies_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("agencies_e_result", "//*[contains(@id, 'pc1:child::db')]/table/tbody/tr[1]/td[1]");
        elements.put("agencies_e_records", "//*[contains(@id, 'pc1:otp95')]");
        elements.put("agencies_ok_audit" , "//*[contains(@id, 'd8::ok')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("a_add_i_agency_code", "//*[contains(@id, 'it36::content')]");
        elements.put("a_add_i_to_branch", "//*[contains(@id, 'it41::content')]");
        elements.put("a_add_i_agency_name", "//*[contains(@id, 'it35::content')]");
        elements.put("a_add_i_major", "//*[contains(@id, 'it43::content')]");
        elements.put("a_add_i_submajor", "//*[contains(@id, 'it39::content')]");
        elements.put("a_add_i_detail", "//*[contains(@id, 'it42::content')]");
        elements.put("a_add_i_atlas_code", "//*[contains(@id, 'it37::content')]");
        elements.put("a_add_i_atlas_branch", "//*[contains(@id, 'it40::content')]");
        elements.put("a_add_i_interface", "//*[contains(@id, 'it38::content')]");
        //QBE
        elements.put("a_qbe_i_agency_code", "//*[contains(@id, '_afr_c49::content')]");
        elements.put("a_qbe_i_to_branch", "//*[contains(@id, 'it31::content')]");
        elements.put("a_qbe_i_agency_name", "//*[contains(@id, '_afr_c25::content')]");
        elements.put("a_qbe_i_major", "//*[contains(@id, 'it32::content')]");
        elements.put("a_qbe_i_submajor", "//*[contains(@id, 'it33::content')]");
        elements.put("a_qbe_i_detail", "//*[contains(@id, 'it34::content')]");
        elements.put("a_qbe_i_atlas_code", "//*[contains(@id, '_afr_c38::content')]");
        elements.put("a_qbe_i_atlas_branch", "//*[contains(@id, '_afr_c18::content')]");
        elements.put("a_qbe_i_interface", "//*[contains(@id, '_afr_c31::content')]");
    }
}
