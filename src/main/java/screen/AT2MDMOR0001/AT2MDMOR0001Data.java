package screen.AT2MDMOR0001;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 15/12/2016.
 */
public class AT2MDMOR0001Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0001Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0001DataValues.txt");
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
        data.put("text", DataGenerator.getRandomAlphanumericSequence(30, true));
        data.put("url", DataGenerator.getRandomAlphanumericSequence(10, true));
    }
}
