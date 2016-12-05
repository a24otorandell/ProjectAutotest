package screen.AT2MDMCL0045;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2MDMCL0045Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0045Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("results_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("results_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("results_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("results_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("results_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("results_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("results_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("results_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("results_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("results_ck_active", "//*[contains(@id, 'sbc3::content')]/span/img");
        elements.put("results_ck_payment", "//*[contains(@id, 'sbc4::content')]/span/img");
        elements.put("results_ck_extra", "//*[contains(@id, 'sbc5::content')]/span/img");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("search_i_key", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_client", "//*[contains(@id, 'value10::content')]");
        elements.put("search_lov_client", "//*[contains(@id, 'value10::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'value20::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'value20::lovIconId')]");
        elements.put("search_i_branch", "//*[contains(@id, 'value30::content')]");
        elements.put("search_lov_branch", "//*[contains(@id, 'value30::lovIconId')]");
        //EDIT
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_key", "//*[contains(@id, 'it7::content')]");
        elements.put("add_i_secret_key", "//*[contains(@id, 'it8::content')]");
        elements.put("add_i_client", "//*[contains(@id, 'ttooId::content')]");
        elements.put("add_lov_client", "//*[contains(@id, 'ttooId::lovIconId')]");
        elements.put("add_i_interface", "//*[contains(@id, 'interfaceCodeId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'interfaceCodeId::lovIconId')]");
        elements.put("add_i_branch", "//*[contains(@id, 'branchId::content')]");
        elements.put("add_lov_branch", "//*[contains(@id, 'branchId::lovIconId')]");
        elements.put("add_ck_active", "//*[contains(@id, 'sbc5::content')]");
        elements.put("add_i_api_name", "//*[contains(@id, 'it3::content')]");
        elements.put("add_i_application", "//*[contains(@id, 'it12::content')]");
        elements.put("add_i_package", "//*[contains(@id, 'it13::content')]");
        elements.put("add_i_plan", "//*[contains(@id, 'it14::content')]");
        elements.put("add_i_package_key", "//*[contains(@id, 'it15::content')]");
        elements.put("add_i_member_username", "//*[contains(@id, 'it16::content')]");
        elements.put("add_i_member_email", "//*[contains(@id, 'it17::content')]");
        elements.put("add_ck_payment", "//*[contains(@id, 'sbc2::content')]");
        elements.put("add_ck_extra", "//*[contains(@id, 'sbc6::content')]");
        //QBE        
        elements.put("qbe_i_key","//*[contains (@id, 'afr_pc1_afr_t1_afr_c1::content')]");
        elements.put("qbe_i_secret_key","//*[contains (@id,'afr_pc1_afr_t1_afr_c11::content')]");
        elements.put("qbe_i_client","//*[contains (@id,'afr_pc1_afr_t1_afr_c7::content')]");
        elements.put("qbe_i_client_desc","//*[contains (@id,'afr_pc1_afr_t1_afr_c16::content')]");
        elements.put("qbe_i_interface","//*[contains (@id,'afr_pc1_afr_t1_afr_c2::content')]");
        elements.put("qbe_i_interface_desc","//*[contains (@id,'afr_pc1_afr_t1_afr_c15::content')]");
        elements.put("qbe_i_branch","//*[contains (@id,'afr_pc1_afr_t1_afr_c6::content')]");
        elements.put("qbe_sl_active","//*[contains (@id,'t1:selectOneChoice1::content')]");
        elements.put("qbe_i_api_name","//*[contains (@id,'afr_pc1_afr_t1_afr_c10::content')]");
        elements.put("qbe_i_application","//*[contains (@id,'afr_pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_i_package", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c8::content')]");
        elements.put("qbe_i_plan", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c5::content')]");
        elements.put("qbe_i_package_key", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c9::content')]");
        elements.put("qbe_i_member_username", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c13::content')]");
        elements.put("qbe_i_member_email", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c14::content')]");
        elements.put("qbe_sl_payment","//*[contains (@id,'selectOneChoice2::content')]");
        elements.put("qbe_sl_extra","//*[contains (@id,'selectOneChoice3::content')]");
    }
}
