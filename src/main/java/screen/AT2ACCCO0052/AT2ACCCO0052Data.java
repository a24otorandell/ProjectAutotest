package screen.AT2ACCCO0052;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * This class manages the data used on this component to test
 *
 * @author ajvirgili on 15/07/2016
 */
public class AT2ACCCO0052Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCCO0052Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCCO0052Values.txt");
        setData();
    }

    /**
     * Gets the data Map
     *
     * @return a {@code Map} with {String, String}
     */
    public Map<String, String> getData() {
        return data;
    }

    /**
     * Sets the data checking if there is any file to read, if not gets the hardcoded data
     *
     * @see DataHarvester#harvestAll()
     */
    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultData();
        }
    }

    /**
     * Sets the hardcoded data in the data Map
     */
    public void setDefaultData() {
    }
}
