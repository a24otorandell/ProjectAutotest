package screen.AT2TRFSU0039;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 02/01/2017.
 */
public class AT2TRFSU0039Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2TRFSU0039Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2TRFSU0039");
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
