package screen.AT2ACCSU0058;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0058Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0058Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0058DataValues.txt");
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
        data.put("hotel_id", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rate_plan", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("currency", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("baseboard_type", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contract_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("incoming_office", Integer.toString(DataGenerator.random(0, 999)));
        data.put("contr_seq", Integer.toString(DataGenerator.random(0, 999)));
        data.put("hsi_user", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("register_status", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("activ_date", DataGenerator.getToday());
        data.put("room_id", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dis_hot_id", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dis_room_id", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("seq_age_ext", Integer.toString(DataGenerator.random(0, 999)));
        data.put("hotel_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("rate_plan_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("currency_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("baseboard_type_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contract_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("incoming_office_edit", Integer.toString(DataGenerator.random(0, 999)));
        data.put("contr_seq_edit", Integer.toString(DataGenerator.random(0, 999)));
        data.put("hsi_user_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("register_status_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("activ_date_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(0, 3), 0));
        data.put("room_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dis_hot_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("dis_room_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("seq_age_ext_edit", Integer.toString(DataGenerator.random(0, 999)));
    }
}