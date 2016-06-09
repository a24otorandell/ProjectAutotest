package screen.AT2BOOSA1002;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;
    public AT2BOOSA1002Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2BOOSA1002Values.txt");
        setData();
    }
    public Map<String, String> getData() {
        return data;
    }
    public void setData() {
        this.data = harvester.harvestAll();
        if(data.get("empty").equals("true")){
            setDefaultData();
        }
    }
    public void setDefaultData(){
        data.put("header_interface","A");
        data.put("header_to","turchese");
        data.put("header_branch","");
        data.put("header_user","");
        data.put("header_booking_type","");
        data.put("header_ag_ref",DataGenerator.getRandomAlphanumericSequence(6,true));
        data.put("header_despt","HOTELOPIA");
        data.put("header_adults","2");
        data.put("header_child","0");
        data.put("header_baby","0");
        data.put("header_pax_name","Federico");
        data.put("header_valuation","Booking");
        data.put("booking_remmarks","Testing random data");
        data.put("hotel_startdate",DataGenerator.getToday());
        data.put("hotel_night","5");
        data.put("hotel_name","CAPDEMAR");
        data.put("room_name","1BS");
        data.put("char_name","1BS");
        data.put("hotel_fixinfo_phone","971971971");
        data.put("hotel_fixinfo_mail","anemail@adomain.none");
        data.put("hotel_fixinfo_comment","Testing some stuff");
        data.put("transfer_date",DataGenerator.getToday());
        data.put("activities_startdate",DataGenerator.getToday());



    }
}
