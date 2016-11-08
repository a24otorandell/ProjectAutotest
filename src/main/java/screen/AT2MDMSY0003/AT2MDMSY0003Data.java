package screen.AT2MDMSY0003;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0003Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0003Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0003DataValues.txt");
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
        //PARAMETERS
            data.put("prmt_parameter", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmt_value", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmt_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmt_parameter_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmt_value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmt_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //PARAMETERS BY COMPANY
            data.put("prmtbc_parameter", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmtbc_value", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmtbc_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmtbc_parameter_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmtbc_value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("prmtbc_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GENERAL PARAMETERS
            data.put("gprmt_parameters_code", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("gprmt_supplier", "1");
            data.put("gprmt_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("gprmt_numeric_value", Integer.toString(DataGenerator.random(0,99)));
            data.put("gprmt_non_numeric_value", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("gprmt_parameters_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("gprmt_supplier", "2");
            data.put("gprmt_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("gprmt_numeric_value_edit", Integer.toString(DataGenerator.random(0,99)));
            data.put("gprmt_non_numeric_value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
