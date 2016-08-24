package screen.AT2ACCOP0024;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * This class manages the data used on this component to test
 *
 * @author ajvirgili on 29/06/2016.
 */
public class AT2ACCOP0024Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCOP0024Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCOP0024Values.txt");
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
        data.put("file_new", "C:\\ProjectAutotest\\src\\main\\resources\\IPS-20160531-0412461-000001_REPRO_1886019379_041246-000001.csv");
    }
}
