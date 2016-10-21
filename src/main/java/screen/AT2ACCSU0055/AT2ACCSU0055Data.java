package screen.AT2ACCSU0055;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/10/2016.
 */
public class AT2ACCSU0055Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0055Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0055DataValues.txt");
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
        data.put("crs_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("crs_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("crs_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("brand_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("brand_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("crs_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("crs_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("crs_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("brand_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("brand_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}