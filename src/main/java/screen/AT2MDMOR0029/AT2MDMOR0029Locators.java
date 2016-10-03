package screen.AT2MDMOR0029;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 27/09/2016.
 */
public class AT2MDMOR0029Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0029Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        // ADD

        elements.put("service_authorization_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("service_authorization_add_ch_atlas_company", "//*[contains(@id, 'pcgt1:codEmpId1::lovIconId')]");
        elements.put("service_authorization_add_sl_atlas_company_e_company", "//*[contains(@id, 'pcgt1:codEmpId1::dropdownPopup::dropDownContent::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_authorization_add_i_atlas_company", "//*[contains(@id, 'pcgt1:codEmpId1::content')]");
        elements.put("service_authorization_add_ch_receptive", "//*[contains(@id, 'pcgt1:seqRecId1::lovIconId')]");
        elements.put("service_authorization_add_sl_receptive_e_code", "//*[contains(@id, 'pcgt1:seqRecId1::dropdownPopup::dropDownContent::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_authorization_add_i_receptive", "//*[contains(@id, 'pcgt1:seqRecId1::content')]");
        elements.put("service_authorization_add_i_text", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("service_authorization_add_i_apply_date_from", "//*[contains(@id, 'pcgt1:id6::content')]");
        elements.put("service_authorization_add_i_apply_fate_to", "//*[contains(@id, 'pcgt1:id5::content')]");
        elements.put("service_authorization_add_sl_cod_division", "//*[contains(@id, 'pcgt1:soc1::content')]");
        elements.put("service_authorization_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("service_authorization_se_se_company_atlas", "//*[contains(@id, 'codEmp2Id::lovIconId')]");
        elements.put("service_authorization_se_se_ompany_atlas_e_code", "//*[contains(@id, 'dyntdc:r1:1:codEmp2Id::dropdownPopup::dropDownContent::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_authorization_se_sl_receptive", "//*[contains(@id, 'seqRec2Id::lovIconId')]");
        elements.put("service_authorization_se_sl_receptive_e_code", "//*[contains(@id, 'seqRec2Id::dropdownPopup::dropDownContent::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_authorization_se_i_text", "//*[contains(@id, 'it4::content')]");
        elements.put("service_authorization_se_i_apply_date_from", "//*[contains(@id, 'id2::content')]");
        elements.put("service_authorization_se_i_apply_date_to", "//*[contains(@id, 'id1::content')]");
        elements.put("service_authorization_se_sl_cod_division", "//*[contains(@id, 'soc3::content')]");
        elements.put("service_authorization_se_b_search", "//*[contains(@id, '1:cb1')]");
        elements.put("service_authorization_se_b_reset", "//*[contains(@id, '1:cb2')]");
        elements.put("service_authorization_se_e_result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("service_authorization_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("service_authorization_ed_ch_atlas_company", "//*[contains(@id, 'pcgt1:codEmpId1::lovIconId')]");
        elements.put("service_authorization_ed_sl_atlas_company_e_company", "//*[contains(@id, 'pcgt1:codEmpId1::dropdownPopup::dropDownContent::db')]/table/tbody/tr[3]/td[1]");
        elements.put("service_authorization_ed_i_atlas_company", "//*[contains(@id, 'pcgt1:codEmpId1::content')]");
        elements.put("service_authorization_ed_ch_receptive", "//*[contains(@id, 'pcgt1:seqRecId1::lovIconId')]");
        elements.put("service_authorization_ed_sl_receptive_e_code", "//*[contains(@id, 'pcgt1:seqRecId1::dropdownPopup::dropDownContent::db')]/table/tbody/tr[1]/td[1]");
        elements.put("service_authorization_ed_i_receptive", "//*[contains(@id, 'pcgt1:seqRecId1::content')]");
        elements.put("service_authorization_ed_i_text", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("service_authorization_ed_i_apply_date_from", "//*[contains(@id, 'pcgt1:id6::content')]");
        elements.put("service_authorization_ed_i_apply_fate_to", "//*[contains(@id, 'pcgt1:id5::content')]");
        elements.put("service_authorization_ed_sl_cod_division", "//*[contains(@id, 'pcgt1:soc1::content')]");
        elements.put("service_authorization_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //QBE

        elements.put("service_authorization_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("service_authorization_qbe_i_atlas_company", "//*[contains(@id, 'afr_t1_afr_c5::content')]");
        elements.put("service_authorization_qbe_i_receptive", "//*[contains(@id, 't1:it5::content')]");
        elements.put("service_authorization_qbe_i_text", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("service_authorization_qbe_i_apply_date_from", "//*[contains(@id, 't1:id4::content')]");
        elements.put("service_authorization_qbe_i_apply_date_to", "//*[contains(@id, 'id3::content')]");
        elements.put("service_authorization_qbe_sl_cod_division", "//*[contains(@id, 'soc55::content')]");

        //OTHER ACTIONS

        elements.put("service_authorization_oa_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("service_authorization_del_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("service_authorization_del_b_delete_b_yes", "//*[contains(@id, 'pcgt1:cbt1')]");
        elements.put("service_authorization_del_e_records", "//*[contains(@id, 'pc1:ot5')]");








        /*elements.put("","//*[contains(@id, '')]");*/


    }
}