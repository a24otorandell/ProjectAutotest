package screen.AT2MDMOR0027;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 14/11/2016.
 */
public class AT2MDMOR0027Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0027Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0027DataValues.txt");
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
        data.put("market", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("market_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("language_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_language_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("market_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("market_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("language_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("second_language_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
