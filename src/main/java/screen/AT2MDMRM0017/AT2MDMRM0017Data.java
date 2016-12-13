package screen.AT2MDMRM0017;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 13/12/2016.
 */

public class AT2MDMRM0017Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0017Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0017DataValues.txt");
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
        //HB LABELS MAINTENANCE
        data.put("page", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hblabels_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("page_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hblabels_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //DICTIONARY
        data.put("code", Integer.toString(DataGenerator.random(111,999)));
        data.put("code_edit", Integer.toString(DataGenerator.random(111,999)));
        //DMULTI-LANGUAGE
        data.put("dmulti_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dmulti_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //HELP
        data.put("detail", Integer.toString(DataGenerator.random(111,999)));
        data.put("detail_edit", Integer.toString(DataGenerator.random(111,999)));
        //HMULTI-LANGUAGE
        data.put("hmulti_concept", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hmulti_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hmulti_concept_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hmulti_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //BANNER
        data.put("bnnr_code", Integer.toString(DataGenerator.random(111,999)));
        data.put("bnnr_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("bnnr_code_edit", Integer.toString(DataGenerator.random(111,999)));
        data.put("bnnr_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //HEADER
        data.put("number", Integer.toString(DataGenerator.random(1,9)));
        data.put("number_edit", Integer.toString(DataGenerator.random(1,9)));
        //HHMULTI_LANGUAGE
        data.put("hdmulti_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hdmulti_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}