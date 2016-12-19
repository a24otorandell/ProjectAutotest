package screen.AT2MDMCL0044;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMCL0044Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0044Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMCL0044DataValues.txt");
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
        data.put("value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("nt_type", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_nt_type", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("np_property", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("np_property_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("default", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_np_property", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_np_property_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_default", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("nt_type_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("np_property_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("np_property_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("default_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
