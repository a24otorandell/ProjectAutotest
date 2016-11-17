package screen.AT2MDMSY0014;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMSY0014Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0014Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0014DataValues.txt");
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
        data.put("observation_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("observation_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("observations", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("observations_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
