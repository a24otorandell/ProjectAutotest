package screen.AT2MDMCL0022;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 25/11/2016.
 */
public class AT2MDMCL0022Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0022Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMCL0022DataValues.txt");
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
        data.put("secondary", Integer.toString(DataGenerator.random(0,99)));
        data.put("detail", Integer.toString(DataGenerator.random(0,199)));
        data.put("branch", Integer.toString(DataGenerator.random(0,9)));
        data.put("ip", DataGenerator.ipGenerator());
        data.put("valid_ip", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("secondary_edit", Integer.toString(DataGenerator.random(0,99)));
        data.put("detail_edit", Integer.toString(DataGenerator.random(0,199)));
        data.put("branch_edit", Integer.toString(DataGenerator.random(0,9)));
        data.put("ip_edit", DataGenerator.ipGenerator());
        data.put("valid_ip_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}