import Module.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        TransportBusiness hello = new TransportBusiness();
        HashMap<String, Transport> listTrans = hello.createData();
//        Transport newRoadTrans = hello.createTransport();
//        hello.addTransport(listTrans, newRoadTrans);
//        hello.showTransport(listTrans);
//        newRoadTrans.showInfo();
        String removeId = hello.getTransportID();
        hello.removeTransport(listTrans,removeId);
        hello.showTransport(listTrans);
    }
}
