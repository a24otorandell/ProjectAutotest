package screen.AT2ACCSU0056;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import core.TestDriver.TestDriver;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0056Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0056Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0056DataValues.txt");
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
        data.put("client_exp", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("product_exp", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("client_exp_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("product_exp_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
