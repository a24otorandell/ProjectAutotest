package screen.AT2ACCSU0051;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2ACCSU0051Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0051Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){
        //BOARD

        //ADD
        elements.put("board_add_b_add","//*[contains(@id, 'pc1:pcgt21:boton_add')]");
        elements.put("board_add_i_board","//*[contains(@id, 'pc1:pcgt21:it13::content')]");
        elements.put("board_add_ch_active","//*[contains(@id, 'pc1:pcgt21:sbc3::content')]");
        elements.put("board_add_ch_sa","//*[contains(@id, 'pc1:pcgt21:sbc4::content')]");
        elements.put("board_add_i_board_order","//*[contains(@id, 'pc1:pcgt21:it1::content')]");
        elements.put("board_add_ch_suplier_registered_online","//*[contains(@id, 'pc1:pcgt21:sbc5::content')]");
        elements.put("board_add_b_save","//*[contains(@id, 'pc1:pcgt21:btn_commitExit')]");


        //SEARCH

        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");
        elements.put("board_se_","//*[contains(@id, '");

        //EDIT
        elements.put("board_ed_b_add","//*[contains(@id, 'pc1:pcgt21:boton_add')]");
        elements.put("board_ed_i_board","//*[contains(@id, 'pc1:pcgt21:it13::content')]");
        elements.put("board_ed_ch_active","//*[contains(@id, 'pc1:pcgt21:sbc3::content')]");
        elements.put("board_ed_ch_sa","//*[contains(@id, 'pc1:pcgt21:sbc4::content')]");
        elements.put("board_ed_i_board_order","//*[contains(@id, 'pc1:pcgt21:it1::content')]");
        elements.put("board_ed_ch_suplier_registered_online","//*[contains(@id, 'pc1:pcgt21:sbc5::content')]");
        elements.put("board_ed_b_save","//*[contains(@id, 'pc1:pcgt21:btn_commitExit')]");

        //QBE
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");
        elements.put("board_qbe_","//*[contains(@id, '");

        //OTHER ACTIONS
        elements.put("board_oa_","//*[contains(@id, '");
        elements.put("board_oa_","//*[contains(@id, '");
        elements.put("board_oa_","//*[contains(@id, '");
        elements.put("board_oa_","//*[contains(@id, '");


        //DELETE
        elements.put("board_del_","//*[contains(@id, '");
        elements.put("board_del_","//*[contains(@id, '");
        elements.put("board_del_","//*[contains(@id, '");




    }
}
