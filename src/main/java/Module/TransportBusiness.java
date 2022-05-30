package Module;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransportBusiness {

    Scanner sc = new Scanner(System.in);


    public HashMap<String, Transport> createData() {
        HashMap<String, Transport> lstTransport = new HashMap<>();

        AirTransport at1 = new AirTransport("at1", "plane1");
        AirTransport at2 = new AirTransport("at2", "helicopter1");
        RoadTransport rt1 = new RoadTransport("rt1", "minivan1");
        RoadTransport rt2 = new RoadTransport("rt2", "bus1");
        WaterTransport wt1 = new WaterTransport("wt1", "boat1");
        WaterTransport wt2 = new WaterTransport("wt2", "ship1");

        lstTransport.put(at1.getId(), at1);
        lstTransport.put(at2.getId(), at2);
        lstTransport.put(rt1.getId(), rt1);
        lstTransport.put(rt2.getId(), rt2);
        lstTransport.put(wt1.getId(), wt1);
        lstTransport.put(wt2.getId(), wt2);

        return lstTransport;
    }

    public void showTransport(HashMap<String, Transport> lstTransport) {
        for (Map.Entry<String, Transport> tran : lstTransport.entrySet()) {
            System.out.println(tran.getKey() + " : " + tran.getValue().getName());
        }
    }

    public Transport createTransport() {
        String id = null;
        String name = null;
        int seat = 0;
        String manufacturer = null;
        String regisNumber = null;
        String type = null;

        System.out.print("Type of Transport: ");
        type = sc.nextLine();
        System.out.print("Id: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Number of Seats: ");
        seat = Integer.parseInt(sc.nextLine());
        System.out.print("Manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Registration Number: ");
        regisNumber = sc.nextLine();

        Transport newTrans = new Transport(id, name, seat, manufacturer, regisNumber, type);

        return newTrans;
    }

    public void addTransport(HashMap<String, Transport> lstTransport, Transport newTrans) {
        lstTransport.put(newTrans.getId(), newTrans);
    }

    public String getTransportID(HashMap<String, Transport> lstTransport){
        int result = 0;
        String id = null;
        while (result == 0 ){
            System.out.print("Enter the id of transport: ");
            id = sc.nextLine();
            for (Map.Entry<String, Transport> tran : lstTransport.entrySet()) {
                if (tran.getKey().equals(id)) {
                    result = 1;
                    break;
                }
            }
            if (result == 0) {
                System.out.println("Invalid Id, please try again.");
            }
        }
        return id;
    }

    public void removeTransport(HashMap<String, Transport> lstTransport, String idTrans) {
        lstTransport.remove(idTrans);
        System.out.println("Successful");
    }

    public void updateTransport(HashMap<String, Transport> lstTransport, String idTrans) {
        Transport tran = lstTransport.get(idTrans);
        System.out.println("Update a transport with id is " +idTrans);
        System.out.print("Get a new name: ");
        String newName = sc.nextLine();
        tran.setName(newName);

        System.out.print("Get a new type: ");
        String newType = sc.nextLine();
        tran.setType(newType);

        System.out.print("Get a new number of seats: ");
        int newSeat = Integer.parseInt(sc.nextLine());
        tran.setSeat(newSeat);

        System.out.print("Get a new manufacturer: ");
        String newManu = sc.nextLine();
        tran.setManufacturer(newManu);

        System.out.print("Get a new regis number: ");
        String newRegis = sc.nextLine();
        tran.setRegisNumber(newRegis);
    }


}