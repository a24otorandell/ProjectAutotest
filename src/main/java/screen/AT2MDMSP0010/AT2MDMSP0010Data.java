package screen.AT2MDMSP0010;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0010Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0010Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSP0010DataValues.txt");
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
        data.put("payable_company_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("long_payable_company_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("payable_company_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("long_payable_company_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
