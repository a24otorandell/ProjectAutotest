package screen.AT2MDMSP0037;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 19/07/2016
 */
public class AT2MDMSP0037Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0037Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSP0037Values.txt");
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
