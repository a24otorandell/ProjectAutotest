package screen.AT2MDMDE0025;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMDE0025Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMDE0025Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMDE0025DataValues.txt");
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
        //AIRPORTS
            data.put("ap_airport_code", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("ap_airport_name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("ap_airport_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("ap_airport_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MULTI-LANGUAGE
            data.put("ml_airport_name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("ml_airport_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}