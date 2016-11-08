package screen.AT2MDMSY0004;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMSY0004Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0004DataValues.txt");
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
        //PARAMETERS
        data.put("parameter", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("parameter_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
