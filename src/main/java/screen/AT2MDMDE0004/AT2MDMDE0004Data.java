package screen.AT2MDMDE0004;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/12/2016.
 */
public class AT2MDMDE0004Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMDE0004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMDE0004DataValues.txt");
        setData();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultData();
        }
    }

    public void setDefaultData() {
        //COUNTRIES
        data.put("cntrs_order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("cntrs_url", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_larger_image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_small_image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_map_image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_map_image2", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_order_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("cntrs_url_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_larger_image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_small_image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_map_image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_map_image2_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MAP LANGUAGE DESCRIPTION
        data.put("mld_link", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mld_link_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //COMMERCIAL CONTACT
        data.put("cmmc_telephone", Integer.toString(DataGenerator.random(111111111, 999999999)));
        data.put("cmmc_fax", Integer.toString(DataGenerator.random(111111111, 999999999)));
        data.put("cmmc_postal_code", Integer.toString(DataGenerator.random(11111, 99999)));
        data.put("cmmc_email", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc_telephone_edit", Integer.toString(DataGenerator.random(111111111, 999999999)));
        data.put("cmmc_fax_edit", Integer.toString(DataGenerator.random(111111111, 999999999)));
        data.put("cmmc_postal_code_edit", Integer.toString(DataGenerator.random(11111, 99999)));
        data.put("cmmc_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //COMMERCIAL CONTACT 2
        data.put("cmmc2_office", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_address", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_province", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_country", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_office_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_address_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_province_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cmmc2_country_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //BIG IMAGE
        data.put("bigi_alt_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("bigi_alt_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //SMALL IMAGE
        data.put("smalli_alt_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("smalli_alt_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MAP IMAGE
        data.put("mapi_alt_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mapi_alt_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MAP IMAGE 2
        data.put("mapi2_alt_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mapi2_alt_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //DATA SLOGANS
        data.put("dslgns_slogan", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dslgns_slogan_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //LONG DESCRIPTION
        data.put("longd_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("longd_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //SHORT DESCRIPTION
        data.put("shortd_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("shortd_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GENERAL SERVICE SLOGANS
        data.put("gsslgns_slogan", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gsslgns_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gsslgns_slogan_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gsslgns_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GENERAL SERVICE
        data.put("gnrls_order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("gnrls_order_edit", Integer.toString(DataGenerator.random(0, 99)));
        //GENERAL SERVICE LANGUAGES
        data.put("gnrlslngs_title", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_link", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_alternative_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_title_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_link_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_alternative_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gnrlslngs_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //HIGHLIGHTS SLOGANS
        data.put("hghltssl_slogan", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltssl_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltssl_slogan_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltssl_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //HIGHLIGHTS
        data.put("hghlts_order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("hghlts_order_edit", Integer.toString(DataGenerator.random(0, 99)));
        //HIGHLIGHTS LANGUAGES
        data.put("hghltslngs_title", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_link", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_alternative_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_title_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_link_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_alternative_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hghltslngs_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}