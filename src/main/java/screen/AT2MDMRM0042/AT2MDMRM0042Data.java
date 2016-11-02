package screen.AT2MDMRM0042;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMRM0042Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0042Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0042DataValues.txt");
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
        data.put("date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 1, DataGenerator.random(0, 10), 0));
        data.put("%_endowment", Integer.toString(DataGenerator.random(0, 99)));
    }
}