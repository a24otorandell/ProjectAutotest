package screen.AT2ACCOP0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0004Locators(String enviroment) {
        setElements();
    }
    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("accommodation_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("accommodation_b_actions_audit_data","//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("accommodation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_records", "//*[contains(@id, 'pc1:ot26')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'r1:1:cb1')]");
        elements.put("search_i_TO", "//*[contains(@id, 'r1:1:nomTtooId::content')]");
        elements.put("search_lov_TO", "//*[contains(@id, 'r1:1:nomTtooId::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'r1:1:codInterfaceId::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'r1:1:codInterfaceId::lovIconId')]");
        elements.put("search_e_interface_description", "//*[contains(@id, 'r1:1:it3::content')]");
        elements.put("search_i_email", "//*[contains(@id, 'r1:1:it1::content')]");
        elements.put("search_i_telephone", "//*[contains(@id, 'r1:1:it5::content')]");
        elements.put("search_i_ip_adress", "//*[contains(@id, 'r1:1:it8::content')]");
        elements.put("search_i_hash", "//*[contains(@id, 'r1:1:it2::content')]");
        elements.put("search_i_card_holder_name", "//*[contains(@id, 'r1:1:it6::content')]");
        elements.put("search_i_amount", "//*[contains(@id, 'r1:1:it7::content')]");
        elements.put("search_i_general_name", "//*[contains(@id, ':r1:1:it4::content')]");
        elements.put("search_i_partner", "//*[contains(@id, 'r1:1:nomPartnerId::content')]");
        elements.put("search_i_creation_date_from", "//*[contains(@id, 'r1:1:id2::content')]");
        elements.put("search_i_creation_date_to", "//*[contains(@id, 'r1:1:id4::content')]");
        elements.put("search_i_service_date_from", "//*[contains(@id, 'r1:1:id3::content')]");
        elements.put("search_i_service_date_to", "//*[contains(@id, 'r1:1:id1::content')]");
        elements.put("search_e_interface_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]");
        elements.put("search_e_TO_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[3]");
        elements.put("search_e_general_name_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[4]");
        elements.put("search_e_TO_reference_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[1]");
        elements.put("search_e_partner_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[2]");
        elements.put("search_e_destination_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[4]");
        elements.put("search_e_ip_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[5]");
        elements.put("search_e_creation_user_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]");
        elements.put("search_e_creation_date_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[7]");
        elements.put("search_e_from_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[8]");
        elements.put("search_e_to_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[9]");
        elements.put("search_e_telephone_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[10]");
        elements.put("search_e_email_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[11]");
        elements.put("search_e_hash_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[12]");
        elements.put("search_e_expiry_date_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[13]");
        elements.put("search_e_card_type_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[14]");
        elements.put("search_e_card_holder_name_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[15]");
        elements.put("search_e_confirmation_date_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[16]");
        elements.put("search_e_amount_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[17]");
        elements.put("search_e_currency_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[5]/div/table/tbody/tr/td[18]");

        //QBE
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_c20::content')]");
        elements.put("qbe_i_TO", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_general_name", "//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_TO_reference", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_partner", "//*[contains(@id, 'afr_c14::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_ip", "//*[contains(@id, 'afr_c18::content')]");
        elements.put("qbe_i_creation_user", "//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_i_creation_date", "//*[contains(@id, 'pc1:t1:id8::content')]");
        elements.put("qbe_i_from", "//*[contains(@id, 'pc1:t1:id5::content')]");
        elements.put("qbe_i_to", "//*[contains(@id, 'pc1:t1:id6::content')]");
        elements.put("qbe_i_telephone", "//*[contains(@id, 'afr_c17::content')]");
        elements.put("qbe_i_email", "//*[contains(@id, 'afr_c21::content')]");
        elements.put("qbe_i_hash", "//*[contains(@id, 'afr_c21::content')]");
        elements.put("qbe_i_expiry_date", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_card_type", "//*[contains(@id, 'afr_c16::content')]");
        elements.put("qbe_i_card_holder_name", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_i_confirmation_date", "//*[contains(@id, 'pc1:t1:id7::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'afr_c19::content')]");
    }
}
