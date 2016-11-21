package screen.AT2MDMCL0020;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/11/2016.
 */
public class AT2MDMCL0020Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0020Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TAB USERS TABLE CREDENTIALS
         */
        //TAB
        elements.put("users_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERALS
        elements.put("credentials_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("credentials_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("credentials_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("credentials_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("credentials_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("credentials_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("credentials_e_result", "//*[contains(@id, 'pc1:anacon1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("credentials_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search1", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset1", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code","//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_pwd","//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_to","//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_to","//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_branch","//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_interface","//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_interface","//*[contains(@id,'qryId1:value40::content')]");
        elements.put("search_i_major","//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_sub_major","//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_detail","//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_branch2","//*[contains(@id, 'qryId1:value80::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_code","//*[contains(@id,'pc1:pcgt2:it4::content')]");
        elements.put("add_i_pwd","//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("add_lov_to","//*[contains(@id,'pc1:pcgt2:codTtooId::lovIconId')]");
        elements.put("add_i_to","//*[contains(@id, 'pc1:pcgt2:codTtooId::content')]");
        elements.put("add_e_des_ttoo","//*[contains(@id, 'pc1:pcgt2:it9::content')]");
        elements.put("add_lov_branch","//*[contains(@id,'pc1:pcgt2:sucTtooId::lovIconId')]");
        elements.put("add_i_branch","//*[contains(@id, 'pc1:pcgt2:sucTtooId::content')]");
        elements.put("add_e_des_sucursal","//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("add_lov_interface","//*[contains(@id, 'pc1:pcgt2:fintCodInterfaceId::lovIconId')]");
        elements.put("add_i_interface","//*[contains(@id, 'pc1:pcgt2:fintCodInterfaceId::content')]");
        elements.put("add_i_min","//*[contains(@id, 'pc1:pcgt2:it8::content')]");
        elements.put("add_i_major","//*[contains(@id, 'pc1:pcgt2:it7::content')]");
        elements.put("add_i_sub_major","//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_detail","//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_branch2","//*[contains(@id, 'pc1:pcgt2:it6::content')]");
        //QBE
        elements.put("qbe_i_code","//*[contains(@id, '_resId1c1::content')]");
        elements.put("qbe_i_password","//*[contains(@id, '_resId1c2::content')]");
        elements.put("qbe_i_to","//*[contains(@id, '_resId1c3::content')]");
        elements.put("qbe_i_des_ttoo","//*[contains(@id,'pc1_afr_anacon1_afr_resId1c4::content')]");
        elements.put("qbe_i_branch","//*[contains(@id, '_resId1c5::content')]");
        elements.put("qbe_i_des_sucursal","//*[contains(@id, 'pc1_afr_anacon1_afr_resId1c6::content')]");
        elements.put("qbe_i_interface","//*[contains(@id,'_resId1c7::content')]");
        elements.put("qbe_i_min","//*[contains(@id, 'pc1_afr_anacon1_afr_resId1c8::content')]");
        elements.put("qbe_i_major","//*[contains(@id, '_resId1c9::content')]");
        elements.put("qbe_i_sub_major","//*[contains(@id, '_resId1c10::content')]");
        elements.put("qbe_i_detail","//*[contains(@id, '_resId1c11::content')]");
        elements.put("qbe_i_branch2","//*[contains(@id, 'pc1_afr_anacon1_afr_resId1c12::content')]");
        /**
         * TAB USERS TABLE ENVIRONMENTS
         */
        //GENERALS
        elements.put("environment_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("environment_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("environment_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("environment_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("environment_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("environment_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("environment_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("environment_e_result", "//*[contains(@id, 'pc2:anacon2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("environment_e_records", "//*[contains(@id, 'pc2:ot18')]");
        elements.put("environment_e_ok_de", "//*[contains(@id, 'pc2:pcgt3:cbt1')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_environment_id", "//*[contains(@id, 'pc2:pcgt3:envIdId::content')]");
        elements.put("add_lov_environment_id", "//*[contains(@id, 'envIdId::lovIconId')]");
        elements.put("add_sl_status", "//*[contains(@id, 'soc1::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'it12::content')]");
        //QBE
        elements.put("qbe_i_environment_id", "//*[contains(@id, '_afr_c2::content')]");
        elements.put("qbe_sl_status", "//*[contains(@id, 'soc4::content')]");
        elements.put("qbe_i_remarks", "//*[contains(@id, '_afr_c1::content')]");
        /**
         * TAB USERS TABLE IP
         */
        //GENERALS
        elements.put("ip_b_add", "//*[contains(@id, 'pcgt4:boton_add')]");
        elements.put("ip_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
        elements.put("ip_b_edit", "//*[contains(@id, 'pcgt4:boton_edit')]");
        elements.put("ip_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("ip_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("ip_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("ip_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("ip_e_result", "//*[contains(@id, 'pc3:anacon3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("ip_e_records", "//*[contains(@id, 'pc3:ot27')]");
        elements.put("ip_e_extra_actions", "//*[contains(@id, 'pc3:t6::eoi')]");
        elements.put("ip_e_extra_detach", "//*[contains(@id, 'pc3:_tbr::eoi')]");
        //ADD
        elements.put("add_b_save3", "//*[contains(@id, 'pcgt4:btn_commitExit')]");
        elements.put("add_i_ip_id", "//*[contains(@id, 'idIpId::content')]");
        elements.put("add_lov_ip_id", "//*[contains(@id, 'idIpId::lovIconId')]");
        elements.put("add_i_devel_code", "//*[contains(@id, 'pcgt4:it17::content')]");
        //QBE
        elements.put("qbe_i_ip_id", "//*[contains(@id, 'pc3_afr_anacon3_afr_c6::content')]");
        elements.put("qbe_i_devel_code", "//*[contains(@id, 'pc3_afr_anacon3_afr_c5::content')]");
        /**
         * TAB DEVELOPER TABLE DEVELOVER
         */
        //TAB
        elements.put("developers_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERALS
        elements.put("develop_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("develop_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("develop_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("develop_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("develop_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("develop_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("develop_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("develop_e_result", "//*[contains(@id, 'pc1:anacon4::db')]/table/tbody/tr[1]/td[1]");
        elements.put("develop_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("develop_e_ok_de", "//*[contains(@id, 'pc1:pcgt2:cbt1')]");
        //SEARCH
        elements.put("search_b_search2", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset2", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_dev_code", "//*[contains(@id, 'value00::content')]");
        //ADD
        elements.put("add_b_save4", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_dev_code", "//*[contains(@id, 'it2::content')]");
        //QBE
        elements.put("qbe_i_dev_code", "//*[contains(@id, 'pc1_afr_anacon4_afr_resId1c1::content')]");
        /**
         * TAB DEVELOPER TABLE DEVELOPER IP
         */
        //GENERALS
        elements.put("develop_ip_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("develop_ip_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("develop_ip_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("develop_ip_b_actions", "//*[contains(@id, 'pcgm1:dc_mb1')]");
        elements.put("develop_ip_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("develop_ip_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("develop_ip_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("develop_ip_e_result", "//*[contains(@id, 'pc2:anacon5::db')]/table/tbody/tr[1]/td[1]");
        elements.put("develop_ip_e_records", "//*[contains(@id, 'pc2:ot5')]");
        //ADD
        elements.put("add_b_save5", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_ip", "//*[contains(@id, 'ipsId::content')]");
        elements.put("add_lov_ip", "//*[contains(@id, 'ipsId::lovIconId')]");
        //QBE
        elements.put("qbe_i_ip", "//*[contains(@id, '_afr_c1::content')]");
    }
}
