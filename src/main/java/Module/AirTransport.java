package Module;

public class AirTransport extends Transport  {
    private int airProp1;
    private String airProp2;

    public int getAirProp1() {
        return airProp1;
    }

    public AirTransport(String id, String name, int seat, String manufacturer, String regisNumber, String type, int airProp1, String airProp2) {
        super(id, name, seat, manufacturer, regisNumber, type);
        this.airProp1 = airProp1;
        this.airProp2 = airProp2;
    }

    public AirTransport(String id, String name) {
        super(id, name);
    }

    public void setAirProp1(int airProp1) {
        this.airProp1 = airProp1;
    }

    public String getAirProp2() {
        return airProp2;
    }

    public void setAirProp2(String airProp2) {
        this.airProp2 = airProp2;
    }

    @Override
    protected void showInfo() {
        System.out.println("Air transport information: ");
        super.showInfo();
    }
}
