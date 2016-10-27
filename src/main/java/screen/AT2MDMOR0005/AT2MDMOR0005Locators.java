package screen.AT2MDMOR0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 27/10/2016.
 */
public class AT2MDMOR0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("companies_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("companies_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("companies_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("companies_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
        elements.put("companies_b_actions_b_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
        elements.put("companies_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("companies_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("companies_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("companies_e_records", "//*[contains(@id, 'pc1:ot111')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_vat", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_sap", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_creditor", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_creditor", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_debtor", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_lov_debtor", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pcgt1:it9::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'pcgt1:it14::content')]");
        elements.put("add_i_short_name", "//*[contains(@id, 'pcgt1:it26::content')]");
        elements.put("add_i_vat", "//*[contains(@id, 'pcgt1:it18::content')]");
        elements.put("add_i_sap", "//*[contains(@id, 'pc1:pcgt1:it8::content')]");
        elements.put("add_i_creditor", "//*[contains(@id, 'pcgt1:ssprCodAcreedor1Id::content')]");
        elements.put("add_lov_creditor", "//*[contains(@id, 'pcgt1:ssprCodAcreedor1Id::lovIconId')]");
        elements.put("add_i_debtor", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues1::content')]");
        elements.put("add_lov_debtor", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues1::lovIconId')]");
        elements.put("add_i_street_type", "//*[contains(@id, 'pcgt1:gviaCodTipoVia1Id::content')]");
        elements.put("add_lov_street_type", "//*[contains(@id, 'pcgt1:gviaCodTipoVia1Id::lovIconId')]");
        elements.put("add_i_street", "//*[contains(@id, 'pcgt1:it35::content')]");
        elements.put("add_i_n_from", "//*[contains(@id, 'pcgt1:it27::content')]");
        elements.put("add_i_n_to", "//*[contains(@id, 'pcgt1:it25::content')]");
        elements.put("add_i_street_date", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_stairway", "//*[contains(@id, 'pcgt1:it24::content')]");
        elements.put("add_i_floor", "//*[contains(@id, 'pcgt1:it21::content')]");
        elements.put("add_i_door", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("add_i_country", "//*[contains(@id, 'pcgt1:gpaiCodPais1Id::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'pcgt1:gpaiCodPais1Id::lovIconId')]");
        elements.put("add_i_country_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");  //FI - ES
        elements.put("add_i_county", "//*[contains(@id, 'pcgt1:gprvCodProv1Id::content')]");
        elements.put("add_lov_county", "//*[contains(@id, 'pcgt1:gprvCodProv1Id::lovIconId')]");
        elements.put("add_i_county_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");  //10 - 07
        elements.put("add_i_city", "//*[contains(@id, 'pc1:pcgt1:poblacion1Id::content')]");
        elements.put("add_lov_city", "//*[contains(@id, 'pc1:pcgt1:poblacion1Id::lovIconId')]");
        elements.put("add_i_postal_code", "//*[contains(@id, 'pc1:pcgt1:it13::content')]");
        elements.put("add_i_address", "//*[contains(@id, 'pc1:pcgt1:it19::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'afr_resId1c7::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_vat", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_sap", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_creditor", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_i_debtor", "//*[contains(@id, 'afr_resId1c9::content')]");
    }
}
