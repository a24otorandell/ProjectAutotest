package screen.AT2MSCSU0006;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icastaneira on 12/12/2016.
 */
public class AT2MSCSU0006Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MSCSU0006Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MSCSU0006Values.txt");
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

    private void setDefaultData() {
        data.put("elements_tab_elements_table_operation", "Availability");
        data.put("elements_tab_elements_table_elements", DataGenerator.getRandomAlphanumericSequence(8, true));
        data.put("update_elements_tab_elements_table_operation", "BookingDetail");
        data.put("update_elements_tab_elements_table_elements", DataGenerator.getRandomAlphanumericSequence(8, true));

    }
}
