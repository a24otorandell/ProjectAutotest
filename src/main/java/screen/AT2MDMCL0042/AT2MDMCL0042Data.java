package screen.AT2MDMCL0042;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMCL0042Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0042Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2MDMCL0042Values.txt");
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
