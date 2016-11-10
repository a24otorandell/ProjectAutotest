package screen.AT2MDMSY0023;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMSY0023Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0023Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0023DataValues.txt");
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
        data.put("application", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("group", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("type", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("remarks", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("parameter_value", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("group_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("type_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("remarks_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("parameter_value_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
    }
}
