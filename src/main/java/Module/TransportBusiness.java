package Module;

import java.util.HashMap;
import java.util.Map;

public class TransportBusiness {

    public HashMap<String, Transport> createData(){
        HashMap<String, Transport> lstTransport = new HashMap<>();

        AirTransport at1 = new AirTransport("at1","plane1");
        AirTransport at2 = new AirTransport("at2","helicopter1");
        RoadTransport rt1 = new RoadTransport("rt1","minivan1");
        RoadTransport rt2 = new RoadTransport("rt2", "bus1");
        WaterTransport wt1 = new WaterTransport("wt1","boat1");
        WaterTransport wt2 = new WaterTransport("wt2","ship1");

        lstTransport.put(at1.getId(), at1);
        lstTransport.put(at2.getId(), at2);
        lstTransport.put(rt1.getId(), rt1);
        lstTransport.put(rt2.getId(), rt2);
        lstTransport.put(wt1.getId(), wt1);
        lstTransport.put(wt2.getId(), wt2);

        return lstTransport;
    }

    public void showTransport(HashMap<String, Transport> lstTransport){
        for (Map.Entry<String, Transport> tran: lstTransport.entrySet()){
            System.out.println(tran.getKey()+" : "+tran.getValue());
        }
    }
}
