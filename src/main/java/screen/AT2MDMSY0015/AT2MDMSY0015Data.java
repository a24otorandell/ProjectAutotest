package screen.AT2MDMSY0015;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMSY0015Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0015Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0015DataValues.txt");
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
        data.put("rbc2_B2B_reference", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_hotelbeds_reference", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_remarks", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prb2_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prb2_value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("arc2_remarks", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("arc2_status", DataGenerator.getRandomAlphanumericSequence(2, true));
        data.put("prrb2_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prrb2_value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_B2B_reference_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_hotelbeds_reference_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_remarks_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rbc2_status_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prb2_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prb2_value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("arc2_remarks_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("arc2_status_edit", DataGenerator.getRandomAlphanumericSequence(2, true));
        data.put("prrb2_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prrb2_value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
