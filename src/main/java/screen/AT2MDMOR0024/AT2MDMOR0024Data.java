package screen.AT2MDMOR0024;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0024Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0024Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0024DataValues.txt");
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
        data.put("region_subregion_code", DataGenerator.getRandomAlphanumericSequence(3, true));
        data.put("region_subregion_name", DataGenerator.getRandomAlphanumericSequence(3, true));
        data.put("region_subregion_code_edit", DataGenerator.getRandomAlphanumericSequence(3, true));
        data.put("region_subregion_name_edit", DataGenerator.getRandomAlphanumericSequence(3, true));
    }
}
