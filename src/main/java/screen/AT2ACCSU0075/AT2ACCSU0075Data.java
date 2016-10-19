package screen.AT2ACCSU0075;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACCSU0075Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0075Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0075DataValues.txt");
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
        data.put("modelo", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("modelo_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("negocio", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("negocio_edit", DataGenerator.getRandomAlphanumericSequence(5, true));

    }
}
