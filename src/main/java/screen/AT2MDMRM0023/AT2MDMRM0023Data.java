package screen.AT2MDMRM0023;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 12/12/2016.
 */
public class AT2MDMRM0023Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0023Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0023DataValues.txt");
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
        //PRODUCT SITE
        data.put("img", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contents1", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contents2", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("pdf", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("pdf2", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("img_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contents1_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contents2_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("pdf_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("pdf2_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GROUP OF COUNTRIES
        data.put("grc_group_of_countries_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grc_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grc_group_of_countries_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grc_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //COUNTRIES
        data.put("cntrs_country_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_country_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("cntrs_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GROUP OF DESTINATIONS
        data.put("grd_group_of_destinations_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grd_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grd_group_of_destinations_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grd_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //DESTINATIONS
        data.put("dstnts_destination_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dstnts_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dstnts_destination_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dstnts_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
