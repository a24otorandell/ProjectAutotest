package screen.AT2BOOSA1002;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Locators {
    Map<String, String> elements = new HashMap<>();
    public AT2BOOSA1002Locators() {
        setElements();
    }
    public Map<String, String> getElements() {
        return elements;
    }
    public void setElements() {
        //Header
        elements.put("header_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("header_add_i_interface", "//*[contains(@id, 'fintCodInterfaceId::content')]");
        elements.put("header_add_lov_interface", "//*[contains(@id, 'fintCodInterfaceId::lovIconId')]");
        elements.put("header_add_i_to", "//*[contains(@id, 'nomTtooId::content')]");
        elements.put("header_add_lov_to", "//*[contains(@id, 'nomTtooId::lovIconId')]");
        elements.put("header_add_i_branch", "//*[contains(@id, 'gsucCodSucId::content')]");
        elements.put("header_add_lov_branch", "//*[contains(@id, 'gsucCodSucId::lovIconId')]");
        elements.put("header_add_i_user", "//*[contains(@id, 'nomAgenteId::content')]");
        elements.put("header_add_lov_user", "//*[contains(@id, 'ilov1::lovIconId')]");
        elements.put("header_add_i_booking_type", "//*[contains(@id, 'rtreCodTipoRes::content')]");
        elements.put("header_add_lov_booking_type", "//*[contains(@id, 'rtreCodTipoRes::lovIconId')]");
        elements.put("header_add_i_ag_ref", "//*[contains(@id, 'it23::content')]");
        elements.put("header_add_i_despt", "//*[contains(@id, 'soc11::content')]");
        elements.put("header_add_i_adults", "//*[contains(@id, 'it19::content')]");
        elements.put("header_add_i_child", "//*[contains(@id, 'it20::content')]");
        elements.put("header_add_i_baby", "//*[contains(@id, 'it21::content')]");
        elements.put("header_add_i_pax_mane", "//*[contains(@id, 'it22::content')]");
        elements.put("header_add_i_transfers_valuation", "//*[contains(@id, 'soc3::content')]");
        elements.put("header_add_b_save", "//*[contains(@id, 'pcgt1:boton_commit')]");

        elements.put("header_edit_booking_tab", "//*[contains(@id, ':2:tabIndex::disclosureAnchor')]");



        //search
        elements.put("search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("search_b_search", "//*[contains(@id, '0:cb1header')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");

        //Remarks
        //Booking observations
        elements.put("remmarks_tab_booking", "//*[contains(@id, '0:sdi1::disAcr')]");
        elements.put("remmarks_booking_i_bookingadd", "//*[contains(@id, '0:inputText1::content')]");
        elements.put("remmarks_booking_b_bookingadd", "//*[contains(@id, '0:ctb1::icon')]");
        elements.put("remmarks_booking_i_adminadd", "//*[contains(@id, '0:inputText2::content')]");
        elements.put("remmarks_booking_b_adminadd", "//*[contains(@id, '0:ctb2::icon')]");
        //TO tab
        elements.put("remmarks_to_tab", "//*[contains(@id, '0:sdi1::disAcr')]");
        elements.put("remmarks_to_i_commentsadd", "//*[contains(@id, '0:inputText1::content')]");
        elements.put("remmarks_to_b_commentsadd", "//*[contains(@id, '0:ctb1::icon')]");

        //ACTIONS
        elements.put("header_b_actions", "//*[contains(@id, '0:pcgm1:dc_m1')]/div/table/tbody/tr/td[3]/div");
        //TO_BOOKING
        elements.put("header_b_actions_b_tobooking", "//*[contains(@id, '0:pcgm1:dc_cmi2')]/td[2]");
        elements.put("header_b_actions_b_tobooking_b_accept", "//*[contains(@id, '0:cb10");
        //PAXES
        elements.put("header_b_actions_b_collectiondata", "//*[contains(@id, '0:pcgm1:dc_cmi5')]/td[2]");
        elements.put("header_b_actions_b_collectiondata_b_close", "//*[contains(@id, '0:d19::close')]");
        //HOTELOPIACLIENT
        elements.put("header_b_actions_b_hotelopiaclient", "//*[contains(@id, '0:pcgm1:dc_cmi7')]/td[2]");
        elements.put("header_b_actions_b_hotelopiaclient_b_chargecps", "//*[contains(@id, 'r1:1:r2:0:cb4')]");
        elements.put("header_b_actions_b_hotelopiaclient_b_chargecps_b_close", "//*[contains(@id, 'd10::close')]");





    }
}
