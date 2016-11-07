package screen.AT2MDMRM0026;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMRM0026Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0026Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0026DataValues.txt");
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
    }
}
