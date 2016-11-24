package screen.AT2MDMSP0015;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMSP0015Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSP0015Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSP0015DataValues.txt");
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
        //EXTERNAL AGENCIES
            data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("SAP_code", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("supplier", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("SAP_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("supplier_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //STOPS
            data.put("stop_time", DataGenerator.getRelativeDateToday("hh:mm:ss", 0, 0, 0));
            data.put("start_time", DataGenerator.getRelativeDateToday("hh:mm:ss", 0, -1, 0));
            data.put("stop_date", DataGenerator.getToday());
            data.put("start_date", DataGenerator.getToday());
            data.put("comments", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("stop_time_edit", DataGenerator.getRelativeDateToday("hh:mm:ss", 0, 0, 0));
            data.put("start_time_edit", DataGenerator.getRelativeDateToday("hh:mm:ss", 0, 0, 0));
            data.put("stop_date_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, 1, 0));
            data.put("start_date_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, 2, 0));
            data.put("comments_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //RESTRICTIONS
            data.put("app_id", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("TO_branch", Integer.toString(DataGenerator.random(0,99)));
            data.put("app_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("TO_branch_edit", Integer.toString(DataGenerator.random(0,99)));
        //CONDITIONS
            data.put("cndtn_name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("nom_tip", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("c_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("cndtn_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("nom_tip_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("c_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
