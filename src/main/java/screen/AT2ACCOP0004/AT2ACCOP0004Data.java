package screen.AT2ACCOP0004;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCOP0004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCOP0004DataValues.txt");
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

        data.put("date", DataGenerator.getRelativeDateToday("17/10,2016", 1, 1, 0));
        data.put("date2", DataGenerator.getRelativeDateToday("17/10,2016", 2, 2, 0));

    }
}
