package screen.AT2MSCSU0002;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MSCSU0002Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MSCSU0002Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2MSCSU0002Values.txt");
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
