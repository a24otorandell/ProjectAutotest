package screen.AT2MDMCL0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMCL0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("synchronization_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("synchronization_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("synchronization_e_result", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[1]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_id", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_client_system", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_client_registered", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_client_request", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_sl_status", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_date_received_01", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_date_received_02", "//*[contains(@id, 'value51::content')]");
        elements.put("search_i_date_modified_01", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_date_modified_02", "//*[contains(@id, 'value61::content')]");
        elements.put("search_i_type", "//*[contains(@id, 'value70::content')]");
        elements.put("search_i_desc", "//*[contains(@id, 'value80::content')]");
        elements.put("search_i_module", "//*[contains(@id, 'value90::content')]");
        //EDIT
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1PopUp:boton_commit')]");
        elements.put("add_sl_status", "//*[contains(@id, 'pc1:soc1::content')]");
        //GET DATA
        elements.put("table_i_id", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table_i_client_system", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[2]");
        elements.put("table_i_client_request", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[4]");
        elements.put("table_i_client_registered", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[3]");
        elements.put("table_i_date_modified", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[7]");
        elements.put("table_i_date_received", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[6]");
        elements.put("table_i_type", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[8]");
        elements.put("table_i_status", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[10]");
        elements.put("table_i_desc", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[9]");
        elements.put("table_i_module", "//*[contains(@id, 'pc1:syncTab::db')]/table/tbody/tr[1]/td[13]");
    }
}
