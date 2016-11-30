package screen.AT2ACCOP0017;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 28/11/2016.
 */
public class AT2ACCOP0017Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0017Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    public void setElements() {
        //BASIC
        elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, '1:qryId1::reset')]");
        elements.put("b_validate", "//*[contains(@id, 'dyntdc:r1:1:cb1')]");
        elements.put("b_validate_b_yes", "//*[contains(@id, 'dyntdc:r1:1:d2::yes')]");
        elements.put("error_b_process_error", "//*[contains(@id, 'dyntdc:r1:1:cb2')]");
        elements.put("table_scroller", "//*[contains(@id, 'pc1:t1::scroller')]");

        elements.put("search_e_record", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        //SEARCH BLOCK
        elements.put("search_e_payment_up", "//*[contains(@id, 'c1::afrSI')]/tbody/tr/td[1]/a");
        elements.put("search_i_operation", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_transaction", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_orderreport", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_financialreport", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_receptive_b_lov", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_booking", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_order_code", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_select_otype", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_select_type", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_message", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_datefrom", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_dateto", "//*[contains(@id, 'qryId1:value101::content')]");
        elements.put("search_i_techerrorcode", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_techerrorcode_b_lov", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("search_i_techerrorcode_b_lov_i_error_code", "//*[contains(@id, 'value110::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_techerrordesc", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_maperrorcode", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_i_maperrorcode_b_lov", "//*[contains(@id, 'qryId1:value130::lovIconId')]");
        elements.put("search_i_maperrorcode_b_lov_i_error_code", "//*[contains(@id, 'value130::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_maperrordesc", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_select_warning", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_select_validate", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("search_i_validatedby", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("search_i_valdatefrom", "//*[contains(@id, 'qryId1:value180::content')]");
        elements.put("search_i_valdateto", "//*[contains(@id, 'qryId1:value181::content')]");
        //TOOLBAR
        elements.put("tb_b_query", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("tb_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //QUERY BE EXAMPLE
        elements.put("tb_b_query_i_error", "//*[contains(@id, 'pc1:t1:inputText6::content')]");
        elements.put("tb_b_query_b_error", "//*[contains(@id, 'pc1:t1:c13')]");
        elements.put("tb_b_query_i_operation", "//*[contains(@id, 'pc1:t1:it1::content')]");
        elements.put("tb_b_query_b_operation", "//*[contains(@id, 'pc1:t1:c11')]");
        elements.put("tb_b_query_i_order_code", "//*[contains(@id, '_afr_pc1_afr_t1_afr_c1::content')]");
        elements.put("tb_b_query_b_order_code", "//*[@id = 'pt1:dyntdc:r1:1:pc1:t1:c1']");
        elements.put("tb_b_query_i_transaction", "//*[contains(@id, 'pc1:t1:inputText1::content')]");
        elements.put("tb_b_query_b_transaction", "//*[contains(@id, 'pc1:t1:c4')]");
        elements.put("tb_b_query_i_receptivo", "//*[contains(@id, 'pc1:t1:inputText61::content')]");
        elements.put("tb_b_query_b_receptivo", "//*[contains(@id, 'pc1:t1:c24')]");
        elements.put("tb_b_query_i_booking", "//*[contains(@id, '_afr_pc1_afr_t1_afr_c19::content')]");
        elements.put("tb_b_query_b_booking", "//*[contains(@id, 'pc1:t1:c19')]");
        elements.put("tb_b_query_select_otype", "//*[contains(@id, 'pc1:t1:soc1::content')]");
        elements.put("tb_b_query_b_select_otype", "//*[contains(@id, 'pc1:t1:c8')]");
        elements.put("tb_b_query_select_type", "//*[contains(@id, 'pc1:t1:soc22::content')]");
        elements.put("tb_b_query_b_select_type", "//*[contains(@id, 'pc1:t1:c16')]");
        elements.put("tb_b_query_i_orderreport", "//*[contains(@id, 'pc1:t1:inputText7::content')]");
        elements.put("tb_b_query_b_orderreport", "//*[contains(@id, 'pc1:t1:c10')]");
        elements.put("tb_b_query_i_financialreport", "//*[contains(@id, 'pc1:t1:inputText2::content')]");
        elements.put("tb_b_query_b_financialreport", "//*[contains(@id, 'pc1:t1:c15')]");
        elements.put("tb_b_query_i_message", "//*[contains(@id, 'pc1:t1:inputText3::content')]");
        elements.put("tb_b_query_b_message", "//*[contains(@id, 'pc1:t1:c17')]");
        elements.put("tb_b_query_i_date", "//*[contains(@id, 'pc1:t1:id2::content')]");
        elements.put("tb_b_query_b_date", "//*[contains(@id, 'pc1:t1:c22')]");
        elements.put("tb_b_query_i_techerrorcode", "//*[contains(@id, 'pc1_afr_t1_afr_c20::content')]");
        elements.put("tb_b_query_b_techerrorcode", "//*[contains(@id, 'pc1:t1:c20')]");
        elements.put("tb_b_query_i_techerrordesc", "//*[contains(@id, 'pc1_afr_t1_afr_c21::content')]");
        elements.put("tb_b_query_b_techerrordesc", "//*[contains(@id, 'pc1:t1:c21')]");
        elements.put("tb_b_query_i_maperrorcode", "//*[contains(@id, 'pc1:t1:inputText4::content')]");
        elements.put("tb_b_query_b_maperrorcode", "//*[contains(@id, 'pc1:t1:c2')]");
        elements.put("tb_b_query_i_maperrordesc", "//*[contains(@id, 'pc1_afr_t1_afr_c3::content')]");
        elements.put("tb_b_query_b_maperrordesc", "//*[contains(@id, 'pc1:t1:c3')]");
        elements.put("tb_b_query_i_pspecode", "//*[contains(@id, 'pc1_afr_t1_afr_c23::content')]");
        elements.put("tb_b_query_b_pspecode", "//*[contains(@id, 'pc1:t1:c23')]");
        elements.put("tb_b_query_i_pspedesc", "//*[contains(@id, 'pc1_afr_t1_afr_c7::content')]");
        elements.put("tb_b_query_b_pspedesc", "//*[contains(@id, 'pc1:t1:c7')]");
        elements.put("tb_b_query_i_token", "//*[contains(@id, 'pc1_afr_t1_afr_c14::content')]");
        elements.put("tb_b_query_b_token", "//*[contains(@id, 'pc1:t1:c14')]");
        elements.put("tb_b_query_i_warning", "//*[contains(@id, 'pc1:t1:soc2::content')]");
        elements.put("tb_b_query_b_warning", "//*[contains(@id, 'pc1:t1:c9')]");
        elements.put("tb_b_query_i_validated", "//*[contains(@id, 'pc1:t1:soc35::content')]");
        elements.put("tb_b_query_b_validated", "//*[contains(@id, 'pc1:t1:c12')]");
        elements.put("tb_b_query_i_validatedby", "//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("tb_b_query_b_validatedby", "//*[contains(@id, 'pc1:t1:c5')]");
        elements.put("tb_b_query_i_validateddate", "//*[contains(@id, 'pc1:t1:id1::content')]");
        elements.put("tb_b_query_b_validateddate", "//*[contains(@id, 'pc1:t1:c18')]");
        elements.put("tb_clean_query", "//*[contains(@id, 'pc1:t1::ch::t')]/tbody/tr[2]/th/a");
        //GetText QbE
        elements.put("tb_error_monitoring","//*[contains(@id, 'pc1:t1::db')]");
        elements.put("tb_b_query_e_error", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("tb_b_query_e_operation", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("tb_b_query_e_order_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("tb_b_query_e_transaction", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("tb_b_query_e_receptivo", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("tb_b_query_e_booking", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("tb_b_query_e_operation_type", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("tb_b_query_e_type", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        elements.put("tb_b_query_e_order_report", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        elements.put("tb_b_query_e_financial_report", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[10]");
        elements.put("tb_b_query_e_message", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[11]");
        elements.put("tb_b_query_e_date", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[12]");
        elements.put("tb_b_query_e_tech_error_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[13]");
        elements.put("tb_b_query_e_tech_error_desc", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[14]");
        elements.put("tb_b_query_e_map_error_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[15]");
        elements.put("tb_b_query_e_map_error_desc", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[16]");
        elements.put("tb_b_query_e_psp_error_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[17]");
        elements.put("tb_b_query_e_psp_error_desc", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[18]");
        elements.put("tb_b_query_e_token_error", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[19]");
        elements.put("tb_b_query_e_warning", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[20]");
        elements.put("tb_b_query_e_validated", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[21]");
        elements.put("tb_b_query_e_validated_by", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[22]");
        elements.put("tb_b_query_e_validated_date", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[23]");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////        CHILDREN TAB        //////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Search AT2ACCOP0017CE
        elements.put("data_proces_b_payment", "//*[contains(@id, 'r2:1:sor1:_1')]");
        elements.put("data_proces_b_itp", "//*[contains(@id, 'r2:1:sor1:_0')]");
        elements.put("data_process_b_search", "//*[contains(@id, '1:cb1')]");
        elements.put("data_process_i_itp", "//*[contains(@id, 'it14::content')]");
        elements.put("data_process_i_payment", "//*[contains(@id, 'it15::content')]");
        elements.put("process_b_viewall", "//*[contains(@id, 'dyntdc:r6:1:cb4')]");
        elements.put("process_b_clear", "//*[contains(@id, '1:cb2')]");
        elements.put("process_b_process", "//*[contains(@id, '1:cb3')]");
        elements.put("itp_detail_i_itp", "//*[contains(@id, '1:it6::content')]");
        elements.put("paymnent_i_status", "//*[contains(@id, '1:statusId::content')]");
        elements.put("paymnent_lov_status", "//*[contains(@id, '1:statusId::lovIconId')]");
        elements.put("paymnent_i_psp_status", "//*[contains(@id, '1:it8::content')]");
        elements.put("paymnent_i_amount", "//*[contains(@id, 'it7::content')]");
        elements.put("paymnent_i_exponent", "//*[contains(@id, 'it11::content')]");
        elements.put("paymnent_i_currency", "//*[contains(@id, 'currency1Id::content')]");
        elements.put("paymnent_i_currency_lov", "//*[contains(@id, 'currency1Id::lovIconId')]");
        elements.put("search_b_process_b_ok", "//*[contains(@id, '1:d2::yes')]");
        elements.put("process_error_mensage", "//*[contains(@id, 'msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("paymnent_ls_payment_method", "//*[contains(@id, '1:soc1::content')]");
        elements.put("itp_detail_i_status", "//*[contains(@id, 'status2Id::content')]");
        elements.put("itp_detail_lov_status", "//*[contains(@id, '1:status2Id::lovIconId')]");
        elements.put("itp_detail_i_amount", "//*[contains(@id, '1:it4::content')]");
        elements.put("itp_detail_i_exponent", "//*[contains(@id, '1:it3::content')]");
        elements.put("itp_detail_i_currency", "//*[contains(@id, '1:currencyId::content')]");
        elements.put("itp_detail_lov_currency", "//*[contains(@id, '1:currencyId::lovIconId')]");
        elements.put("screen_principal", "//*[contains(@id, '1:tabIndex::disclosureAnchor')]");
    }
}
