import Module.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        TransportBusiness hello = new TransportBusiness();
        HashMap<String, Transport> listTrans = hello.createData();
        hello.showTransport(listTrans);
    }
}
