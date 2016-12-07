package screen.AT2ACCCO0045;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 30/11/2016.
 */
public class AT2ACCCO0045Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCCO0045Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    public void setElements() {
        //QUERY
        elements.put("tb_query", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("tb_query_i_receptive", "//*[contains(@id, '_afr_resId1_afr_resId1c1::content')]");
        elements.put("tb_query_i_company", "//*[contains(@id, '_afr_resId1_afr_c4::content')]");
        elements.put("tb_query_i_office", "//*[contains(@id, '_afr_resId1_afr_c9::content')]");
        elements.put("tb_query_i_contract", "//*[contains(@id, '_afr_resId1_afr_resId1c2::content')]");
        elements.put("tb_query_i_code", "//*[contains(@id, '_afr_resId1_afr_resId1c3::content')]");
        elements.put("tb_query_i_description", "//*[contains(@id, '_afr_resId1_afr_c1::content')]");
        elements.put("tb_query_i_appdate", "//*[contains(@id, 'resId1:id2::content')]");
        elements.put("tb_query_i_validation", "//*[contains(@id, '_afr_resId1_afr_c2::content')]");
        elements.put("tb_query_i_state", "//*[contains(@id, '_pc1_afr_resId1_afr_c3::content')]");
        elements.put("tb_query_i_uaccept", "//*[contains(@id, 'pc1_afr_resId1_afr_c6::content')]");
        elements.put("tb_query_i_dateaccept", "//*[contains(@id, 'pc1:resId1:id1::content')]");

        //RESULTS
        elements.put("result_e_receptive", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("result_e_company", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("result_e_office", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("result_e_contract", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("result_e_rulecode", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("result_e_description", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("result_e_appdate", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        elements.put("result_e_uvalidate", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        elements.put("result_e_state", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[10]");
        elements.put("result_e_accept", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[11]");
        elements.put("result_e_user_accept", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[12]");
        elements.put("result_e_date_accept", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[13]");


        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");

        elements.put("search_i_company", "//*[contains(@id, 'value00::content')]");
        elements.put("search_company_lov", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_company_lov_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_office", "//*[contains(@id, 'value10::content')]");
        elements.put("search_office_lov", "//*[contains(@id, 'value10::lovIconId')]");
        elements.put("search_office_lov_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_accepted", "//*[contains(@id, 'qryId1:value20::content')]");

        elements.put("search_i_contract", "//*[contains(@id, 'value30::content')]");
        elements.put("search_contract_lov", "//*[contains(@id, 'value30::lovIconId')]");
        elements.put("search_contract_lov_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_rule_code", "//*[contains(@id, 'value40::content')]");
        elements.put("search_rule_code_lov", "//*[contains(@id, 'value40::lovIconId')]");
        elements.put("search_rule_code_lov_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("search_i_date_from", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_date_to", "//*[contains(@id, 'value51::content')]");

        //ACTIONS & QUERY
        elements.put("tb_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
    }
}
