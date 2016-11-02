package screen.AT2MDMSP0016;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0016Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0016Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSP0016DataValues.txt");
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
        data.put("days_in_advance", Integer.toString(DataGenerator.random(0, 99)));
        data.put("%_prepayment", Integer.toString(DataGenerator.random(0, 99)));
        data.put("application_date", DataGenerator.getToday());
    }
}
