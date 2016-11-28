package screen.AT2TABTR0004;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2TABTR0004Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2TABTR0004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2TABTR0004Values.txt");
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
