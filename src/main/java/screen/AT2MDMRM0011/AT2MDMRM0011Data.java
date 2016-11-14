package screen.AT2MDMRM0011;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMRM0011Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0011Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0011DataValues.txt");
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
        //ID WEB
            data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("url", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("url_form", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("web_code", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("send_days_costs_cancellation", Integer.toString(DataGenerator.random(0,50)));
            data.put("days_send_previous_days_costs_cancellation", Integer.toString(DataGenerator.random(51,70)));
            data.put("days_previous_to_first_send_cancellation", Integer.toString(DataGenerator.random(71,99)));
            data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("url_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("url_form_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("web_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("send_days_costs_cancellation_edit", Integer.toString(DataGenerator.random(0,50)));
            data.put("days_send_previous_days_costs_cancellation_edit", Integer.toString(DataGenerator.random(51,70)));
            data.put("days_previous_to_first_send_cancellation_edit", Integer.toString(DataGenerator.random(71,99)));
            data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //PREPAYMENT BOOK. CANCELLATION CONFIGURATION
            data.put("application_date", DataGenerator.getToday());
            data.put("interface", DataGenerator.getRandomAlphanumericSequence(4, true));
            data.put("number_of_days_previous_cancel_prepayment", Integer.toString(DataGenerator.random(0,99)));
            data.put("application_date_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, 1, 0));
            data.put("interface_edit", DataGenerator.getRandomAlphanumericSequence(4, true));
            data.put("number_of_days_previous_cancel_prepayment_edit", Integer.toString(DataGenerator.random(0,99)));
    }
}