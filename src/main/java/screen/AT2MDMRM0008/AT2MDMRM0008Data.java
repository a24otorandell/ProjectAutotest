package screen.AT2MDMRM0008;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/11/2016.
 */
public class AT2MDMRM0008Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0008Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0008DataValues.txt");
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
        data.put("no_allotm", Integer.toString(DataGenerator.random(0,99)));
        data.put("no_max_edit", Integer.toString(DataGenerator.random(0,99)));
        data.put("no_allotm_edit", Integer.toString(DataGenerator.random(0,99)));
    }
}
