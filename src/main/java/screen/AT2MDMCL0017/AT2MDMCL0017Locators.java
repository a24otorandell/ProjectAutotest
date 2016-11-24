package screen.AT2MDMCL0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 24/11/2016.
 */
public class AT2MDMCL0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0017Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE GROUP
         */
        //GENERALS
        elements.put("group_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("group_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("group_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("group_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("group_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("group_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("group_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("group_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("group_e_records", "//*[contains(@id, 'pc1:ot5')]");
        elements.put("group_e_yes", "//*[contains(@id, 'pcgt2:cbt1')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'it9::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, '_pc1_afr_master_afr_c7::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, '_pc1_afr_master_afr_c6::content')]");
        /**
         * TABLE TO
         */
        //GENERALS
        elements.put("to_b_add", "//*[contains(@id, 'pcgt21:boton_add')]");
        elements.put("to_b_delete", "//*[contains(@id, 'pcgt21:boton_remove')]");
        elements.put("to_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("to_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("to_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("to_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("to_e_result", "//*[contains(@id, 'pc2:detail::db')]/table/tbody/tr[1]/td[1]");
        elements.put("to_e_records", "//*[contains(@id, 'pc2:ot25')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt21:btn_commitExit')]");
        elements.put("add_i_short", "//*[contains(@id, 'pcgt21:nomCortoTtooId::content')]");
        elements.put("add_lov_short", "//*[contains(@id, 'pcgt21:nomCortoTtooId::lovIconId')]");
        elements.put("add_i_name_to", "//*[contains(@id, 'pcgt21:ot7::content')]");
        //QBE
        elements.put("qbe_i_short", "//*[contains(@id, 'afr_pc2_afr_detail_afr_c17::content')]");
        elements.put("qbe_i_name_to", "//*[contains(@id, 'afr_pc2_afr_detail_afr_c18::content')]");
        /**
         * TABLE COMPANY
         */
        //GENERALS
        elements.put("company_b_delete", "//*[contains(@id, 'pcgt32:boton_remove')]");
        elements.put("company_b_qbe", "//*[contains(@id, 'pc31:_qbeTbr')]");
        elements.put("company_b_detach", "//*[contains(@id, 'pc31:_dchTbr')]");
        elements.put("company_e_result", "//*[contains(@id, 'pc31:empresa::db')]/table/tbody/tr[1]/td[1]");
        elements.put("company_e_records", "//*[contains(@id, 'pc31:ot35')]");
        elements.put("company_ck_select", "//*[contains(@id, 'empresa:0:sbc1::content')]");
        //QBE
        elements.put("qbe_i_company","//*[contains(@id,'pc31_afr_empresa_afr_c2::content')]");
        elements.put("qbe_i_c_name","//*[contains(@id,'pc31_afr_empresa_afr_c10::content')]");
        /**
         * TABLE OFFICE
         */
        //GENERALS
        elements.put("office_b_actions", "//*[contains(@id, 'pcgm41:dc_m1')]");
        elements.put("office_b_actions_audit_data", "//*[contains(@id, 'pcgm41:dc_cmi1')]/td[2]");
        elements.put("office_b_qbe", "//*[contains(@id, 'pc41:_qbeTbr')]");
        elements.put("office_b_detach", "//*[contains(@id, 'pc41:_dchTbr')]");
        elements.put("office_e_result", "//*[contains(@id, 'pc41:oficina::db')]/table/tbody/tr[1]/td[1]");
        elements.put("office_e_records", "//*[contains(@id, 'pc41:t43::eoi')]");
        //QBE
        elements.put("qbe_i_office","//*[contains(@id,'afr_pc41_afr_oficina_afr_c13::content')]");
        elements.put("qbe_i_o_name","//*[contains(@id,'afr_pc41_afr_oficina_afr_c12::content')]");
    }
}
