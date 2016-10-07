package screen.AT2ACCSU0073;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 06/10/2016.
 */
public class AT2ACCSU0073Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0073Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //BLOCK 1

        // FATHER TABLE

        //ADD

        elements.put("block1_tb_father_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("block1_tb_father_add_i_reason_code", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("block1_tb_father_add_i_description", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("block1_tb_father_add_ch_visible", "//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("block1_tb_father_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("block1_tb_father_se_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr']/a");
        elements.put("block1_tb_father_se_i_reason_code", "//*[contains(@id, 't1_afr_c2::content')]");
        elements.put("block1_tb_father_se_i_description", "//*[contains(@id, 't1_afr_c3::content')]");
        elements.put("block1_tb_father_se_sl_visible", "//*[contains(@id, 't1:socz21::content')]");
        elements.put("block1_tb_father_se_e_result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("block1_tb_father_ed_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("block1_tb_father_ed_i_reason_code", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("block1_tb_father_ed_i_description", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("block1_tb_father_ed_ch_visible", "//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("block1_tb_father_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("block1_tb_father_oa_b_actions", "//*[contains(@id, 'pcgm2:dc_m1']/div/table/tbody/tr/td[2]/a");
        elements.put("block1_tb_father_oa_", "//*[contains(@id, '");
        elements.put("block1_tb_father_oa_", "//*[contains(@id, '");
        elements.put("block1_tb_father_oa_", "//*[contains(@id, '");

        //SON TALBE


        //ADD

        elements.put("block1_tb_son_add_", "//*[contains(@id, '");
        elements.put("block1_tb_son_add_", "//*[contains(@id, '");
        elements.put("block1_tb_son_add_", "//*[contains(@id, '");
        elements.put("block1_tb_son_add_", "//*[contains(@id, '");
        elements.put("block1_tb_son_add_", "//*[contains(@id, '");


        //SEARCH

        elements.put("block1_tb_son_se_", "//*[contains(@id, '");
        elements.put("block1_tb_son_se_", "//*[contains(@id, '");
        elements.put("block1_tb_son_se_", "//*[contains(@id, '");
        elements.put("block1_tb_son_se_", "//*[contains(@id, '");
        elements.put("block1_tb_son_se_", "//*[contains(@id, '");

        //ADD

        elements.put("block1_tb_son_ed_", "//*[contains(@id, '");
        elements.put("block1_tb_son_ed_", "//*[contains(@id, '");
        elements.put("block1_tb_son_ed_", "//*[contains(@id, '");
        elements.put("block1_tb_son_ed_", "//*[contains(@id, '");
        elements.put("block1_tb_son_ed_", "//*[contains(@id, '");


        //OTHER ACTIONS
        elements.put("block1_tb_son_oa_", "//*[contains(@id, '");
        elements.put("block1_tb_son_oa_", "//*[contains(@id, '");
        elements.put("block1_tb_son_oa_", "//*[contains(@id, '");
        elements.put("block1_tb_son_oa_", "//*[contains(@id, '");

    }
}
