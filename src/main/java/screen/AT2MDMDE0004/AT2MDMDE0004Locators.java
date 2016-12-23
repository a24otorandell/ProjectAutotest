package screen.AT2MDMDE0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/12/2016.
 */
public class AT2MDMDE0004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0004Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERALS
        //-----------------------------------------------------------------------------------------------------------------------------------
            //GENERAL TABS
                elements.put("MDM_b_countries", "//*[contains(@id, 'r1:1:sdi1::disAcr')]");
                elements.put("MDM_b_data", "//*[contains(@id, 'r1:1:sdi2::disAcr')]");
                elements.put("MDM_b_general_service", "//*[contains(@id, 'r1:1:sdi3::disAcr')]");
                elements.put("MDM_b_highlights", "//*[contains(@id, 'r1:1:sdi4::disAcr')]");
                elements.put("MDM_b_tops", "//*[contains(@id, 'r1:1:sdi5::disAcr')]");
            //COUNTRIES
                //COUNTRIES
                    elements.put("MDM_cntrs_b_add", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:boton_add')]");
                    elements.put("MDM_cntrs_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:boton_remove')]");
                    elements.put("MDM_cntrs_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:cbt1')]");
                    elements.put("MDM_cntrs_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:boton_edit')]");
                    elements.put("MDM_cntrs_b_actions", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgm2:dc_m1')]");
                    elements.put("MDM_cntrs_b_actions_audit_data", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgm2:dc_cmi0')]/td[2]");
                    elements.put("MDM_cntrs_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc4:_qbeTbr')]");
                    elements.put("MDM_cntrs_b_clear_qbe", "//*[contains(@id, 'r1:1:r1:0:pc4:cwcCon::ch::t')]/tbody/tr[2]/th/a");
                    elements.put("MDM_cntrs_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc4:_dchTbr')]");
                    elements.put("MDM_cntrs_e_result", "//*[contains(@id, 'r1:1:r1:0:pc4:cwcCon::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_cntrs_e_records", "//*[contains(@id, 'r1:1:r1:0:pc4:ot33')]");
            //COUNTRIES TABS
                elements.put("MDM_cntrs_b_country_images", "//*[contains(@id, 'r1:1:r1:0:sdi1::disAcr')]");
                elements.put("MDM_cntrs_b_big_image", "//*[contains(@id, 'r1:1:r1:0:sdi2::disAcr')]");
                elements.put("MDM_cntrs_b_small_image", "//*[contains(@id, 'r1:1:r1:0:sdi3::disAcr')]");
                elements.put("MDM_cntrs_b_map_image", "//*[contains(@id, 'r1:1:r1:0:sdi4::disAcr')]");
                elements.put("MDM_cntrs_b_map_image2", "//*[contains(@id, 'r1:1:r1:0:sdi5::disAcr')]");
                //COUNTRY IMAGES
                    //MAP LANGUAGE DESCRIPTION
                        elements.put("MDM_mld_b_add", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:boton_add')]");
                        elements.put("MDM_mld_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:boton_remove')]");
                        elements.put("MDM_mld_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:cbt1')]");
                        elements.put("MDM_mld_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:boton_edit')]");
                        elements.put("MDM_mld_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc1:_qbeTbr')]");
                        elements.put("MDM_mld_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc1:_dchTbr')]");
                        elements.put("MDM_mld_e_result", "//*[contains(@id, 'r1:1:r1:0:pc1:mapaLink::db')]/table/tbody/tr/td[1]");
                        elements.put("MDM_mld_e_records", "//*[contains(@id, 'r1:1:r1:0:pc1:ot31')]");
                    //COMMERCIAL CONTACT
                        elements.put("MDM_cmmc_b_add", "//*[contains(@id, 'r1:1:r1:0:pcgft99:boton_add')]");
                        elements.put("MDM_cmmc_b_delete", "//*[contains(@id, 'r1:1:r1:0:pcgft99:boton_remove')]");
                        elements.put("MDM_cmmc_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:dConfirmDel::yes')]");
                        elements.put("MDM_cmmc_b_edit", "//*[contains(@id, 'r1:1:r1:0:pcgft99:boton_edit')]");
                    //COMMERCIAL CONTACT 2
                        elements.put("MDM_cmmc2_b_add", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:boton_add')]");
                        elements.put("MDM_cmmc2_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:boton_remove')]");
                        elements.put("MDM_cmmc2_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:cbt1')]");
                        elements.put("MDM_cmmc2_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:boton_edit')]");
                        elements.put("MDM_cmmc2_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc5:_qbeTbr')]");
                        elements.put("MDM_cmmc2_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc5:_dchTbr')]");
                        elements.put("MDM_cmmc2_e_result", "//*[contains(@id, 'r1:1:r1:0:pc5:contId::db')]/table/tbody/tr/td[1]");
                        elements.put("MDM_cmmc2_e_records", "//*[contains(@id, 'r1:1:r1:0:pc5:ot23')]");
                //BIG IMAGE
                    elements.put("MDM_bigi_b_add", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:boton_add')]");
                    elements.put("MDM_bigi_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:boton_remove')]");
                    elements.put("MDM_bigi_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:cbt1')]");
                    elements.put("MDM_bigi_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:boton_edit')]");
                    elements.put("MDM_bigi_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc11:_qbeTbr')]");
                    elements.put("MDM_bigi_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc11:_dchTbr')]");
                    elements.put("MDM_bigi_e_result", "//*[contains(@id, 'r1:1:r1:0:pc11:imag::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_bigi_e_records", "//*[contains(@id, 'r1:1:r1:0:pc11:otp2')]");
                //SMALL IMAGE
                    elements.put("MDM_smalli_b_add", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:boton_add')]");
                    elements.put("MDM_smalli_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:boton_remove')]");
                    elements.put("MDM_smalli_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:cbt1')]");
                    elements.put("MDM_smalli_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:boton_edit')]");
                    elements.put("MDM_smalli_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc31:_qbeTbr')]");
                    elements.put("MDM_smalli_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc31:_dchTbr')]");
                    elements.put("MDM_smalli_e_result", "//*[contains(@id, 'r1:1:r1:0:pc31:simag::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_smalli_e_records", "//*[contains(@id, 'r1:1:r1:0:pc31:otp32')]");
                //MAP IMAGE
                    elements.put("MDM_mapi_b_add", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:boton_add')]");
                    elements.put("MDM_mapi_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:boton_remove')]");
                    elements.put("MDM_mapi_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:cbt1')]");
                    elements.put("MDM_mapi_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:boton_edit')]");
                    elements.put("MDM_mapi_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc41:_qbeTbr')]");
                    elements.put("MDM_mapi_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc41:_dchTbr')]");
                    elements.put("MDM_mapi_e_result", "//*[contains(@id, 'r1:1:r1:0:pc41:mimag::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_mapi_e_records", "//*[contains(@id, 'r1:1:r1:0:pc41:otp52')]");
                //MAP IMAGE 2
                    elements.put("MDM_mapi2_b_add", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:boton_add')]");
                    elements.put("MDM_mapi2_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:boton_remove')]");
                    elements.put("MDM_mapi2_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:cbt1')]");
                    elements.put("MDM_mapi2_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:boton_edit')]");
                    elements.put("MDM_mapi2_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc51:_qbeTbr')]");
                    elements.put("MDM_mapi2_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc51:_dchTbr')]");
                    elements.put("MDM_mapi2_e_result", "//*[contains(@id, 'r1:1:r1:0:pc51:mimag2::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_mapi2_e_records", "//*[contains(@id, 'r1:1:r1:0:pc51:otp42')]");
            //DATA
                //SLOGANS
                    elements.put("MDM_dslgns_b_add", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_dslgns_b_delete", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_dslgns_b_delete_ok", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_dslgns_b_edit", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:boton_edit')]");
                    elements.put("MDM_dslgns_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc1:_qbeTbr')]");
                    elements.put("MDM_dslgns_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc1:_dchTbr')]");
                    elements.put("MDM_dslgns_e_result", "//*[contains(@id, 'r1:1:r2:0:pc1:slogan::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_dslgns_e_records", "//*[contains(@id, 'r1:1:r2:0:pc1:otp2')]");
                //LONG DESCRIPTION
                    elements.put("MDM_longd_b_add", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:boton_add')]");
                    elements.put("MDM_longd_b_delete", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:boton_remove')]");
                    elements.put("MDM_longd_b_delete_ok", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:cbt1')]");
                    elements.put("MDM_longd_b_edit", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:boton_edit')]");
                    elements.put("MDM_longd_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc2:_qbeTbr')]");
                    elements.put("MDM_longd_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc2:_dchTbr')]");
                    elements.put("MDM_longd_e_result", "//*[contains(@id, 'r1:1:r2:0:pc2:pddes::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_longd_e_records", "//*[contains(@id, 'r1:1:r2:0:pc2:ot31')]");
                //SHORT DESCRIPTION
                    elements.put("MDM_shortd_b_add", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:boton_add')]");
                    elements.put("MDM_shortd_b_delete", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:boton_remove')]");
                    elements.put("MDM_shortd_b_delete_ok", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:cbt1')]");
                    elements.put("MDM_shortd_b_edit", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:boton_edit')]");
                    elements.put("MDM_shortd_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc3:_qbeTbr')]");
                    elements.put("MDM_shortd_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc3:_dchTbr')]");
                    elements.put("MDM_shortd_e_result", "//*[contains(@id, 'r1:1:r2:0:pc3:desCor::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_shortd_e_records", "//*[contains(@id, 'r1:1:r2:0:pc3:ot33')]");
            //GENERAL SERVICE
                //SLOGANS
                    elements.put("MDM_gsslgns_b_add", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_gsslgns_b_delete", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_gsslgns_b_delete_ok", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_gsslgns_b_edit", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:boton_edit')]");
                    elements.put("MDM_gsslgns_b_qbe", "//*[contains(@id, 'r1:1:r3:0:pc1:_qbeTbr')]");
                    elements.put("MDM_gsslgns_b_detach", "//*[contains(@id, 'r1:1:r3:0:pc1:_dchTbr')]");
                    elements.put("MDM_gsslgns_e_result", "//*[contains(@id, 'r1:1:r3:0:pc1:slogHl::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_gsslgns_e_records", "//*[contains(@id, 'r1:1:r3:0:pc1:otp2')]");
                //GENERAL SERVICE
                    elements.put("MDM_gnrls_b_add", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:boton_add')]");
                    elements.put("MDM_gnrls_b_delete", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:boton_remove')]");
                    elements.put("MDM_gnrls_b_delete_ok", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:cbt1')]");
                    elements.put("MDM_gnrls_b_edit", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:boton_edit')]");
                    elements.put("MDM_gnrls_b_qbe", "//*[contains(@id, 'r1:1:r3:0:pc2:_qbeTbr')]");
                    elements.put("MDM_gnrls_b_detach", "//*[contains(@id, 'r1:1:r3:0:pc2:_dchTbr')]");
                    elements.put("MDM_gnrls_e_result", "//*[contains(@id, 'r1:1:r3:0:pc2:pdHigh::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_gnrls_e_records", "//*[contains(@id, 'r1:1:r3:0:pc2:ot31')]");
                //LANGUAGES
                    elements.put("MDM_gnrlslngs_b_add", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:boton_add')]");
                    elements.put("MDM_gnrlslngs_b_delete", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:boton_remove')]");
                    elements.put("MDM_gnrlslngs_b_delete_ok", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:cbt1')]");
                    elements.put("MDM_gnrlslngs_b_edit", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:boton_edit')]");
                    elements.put("MDM_gnrlslngs_b_qbe", "//*[contains(@id, 'r1:1:r3:0:pc3:_qbeTbr')]");
                    elements.put("MDM_gnrlslngs_b_detach", "//*[contains(@id, 'r1:1:r3:0:pc3:_dchTbr')]");
                    elements.put("MDM_gnrlslngs_e_result", "//*[contains(@id, 'r1:1:r3:0:pc3:highId::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_gnrlslngs_e_records", "//*[contains(@id, 'r1:1:r3:0:pc3:ot33')]");
            //HIGHLIGHTS
                //SLOGANS
                    elements.put("MDM_hghltssl_b_add", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_hghltssl_b_delete", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_hghltssl_b_delete_ok", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_hghltssl_b_edit", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:boton_edit')]");
                    elements.put("MDM_hghltssl_b_qbe", "//*[contains(@id, 'r1:1:r4:0:pc1:_qbeTbr')]");
                    elements.put("MDM_hghltssl_b_detach", "//*[contains(@id, 'r1:1:r4:0:pc1:_dchTbr')]");
                    elements.put("MDM_hghltssl_e_result", "//*[contains(@id, 'r1:1:r4:0:pc1:hslogan::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hghltssl_e_records", "//*[contains(@id, 'r1:1:r4:0:pc1:otp2')]");
                //HIGHLIGHTS
                    elements.put("MDM_hghlts_b_add", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:boton_add')]");
                    elements.put("MDM_hghlts_b_delete", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:boton_remove')]");
                    elements.put("MDM_hghlts_b_delete_ok", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:cbt1')]");
                    elements.put("MDM_hghlts_b_edit", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:boton_edit')]");
                    elements.put("MDM_hghlts_b_qbe", "//*[contains(@id, 'r1:1:r4:0:pc2:_qbeTbr')]");
                    elements.put("MDM_hghlts_b_detach", "//*[contains(@id, 'r1:1:r4:0:pc2:_dchTbr')]");
                    elements.put("MDM_hghlts_e_result", "//*[contains(@id, 'r1:1:r4:0:pc2:hhigh::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_hghlts_e_records", "//*[contains(@id, 'r1:1:r4:0:pc2:ot31')]");
                //LANGUAGES
                    elements.put("MDM_hghltslngs_b_add", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:boton_add')]");
                    elements.put("MDM_hghltslngs_b_delete", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:boton_remove')]");
                    elements.put("MDM_hghltslngs_b_delete_ok", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:cbt1')]");
                    elements.put("MDM_hghltslngs_b_edit", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:boton_edit')]");
                    elements.put("MDM_hghltslngs_b_qbe", "//*[contains(@id, 'r1:1:r4:0:pc3:_qbeTbr')]");
                    elements.put("MDM_hghltslngs_b_detach", "//*[contains(@id, 'r1:1:r4:0:pc3:_dchTbr')]");
                    elements.put("MDM_hghltslngs_e_result", "//*[contains(@id, 'r1:1:r4:0:pc3:hhighId::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_hghltslngs_e_records", "//*[contains(@id, 'r1:1:r4:0:pc3:ot43')]");
            //TOPS
                //TOP COUNTRIES
                    elements.put("MDM_tpcntrs_b_add", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_tpcntrs_b_delete", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_tpcntrs_b_delete_ok", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_tpcntrs_b_qbe", "//*[contains(@id, 'r1:1:r5:0:pc1:_qbeTbr')]");
                    elements.put("MDM_tpcntrs_b_detach", "//*[contains(@id, 'r1:1:r5:0:pc1:_dchTbr')]");
                    elements.put("MDM_tpcntrs_e_result", "//*[contains(@id, 'r1:1:r5:0:pc1:childTb1::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_tpcntrs_e_records", "//*[contains(@id, 'r1:1:r5:0:pc1:ot17')]");
                //TOP DESTINATIONS
                    elements.put("MDM_tpdstnts_b_add", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:boton_add')]");
                    elements.put("MDM_tpdstnts_b_delete", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:boton_remove')]");
                    elements.put("MDM_tpdstnts_b_delete_ok", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:cbt1')]");
                    elements.put("MDM_tpdstnts_b_qbe", "//*[contains(@id, 'r1:1:r5:0:pc2:_qbeTbr')]");
                    elements.put("MDM_tpdstnts_b_detach", "//*[contains(@id, 'r1:1:r5:0:pc2:_dchTbr')]");
                    elements.put("MDM_tpdstnts_e_result", "//*[contains(@id, 'r1:1:r5:0:pc2:childTb2::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_tpdstnts_e_records", "//*[contains(@id, 'r1:1:r5:0:pc2:ot18')]");
                //TOP EVENTS
                    elements.put("MDM_tpevents_b_add", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:boton_add')]");
                    elements.put("MDM_tpevents_b_delete", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:boton_remove')]");
                    elements.put("MDM_tpevents_b_delete_ok", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:cbt1')]");
                    elements.put("MDM_tpevents_b_qbe", "//*[contains(@id, 'r1:1:r5:0:pc3:_qbeTbr')]");
                    elements.put("MDM_tpevents_b_detach", "//*[contains(@id, 'r1:1:r5:0:pc3:_dchTbr')]");
                    elements.put("MDM_tpevents_e_result", "//*[contains(@id, 'r1:1:r5:0:pc3:childTb3::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_tpevents_e_records", "//*[contains(@id, 'r1:1:r5:0:pc3:ot20')]");
        //-----------------------------------------------------------------------------------------------------------------------------------
        //ADD|MODIFY
        //-----------------------------------------------------------------------------------------------------------------------------------
            //COUNTRIES
                //COUNTRIES
                    elements.put("add_cntrs_b_save", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:btn_commitExit')]");
                    elements.put("add_cntrs_i_code", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:codPaisId::content')]");
                    elements.put("add_cntrs_lov_code", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:codPaisId::lovIconId')]");
                    elements.put("add_cntrs_e_code_description", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it3::content')]");
                    elements.put("add_cntrs_i_order", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it4::content')]");
                    elements.put("add_cntrs_i_url", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it6::content')]");
                    elements.put("add_cntrs_i_page_publication", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:codPublicId::content')]");
                    elements.put("add_cntrs_lov_page_publication", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:codPublicId::lovIconId')]");
                    elements.put("add_cntrs_e_page_publication_description", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it2::content')]");
                    elements.put("add_cntrs_cb_active", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:sbc1::content')]");
                    elements.put("add_cntrs_i_larger_image", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it9::content')]");
                    elements.put("add_cntrs_i_small_image", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it8::content')]");
                    elements.put("add_cntrs_i_map_image", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it7::content')]");
                    elements.put("add_cntrs_i_map_image2", "//*[contains(@id, 'r1:1:r1:0:pc4:pcgt1:it1::content')]");
                //COUNTRY IMAGES
                    //MAP LANGUAGE DESCRIPTION
                        elements.put("add_mld_b_save", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:btn_commitExit')]");
                        elements.put("add_mld_i_language", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:codIdiomaId::content')]");
                        elements.put("add_mld_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:codIdiomaId::lovIconId')]");
                        elements.put("add_mld_i_link_map", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt2:it14::content')]");
                    //COMMERCIAL CONTACT
                        elements.put("add_cmmc_b_save", "//*[contains(@id, 'r1:0:dc_t1p::oc')]/table/tbody/tr/td[2]//*[contains(@id, 'r1:1:r1:0:boton_commit')]");
                        elements.put("add_cmmc_i_job_position", "//*[contains(@id, 'r1:1:r1:0:inputListOfValues1::content')]");
                        elements.put("add_cmmc_lov_job_position", "//*[contains(@id, 'r1:1:r1:0:inputListOfValues1::lovIconId')]");
                        elements.put("add_cmmc_i_telephone", "//*[contains(@id, 'r1:1:r1:0:it23::content')]");
                        elements.put("add_cmmc_i_fax", "//*[contains(@id, 'r1:1:r1:0:it22::content')]");
                        elements.put("add_cmmc_i_postal_code", "//*[contains(@id, 'r1:1:r1:0:it24::content')]");
                        elements.put("add_cmmc_i_email", "//*[contains(@id, 'r1:1:r1:0:it21::content')]");
                    //COMMERCIAL CONTACT 2
                        elements.put("add_cmmc2_b_save", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:btn_commitExit')]");
                        elements.put("add_cmmc2_i_language", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:codIdioma1Id::content')]");
                        elements.put("add_cmmc2_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:codIdioma1Id::lovIconId')]");
                        elements.put("add_cmmc2_i_office", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:it16::content')]");
                        elements.put("add_cmmc2_i_name", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:it19::content')]");
                        elements.put("add_cmmc2_i_address", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:it18::content')]");
                        elements.put("add_cmmc2_i_province", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:it15::content')]");
                        elements.put("add_cmmc2_i_country", "//*[contains(@id, 'r1:1:r1:0:pc5:pcgt5:it17::content')]");
                    //BIG IMAGE
                        elements.put("add_bigi_b_save", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:btn_commitExit')]");
                        elements.put("add_bigi_i_language", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:codIdioma3Id::content')]");
                        elements.put("add_bigi_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:codIdioma3Id::lovIconId')]");
                        elements.put("add_bigi_i_alternative_text", "//*[contains(@id, 'r1:1:r1:0:pc11:pcgt11:it26::content')]");
                    //SMALL IMAGE
                        elements.put("add_smalli_b_save", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:btn_commitExit')]");
                        elements.put("add_smalli_i_language", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:codIdioma4Id::content')]");
                        elements.put("add_smalli_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:codIdioma4Id::lovIconId')]");
                        elements.put("add_smalli_i_alternative_text", "//*[contains(@id, 'r1:1:r1:0:pc31:pcgt31:it27::content')]");
                    //MAP IMAGE
                        elements.put("add_mapi_b_save", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:btn_commitExit')]");
                        elements.put("add_mapi_i_language", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:codIdioma6Id::content')]");
                        elements.put("add_mapi_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:codIdioma6Id::lovIconId')]");
                        elements.put("add_mapi_i_alternative_text", "//*[contains(@id, 'r1:1:r1:0:pc41:pcgt41:it32::content')]");
                    //MAP IMAGE 2
                        elements.put("add_mapi2_b_save", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:btn_commitExit')]");
                        elements.put("add_mapi2_i_language", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:codIdioma5Id::content')]");
                        elements.put("add_mapi2_lov_language", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:codIdioma5Id::lovIconId')]");
                        elements.put("add_mapi2_i_alternative_text", "//*[contains(@id, 'r1:1:r1:0:pc51:pcgt51:it30::content')]");
            //DATA
                //SLOGANS
                    elements.put("add_dslgns_b_save", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_dslgns_i_language", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:inputListOfValues1::content')]");
                    elements.put("add_dslgns_lov_language", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:inputListOfValues1::lovIconId')]");
                    elements.put("add_dslgns_i_slogan", "//*[contains(@id, 'r1:1:r2:0:pc1:pcgt1:it2::content')]");
                //LONG DESCRIPTION
                    elements.put("add_longd_b_save", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:btn_commitExit')]");
                    elements.put("add_longd_i_language", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:codIdioma1Id::content')]");
                    elements.put("add_longd_lov_language", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:codIdioma1Id::lovIconId')]");
                    elements.put("add_longd_i_description", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt2:it3::content')]");
                //SHORT DESCRIPTION
                    elements.put("add_shortd_b_save", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:btn_commitExit')]");
                    elements.put("add_shortd_i_language", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:codIdioma2Id::content')]");
                    elements.put("add_shortd_lov_language", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:codIdioma2Id::lovIconId')]");
                    elements.put("add_shortd_i_description", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt3:it4::content')]");
            //GENERAL SERVICE
                //SLOGANS
                    elements.put("add_gsslgns_b_save", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_gsslgns_i_language", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:codIdiomaId::content')]");
                    elements.put("add_gsslgns_lov_language", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:codIdiomaId::lovIconId')]");
                    elements.put("add_gsslgns_i_slogan", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:it2::content')]");
                    elements.put("add_gsslgns_i_description", "//*[contains(@id, 'r1:1:r3:0:pc1:pcgt1:it1::content')]");
                //GENERAL SERVICE
                    elements.put("add_gnrls_b_save", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:btn_commitExit')]");
                    elements.put("add_gnrls_i_order", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:it4::content')]");
                    elements.put("add_gnrls_i_category", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:codCategoriaId::content')]");
                    elements.put("add_gnrls_lov_category", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:codCategoriaId::lovIconId')]");
                    elements.put("add_gnrls_e_type", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:it3::content')]");
                    elements.put("add_gnrls_e_description", "//*[contains(@id, 'r1:1:r3:0:pc2:pcgt2:it12::content')]");
                //LANGUAGES
                    elements.put("add_gnrlslngs_b_save", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:btn_commitExit')]");
                    elements.put("add_gnrlslngs_i_language", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:codIdioma1Id::content')]");
                    elements.put("add_gnrlslngs_lov_language", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:codIdioma1Id::lovIconId')]");
                    elements.put("add_gnrlslngs_i_title", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:it7::content')]");
                    elements.put("add_gnrlslngs_i_link", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:it8::content')]");
                    elements.put("add_gnrlslngs_i_image", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:it9::content')]");
                    elements.put("add_gnrlslngs_i_alternative_text", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:it6::content')]");
                    elements.put("add_gnrlslngs_i_description", "//*[contains(@id, 'r1:1:r3:0:pc3:pcgt3:it5::content')]");
            //HIGHLIGHTS
                //SLOGANS
                    elements.put("add_hghltssl_b_save", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_hghltssl_i_language", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:codIdiomaId::content')]");
                    elements.put("add_hghltssl_lov_language", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:codIdiomaId::lovIconId')]");
                    elements.put("add_hghltssl_i_slogan", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:it4::content')]");
                    elements.put("add_hghltssl_i_description", "//*[contains(@id, 'r1:1:r4:0:pc1:pcgt1:it3::content')]");
                //HIGHLIGHTS
                    elements.put("add_hghlts_b_save", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:btn_commitExit')]");
                    elements.put("add_hghlts_i_order", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:it5::content')]");
                    elements.put("add_hghlts_i_category", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:codCategoriaId::content')]");
                    elements.put("add_hghlts_lov_category", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:codCategoriaId::lovIconId')]");
                    elements.put("add_hghlts_e_altresultX", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:codCategoriaId_afrLovInternalTableId::db')]/table/tbody/tr[8]/td[1]");
                    elements.put("add_hghlts_e_altresultY", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:codCategoriaId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
                    elements.put("add_hghlts_e_description", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:it7::content')]");
                    elements.put("add_hghlts_e_type", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:it6::content')]");
                    elements.put("add_hghlts_i_destination", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:destinoId::content')]");
                    elements.put("add_hghlts_lov_destination", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:destinoId::lovIconId')]");
                    elements.put("add_hghlts_i_service", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:servicioId::content')]");
                    elements.put("add_hghlts_lov_service", "//*[contains(@id, 'r1:1:r4:0:pc2:pcgt2:servicioId::lovIconId')]");
                //LANGUAGES
                    elements.put("add_hghltslngs_b_save", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:btn_commitExit')]");
                    elements.put("add_hghltslngs_i_language", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:codIdioma1Id::content')]");
                    elements.put("add_hghltslngs_lov_language", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:codIdioma1Id::lovIconId')]");
                    elements.put("add_hghltslngs_i_title", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:it8::content')]");
                    elements.put("add_hghltslngs_i_link", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:it13::content')]");
                    elements.put("add_hghltslngs_i_image", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:it9::content')]");
                    elements.put("add_hghltslngs_i_alternative_text", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:it12::content')]");
                    elements.put("add_hghltslngs_i_description", "//*[contains(@id, 'r1:1:r4:0:pc3:pcgt3:it11::content')]");
            //TOPS
                //TOP COUNTRIES
                    elements.put("add_tpcntrs_b_save", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_tpcntrs_i_country", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:codPais2Id::content')]");
                    elements.put("add_tpcntrs_lov_country", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:codPais2Id::lovIconId')]");
                    elements.put("add_tpcntrs_e_country_description", "//*[contains(@id, 'r1:1:r5:0:pc1:pcgt1:it4::content')]");
                //TOP DESTINATIONS
                    elements.put("add_tpdstnts_b_save", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:btn_commitExit')]");
                    elements.put("add_tpdstnts_i_destination", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:codDestino2Id::content')]");
                    elements.put("add_tpdstnts_lov_destination", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:codDestino2Id::lovIconId')]");
                    elements.put("add_tpdstnts_e_destination_description", "//*[contains(@id, 'r1:1:r5:0:pc2:pcgt2:it1::content')]");
                //TOP EVENTS
                    elements.put("add_tpevents_b_save", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:btn_commitExit')]");
                    elements.put("add_tpevents_i_event", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:seqEventoTopId::content')]");
                    elements.put("add_tpevents_lov_event", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:seqEventoTopId::lovIconId')]");
                    elements.put("add_tpevents_e_title", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:it3::content')]");
                    elements.put("add_tpevents_e_destination", "//*[contains(@id, 'r1:1:r5:0:pc3:pcgt3:it2::content')]");
        //-----------------------------------------------------------------------------------------------------------------------------------
        //SEARCH
        //-----------------------------------------------------------------------------------------------------------------------------------
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_code_description", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_i_order", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_i_url", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_i_page_publication", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_lov_page_publication", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
            elements.put("search_i_page_publication_description", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_cb_active", "//*[contains(@id, 'qryId1:value60::content')]");
            elements.put("search_i_larger_image", "//*[contains(@id, 'qryId1:value70::content')]");
            elements.put("search_i_small_image", "//*[contains(@id, 'qryId1:value80::content')]");
            elements.put("search_i_map_image", "//*[contains(@id, 'qryId1:value90::content')]");
            elements.put("search_i_map_image2", "//*[contains(@id, 'qryId1:value100::content')]");
        //-----------------------------------------------------------------------------------------------------------------------------------
        //QBE
        //-----------------------------------------------------------------------------------------------------------------------------------
            //COUNTRIES
                //COUNTRIES
                    elements.put("qbe_cntrs_i_code", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c7::content')]");
                    elements.put("qbe_cntrs_i_code_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c6::content')]");
                    elements.put("qbe_cntrs_i_order", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c1::content')]");
                    elements.put("qbe_cntrs_i_url", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c5::content')]");
                    elements.put("qbe_cntrs_i_page_publication", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c2::content')]");
                    elements.put("qbe_cntrs_i_page_publication_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc4_afr_cwcCon_afr_c4::content')]");
                    elements.put("qbe_cntrs_sl_active", "//*[contains(@id, 'r1:1:r1:0:pc4:cwcCon:wxq667::content')]");
            //COUNTRY IMAGES
                //MAP LANGUAGE DESCRIPTION
                    elements.put("qbe_mld_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mapaLink_afr_c20::content')]");
                    elements.put("qbe_mld_i_link_map", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mapaLink_afr_c19::content')]");
                //COMMERCIAL CONTACT 2
                    elements.put("qbe_cmmc2_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c23::content')]");
                    elements.put("qbe_cmmc2_i_office", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c27::content')]");
                    elements.put("qbe_cmmc2_i_name", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c22::content')]");
                    elements.put("qbe_cmmc2_i_address", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c26::content')]");
                    elements.put("qbe_cmmc2_i_province", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c25::content')]");
                    elements.put("qbe_cmmc2_i_country", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc5_afr_contId_afr_c24::content')]");
                //BIG IMAGE
                    elements.put("qbe_bigi_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc11_afr_imag_afr_c29::content')]");
                    elements.put("qbe_bigi_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc11_afr_imag_afr_c28::content')]");
                //SMALL IMAGE
                    elements.put("qbe_smalli_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc31_afr_simag_afr_c34::content')]");
                    elements.put("qbe_smalli_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc31_afr_simag_afr_c35::content')]");
                //MAP IMAGE
                    elements.put("qbe_mapi_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc41_afr_mimag_afr_c33::content')]");
                    elements.put("qbe_mapi_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc41_afr_mimag_afr_c32::content')]");
                //MAP IMAGE 2
                    elements.put("qbe_mapi2_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc51_afr_mimag2_afr_c31::content')]");
                    elements.put("qbe_mapi2_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r1_afr_0_afr_pc51_afr_mimag2_afr_c30::content')]");
            //DATA
                //SLOGANS
                    elements.put("qbe_dslgns_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc1_afr_slogan_afr_c1::content')]");
                    elements.put("qbe_dslgns_i_slogan", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc1_afr_slogan_afr_c2::content')]");
                //LONG DESCRIPTION
                    elements.put("qbe_longd_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc2_afr_pddes_afr_c3::content')]");
                    elements.put("qbe_longd_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc2_afr_pddes_afr_c4::content')]");
                //SHORT DESCRIPTION
                    elements.put("qbe_shortd_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc3_afr_desCor_afr_c6::content')]");
                    elements.put("qbe_shortd_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r2_afr_0_afr_pc3_afr_desCor_afr_c7::content')]");
            //GENERAL SERVICE
                //SLOGANS
                    elements.put("qbe_gsslgns_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc1_afr_slogHl_afr_c1::content')]");
                    elements.put("qbe_gsslgns_i_slogan", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc1_afr_slogHl_afr_c2::content')]");
                //GENERAL SERVICE
                    elements.put("qbe_gnrls_i_order", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc2_afr_pdHigh_afr_c6::content')]");
                    elements.put("qbe_gnrls_i_category", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc2_afr_pdHigh_afr_c9::content')]");
                    elements.put("qbe_gnrls_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc2_afr_pdHigh_afr_c7::content')]");
                    elements.put("qbe_gnrls_i_type", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc2_afr_pdHigh_afr_c8::content')]");
                //LANGUAGES
                    elements.put("qbe_gnrlslngs_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc3_afr_highId_afr_c13::content')]");
                    elements.put("qbe_gnrlslngs_i_title", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc3_afr_highId_afr_c11::content')]");
                    elements.put("qbe_gnrlslngs_i_link", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc3_afr_highId_afr_c14::content')]");
                    elements.put("qbe_gnrlslngs_i_image", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc3_afr_highId_afr_c12::content')]");
                    elements.put("qbe_gnrlslngs_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r3_afr_0_afr_pc3_afr_highId_afr_c15::content')]");
            //HIGHLIGHTS
                //SLOGANS
                    elements.put("qbe_hghltssl_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc1_afr_hslogan_afr_c23::content')]");
                    elements.put("qbe_hghltssl_i_slogan", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc1_afr_hslogan_afr_c2::content')]");
                //HIGHLIGHTS
                    elements.put("qbe_hghlts_i_order", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c1::content')]");
                    elements.put("qbe_hghlts_i_category", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c44::content')]");
                    elements.put("qbe_hghlts_i_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c43::content')]");
                    elements.put("qbe_hghlts_i_type", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c24::content')]");
                    elements.put("qbe_hghlts_i_destination", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c17::content')]");
                    elements.put("qbe_hghlts_i_service", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc2_afr_hhigh_afr_c18::content')]");
                //LANGUAGES
                    elements.put("qbe_hghltslngs_i_language", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc3_afr_hhighId_afr_c45::content')]");
                    elements.put("qbe_hghltslngs_i_title", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc3_afr_hhighId_afr_c7::content')]");
                    elements.put("qbe_hghltslngs_i_link", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc3_afr_hhighId_afr_c8::content')]");
                    elements.put("qbe_hghltslngs_i_image", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc3_afr_hhighId_afr_c6::content')]");
                    elements.put("qbe_hghltslngs_i_alternative_text", "//*[contains(@id, 'afr_r1_afr_1_afr_r4_afr_0_afr_pc3_afr_hhighId_afr_c9::content')]");
            //TOPS
                //TOP COUNTRIES
                    elements.put("qbe_tpcntrs_i_country", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc1_afr_childTb1_afr_c11::content')]");
                    elements.put("qbe_tpcntrs_i_country_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc1_afr_childTb1_afr_c10::content')]");
                //TOP DESTINATIONS
                    elements.put("MDM_tpdstnts_i_destination", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc2_afr_childTb2_afr_c13::content')]");
                    elements.put("MDM_tpdstnts_i_destination_description", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc2_afr_childTb2_afr_c12::content')]");
                //TOP EVENTS
                    elements.put("qbe_tpevents_i_event", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc3_afr_childTb3_afr_c14::content')]");
                    elements.put("qbe_tpevents_i_title", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc3_afr_childTb3_afr_c24::content')]");
                    elements.put("qbe_tpevents_i_destination", "//*[contains(@id, 'afr_r1_afr_1_afr_r5_afr_0_afr_pc3_afr_childTb3_afr_c17::content')]");
    }
}