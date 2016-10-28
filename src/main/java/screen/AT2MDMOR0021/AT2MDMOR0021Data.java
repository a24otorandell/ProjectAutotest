package screen.AT2MDMOR0021;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMOR0021Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0021Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0021DataValues.txt");
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
        //ADD
        data.put("results_code", DataGenerator.getRandomAlphanumericSequence(3, true));
        data.put("results_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("results_constraint_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("results_domain_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("errors_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("errors_help_text", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MODIFY
        data.put("results_code_edit", DataGenerator.getRandomAlphanumericSequence(3, true));
        data.put("results_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("results_constraint_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("results_domain_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("errors_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("errors_help_text_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
