package screen.AT2MDMSP0031;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2MDMSP0031Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0031Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2MDMSP0031Values.txt");
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
