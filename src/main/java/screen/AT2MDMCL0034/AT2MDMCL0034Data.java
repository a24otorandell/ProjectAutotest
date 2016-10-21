package screen.AT2MDMCL0034;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 20/10/2016.
 */
public class AT2MDMCL0034Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0034Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/  AT2MDMCL0034DataValues.txt");
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
        data.put("date_from", DataGenerator.getToday());
        data.put("tax_number", Integer.toString(DataGenerator.random(0, 999)));
        data.put("date_from_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, 1, 0));
        data.put("tax_number_edit", Integer.toString(DataGenerator.random(0, 999)));
    }
}
