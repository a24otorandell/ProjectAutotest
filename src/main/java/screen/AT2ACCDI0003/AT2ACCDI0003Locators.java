package screen.AT2ACCDI0003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author otorandell on 16/02/2016.
 */
public class AT2ACCDI0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCDI0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


         /* BOOSA1002 */
        elements.put("boosa1002_b_searchbook", "//*[contains(@id, '0:i10::icon')]");
        elements.put("boosa1002_b_bookingsearch", "//*[contains(@id, '0:cb2::icon')]");
        elements.put("boosa1002_b_bookingsearch_i_booking", "//*[contains(@id, '0:it55::content')]");
        elements.put("boosa1002_b_bookingsearch_b_search", "//*[contains(@id, '0:cb1header')]");
        elements.put("boosa1002_hotel_e_result_sale_b_edit", "//*[contains(@id, 'pc1:pcgt12:boton_edit')]");
        elements.put("boosa1002_hotel_e_result_sale_b_c", "//*[contains(@id, ':pc1:tSales:1:cb11')]");


         /* BOOSA0001 */
        elements.put("boosa0001_i_creationdate", "//*[contains(@id, 'id4::content')]");
        elements.put("boosa0001_b_search", "//*[contains(@id, 'pt1:dyntdc:r2:1:cb3')]");
        elements.put("boosa0001_e_result", "//*[contains(@id, '1:pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("boosa0001_e_result_e_bookreference", "//*[contains(@id, 'pc1:t1:0:cl1')]");
        elements.put("boosa0001_b_closetab", "//*[contains(@id, 'dynTabsPane:2:tabIndex::rmAbv')]");

        /* ACCDI0003 */

        elements.put("accdi0003_lov_destination", "//*[contains(@id, 'destinationId::lovIconId')]");
        elements.put("accdi0003_i_destination", "//*[contains(@id, 'destinationId::content')]");
        elements.put("accdi0003_lov_area", "//*[contains(@id, 'areaId::lovIconId')]");
        elements.put("accdi0003_i_area", "//*[contains(@id, 'areaId::content')]");
        elements.put("accdi0003_lov_area", "//*[contains(@id, 'areaId::lovIconId')]");
        elements.put("accdi0003_i_area", "//*[contains(@id, 'areaId::content')]");
        elements.put("accdi0003_lov_rate", "//*[contains(@id, 'rateId::lovIconId')]");
        elements.put("accdi0003_i_rate", "//*[contains(@id, 'rateId::content')]");
        elements.put("accdi0003_lov_transfer", "//*[contains(@id, 'transferId::lovIconId')]");
        elements.put("accdi0003_i_transfer", "//*[contains(@id, 'transferId::content')]");
        elements.put("accdi0003_lov_room", "//*[contains(@id, 'roomId::lovIconId')]");
        elements.put("accdi0003_i_room", "//*[contains(@id, 'roomId::content')]");
        elements.put("accdi0003_lov_characteristics", "//*[contains(@id, 'characteristicsId::lovIconId')]");
        elements.put("accdi0003_i_characteristics", "//*[contains(@id, 'characteristicsId::content')]");
        elements.put("accdi0003_lov_board", "//*[contains(@id, 'boardId::lovIconId')]");
        elements.put("accdi0003_i_board", "//*[contains(@id, 'boardId::content')]");
        elements.put("accdi0003_cb_agr", "//*[contains(@id, 'sbc1::content')]");
        elements.put("accdi0003_cb_payment", "//*[contains(@id, 'sbc2::content')]");
        elements.put("accdi0003_b_search", "//*[contains(@id, 'r1:0:r1:0:ctb1')]");
        elements.put("accdi0003_e_result", "//*[contains(@id, 'never found a result to catch')]");
        elements.put("accdi0003_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accdi0003_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");

         /* ACCDI0003 QbE */
        elements.put("accdi0003_b_qbe_i_hotel", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c16::content')]");
        elements.put("accdi0003_b_qbe_i_contract", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c19::content')]");
        elements.put("accdi0003_b_qbe_i_availability", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c13::content')]");
        elements.put("accdi0003_b_qbe_i_room", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c1::content')]");
        elements.put("accdi0003_b_qbe_i_characteristics", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c20::content')]");
        elements.put("accdi0003_b_qbe_i_rate", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c12::content')]");
        elements.put("accdi0003_b_qbe_i_release", "//*[contains(@id, 'r1:0:pc1:t2:id6::content')]");
        elements.put("accdi0003_b_qbe_i_amountpernight", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c28::content')]");
        elements.put("accdi0003_b_qbe_i_totalamount", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c4::content')]");
        elements.put("accdi0003_b_qbe_i_retailer", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c26::content')]");
        elements.put("accdi0003_b_qbe_i_checkin", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c2::content')]");
        elements.put("accdi0003_b_qbe_i_board", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t2_afr_c15::content')]");
        elements.put("accdi0003_b_qbe_select_touroperator", "//*[contains(@id, 'r1:0:pc1:t2:soc5::content')]");

    }
}
