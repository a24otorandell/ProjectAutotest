package screen.AT2MDMSP0033;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMSP0033Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0033Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSP0033DataValues.txt");
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
        data.put("code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}